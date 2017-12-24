
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.entering("1.0", "");
    boolean var4 = var0.getUseParentHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var2 = var1.bootstrapException();
    java.util.logging.Logger var3 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.BAD_PARAM var7 = var6.bootstrapException();
    org.omg.CORBA.MARSHAL var8 = var4.iiopinputstreamGrow((java.lang.Throwable)var7);
    org.omg.CORBA.MARSHAL var9 = var1.cannotMarshalNative((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var10 = var1.badSystemExceptionInReply();
    org.omg.CORBA.INTERNAL var11 = var1.getSystemExReturnedNull();
    org.omg.CORBA.MARSHAL var12 = var1.badKind();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var1 = var0.getParent();
    java.util.ResourceBundle var2 = var0.getResourceBundle();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    java.util.logging.Logger var7 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    org.omg.CORBA.BAD_PARAM var9 = var8.bootstrapException();
    org.omg.CORBA.MARSHAL var10 = var6.stubCreateError((java.lang.Throwable)var9);
    java.util.logging.Logger var11 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var11);
    java.util.logging.Logger var13 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var13);
    org.omg.CORBA.BAD_PARAM var15 = var14.bootstrapException();
    org.omg.CORBA.MARSHAL var16 = var12.iiopinputstreamGrow((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var18 = var6.badHelperWriteMethod((java.lang.Throwable)var16, (java.lang.Object)(-1));
    org.omg.CORBA.INTERNAL var19 = var6.badSystemExceptionInReply();
    org.omg.CORBA.INTERNAL var20 = var6.badMessageTypeForCancel();
    java.util.logging.Logger var21 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    org.omg.CORBA.BAD_OPERATION var23 = var22.getTypeIdsRequiresStub();
    java.util.logging.Logger var24 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var24);
    java.util.logging.Logger var26 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var26);
    org.omg.CORBA.BAD_PARAM var28 = var27.bootstrapException();
    org.omg.CORBA.MARSHAL var29 = var25.stubCreateError((java.lang.Throwable)var28);
    java.util.logging.Logger var30 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var30);
    java.util.logging.Logger var32 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var32);
    org.omg.CORBA.BAD_PARAM var34 = var33.bootstrapException();
    org.omg.CORBA.MARSHAL var35 = var31.iiopinputstreamGrow((java.lang.Throwable)var34);
    org.omg.CORBA.INTERNAL var37 = var25.badHelperWriteMethod((java.lang.Throwable)var35, (java.lang.Object)(-1));
    org.omg.CORBA.OBJECT_NOT_EXIST var38 = var22.badSkeleton((java.lang.Throwable)var35);
    org.omg.CORBA.INTERNAL var39 = var6.peekstringFailed((java.lang.Throwable)var38);
    var0.exiting("hi!", "10", (java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.BAD_PARAM var4 = var3.bootstrapException();
    org.omg.CORBA.MARSHAL var5 = var1.stubCreateError((java.lang.Throwable)var4);
    java.util.logging.Logger var6 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    org.omg.CORBA.BAD_PARAM var10 = var9.bootstrapException();
    org.omg.CORBA.MARSHAL var11 = var7.iiopinputstreamGrow((java.lang.Throwable)var10);
    org.omg.CORBA.INTERNAL var13 = var1.badHelperWriteMethod((java.lang.Throwable)var11, (java.lang.Object)(-1));
    org.omg.CORBA.INTERNAL var14 = var1.badSystemExceptionInReply();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    org.omg.CORBA.BAD_PARAM var17 = var16.bootstrapException();
    java.util.logging.Logger var18 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var18);
    java.util.logging.Logger var20 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    org.omg.CORBA.BAD_PARAM var22 = var21.bootstrapException();
    org.omg.CORBA.MARSHAL var23 = var19.iiopinputstreamGrow((java.lang.Throwable)var22);
    org.omg.CORBA.MARSHAL var24 = var16.cannotMarshalNative((java.lang.Throwable)var22);
    org.omg.CORBA.BAD_OPERATION var25 = var1.connectingServant((java.lang.Throwable)var22);
    java.util.logging.Logger var26 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var26);
    org.omg.CORBA.BAD_PARAM var28 = var27.bootstrapException();
    java.util.logging.Logger var29 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var29);
    java.util.logging.Logger var31 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var31);
    org.omg.CORBA.BAD_PARAM var33 = var32.bootstrapException();
    org.omg.CORBA.MARSHAL var34 = var30.iiopinputstreamGrow((java.lang.Throwable)var33);
    org.omg.CORBA.MARSHAL var35 = var27.cannotMarshalNative((java.lang.Throwable)var33);
    org.omg.CORBA.INITIALIZE var36 = var1.cannotCreateOrbidDb((java.lang.Throwable)var33);
    java.util.logging.Logger var37 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var37);
    java.util.logging.Logger var39 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var39);
    org.omg.CORBA.BAD_PARAM var41 = var40.bootstrapException();
    org.omg.CORBA.MARSHAL var42 = var38.stubCreateError((java.lang.Throwable)var41);
    java.util.logging.Logger var43 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var43);
    java.util.logging.Logger var45 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var45);
    org.omg.CORBA.BAD_PARAM var47 = var46.bootstrapException();
    org.omg.CORBA.MARSHAL var48 = var44.iiopinputstreamGrow((java.lang.Throwable)var47);
    org.omg.CORBA.INTERNAL var50 = var38.badHelperWriteMethod((java.lang.Throwable)var48, (java.lang.Object)(-1));
    org.omg.CORBA.MARSHAL var52 = var38.unknownCodeset((java.lang.Object)(short)10);
    org.omg.CORBA.INTERNAL var53 = var1.cancelNotSupported((java.lang.Throwable)var52);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.BAD_PARAM var4 = var3.bootstrapException();
    org.omg.CORBA.MARSHAL var5 = var1.stubCreateError((java.lang.Throwable)var4);
    java.util.logging.Logger var6 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    org.omg.CORBA.BAD_PARAM var10 = var9.bootstrapException();
    org.omg.CORBA.MARSHAL var11 = var7.iiopinputstreamGrow((java.lang.Throwable)var10);
    org.omg.CORBA.INTERNAL var13 = var1.badHelperWriteMethod((java.lang.Throwable)var11, (java.lang.Object)(-1));
    java.util.logging.Logger var14 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var14);
    java.util.logging.Logger var16 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var16);
    org.omg.CORBA.BAD_PARAM var18 = var17.bootstrapException();
    org.omg.CORBA.MARSHAL var19 = var15.iiopinputstreamGrow((java.lang.Throwable)var18);
    org.omg.CORBA.MARSHAL var21 = var1.indirectionNotFound((java.lang.Throwable)var18, (java.lang.Object)(-1.0f));
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var2 = var1.bootstrapException();
    java.util.logging.Logger var3 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.BAD_PARAM var7 = var6.bootstrapException();
    org.omg.CORBA.MARSHAL var8 = var4.iiopinputstreamGrow((java.lang.Throwable)var7);
    org.omg.CORBA.MARSHAL var9 = var1.cannotMarshalNative((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var10 = var1.badSystemExceptionInReply();
    org.omg.CORBA.INTERNAL var11 = var1.getSystemExReturnedNull();
    java.util.logging.Logger var12 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    java.util.logging.Logger var14 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var14);
    org.omg.CORBA.BAD_PARAM var16 = var15.bootstrapException();
    org.omg.CORBA.MARSHAL var17 = var13.stubCreateError((java.lang.Throwable)var16);
    java.util.logging.Logger var18 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var18);
    java.util.logging.Logger var20 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    org.omg.CORBA.BAD_PARAM var22 = var21.bootstrapException();
    org.omg.CORBA.MARSHAL var23 = var19.iiopinputstreamGrow((java.lang.Throwable)var22);
    org.omg.CORBA.INTERNAL var25 = var13.badHelperWriteMethod((java.lang.Throwable)var23, (java.lang.Object)(-1));
    org.omg.CORBA.INTERNAL var26 = var13.badSystemExceptionInReply();
    java.util.logging.Logger var27 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var27);
    org.omg.CORBA.BAD_PARAM var29 = var28.bootstrapException();
    java.util.logging.Logger var30 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var30);
    java.util.logging.Logger var32 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var32);
    org.omg.CORBA.BAD_PARAM var34 = var33.bootstrapException();
    org.omg.CORBA.MARSHAL var35 = var31.iiopinputstreamGrow((java.lang.Throwable)var34);
    org.omg.CORBA.MARSHAL var36 = var28.cannotMarshalNative((java.lang.Throwable)var34);
    org.omg.CORBA.BAD_OPERATION var37 = var13.connectingServant((java.lang.Throwable)var34);
    java.util.logging.Logger var38 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var38);
    org.omg.CORBA.BAD_PARAM var40 = var39.bootstrapException();
    java.util.logging.Logger var41 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var41);
    java.util.logging.Logger var43 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var43);
    org.omg.CORBA.BAD_PARAM var45 = var44.bootstrapException();
    org.omg.CORBA.MARSHAL var46 = var42.iiopinputstreamGrow((java.lang.Throwable)var45);
    org.omg.CORBA.MARSHAL var47 = var39.cannotMarshalNative((java.lang.Throwable)var45);
    org.omg.CORBA.INITIALIZE var48 = var13.cannotCreateOrbidDb((java.lang.Throwable)var45);
    org.omg.CORBA.BAD_OPERATION var49 = var1.setExceptionCalledBadType((java.lang.Throwable)var48);
    java.util.logging.Logger var50 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var50);
    java.util.logging.Logger var52 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var52);
    org.omg.CORBA.BAD_PARAM var54 = var53.bootstrapException();
    org.omg.CORBA.MARSHAL var55 = var51.stubCreateError((java.lang.Throwable)var54);
    org.omg.CORBA.BAD_OPERATION var56 = var51.requestRequiresStub();
    org.omg.CORBA.INTERNAL var58 = var1.readUndeclaredException((java.lang.Throwable)var56, (java.lang.Object)1L);
    
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
    assertNotNull(var58);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.BAD_PARAM var4 = var3.bootstrapException();
    org.omg.CORBA.MARSHAL var5 = var1.iiopinputstreamGrow((java.lang.Throwable)var4);
    java.util.logging.Logger var6 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    org.omg.CORBA.BAD_PARAM var8 = var7.bootstrapException();
    java.util.logging.Logger var9 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var9);
    java.util.logging.Logger var11 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var11);
    org.omg.CORBA.BAD_PARAM var13 = var12.bootstrapException();
    org.omg.CORBA.MARSHAL var14 = var10.iiopinputstreamGrow((java.lang.Throwable)var13);
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    java.util.logging.Logger var17 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    org.omg.CORBA.BAD_PARAM var19 = var18.bootstrapException();
    org.omg.CORBA.MARSHAL var20 = var16.stubCreateError((java.lang.Throwable)var19);
    org.omg.CORBA.BAD_OPERATION var21 = var16.requestRequiresStub();
    org.omg.CORBA.INTERNAL var22 = var10.errorResolvingAlias((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.invalidIndirection((java.lang.Throwable)var8, (java.lang.Object)var21);
    java.util.logging.Logger var24 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var24);
    java.util.logging.Logger var26 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var26);
    org.omg.CORBA.BAD_PARAM var28 = var27.bootstrapException();
    org.omg.CORBA.MARSHAL var29 = var25.iiopinputstreamGrow((java.lang.Throwable)var28);
    java.util.logging.Logger var30 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var30);
    org.omg.CORBA.BAD_PARAM var32 = var31.bootstrapException();
    java.util.logging.Logger var33 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var33);
    java.util.logging.Logger var35 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var35);
    org.omg.CORBA.BAD_PARAM var37 = var36.bootstrapException();
    org.omg.CORBA.MARSHAL var38 = var34.iiopinputstreamGrow((java.lang.Throwable)var37);
    java.util.logging.Logger var39 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var39);
    java.util.logging.Logger var41 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var41);
    org.omg.CORBA.BAD_PARAM var43 = var42.bootstrapException();
    org.omg.CORBA.MARSHAL var44 = var40.stubCreateError((java.lang.Throwable)var43);
    org.omg.CORBA.BAD_OPERATION var45 = var40.requestRequiresStub();
    org.omg.CORBA.INTERNAL var46 = var34.errorResolvingAlias((java.lang.Throwable)var45);
    org.omg.CORBA.MARSHAL var47 = var25.invalidIndirection((java.lang.Throwable)var32, (java.lang.Object)var45);
    org.omg.CORBA.INTERNAL var48 = var1.illegalTargetAddressDisposition((java.lang.Throwable)var45);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertNotNull(var26);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.BAD_PARAM var4 = var3.bootstrapException();
    org.omg.CORBA.MARSHAL var5 = var1.stubCreateError((java.lang.Throwable)var4);
    org.omg.CORBA.BAD_OPERATION var6 = var1.requestRequiresStub();
    java.util.logging.Logger var7 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.util.logging.Logger var9 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var9);
    org.omg.CORBA.BAD_PARAM var11 = var10.bootstrapException();
    org.omg.CORBA.MARSHAL var12 = var8.stubCreateError((java.lang.Throwable)var11);
    java.util.logging.Logger var13 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var13);
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    org.omg.CORBA.BAD_PARAM var17 = var16.bootstrapException();
    org.omg.CORBA.MARSHAL var18 = var14.iiopinputstreamGrow((java.lang.Throwable)var17);
    org.omg.CORBA.INTERNAL var20 = var8.badHelperWriteMethod((java.lang.Throwable)var18, (java.lang.Object)(-1));
    java.util.logging.Logger var21 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    java.util.logging.Logger var23 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var23);
    org.omg.CORBA.BAD_PARAM var25 = var24.bootstrapException();
    org.omg.CORBA.MARSHAL var26 = var22.stubCreateError((java.lang.Throwable)var25);
    java.util.logging.Logger var27 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var27);
    java.util.logging.Logger var29 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var29);
    org.omg.CORBA.BAD_PARAM var31 = var30.bootstrapException();
    org.omg.CORBA.MARSHAL var32 = var28.iiopinputstreamGrow((java.lang.Throwable)var31);
    org.omg.CORBA.INTERNAL var34 = var22.badHelperWriteMethod((java.lang.Throwable)var32, (java.lang.Object)(-1));
    org.omg.CORBA.MARSHAL var36 = var22.unknownCodeset((java.lang.Object)(short)10);
    org.omg.CORBA.BAD_TYPECODE var37 = var8.badRemoteTypecode((java.lang.Throwable)var36);
    org.omg.CORBA.BAD_OPERATION var38 = var8.contextCalledOutOfOrder();
    java.util.logging.Logger var39 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var39);
    java.util.logging.Logger var41 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var41);
    org.omg.CORBA.BAD_PARAM var43 = var42.bootstrapException();
    org.omg.CORBA.MARSHAL var44 = var40.iiopinputstreamGrow((java.lang.Throwable)var43);
    java.util.logging.Logger var45 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var45);
    org.omg.CORBA.BAD_PARAM var47 = var46.bootstrapException();
    java.util.logging.Logger var48 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var48);
    java.util.logging.Logger var50 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var50);
    org.omg.CORBA.BAD_PARAM var52 = var51.bootstrapException();
    org.omg.CORBA.MARSHAL var53 = var49.iiopinputstreamGrow((java.lang.Throwable)var52);
    org.omg.CORBA.MARSHAL var54 = var46.cannotMarshalNative((java.lang.Throwable)var52);
    org.omg.CORBA.COMM_FAILURE var55 = var8.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Throwable)var44, (java.lang.Object)var54);
    org.omg.CORBA.INV_OBJREF var56 = var1.badCorbalocString((java.lang.Throwable)var55);
    
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
    assertNotNull(var29);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
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

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.BAD_PARAM var4 = var3.bootstrapException();
    org.omg.CORBA.MARSHAL var5 = var1.stubCreateError((java.lang.Throwable)var4);
    java.util.logging.Logger var6 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    org.omg.CORBA.BAD_PARAM var10 = var9.bootstrapException();
    org.omg.CORBA.MARSHAL var11 = var7.iiopinputstreamGrow((java.lang.Throwable)var10);
    org.omg.CORBA.INTERNAL var13 = var1.badHelperWriteMethod((java.lang.Throwable)var11, (java.lang.Object)(-1));
    org.omg.CORBA.INTERNAL var14 = var1.badSystemExceptionInReply();
    org.omg.CORBA.BAD_OPERATION var15 = var1.insertObjectFailed();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.BAD_PARAM var4 = var3.bootstrapException();
    org.omg.CORBA.MARSHAL var5 = var1.stubCreateError((java.lang.Throwable)var4);
    java.util.logging.Logger var6 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    org.omg.CORBA.BAD_PARAM var10 = var9.bootstrapException();
    org.omg.CORBA.MARSHAL var11 = var7.iiopinputstreamGrow((java.lang.Throwable)var10);
    org.omg.CORBA.INTERNAL var13 = var1.badHelperWriteMethod((java.lang.Throwable)var11, (java.lang.Object)(-1));
    org.omg.CORBA.INTERNAL var14 = var1.badSystemExceptionInReply();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    java.util.logging.Logger var17 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    org.omg.CORBA.BAD_PARAM var19 = var18.bootstrapException();
    org.omg.CORBA.MARSHAL var20 = var16.stubCreateError((java.lang.Throwable)var19);
    java.util.logging.Logger var21 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    java.util.logging.Logger var23 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var23);
    org.omg.CORBA.BAD_PARAM var25 = var24.bootstrapException();
    org.omg.CORBA.MARSHAL var26 = var22.iiopinputstreamGrow((java.lang.Throwable)var25);
    org.omg.CORBA.INTERNAL var28 = var16.badHelperWriteMethod((java.lang.Throwable)var26, (java.lang.Object)(-1));
    org.omg.CORBA.INTERNAL var29 = var1.badCompletionStatusInReply((java.lang.Object)var16);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var0, 10, 1, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var2 = var1.bootstrapException();
    java.util.logging.Logger var3 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.BAD_PARAM var7 = var6.bootstrapException();
    org.omg.CORBA.MARSHAL var8 = var4.iiopinputstreamGrow((java.lang.Throwable)var7);
    org.omg.CORBA.MARSHAL var9 = var1.cannotMarshalNative((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var10 = var1.badSystemExceptionInReply();
    org.omg.CORBA.INTERNAL var11 = var1.getLocalHostFailed();
    java.util.logging.Logger var12 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.BAD_PARAM var14 = var13.bootstrapException();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    java.util.logging.Logger var17 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    org.omg.CORBA.BAD_PARAM var19 = var18.bootstrapException();
    org.omg.CORBA.MARSHAL var20 = var16.iiopinputstreamGrow((java.lang.Throwable)var19);
    org.omg.CORBA.MARSHAL var21 = var13.cannotMarshalNative((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var22 = var13.badSystemExceptionInReply();
    java.util.logging.Logger var23 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var23);
    org.omg.CORBA.BAD_PARAM var25 = var24.bootstrapException();
    java.util.logging.Logger var26 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var26);
    java.util.logging.Logger var28 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var28);
    org.omg.CORBA.BAD_PARAM var30 = var29.bootstrapException();
    org.omg.CORBA.MARSHAL var31 = var27.iiopinputstreamGrow((java.lang.Throwable)var30);
    org.omg.CORBA.MARSHAL var32 = var24.cannotMarshalNative((java.lang.Throwable)var30);
    org.omg.CORBA.INTERNAL var33 = var24.badSystemExceptionInReply();
    org.omg.CORBA.INTERNAL var34 = var24.getSystemExReturnedNull();
    org.omg.CORBA.BAD_PARAM var35 = var13.badOrbForServant((java.lang.Throwable)var34);
    org.omg.CORBA.MARSHAL var36 = var1.cannotMarshalNative((java.lang.Throwable)var35);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var2 = var1.bootstrapException();
    java.util.logging.Logger var3 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.BAD_PARAM var7 = var6.bootstrapException();
    org.omg.CORBA.MARSHAL var8 = var4.iiopinputstreamGrow((java.lang.Throwable)var7);
    org.omg.CORBA.MARSHAL var9 = var1.cannotMarshalNative((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var10 = var1.badSystemExceptionInReply();
    org.omg.CORBA.INTERNAL var11 = var1.getLocalHostFailed();
    org.omg.CORBA.INTERNAL var13 = var1.invalidBuffMgrStrategy((java.lang.Object)(short)0);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

}
