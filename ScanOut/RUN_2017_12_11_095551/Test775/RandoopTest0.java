
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.Enumeration var1 = var0.getLoggerNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)1L);
    java.util.Set var3 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.UNKNOWN var7 = var1.noInterfaceDefStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var13.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var16 = var11.getLocalHostFailed((java.lang.Throwable)var15);
    org.omg.CORBA.DATA_CONVERSION var17 = var11.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var19.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var22 = var11.getDelegateServantNotActive((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var28 = var26.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var29 = var24.getLocalHostFailed((java.lang.Throwable)var28);
    org.omg.CORBA.BAD_PARAM var30 = var11.stringExpected((java.lang.Throwable)var28);
    org.omg.CORBA.BAD_OPERATION var31 = var9.insertObjectIncompatible((java.lang.Throwable)var30);
    org.omg.CORBA.MARSHAL var33 = var1.cnfeReadClass((java.lang.Throwable)var30, (java.lang.Object)(-1.0f));
    
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
    assertNotNull(var13);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var16 = var14.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var19 = var14.badChunkLength((java.lang.Object)0.0f, (java.lang.Object)0.0d);
    org.omg.CORBA.BAD_OPERATION var20 = var1.setExceptionCalledBadType((java.lang.Throwable)var19);
    org.omg.CORBA.BAD_OPERATION var21 = var1.fixedNotMatch();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var3 = var1.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var4 = var1.unionDiscriminatorError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var18 = var16.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var19 = var14.getLocalHostFailed((java.lang.Throwable)var18);
    org.omg.CORBA.DATA_CONVERSION var20 = var14.badHexDigit();
    org.omg.CORBA.BAD_OPERATION var21 = var1.serverIdNotAvailable((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var27.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var30 = var25.getLocalHostFailed((java.lang.Throwable)var29);
    org.omg.CORBA.DATA_CONVERSION var31 = var25.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var33.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var36 = var25.getDelegateServantNotActive((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var42 = var40.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var43 = var38.getLocalHostFailed((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var44 = var25.stringExpected((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var45 = var1.invalidRequestPartitioningComponentValue((java.lang.Object)(byte)(-1), (java.lang.Object)10L, (java.lang.Object)var44);
    org.omg.CORBA.INTERNAL var47 = var1.unsupportedGiopVersion((java.lang.Object)(byte)1);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var13 = var11.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var14 = var9.getLocalHostFailed((java.lang.Throwable)var13);
    org.omg.CORBA.DATA_CONVERSION var15 = var9.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var19 = var17.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var20 = var9.getDelegateServantNotActive((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var21 = var1.statementNotReachable2((java.lang.Throwable)var19);
    org.omg.CORBA.DATA_CONVERSION var24 = var1.fragmentSizeMinimum((java.lang.Object)(-1), (java.lang.Object)(short)(-1));
    
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
    assertNotNull(var24);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var18 = var16.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var19 = var14.getLocalHostFailed((java.lang.Throwable)var18);
    org.omg.CORBA.DATA_CONVERSION var20 = var14.badHexDigit();
    org.omg.CORBA.BAD_OPERATION var21 = var1.serverIdNotAvailable((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var27.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var30 = var25.getLocalHostFailed((java.lang.Throwable)var29);
    org.omg.CORBA.DATA_CONVERSION var31 = var25.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var33.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var36 = var25.getDelegateServantNotActive((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var42 = var40.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var43 = var38.getLocalHostFailed((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var44 = var25.stringExpected((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var45 = var1.invalidRequestPartitioningComponentValue((java.lang.Object)(byte)(-1), (java.lang.Object)10L, (java.lang.Object)var44);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var51 = var49.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var52 = var47.getLocalHostFailed((java.lang.Throwable)var51);
    org.omg.CORBA.DATA_CONVERSION var53 = var47.badHexDigit();
    org.omg.CORBA.BAD_OPERATION var54 = var47.setDelegateRequiresStub();
    org.omg.CORBA.INTERNAL var55 = var1.peekstringFailed((java.lang.Throwable)var54);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var18 = var16.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var19 = var14.getLocalHostFailed((java.lang.Throwable)var18);
    org.omg.CORBA.DATA_CONVERSION var20 = var14.badHexDigit();
    org.omg.CORBA.BAD_OPERATION var21 = var1.serverIdNotAvailable((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var27.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var30 = var25.getLocalHostFailed((java.lang.Throwable)var29);
    org.omg.CORBA.DATA_CONVERSION var31 = var25.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var33.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var36 = var25.getDelegateServantNotActive((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var42 = var40.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var43 = var38.getLocalHostFailed((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var44 = var25.stringExpected((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var45 = var1.invalidRequestPartitioningComponentValue((java.lang.Object)(byte)(-1), (java.lang.Object)10L, (java.lang.Object)var44);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var51 = var49.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var52 = var47.getLocalHostFailed((java.lang.Throwable)var51);
    org.omg.CORBA.DATA_CONVERSION var53 = var47.badHexDigit();
    org.omg.CORBA.MARSHAL var54 = var1.unexpectedEof((java.lang.Throwable)var53);
    org.omg.CORBA.MARSHAL var55 = var1.valuehandlerReadError();
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var18 = var16.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var19 = var14.getLocalHostFailed((java.lang.Throwable)var18);
    org.omg.CORBA.BAD_PARAM var20 = var1.stringExpected((java.lang.Throwable)var18);
    org.omg.CORBA.DATA_CONVERSION var22 = var1.illegalContactInfoListFactoryType((java.lang.Object)(short)1);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var28 = var26.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var29 = var24.getLocalHostFailed((java.lang.Throwable)var28);
    org.omg.CORBA.DATA_CONVERSION var30 = var24.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var34 = var32.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var35 = var24.getDelegateServantNotActive((java.lang.Throwable)var34);
    org.omg.CORBA.INTERNAL var36 = var1.invocationInfoStackEmpty((java.lang.Throwable)var34);
    
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
    assertNotNull(var36);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var18 = var16.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var19 = var14.getLocalHostFailed((java.lang.Throwable)var18);
    org.omg.CORBA.BAD_PARAM var20 = var1.stringExpected((java.lang.Throwable)var18);
    org.omg.CORBA.BAD_OPERATION var21 = var1.getDelegateWrongPolicy();
    
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

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var18 = var16.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var19 = var14.getLocalHostFailed((java.lang.Throwable)var18);
    org.omg.CORBA.BAD_PARAM var20 = var1.stringExpected((java.lang.Throwable)var18);
    org.omg.CORBA.BAD_OPERATION var21 = var1.setExceptionCalledBadType();
    
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

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.UNKNOWN var7 = var1.noInterfaceDefStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var13 = var11.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var14 = var9.getLocalHostFailed((java.lang.Throwable)var13);
    org.omg.CORBA.DATA_CONVERSION var15 = var9.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var19 = var17.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var20 = var9.getDelegateServantNotActive((java.lang.Throwable)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var26 = var24.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var27 = var22.getLocalHostFailed((java.lang.Throwable)var26);
    org.omg.CORBA.DATA_CONVERSION var28 = var22.badHexDigit();
    org.omg.CORBA.BAD_OPERATION var29 = var9.serverIdNotAvailable((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var37 = var35.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var38 = var33.getLocalHostFailed((java.lang.Throwable)var37);
    org.omg.CORBA.DATA_CONVERSION var39 = var33.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var43 = var41.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var44 = var33.getDelegateServantNotActive((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var50 = var48.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var51 = var46.getLocalHostFailed((java.lang.Throwable)var50);
    org.omg.CORBA.BAD_PARAM var52 = var33.stringExpected((java.lang.Throwable)var50);
    org.omg.CORBA.BAD_PARAM var53 = var9.invalidRequestPartitioningComponentValue((java.lang.Object)(byte)(-1), (java.lang.Object)10L, (java.lang.Object)var52);
    org.omg.CORBA.COMM_FAILURE var54 = var9.invokeError();
    org.omg.CORBA.DATA_CONVERSION var55 = var1.illegalContactInfoListFactoryType((java.lang.Object)var9);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var8 = var6.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var9 = var4.getLocalHostFailed((java.lang.Throwable)var8);
    org.omg.CORBA.DATA_CONVERSION var10 = var4.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var14 = var12.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var15 = var4.getDelegateServantNotActive((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var19.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var22 = var17.getLocalHostFailed((java.lang.Throwable)var21);
    org.omg.CORBA.BAD_PARAM var23 = var4.stringExpected((java.lang.Throwable)var21);
    org.omg.CORBA.BAD_OPERATION var24 = var2.insertObjectIncompatible((java.lang.Throwable)var23);
    java.lang.Object var25 = var0.remove((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNull(var25);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var3 = var1.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.COMM_FAILURE var4 = var1.ioexceptionWhenReadingConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.UNKNOWN var7 = var1.noInterfaceDefStub();
    org.omg.CORBA.MARSHAL var8 = var1.endOfStream();
    org.omg.CORBA.MARSHAL var9 = var1.valuehandlerReadException();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var13.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var16 = var11.getLocalHostFailed((java.lang.Throwable)var15);
    org.omg.CORBA.DATA_CONVERSION var17 = var11.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var19.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var22 = var11.getDelegateServantNotActive((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var23 = var1.methodShouldNotBeCalled((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var27.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var30 = var25.getLocalHostFailed((java.lang.Throwable)var29);
    org.omg.CORBA.UNKNOWN var31 = var25.noInterfaceDefStub();
    org.omg.CORBA.MARSHAL var32 = var25.endOfStream();
    org.omg.CORBA.MARSHAL var33 = var25.valuehandlerReadException();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var39 = var37.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var40 = var35.getLocalHostFailed((java.lang.Throwable)var39);
    org.omg.CORBA.DATA_CONVERSION var41 = var35.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var45 = var43.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var46 = var35.getDelegateServantNotActive((java.lang.Throwable)var45);
    org.omg.CORBA.INTERNAL var47 = var25.methodShouldNotBeCalled((java.lang.Throwable)var45);
    org.omg.CORBA.MARSHAL var49 = var25.indirectionNotFound((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var50 = var25.badLocateRequestStatus();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var56 = var54.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var57 = var52.getLocalHostFailed((java.lang.Throwable)var56);
    org.omg.CORBA.UNKNOWN var58 = var52.noInterfaceDefStub();
    org.omg.CORBA.MARSHAL var59 = var52.endOfStream();
    org.omg.CORBA.MARSHAL var60 = var52.valuehandlerReadException();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var66 = var64.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var67 = var62.getLocalHostFailed((java.lang.Throwable)var66);
    org.omg.CORBA.DATA_CONVERSION var68 = var62.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var72 = var70.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var73 = var62.getDelegateServantNotActive((java.lang.Throwable)var72);
    org.omg.CORBA.INTERNAL var74 = var52.methodShouldNotBeCalled((java.lang.Throwable)var72);
    org.omg.CORBA.INTERNAL var75 = var25.statementNotReachable2((java.lang.Throwable)var74);
    org.omg.CORBA.BAD_PARAM var76 = var1.objrefFromForeignOrb((java.lang.Throwable)var74);
    
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
    assertNotNull(var19);
    
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
    assertNotNull(var30);
    
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
    assertNotNull(var76);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var2 = var1.emptyStackRunServantPostInvoke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var13 = var11.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var14 = var9.getLocalHostFailed((java.lang.Throwable)var13);
    org.omg.CORBA.DATA_CONVERSION var15 = var9.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var19 = var17.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var20 = var9.getDelegateServantNotActive((java.lang.Throwable)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var26 = var24.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var27 = var22.getLocalHostFailed((java.lang.Throwable)var26);
    org.omg.CORBA.BAD_PARAM var28 = var9.stringExpected((java.lang.Throwable)var26);
    org.omg.CORBA.DATA_CONVERSION var30 = var9.illegalContactInfoListFactoryType((java.lang.Object)(short)1);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var36 = var34.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var37 = var32.getLocalHostFailed((java.lang.Throwable)var36);
    org.omg.CORBA.UNKNOWN var38 = var32.noInterfaceDefStub();
    org.omg.CORBA.OBJECT_NOT_EXIST var39 = var9.badSkeleton((java.lang.Throwable)var38);
    org.omg.CORBA.OBJECT_NOT_EXIST var40 = var1.dynAnyDestroyed((java.lang.Throwable)var38);
    
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
    assertNotNull(var30);
    
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
    assertNotNull(var40);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var18 = var16.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var19 = var14.getLocalHostFailed((java.lang.Throwable)var18);
    org.omg.CORBA.DATA_CONVERSION var20 = var14.badHexDigit();
    org.omg.CORBA.BAD_OPERATION var21 = var1.serverIdNotAvailable((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var27.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var30 = var25.getLocalHostFailed((java.lang.Throwable)var29);
    org.omg.CORBA.DATA_CONVERSION var31 = var25.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var33.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var36 = var25.getDelegateServantNotActive((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var42 = var40.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var43 = var38.getLocalHostFailed((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var44 = var25.stringExpected((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var45 = var1.invalidRequestPartitioningComponentValue((java.lang.Object)(byte)(-1), (java.lang.Object)10L, (java.lang.Object)var44);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var51 = var49.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var52 = var47.getLocalHostFailed((java.lang.Throwable)var51);
    org.omg.CORBA.DATA_CONVERSION var53 = var47.badHexDigit();
    org.omg.CORBA.MARSHAL var54 = var1.unexpectedEof((java.lang.Throwable)var53);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var60 = var58.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var61 = var56.getLocalHostFailed((java.lang.Throwable)var60);
    org.omg.CORBA.DATA_CONVERSION var62 = var56.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var66 = var64.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var67 = var56.getDelegateServantNotActive((java.lang.Throwable)var66);
    org.omg.CORBA.INTERNAL var68 = var56.noToa();
    org.omg.CORBA.BAD_INV_ORDER var69 = var1.setResultCalledMultiple((java.lang.Throwable)var68);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
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

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var3.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var6 = var1.getLocalHostFailed((java.lang.Throwable)var5);
    org.omg.CORBA.DATA_CONVERSION var7 = var1.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var9.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateServantNotActive((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var18 = var16.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var19 = var14.getLocalHostFailed((java.lang.Throwable)var18);
    org.omg.CORBA.DATA_CONVERSION var20 = var14.badHexDigit();
    org.omg.CORBA.BAD_OPERATION var21 = var1.serverIdNotAvailable((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var27.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var30 = var25.getLocalHostFailed((java.lang.Throwable)var29);
    org.omg.CORBA.DATA_CONVERSION var31 = var25.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var35 = var33.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var36 = var25.getDelegateServantNotActive((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var42 = var40.classNotFound3((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var43 = var38.getLocalHostFailed((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var44 = var25.stringExpected((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_PARAM var45 = var1.invalidRequestPartitioningComponentValue((java.lang.Object)(byte)(-1), (java.lang.Object)10L, (java.lang.Object)var44);
    org.omg.CORBA.COMM_FAILURE var46 = var1.invokeError();
    org.omg.CORBA.DATA_CONVERSION var47 = var1.badHexDigit();
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
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

  }

}
