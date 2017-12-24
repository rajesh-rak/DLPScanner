
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = java.lang.String.valueOf(var0, 1, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    char[] var3 = new char[] { 'a', '4', '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var3, 100, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.INITIALIZE var2 = var1.cannotWriteOrbidDb();
    org.omg.CORBA.MARSHAL var3 = var1.invalidTypecodeKindMarshal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var16 = var15.badActivateTieCall();
    org.omg.CORBA.MARSHAL var17 = var13.customWrapperIndirection((java.lang.Throwable)var16);
    org.omg.CORBA.BAD_INV_ORDER var18 = var7.argumentsCalledNullArgs((java.lang.Throwable)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var20.badActivateTieCall();
    org.omg.CORBA.INTERNAL var22 = var7.badSystemExceptionInLocateReply((java.lang.Throwable)var21);
    org.omg.CORBA.BAD_OPERATION var23 = var1.extractObjectIncompatible((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var28 = var27.badActivateTieCall();
    org.omg.CORBA.MARSHAL var29 = var25.customWrapperIndirection((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var34 = var33.badActivateTieCall();
    org.omg.CORBA.MARSHAL var35 = var31.customWrapperIndirection((java.lang.Throwable)var34);
    org.omg.CORBA.BAD_INV_ORDER var36 = var25.argumentsCalledNullArgs((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var39 = var38.badActivateTieCall();
    org.omg.CORBA.INTERNAL var40 = var25.badSystemExceptionInLocateReply((java.lang.Throwable)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var45 = var44.badActivateTieCall();
    org.omg.CORBA.MARSHAL var46 = var42.customWrapperIndirection((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var51 = var50.badActivateTieCall();
    org.omg.CORBA.MARSHAL var52 = var48.customWrapperIndirection((java.lang.Throwable)var51);
    org.omg.CORBA.BAD_INV_ORDER var53 = var42.argumentsCalledNullArgs((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var56 = var55.badActivateTieCall();
    org.omg.CORBA.INTERNAL var57 = var42.badSystemExceptionInLocateReply((java.lang.Throwable)var56);
    org.omg.CORBA.INTERNAL var58 = var25.duplicateExceptionDetailMessage((java.lang.Throwable)var56);
    org.omg.CORBA.BAD_OPERATION var59 = var1.extractObjectIncompatible((java.lang.Throwable)var58);
    
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
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.INTERNAL var16 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var15);
    org.omg.CORBA.MARSHAL var17 = var1.customWrapperIndirection();
    
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
    assertNotNull(var10);
    
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
    assertNotNull(var17);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var2 = var1.badActivateTieCall();
    org.omg.CORBA.MARSHAL var3 = var1.readObjectException();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var8 = var7.badActivateTieCall();
    org.omg.CORBA.MARSHAL var9 = var5.customWrapperIndirection((java.lang.Throwable)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var14 = var13.badActivateTieCall();
    org.omg.CORBA.MARSHAL var15 = var11.customWrapperIndirection((java.lang.Throwable)var14);
    org.omg.CORBA.BAD_INV_ORDER var16 = var5.argumentsCalledNullArgs((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var20.badActivateTieCall();
    org.omg.CORBA.MARSHAL var22 = var18.customWrapperIndirection((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var18.endOfStream();
    org.omg.CORBA.INTERNAL var24 = var5.tkLongDoubleNotSupported((java.lang.Throwable)var23);
    org.omg.CORBA.INTERNAL var25 = var1.nullReplyInGetAddrDisposition((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var30 = var29.badActivateTieCall();
    org.omg.CORBA.MARSHAL var31 = var27.customWrapperIndirection((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var36 = var35.badActivateTieCall();
    org.omg.CORBA.MARSHAL var37 = var33.customWrapperIndirection((java.lang.Throwable)var36);
    org.omg.CORBA.BAD_INV_ORDER var38 = var27.argumentsCalledNullArgs((java.lang.Throwable)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var41 = var40.badActivateTieCall();
    org.omg.CORBA.INTERNAL var42 = var27.badSystemExceptionInLocateReply((java.lang.Throwable)var41);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var47 = var46.badActivateTieCall();
    org.omg.CORBA.MARSHAL var48 = var44.customWrapperIndirection((java.lang.Throwable)var47);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var53 = var52.badActivateTieCall();
    org.omg.CORBA.MARSHAL var54 = var50.customWrapperIndirection((java.lang.Throwable)var53);
    org.omg.CORBA.BAD_INV_ORDER var55 = var44.argumentsCalledNullArgs((java.lang.Throwable)var54);
    org.omg.CORBA.MARSHAL var56 = var27.badCodebaseIndirection((java.lang.Object)var44);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var61 = var60.badActivateTieCall();
    org.omg.CORBA.MARSHAL var62 = var58.customWrapperIndirection((java.lang.Throwable)var61);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var67 = var66.badActivateTieCall();
    org.omg.CORBA.MARSHAL var68 = var64.customWrapperIndirection((java.lang.Throwable)var67);
    org.omg.CORBA.BAD_INV_ORDER var69 = var58.argumentsCalledNullArgs((java.lang.Throwable)var68);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var72 = var71.badActivateTieCall();
    org.omg.CORBA.INTERNAL var73 = var58.badSystemExceptionInLocateReply((java.lang.Throwable)var72);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var75 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var78 = var77.badActivateTieCall();
    org.omg.CORBA.MARSHAL var79 = var75.customWrapperIndirection((java.lang.Throwable)var78);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var81 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var83 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var84 = var83.badActivateTieCall();
    org.omg.CORBA.MARSHAL var85 = var81.customWrapperIndirection((java.lang.Throwable)var84);
    org.omg.CORBA.BAD_INV_ORDER var86 = var75.argumentsCalledNullArgs((java.lang.Throwable)var85);
    org.omg.CORBA.MARSHAL var87 = var58.badCodebaseIndirection((java.lang.Object)var75);
    org.omg.CORBA.COMM_FAILURE var89 = var75.exceptionInAccept((java.lang.Object)'#');
    org.omg.CORBA.INTERNAL var90 = var27.errorInitBadserveridhandler((java.lang.Throwable)var89);
    org.omg.CORBA.BAD_INV_ORDER var91 = var1.argumentsCalledAfterException((java.lang.Throwable)var90);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.INTERNAL var16 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var20.badActivateTieCall();
    org.omg.CORBA.MARSHAL var22 = var18.customWrapperIndirection((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var27 = var26.badActivateTieCall();
    org.omg.CORBA.MARSHAL var28 = var24.customWrapperIndirection((java.lang.Throwable)var27);
    org.omg.CORBA.BAD_INV_ORDER var29 = var18.argumentsCalledNullArgs((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var1.badCodebaseIndirection((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var34.badActivateTieCall();
    org.omg.CORBA.MARSHAL var36 = var32.customWrapperIndirection((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var41 = var40.badActivateTieCall();
    org.omg.CORBA.MARSHAL var42 = var38.customWrapperIndirection((java.lang.Throwable)var41);
    org.omg.CORBA.BAD_INV_ORDER var43 = var32.argumentsCalledNullArgs((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var46 = var45.badActivateTieCall();
    org.omg.CORBA.INTERNAL var47 = var32.badSystemExceptionInLocateReply((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var52 = var51.badActivateTieCall();
    org.omg.CORBA.MARSHAL var53 = var49.customWrapperIndirection((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var58 = var57.badActivateTieCall();
    org.omg.CORBA.MARSHAL var59 = var55.customWrapperIndirection((java.lang.Throwable)var58);
    org.omg.CORBA.BAD_INV_ORDER var60 = var49.argumentsCalledNullArgs((java.lang.Throwable)var59);
    org.omg.CORBA.MARSHAL var61 = var32.badCodebaseIndirection((java.lang.Object)var49);
    org.omg.CORBA.COMM_FAILURE var63 = var49.exceptionInAccept((java.lang.Object)'#');
    org.omg.CORBA.INTERNAL var64 = var1.errorInitBadserveridhandler((java.lang.Throwable)var63);
    org.omg.CORBA.COMM_FAILURE var65 = var1.recvMsgError();
    
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
    assertNotNull(var10);
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.INTERNAL var16 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var20.badActivateTieCall();
    org.omg.CORBA.MARSHAL var22 = var18.customWrapperIndirection((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var27 = var26.badActivateTieCall();
    org.omg.CORBA.MARSHAL var28 = var24.customWrapperIndirection((java.lang.Throwable)var27);
    org.omg.CORBA.BAD_INV_ORDER var29 = var18.argumentsCalledNullArgs((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var1.badCodebaseIndirection((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var34.badActivateTieCall();
    org.omg.CORBA.MARSHAL var36 = var32.customWrapperIndirection((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var41 = var40.badActivateTieCall();
    org.omg.CORBA.MARSHAL var42 = var38.customWrapperIndirection((java.lang.Throwable)var41);
    org.omg.CORBA.BAD_INV_ORDER var43 = var32.argumentsCalledNullArgs((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var46 = var45.badActivateTieCall();
    org.omg.CORBA.INTERNAL var47 = var32.badSystemExceptionInLocateReply((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var52 = var51.badActivateTieCall();
    org.omg.CORBA.MARSHAL var53 = var49.customWrapperIndirection((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var58 = var57.badActivateTieCall();
    org.omg.CORBA.MARSHAL var59 = var55.customWrapperIndirection((java.lang.Throwable)var58);
    org.omg.CORBA.BAD_INV_ORDER var60 = var49.argumentsCalledNullArgs((java.lang.Throwable)var59);
    org.omg.CORBA.MARSHAL var61 = var32.badCodebaseIndirection((java.lang.Object)var49);
    org.omg.CORBA.COMM_FAILURE var63 = var49.exceptionInAccept((java.lang.Object)'#');
    org.omg.CORBA.INTERNAL var64 = var1.errorInitBadserveridhandler((java.lang.Throwable)var63);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var67 = var66.badActivateTieCall();
    org.omg.CORBA.INITIALIZE var68 = var1.cannotWriteOrbidDb((java.lang.Throwable)var67);
    
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
    assertNotNull(var10);
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.INTERNAL var16 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var20.badActivateTieCall();
    org.omg.CORBA.MARSHAL var22 = var18.customWrapperIndirection((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var27 = var26.badActivateTieCall();
    org.omg.CORBA.MARSHAL var28 = var24.customWrapperIndirection((java.lang.Throwable)var27);
    org.omg.CORBA.BAD_INV_ORDER var29 = var18.argumentsCalledNullArgs((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var1.badCodebaseIndirection((java.lang.Object)var18);
    org.omg.CORBA.COMM_FAILURE var32 = var18.exceptionInAccept((java.lang.Object)'#');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var34.badActivateTieCall();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var40 = var39.badActivateTieCall();
    org.omg.CORBA.MARSHAL var41 = var37.customWrapperIndirection((java.lang.Throwable)var40);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var46 = var45.badActivateTieCall();
    org.omg.CORBA.MARSHAL var47 = var43.customWrapperIndirection((java.lang.Throwable)var46);
    org.omg.CORBA.BAD_INV_ORDER var48 = var37.argumentsCalledNullArgs((java.lang.Throwable)var47);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var53 = var52.badActivateTieCall();
    org.omg.CORBA.MARSHAL var54 = var50.customWrapperIndirection((java.lang.Throwable)var53);
    org.omg.CORBA.MARSHAL var55 = var50.endOfStream();
    org.omg.CORBA.INTERNAL var56 = var37.tkLongDoubleNotSupported((java.lang.Throwable)var55);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var61 = var60.badActivateTieCall();
    org.omg.CORBA.MARSHAL var62 = var58.customWrapperIndirection((java.lang.Throwable)var61);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var67 = var66.badActivateTieCall();
    org.omg.CORBA.MARSHAL var68 = var64.customWrapperIndirection((java.lang.Throwable)var67);
    org.omg.CORBA.BAD_INV_ORDER var69 = var58.argumentsCalledNullArgs((java.lang.Throwable)var68);
    org.omg.CORBA.COMM_FAILURE var70 = var34.exceptionInAccept((java.lang.Throwable)var56, (java.lang.Object)var68);
    org.omg.CORBA.INTERNAL var71 = var34.unableToSetSocketFactoryOrb();
    org.omg.CORBA.BAD_OPERATION var72 = var18.badOrbConfigurator((java.lang.Object)var34);
    
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
    assertNotNull(var10);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var2 = var1.badActivateTieCall();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var6 = var5.badActivateTieCall();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var10.badActivateTieCall();
    org.omg.CORBA.MARSHAL var12 = var8.customWrapperIndirection((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var17 = var16.badActivateTieCall();
    org.omg.CORBA.MARSHAL var18 = var14.customWrapperIndirection((java.lang.Throwable)var17);
    org.omg.CORBA.BAD_INV_ORDER var19 = var8.argumentsCalledNullArgs((java.lang.Throwable)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var24 = var23.badActivateTieCall();
    org.omg.CORBA.MARSHAL var25 = var21.customWrapperIndirection((java.lang.Throwable)var24);
    org.omg.CORBA.MARSHAL var26 = var21.endOfStream();
    org.omg.CORBA.INTERNAL var27 = var8.tkLongDoubleNotSupported((java.lang.Throwable)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var32 = var31.badActivateTieCall();
    org.omg.CORBA.MARSHAL var33 = var29.customWrapperIndirection((java.lang.Throwable)var32);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var38 = var37.badActivateTieCall();
    org.omg.CORBA.MARSHAL var39 = var35.customWrapperIndirection((java.lang.Throwable)var38);
    org.omg.CORBA.BAD_INV_ORDER var40 = var29.argumentsCalledNullArgs((java.lang.Throwable)var39);
    org.omg.CORBA.COMM_FAILURE var41 = var5.exceptionInAccept((java.lang.Throwable)var27, (java.lang.Object)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var44 = var43.badActivateTieCall();
    org.omg.CORBA.MARSHAL var45 = var43.readObjectException();
    org.omg.CORBA.COMM_FAILURE var46 = var1.connectFailure((java.lang.Object)(short)1, (java.lang.Object)var5, (java.lang.Object)var45);
    org.omg.CORBA.BAD_PARAM var47 = var5.bootstrapException();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var52 = var51.badActivateTieCall();
    org.omg.CORBA.MARSHAL var53 = var49.customWrapperIndirection((java.lang.Throwable)var52);
    org.omg.CORBA.MARSHAL var54 = var49.endOfStream();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var59 = var58.badActivateTieCall();
    org.omg.CORBA.MARSHAL var60 = var56.customWrapperIndirection((java.lang.Throwable)var59);
    org.omg.CORBA.MARSHAL var61 = var56.endOfStream();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var66 = var65.badActivateTieCall();
    org.omg.CORBA.MARSHAL var67 = var63.customWrapperIndirection((java.lang.Throwable)var66);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var69 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var72 = var71.badActivateTieCall();
    org.omg.CORBA.MARSHAL var73 = var69.customWrapperIndirection((java.lang.Throwable)var72);
    org.omg.CORBA.BAD_INV_ORDER var74 = var63.argumentsCalledNullArgs((java.lang.Throwable)var73);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var76 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var77 = var76.badActivateTieCall();
    org.omg.CORBA.INTERNAL var78 = var63.badSystemExceptionInLocateReply((java.lang.Throwable)var77);
    org.omg.CORBA.MARSHAL var79 = var63.badDigitInFixed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var81 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.INITIALIZE var82 = var81.cannotWriteOrbidDb();
    org.omg.CORBA.INTERNAL var83 = var49.interruptedJoinCallWhileClosingThreadPool((java.lang.Throwable)var61, (java.lang.Object)var79, (java.lang.Object)var82);
    org.omg.CORBA.MARSHAL var84 = var5.nullNotAllowed((java.lang.Throwable)var61);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.MARSHAL var16 = var1.invalidTypecodeKindMarshal((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var1.getLocalHostFailed();
    
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
    assertNotNull(var10);
    
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
    assertNotNull(var17);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var17 = var16.badActivateTieCall();
    org.omg.CORBA.MARSHAL var18 = var14.customWrapperIndirection((java.lang.Throwable)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var23 = var22.badActivateTieCall();
    org.omg.CORBA.MARSHAL var24 = var20.customWrapperIndirection((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var28.badActivateTieCall();
    org.omg.CORBA.MARSHAL var30 = var26.customWrapperIndirection((java.lang.Throwable)var29);
    org.omg.CORBA.BAD_INV_ORDER var31 = var20.argumentsCalledNullArgs((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var34 = var33.badActivateTieCall();
    org.omg.CORBA.INTERNAL var35 = var20.badSystemExceptionInLocateReply((java.lang.Throwable)var34);
    org.omg.CORBA.BAD_OPERATION var36 = var14.extractObjectIncompatible((java.lang.Throwable)var34);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var39 = var38.badActivateTieCall();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var43 = var42.badActivateTieCall();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var48 = var47.badActivateTieCall();
    org.omg.CORBA.MARSHAL var49 = var45.customWrapperIndirection((java.lang.Throwable)var48);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var54 = var53.badActivateTieCall();
    org.omg.CORBA.MARSHAL var55 = var51.customWrapperIndirection((java.lang.Throwable)var54);
    org.omg.CORBA.BAD_INV_ORDER var56 = var45.argumentsCalledNullArgs((java.lang.Throwable)var55);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var61 = var60.badActivateTieCall();
    org.omg.CORBA.MARSHAL var62 = var58.customWrapperIndirection((java.lang.Throwable)var61);
    org.omg.CORBA.MARSHAL var63 = var58.endOfStream();
    org.omg.CORBA.INTERNAL var64 = var45.tkLongDoubleNotSupported((java.lang.Throwable)var63);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var69 = var68.badActivateTieCall();
    org.omg.CORBA.MARSHAL var70 = var66.customWrapperIndirection((java.lang.Throwable)var69);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var74 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var75 = var74.badActivateTieCall();
    org.omg.CORBA.MARSHAL var76 = var72.customWrapperIndirection((java.lang.Throwable)var75);
    org.omg.CORBA.BAD_INV_ORDER var77 = var66.argumentsCalledNullArgs((java.lang.Throwable)var76);
    org.omg.CORBA.COMM_FAILURE var78 = var42.exceptionInAccept((java.lang.Throwable)var64, (java.lang.Object)var76);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var80 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var81 = var80.badActivateTieCall();
    org.omg.CORBA.MARSHAL var82 = var80.readObjectException();
    org.omg.CORBA.COMM_FAILURE var83 = var38.connectFailure((java.lang.Object)(short)1, (java.lang.Object)var42, (java.lang.Object)var82);
    org.omg.CORBA.BAD_PARAM var84 = var42.bootstrapException();
    org.omg.CORBA.DATA_CONVERSION var85 = var14.badModifier((java.lang.Throwable)var84);
    org.omg.CORBA.COMM_FAILURE var86 = var1.exceptionInAccept((java.lang.Object)var14);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.INTERNAL var16 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var15);
    org.omg.CORBA.MARSHAL var17 = var1.badDigitInFixed();
    org.omg.CORBA.MARSHAL var18 = var1.couldNotFindClass();
    
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
    assertNotNull(var10);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.badStringifiedIorLen();
    
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

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.INTERNAL var16 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var20.badActivateTieCall();
    org.omg.CORBA.MARSHAL var22 = var18.customWrapperIndirection((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var27 = var26.badActivateTieCall();
    org.omg.CORBA.MARSHAL var28 = var24.customWrapperIndirection((java.lang.Throwable)var27);
    org.omg.CORBA.BAD_INV_ORDER var29 = var18.argumentsCalledNullArgs((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var1.badCodebaseIndirection((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var34.badActivateTieCall();
    org.omg.CORBA.MARSHAL var36 = var32.customWrapperIndirection((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var41 = var40.badActivateTieCall();
    org.omg.CORBA.MARSHAL var42 = var38.customWrapperIndirection((java.lang.Throwable)var41);
    org.omg.CORBA.BAD_INV_ORDER var43 = var32.argumentsCalledNullArgs((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var46 = var45.badActivateTieCall();
    org.omg.CORBA.INTERNAL var47 = var32.badSystemExceptionInLocateReply((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var52 = var51.badActivateTieCall();
    org.omg.CORBA.MARSHAL var53 = var49.customWrapperIndirection((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var58 = var57.badActivateTieCall();
    org.omg.CORBA.MARSHAL var59 = var55.customWrapperIndirection((java.lang.Throwable)var58);
    org.omg.CORBA.BAD_INV_ORDER var60 = var49.argumentsCalledNullArgs((java.lang.Throwable)var59);
    org.omg.CORBA.MARSHAL var61 = var32.badCodebaseIndirection((java.lang.Object)var49);
    org.omg.CORBA.COMM_FAILURE var63 = var49.exceptionInAccept((java.lang.Object)'#');
    org.omg.CORBA.INTERNAL var64 = var1.errorInitBadserveridhandler((java.lang.Throwable)var63);
    org.omg.CORBA.BAD_OPERATION var65 = var1.getDelegateServantNotActive();
    
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
    assertNotNull(var10);
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.INTERNAL var16 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var20.badActivateTieCall();
    org.omg.CORBA.MARSHAL var22 = var18.customWrapperIndirection((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var27 = var26.badActivateTieCall();
    org.omg.CORBA.MARSHAL var28 = var24.customWrapperIndirection((java.lang.Throwable)var27);
    org.omg.CORBA.BAD_INV_ORDER var29 = var18.argumentsCalledNullArgs((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var1.badCodebaseIndirection((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var34.badActivateTieCall();
    org.omg.CORBA.MARSHAL var36 = var32.customWrapperIndirection((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var41 = var40.badActivateTieCall();
    org.omg.CORBA.MARSHAL var42 = var38.customWrapperIndirection((java.lang.Throwable)var41);
    org.omg.CORBA.INTERNAL var43 = var32.unsupportedGiopVersion((java.lang.Object)var38);
    org.omg.CORBA.BAD_INV_ORDER var44 = var38.argumentsCalledMultiple();
    org.omg.CORBA.MARSHAL var46 = var18.readObjectLoadClassFailure((java.lang.Object)var38, (java.lang.Object)100.0f);
    
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
    assertNotNull(var10);
    
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

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var17 = var16.badActivateTieCall();
    org.omg.CORBA.MARSHAL var18 = var14.customWrapperIndirection((java.lang.Throwable)var17);
    org.omg.CORBA.MARSHAL var19 = var14.endOfStream();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var24 = var23.badActivateTieCall();
    org.omg.CORBA.MARSHAL var25 = var21.customWrapperIndirection((java.lang.Throwable)var24);
    org.omg.CORBA.MARSHAL var26 = var21.endOfStream();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var31 = var30.badActivateTieCall();
    org.omg.CORBA.MARSHAL var32 = var28.customWrapperIndirection((java.lang.Throwable)var31);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var37 = var36.badActivateTieCall();
    org.omg.CORBA.MARSHAL var38 = var34.customWrapperIndirection((java.lang.Throwable)var37);
    org.omg.CORBA.BAD_INV_ORDER var39 = var28.argumentsCalledNullArgs((java.lang.Throwable)var38);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var42 = var41.badActivateTieCall();
    org.omg.CORBA.INTERNAL var43 = var28.badSystemExceptionInLocateReply((java.lang.Throwable)var42);
    org.omg.CORBA.MARSHAL var44 = var28.badDigitInFixed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.INITIALIZE var47 = var46.cannotWriteOrbidDb();
    org.omg.CORBA.INTERNAL var48 = var14.interruptedJoinCallWhileClosingThreadPool((java.lang.Throwable)var26, (java.lang.Object)var44, (java.lang.Object)var47);
    org.omg.CORBA.INTERNAL var49 = var14.duplicateSendingContextServiceContext();
    org.omg.CORBA.DATA_CONVERSION var50 = var1.illegalIorToSocketInfoType((java.lang.Object)var14);
    
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
    assertNotNull(var21);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertNotNull(var50);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var17 = var16.badActivateTieCall();
    org.omg.CORBA.MARSHAL var18 = var14.customWrapperIndirection((java.lang.Throwable)var17);
    org.omg.CORBA.MARSHAL var19 = var14.endOfStream();
    org.omg.CORBA.INTERNAL var20 = var1.tkLongDoubleNotSupported((java.lang.Throwable)var19);
    org.omg.CORBA.COMM_FAILURE var21 = var1.invokeError();
    
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
    assertNotNull(var21);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.badActivateTieCall();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperIndirection((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var10 = var9.badActivateTieCall();
    org.omg.CORBA.MARSHAL var11 = var7.customWrapperIndirection((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_INV_ORDER var12 = var1.argumentsCalledNullArgs((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var14.badActivateTieCall();
    org.omg.CORBA.INTERNAL var16 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var20.badActivateTieCall();
    org.omg.CORBA.MARSHAL var22 = var18.customWrapperIndirection((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var27 = var26.badActivateTieCall();
    org.omg.CORBA.MARSHAL var28 = var24.customWrapperIndirection((java.lang.Throwable)var27);
    org.omg.CORBA.BAD_INV_ORDER var29 = var18.argumentsCalledNullArgs((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var1.badCodebaseIndirection((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var34.badActivateTieCall();
    org.omg.CORBA.MARSHAL var36 = var32.customWrapperIndirection((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var41 = var40.badActivateTieCall();
    org.omg.CORBA.MARSHAL var42 = var38.customWrapperIndirection((java.lang.Throwable)var41);
    org.omg.CORBA.BAD_INV_ORDER var43 = var32.argumentsCalledNullArgs((java.lang.Throwable)var42);
    org.omg.CORBA.OBJECT_NOT_EXIST var44 = var18.dynAnyDestroyed((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var49 = var48.badActivateTieCall();
    org.omg.CORBA.MARSHAL var50 = var46.customWrapperIndirection((java.lang.Throwable)var49);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var55 = var54.badActivateTieCall();
    org.omg.CORBA.MARSHAL var56 = var52.customWrapperIndirection((java.lang.Throwable)var55);
    org.omg.CORBA.BAD_INV_ORDER var57 = var46.argumentsCalledNullArgs((java.lang.Throwable)var56);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var60 = var59.badActivateTieCall();
    org.omg.CORBA.INTERNAL var61 = var46.badSystemExceptionInLocateReply((java.lang.Throwable)var60);
    org.omg.CORBA.MARSHAL var62 = var46.badDigitInFixed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var67 = var66.badActivateTieCall();
    org.omg.CORBA.MARSHAL var68 = var64.customWrapperIndirection((java.lang.Throwable)var67);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var73 = var72.badActivateTieCall();
    org.omg.CORBA.MARSHAL var74 = var70.customWrapperIndirection((java.lang.Throwable)var73);
    org.omg.CORBA.BAD_INV_ORDER var75 = var64.argumentsCalledNullArgs((java.lang.Throwable)var74);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var78 = var77.badActivateTieCall();
    org.omg.CORBA.INTERNAL var79 = var64.badSystemExceptionInLocateReply((java.lang.Throwable)var78);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var81 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var83 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var84 = var83.badActivateTieCall();
    org.omg.CORBA.MARSHAL var85 = var81.customWrapperIndirection((java.lang.Throwable)var84);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var87 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var89 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var90 = var89.badActivateTieCall();
    org.omg.CORBA.MARSHAL var91 = var87.customWrapperIndirection((java.lang.Throwable)var90);
    org.omg.CORBA.BAD_INV_ORDER var92 = var81.argumentsCalledNullArgs((java.lang.Throwable)var91);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var94 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var95 = var94.badActivateTieCall();
    org.omg.CORBA.INTERNAL var96 = var81.badSystemExceptionInLocateReply((java.lang.Throwable)var95);
    org.omg.CORBA.INTERNAL var97 = var64.duplicateExceptionDetailMessage((java.lang.Throwable)var95);
    org.omg.CORBA.COMM_FAILURE var98 = var18.createListenerFailed((java.lang.Throwable)var62, (java.lang.Object)var97);
    
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
    assertNotNull(var10);
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

}
