
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    java.lang.Throwable var10 = new java.lang.Throwable("");
    org.omg.CORBA.MARSHAL var11 = var1.invalidSimpleTypecode(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var3 = var1.threadGroupDestroyFailed((java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var7 = var5.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.MARSHAL var8 = var1.badArgumentsNvlist((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var13 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var18 = var11.invalidRequestPartitioningId(var13, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var19 = var11.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var23 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var28 = var21.invalidRequestPartitioningId(var23, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var29 = var21.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var30 = var11.serverScNoIiopProfile((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var36 = var34.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.MARSHAL var37 = var11.unexpectedEnclosingValuetype((java.lang.Object)'4', (java.lang.Object)var34);
    org.omg.CORBA.BAD_OPERATION var38 = var1.extractWrongTypeList((java.lang.Object)'a', (java.lang.Object)var37);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var9 = var1.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var11.badDigitInFixed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var16 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var21 = var14.invalidRequestPartitioningId(var16, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var22 = var14.bootstrapApplicationException();
    org.omg.CORBA.INTERNAL var23 = var11.multIiopProfNotSupported((java.lang.Throwable)var22);
    org.omg.CORBA.OBJECT_NOT_EXIST var24 = var1.servantNotFound((java.lang.Throwable)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var9 = var1.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var10 = var1.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var14 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var19 = var12.invalidRequestPartitioningId(var14, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var20 = var12.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var24 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var29 = var22.invalidRequestPartitioningId(var24, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var30 = var22.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var31 = var12.serverScNoIiopProfile((java.lang.Throwable)var30);
    org.omg.CORBA.BAD_OPERATION var32 = var12.connectRequiresStub();
    org.omg.CORBA.BAD_PARAM var33 = var1.stringExpected((java.lang.Throwable)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var9 = var1.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var10 = var1.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var14 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var19 = var12.invalidRequestPartitioningId(var14, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var20 = var12.abstractFromNonAbstract();
    org.omg.CORBA.INTERNAL var21 = var12.btcConverterFailure();
    org.omg.CORBA.BAD_PARAM var22 = var1.stringExpected((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var26 = var24.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.OBJECT_NOT_EXIST var27 = var24.locateUnknownObject();
    org.omg.CORBA.INTERNAL var28 = var1.invalidCtbConverterName((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var9 = var1.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var10 = var1.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var14 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var19 = var12.invalidRequestPartitioningId(var14, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var20 = var12.abstractFromNonAbstract();
    org.omg.CORBA.INTERNAL var21 = var12.btcConverterFailure();
    org.omg.CORBA.BAD_PARAM var22 = var1.stringExpected((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.refTypeIndirType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.String var1 = var0.toLocaleString();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDay();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var9 = var1.abstractFromNonAbstract();
    org.omg.CORBA.INTERNAL var10 = var1.btcConverterFailure();
    org.omg.CORBA.BAD_OPERATION var11 = var1.orbIdNotAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var3 = var1.threadGroupDestroyFailed((java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var7 = var5.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.MARSHAL var8 = var1.badArgumentsNvlist((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var12 = var10.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.OBJECT_NOT_EXIST var13 = var10.locateUnknownObject();
    java.lang.Throwable var15 = new java.lang.Throwable("");
    java.lang.Throwable var16 = new java.lang.Throwable(var15);
    java.util.Date var17 = new java.util.Date();
    var17.setMonth(100);
    org.omg.CORBA.INTERNAL var20 = var10.badHelperIdMethod(var16, (java.lang.Object)100);
    org.omg.CORBA.MARSHAL var21 = var1.chunkOverflow((java.lang.Throwable)var20);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_OPERATION var9 = var1.getOrbRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var13 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var18 = var11.invalidRequestPartitioningId(var13, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var19 = var11.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var23 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var28 = var21.invalidRequestPartitioningId(var23, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var29 = var21.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var30 = var11.serverScNoIiopProfile((java.lang.Throwable)var29);
    org.omg.CORBA.BAD_OPERATION var31 = var1.orbConfiguratorError((java.lang.Throwable)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var9 = var1.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var10 = var1.fragmentationDisallowed();
    org.omg.CORBA.BAD_OPERATION var11 = var1.fixedBadTypecode();
    org.omg.CORBA.MARSHAL var12 = var1.valuehandlerReadError();
    org.omg.CORBA.BAD_OPERATION var13 = var1.requestRequiresStub();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    assertNotNull(var13);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var3 = var1.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.OBJECT_NOT_EXIST var4 = var1.locateUnknownObject();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var6.badDigitInFixed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var11 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var16 = var9.invalidRequestPartitioningId(var11, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var17 = var9.bootstrapApplicationException();
    org.omg.CORBA.INTERNAL var18 = var6.multIiopProfNotSupported((java.lang.Throwable)var17);
    java.lang.Throwable var20 = new java.lang.Throwable("");
    java.lang.Throwable var21 = new java.lang.Throwable(var20);
    org.omg.CORBA.INTERNAL var23 = var1.workerThreadCaughtUnexpectedThrowable((java.lang.Throwable)var17, (java.lang.Object)var20, (java.lang.Object)(short)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var27 = var25.threadGroupDestroyFailed((java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var31 = var29.badValueTag((java.lang.Object)100L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var35 = var33.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.INTERNAL var36 = var25.invalidBtcConverterName((java.lang.Throwable)var31, (java.lang.Object)(short)10);
    org.omg.CORBA.COMM_FAILURE var37 = var1.selectionKeyInvalid((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var9 = var1.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var13 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var18 = var11.invalidRequestPartitioningId(var13, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var19 = var11.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var20 = var1.serverScNoIiopProfile((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var21 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var26 = var24.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.MARSHAL var27 = var1.unexpectedEnclosingValuetype((java.lang.Object)'4', (java.lang.Object)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var31 = var29.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.OBJECT_NOT_EXIST var32 = var29.locateUnknownObject();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var35 = var34.badDigitInFixed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var39 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var44 = var37.invalidRequestPartitioningId(var39, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var45 = var37.bootstrapApplicationException();
    org.omg.CORBA.INTERNAL var46 = var34.multIiopProfNotSupported((java.lang.Throwable)var45);
    java.lang.Throwable var48 = new java.lang.Throwable("");
    java.lang.Throwable var49 = new java.lang.Throwable(var48);
    org.omg.CORBA.INTERNAL var51 = var29.workerThreadCaughtUnexpectedThrowable((java.lang.Throwable)var45, (java.lang.Object)var48, (java.lang.Object)(short)(-1));
    org.omg.CORBA.OBJECT_NOT_EXIST var52 = var1.badServerId((java.lang.Throwable)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNotNull(var24);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var12 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var17 = var10.invalidRequestPartitioningId(var12, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var18 = var10.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var19 = var10.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var23 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var28 = var21.invalidRequestPartitioningId(var23, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var29 = var21.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var30 = var21.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var34 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var39 = var32.invalidRequestPartitioningId(var34, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var40 = var32.abstractFromNonAbstract();
    org.omg.CORBA.INTERNAL var41 = var32.btcConverterFailure();
    org.omg.CORBA.BAD_PARAM var42 = var21.stringExpected((java.lang.Throwable)var41);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var46 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var51 = var44.invalidRequestPartitioningId(var46, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var52 = var44.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var53 = var44.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var57 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var62 = var55.invalidRequestPartitioningId(var57, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var63 = var55.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var67 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var72 = var65.invalidRequestPartitioningId(var67, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var73 = var65.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var74 = var55.serverScNoIiopProfile((java.lang.Throwable)var73);
    org.omg.CORBA.BAD_OPERATION var75 = var55.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var78 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var80 = var78.threadGroupDestroyFailed((java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var82 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var84 = var82.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.MARSHAL var85 = var78.badArgumentsNvlist((java.lang.Throwable)var84);
    org.omg.CORBA.COMM_FAILURE var87 = var44.connectFailure((java.lang.Throwable)var75, (java.lang.Object)(short)0, (java.lang.Object)var84, (java.lang.Object)(-1.0f));
    org.omg.CORBA.DATA_CONVERSION var88 = var10.orbInitializerFailure((java.lang.Throwable)var42, (java.lang.Object)var87);
    org.omg.CORBA.BAD_PARAM var89 = var1.unableFindValueFactory((java.lang.Throwable)var87);
    org.omg.CORBA.BAD_INV_ORDER var90 = var1.setResultAfterException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var44);
    
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
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
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
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var9 = var1.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var10 = var1.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var14 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var19 = var12.invalidRequestPartitioningId(var14, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var20 = var12.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var24 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var29 = var22.invalidRequestPartitioningId(var24, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var30 = var22.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var31 = var12.serverScNoIiopProfile((java.lang.Throwable)var30);
    org.omg.CORBA.BAD_OPERATION var32 = var12.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var37 = var35.threadGroupDestroyFailed((java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var41 = var39.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.MARSHAL var42 = var35.badArgumentsNvlist((java.lang.Throwable)var41);
    org.omg.CORBA.COMM_FAILURE var44 = var1.connectFailure((java.lang.Throwable)var32, (java.lang.Object)(short)0, (java.lang.Object)var41, (java.lang.Object)(-1.0f));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var48 = var46.threadGroupDestroyFailed((java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var52 = var50.badValueTag((java.lang.Object)100L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var56 = var54.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.INTERNAL var57 = var46.invalidBtcConverterName((java.lang.Throwable)var52, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var58 = var1.badStringifiedIor((java.lang.Throwable)var52);
    org.omg.CORBA.INITIALIZE var59 = var1.getServerPortCalledBeforeEndpointsInitialized();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var63 = var61.threadGroupDestroyFailed((java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var67 = var65.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.MARSHAL var68 = var61.badArgumentsNvlist((java.lang.Throwable)var67);
    org.omg.CORBA.INTERNAL var70 = var1.workQueueRequestWorkNoWorkFound((java.lang.Object)var68, (java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertNotNull(var44);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId(var3, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var9 = var1.abstractFromNonAbstract();
    org.omg.CORBA.INTERNAL var10 = var1.btcConverterFailure();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var14 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var19 = var12.invalidRequestPartitioningId(var14, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var20 = var12.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var21 = var12.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var25 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var30 = var23.invalidRequestPartitioningId(var25, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var31 = var23.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var35 = new java.lang.Throwable("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_PARAM var40 = var33.invalidRequestPartitioningId(var35, (java.lang.Object)(short)100, (java.lang.Object)"", (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var41 = var33.iiopinputstreamGrow();
    org.omg.CORBA.INTERNAL var42 = var23.serverScNoIiopProfile((java.lang.Throwable)var41);
    org.omg.CORBA.BAD_OPERATION var43 = var23.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var48 = var46.threadGroupDestroyFailed((java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var52 = var50.threadGroupDestroyFailed((java.lang.Object)(short)10);
    org.omg.CORBA.MARSHAL var53 = var46.badArgumentsNvlist((java.lang.Throwable)var52);
    org.omg.CORBA.COMM_FAILURE var55 = var12.connectFailure((java.lang.Throwable)var43, (java.lang.Object)(short)0, (java.lang.Object)var52, (java.lang.Object)(-1.0f));
    org.omg.CORBA.INTERNAL var56 = var1.unableToSetSocketFactoryOrb((java.lang.Throwable)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
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

}
