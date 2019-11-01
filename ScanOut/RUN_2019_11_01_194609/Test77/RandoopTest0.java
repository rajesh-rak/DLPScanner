
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.misc.VM.asChange_otherthread(0, 100);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var1 = new char[] { '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = java.lang.String.copyValueOf(var1, (-1), (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.nio.channels.Channel var0 = java.lang.System.inheritedChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = java.lang.System.getProperty("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    int var0 = sun.misc.VM.getFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var1 = new byte[] { (byte)10};
    java.lang.String var2 = sun.security.util.Debug.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0a"+ "'", var2.equals("0a"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = sun.misc.VM.getSavedProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.System.runFinalizersOnExit(true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Throwable var5 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var7 = var3.badInsertobjParam(var5, (java.lang.Object)0);
    java.lang.Throwable var9 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var10 = var3.badSkeleton(var9);
    org.omg.CORBA.MARSHAL var11 = var3.refTypeIndirType();
    java.util.logging.Logger var13 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var14 = var13.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var13);
    java.lang.Throwable var17 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var19 = var15.badInsertobjParam(var17, (java.lang.Object)0);
    java.util.logging.Logger var21 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var22 = var21.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    java.lang.Throwable var25 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var27 = var23.badInsertobjParam(var25, (java.lang.Object)0);
    java.lang.Throwable var29 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var30 = var23.badSkeleton(var29);
    org.omg.CORBA.MARSHAL var31 = var23.refTypeIndirType();
    org.omg.CORBA.MARSHAL var33 = var15.unknownCodeset((java.lang.Throwable)var31, (java.lang.Object)(short)(-1));
    java.util.logging.Logger var35 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var36 = var35.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var35);
    java.lang.Throwable var39 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var41 = var37.badInsertobjParam(var39, (java.lang.Object)0);
    java.util.logging.Logger var43 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var44 = var43.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var43);
    java.lang.Throwable var47 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var49 = var45.badInsertobjParam(var47, (java.lang.Object)0);
    java.lang.Throwable var51 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var52 = var45.badSkeleton(var51);
    org.omg.CORBA.MARSHAL var53 = var45.refTypeIndirType();
    org.omg.CORBA.MARSHAL var55 = var37.unknownCodeset((java.lang.Throwable)var53, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var56 = var15.cannotMarshalNative((java.lang.Throwable)var53);
    java.util.logging.Logger var58 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var59 = var58.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var58);
    java.lang.Throwable var62 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var64 = var60.badInsertobjParam(var62, (java.lang.Object)0);
    java.util.logging.Logger var66 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var67 = var66.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var66);
    java.lang.Throwable var70 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var72 = var68.badInsertobjParam(var70, (java.lang.Object)0);
    java.lang.Throwable var74 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var75 = var68.badSkeleton(var74);
    org.omg.CORBA.MARSHAL var76 = var68.refTypeIndirType();
    org.omg.CORBA.MARSHAL var78 = var60.unknownCodeset((java.lang.Throwable)var76, (java.lang.Object)(short)(-1));
    org.omg.CORBA.BAD_OPERATION var79 = var15.insertObjectFailed((java.lang.Throwable)var76);
    java.util.logging.Logger var81 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var82 = var81.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var83 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var81);
    java.lang.Throwable var85 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var87 = var83.badInsertobjParam(var85, (java.lang.Object)0);
    org.omg.CORBA.BAD_OPERATION var88 = var15.extractNotInitialized(var85);
    org.omg.CORBA.INTERNAL var89 = var3.unexpectedDiiException(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
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
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
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
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Throwable var5 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var7 = var3.badInsertobjParam(var5, (java.lang.Object)0);
    java.lang.Throwable var9 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var10 = var3.badSkeleton(var9);
    java.util.logging.Logger var12 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var13 = var12.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    java.lang.Throwable var16 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var18 = var14.badInsertobjParam(var16, (java.lang.Object)0);
    java.util.logging.Logger var20 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var21 = var20.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    java.lang.Throwable var24 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var26 = var22.badInsertobjParam(var24, (java.lang.Object)0);
    java.lang.Throwable var28 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var29 = var22.badSkeleton(var28);
    org.omg.CORBA.MARSHAL var30 = var22.refTypeIndirType();
    org.omg.CORBA.MARSHAL var32 = var14.unknownCodeset((java.lang.Throwable)var30, (java.lang.Object)(short)(-1));
    java.util.logging.Logger var34 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var35 = var34.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var34);
    java.lang.Throwable var38 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var40 = var36.badInsertobjParam(var38, (java.lang.Object)0);
    java.util.logging.Logger var42 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var43 = var42.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var42);
    java.lang.Throwable var46 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var48 = var44.badInsertobjParam(var46, (java.lang.Object)0);
    java.lang.Throwable var50 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var51 = var44.badSkeleton(var50);
    org.omg.CORBA.MARSHAL var52 = var44.refTypeIndirType();
    org.omg.CORBA.MARSHAL var54 = var36.unknownCodeset((java.lang.Throwable)var52, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var55 = var14.cannotMarshalNative((java.lang.Throwable)var52);
    org.omg.CORBA.BAD_PARAM var56 = var3.acceptorsAndLegacySocketFactoryAtSameTime((java.lang.Throwable)var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Throwable var5 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var7 = var3.badInsertobjParam(var5, (java.lang.Object)0);
    java.util.logging.Logger var9 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var10 = var9.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var9);
    java.lang.Throwable var13 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var15 = var11.badInsertobjParam(var13, (java.lang.Object)0);
    java.lang.Throwable var17 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var18 = var11.badSkeleton(var17);
    org.omg.CORBA.MARSHAL var19 = var11.refTypeIndirType();
    org.omg.CORBA.MARSHAL var21 = var3.unknownCodeset((java.lang.Throwable)var19, (java.lang.Object)(short)(-1));
    java.util.logging.Logger var23 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var24 = var23.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var23);
    java.lang.Throwable var27 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var29 = var25.badInsertobjParam(var27, (java.lang.Object)0);
    java.util.logging.Logger var31 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var32 = var31.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var31);
    java.lang.Throwable var35 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var37 = var33.badInsertobjParam(var35, (java.lang.Object)0);
    java.lang.Throwable var39 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var40 = var33.badSkeleton(var39);
    org.omg.CORBA.MARSHAL var41 = var33.refTypeIndirType();
    org.omg.CORBA.MARSHAL var43 = var25.unknownCodeset((java.lang.Throwable)var41, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var44 = var3.cannotMarshalNative((java.lang.Throwable)var41);
    org.omg.CORBA.INTERNAL var45 = var3.boundsCannotOccur();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    org.omg.CORBA.INTERNAL var4 = var3.duplicateSendingContextServiceContext();
    org.omg.CORBA.OBJECT_NOT_EXIST var5 = var3.badServerId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Throwable var5 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var7 = var3.badInsertobjParam(var5, (java.lang.Object)0);
    java.util.logging.Logger var9 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var10 = var9.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var9);
    java.lang.Throwable var13 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var15 = var11.badInsertobjParam(var13, (java.lang.Object)0);
    java.lang.Throwable var17 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var18 = var11.badSkeleton(var17);
    java.util.logging.Logger var20 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var21 = var20.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    java.lang.Throwable var24 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var26 = var22.badInsertobjParam(var24, (java.lang.Object)0);
    org.omg.CORBA.INTERNAL var27 = var11.unexpectedDirectByteBufferWithNonChannelSocket(var24);
    java.util.logging.Logger var29 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var30 = var29.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var29);
    java.lang.Throwable var33 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var35 = var31.badInsertobjParam(var33, (java.lang.Object)0);
    java.lang.Throwable var37 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var38 = var31.badSkeleton(var37);
    org.omg.CORBA.INTERNAL var39 = var11.bootstrapApplicationException(var37);
    org.omg.CORBA.MARSHAL var40 = var3.dsiResultException(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Throwable var5 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var7 = var3.badInsertobjParam(var5, (java.lang.Object)0);
    java.lang.Throwable var9 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var10 = var3.badSkeleton(var9);
    java.util.logging.Logger var12 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var13 = var12.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    java.lang.Throwable var16 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var18 = var14.badInsertobjParam(var16, (java.lang.Object)0);
    org.omg.CORBA.INTERNAL var19 = var3.unexpectedDirectByteBufferWithNonChannelSocket(var16);
    java.util.logging.Logger var21 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var22 = var21.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    java.lang.Throwable var25 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var27 = var23.badInsertobjParam(var25, (java.lang.Object)0);
    java.lang.Throwable var29 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var30 = var23.badSkeleton(var29);
    org.omg.CORBA.INTERNAL var31 = var3.bootstrapApplicationException(var29);
    org.omg.CORBA.COMM_FAILURE var32 = var3.ioexceptionWhenReadingConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var5 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var6 = var5.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    java.lang.Throwable var9 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var11 = var7.badInsertobjParam(var9, (java.lang.Object)0);
    java.util.logging.Logger var13 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var14 = var13.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var13);
    java.lang.Throwable var17 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var19 = var15.badInsertobjParam(var17, (java.lang.Object)0);
    java.util.logging.Logger var21 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var22 = var21.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    org.omg.CORBA.INTERNAL var24 = var23.duplicateSendingContextServiceContext();
    org.omg.CORBA.MARSHAL var25 = var3.unexpectedEnclosingValuetype(var9, (java.lang.Object)var15, (java.lang.Object)var23);
    java.util.logging.Logger var28 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var29 = var28.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var28);
    java.util.logging.Logger var32 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var33 = var32.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var32);
    java.lang.Throwable var36 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var38 = var34.badInsertobjParam(var36, (java.lang.Object)0);
    java.util.logging.Logger var40 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var41 = var40.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var40);
    java.lang.Throwable var44 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var46 = var42.badInsertobjParam(var44, (java.lang.Object)0);
    java.util.logging.Logger var48 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var49 = var48.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var48);
    org.omg.CORBA.INTERNAL var51 = var50.duplicateSendingContextServiceContext();
    org.omg.CORBA.MARSHAL var52 = var30.unexpectedEnclosingValuetype(var36, (java.lang.Object)var42, (java.lang.Object)var50);
    org.omg.CORBA.BAD_OPERATION var53 = var15.badStringBounds((java.lang.Object)(short)100, (java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
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

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Map var0 = java.lang.System.getenv();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Throwable var5 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var7 = var3.badInsertobjParam(var5, (java.lang.Object)0);
    java.util.logging.Logger var9 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var10 = var9.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var9);
    java.lang.Throwable var13 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var15 = var11.badInsertobjParam(var13, (java.lang.Object)0);
    java.lang.Throwable var17 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var18 = var11.badSkeleton(var17);
    org.omg.CORBA.MARSHAL var19 = var11.refTypeIndirType();
    org.omg.CORBA.MARSHAL var21 = var3.unknownCodeset((java.lang.Throwable)var19, (java.lang.Object)(short)(-1));
    org.omg.CORBA.INTERNAL var22 = var3.serverScNoIiopProfile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Throwable var5 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var7 = var3.badInsertobjParam(var5, (java.lang.Object)0);
    java.util.logging.Logger var9 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var10 = var9.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var9);
    java.lang.Throwable var13 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var15 = var11.badInsertobjParam(var13, (java.lang.Object)0);
    java.lang.Throwable var17 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var18 = var11.badSkeleton(var17);
    org.omg.CORBA.MARSHAL var19 = var11.refTypeIndirType();
    org.omg.CORBA.MARSHAL var21 = var3.unknownCodeset((java.lang.Throwable)var19, (java.lang.Object)(short)(-1));
    java.util.logging.Logger var23 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var24 = var23.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var23);
    java.lang.Throwable var27 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var29 = var25.badInsertobjParam(var27, (java.lang.Object)0);
    java.util.logging.Logger var31 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var32 = var31.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var31);
    java.lang.Throwable var35 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var37 = var33.badInsertobjParam(var35, (java.lang.Object)0);
    java.lang.Throwable var39 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var40 = var33.badSkeleton(var39);
    org.omg.CORBA.MARSHAL var41 = var33.refTypeIndirType();
    org.omg.CORBA.MARSHAL var43 = var25.unknownCodeset((java.lang.Throwable)var41, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var44 = var3.cannotMarshalNative((java.lang.Throwable)var41);
    org.omg.CORBA.UNKNOWN var45 = var3.unknownSysex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    org.omg.CORBA.INTERNAL var4 = var3.duplicateSendingContextServiceContext();
    org.omg.CORBA.INV_OBJREF var5 = var3.noProfilePresent();
    org.omg.CORBA.MARSHAL var6 = var3.invalidSimpleTypecode();
    
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

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    org.omg.CORBA.INTERNAL var4 = var3.duplicateSendingContextServiceContext();
    org.omg.CORBA.INV_OBJREF var5 = var3.noProfilePresent();
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var8 = var7.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.lang.Throwable var11 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var13 = var9.badInsertobjParam(var11, (java.lang.Object)0);
    java.lang.Throwable var15 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var16 = var9.badSkeleton(var15);
    org.omg.CORBA.BAD_PARAM var17 = var9.nullParam();
    org.omg.CORBA.INTERNAL var18 = var9.badServantReadObject();
    java.util.logging.Logger var20 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var21 = var20.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    java.lang.Throwable var24 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var26 = var22.badInsertobjParam(var24, (java.lang.Object)0);
    java.lang.Throwable var28 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var29 = var22.badSkeleton(var28);
    java.util.logging.Logger var31 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var32 = var31.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var31);
    java.lang.Throwable var35 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var37 = var33.badInsertobjParam(var35, (java.lang.Object)0);
    org.omg.CORBA.INTERNAL var38 = var22.unexpectedDirectByteBufferWithNonChannelSocket(var35);
    java.util.logging.Logger var40 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var41 = var40.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var40);
    java.lang.Throwable var44 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var46 = var42.badInsertobjParam(var44, (java.lang.Object)0);
    java.lang.Throwable var48 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var49 = var42.badSkeleton(var48);
    org.omg.CORBA.INTERNAL var50 = var22.bootstrapApplicationException(var48);
    org.omg.CORBA.MARSHAL var51 = var9.badKind((java.lang.Throwable)var50);
    java.util.logging.Logger var53 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var54 = var53.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var53);
    java.lang.Throwable var57 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var59 = var55.badInsertobjParam(var57, (java.lang.Object)0);
    java.util.logging.Logger var61 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var62 = var61.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var61);
    java.lang.Throwable var65 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var67 = var63.badInsertobjParam(var65, (java.lang.Object)0);
    java.lang.Throwable var69 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var70 = var63.badSkeleton(var69);
    org.omg.CORBA.MARSHAL var71 = var63.refTypeIndirType();
    org.omg.CORBA.MARSHAL var73 = var55.unknownCodeset((java.lang.Throwable)var71, (java.lang.Object)(short)(-1));
    java.util.logging.Logger var75 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var76 = var75.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var75);
    java.lang.Throwable var79 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var81 = var77.badInsertobjParam(var79, (java.lang.Object)0);
    java.util.logging.Logger var83 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var84 = var83.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var85 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var83);
    java.lang.Throwable var87 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var89 = var85.badInsertobjParam(var87, (java.lang.Object)0);
    java.lang.Throwable var91 = new java.lang.Throwable("");
    org.omg.CORBA.OBJECT_NOT_EXIST var92 = var85.badSkeleton(var91);
    org.omg.CORBA.MARSHAL var93 = var85.refTypeIndirType();
    org.omg.CORBA.MARSHAL var95 = var77.unknownCodeset((java.lang.Throwable)var93, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var96 = var55.cannotMarshalNative((java.lang.Throwable)var93);
    org.omg.CORBA.MARSHAL var97 = var3.indirectionNotFound((java.lang.Throwable)var51, (java.lang.Object)var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
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
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var5 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var6 = var5.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    java.lang.Throwable var9 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var11 = var7.badInsertobjParam(var9, (java.lang.Object)0);
    java.util.logging.Logger var13 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var14 = var13.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var13);
    java.lang.Throwable var17 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var19 = var15.badInsertobjParam(var17, (java.lang.Object)0);
    java.util.logging.Logger var21 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var22 = var21.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    org.omg.CORBA.INTERNAL var24 = var23.duplicateSendingContextServiceContext();
    org.omg.CORBA.MARSHAL var25 = var3.unexpectedEnclosingValuetype(var9, (java.lang.Object)var15, (java.lang.Object)var23);
    org.omg.CORBA.BAD_OPERATION var26 = var23.setExceptionCalledBadType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Throwable var5 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var7 = var3.badInsertobjParam(var5, (java.lang.Object)0);
    org.omg.CORBA.OBJ_ADAPTER var8 = var3.orbConnectError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var5 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var6 = var5.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var8 = var7.duplicateSendingContextServiceContext();
    org.omg.CORBA.MARSHAL var9 = var3.javaSerializationException((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var2 = var1.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var5 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var6 = var5.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    java.lang.Throwable var9 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var11 = var7.badInsertobjParam(var9, (java.lang.Object)0);
    java.util.logging.Logger var13 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var14 = var13.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var13);
    java.lang.Throwable var17 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var19 = var15.badInsertobjParam(var17, (java.lang.Object)0);
    java.util.logging.Logger var21 = java.util.logging.Logger.getLogger("");
    java.util.logging.Handler[] var22 = var21.getHandlers();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    org.omg.CORBA.INTERNAL var24 = var23.duplicateSendingContextServiceContext();
    org.omg.CORBA.MARSHAL var25 = var3.unexpectedEnclosingValuetype(var9, (java.lang.Object)var15, (java.lang.Object)var23);
    org.omg.CORBA.UNKNOWN var26 = var23.unknownExceptionInDispatch();
    org.omg.CORBA.DATA_CONVERSION var28 = var23.orbInitializerType((java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var29 = var23.fragmentationDisallowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

}
