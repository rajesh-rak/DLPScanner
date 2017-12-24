
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    org.omg.CORBA.MARSHAL var8 = var1.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var12 = var10.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var15 = var14.contextNotImplemented();
    org.omg.CORBA.INTERNAL var16 = var10.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var10.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.MARSHAL var21 = var10.badDigitInFixed((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var23 = var1.badValueTag((java.lang.Throwable)var21, (java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var26 = var25.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var27 = var25.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var30 = var29.contextNotImplemented();
    org.omg.CORBA.INTERNAL var31 = var25.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var34 = var33.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var35 = var33.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var38 = var37.contextNotImplemented();
    org.omg.CORBA.INTERNAL var39 = var33.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var38);
    org.omg.CORBA.INTERNAL var40 = var33.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var43 = var42.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var44 = var42.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var45 = var42.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var48 = var47.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var50 = var42.selectionKeyInvalid((java.lang.Throwable)var48, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var51 = var25.fragmentSizeDiv((java.lang.Object)var33, (java.lang.Object)var50);
    org.omg.CORBA.BAD_OPERATION var52 = var1.orbConfiguratorError((java.lang.Throwable)var51);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var55 = var54.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var56 = var54.genericNoImpl();
    org.omg.CORBA.INTERNAL var57 = var54.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var60 = var59.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var61 = var59.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var62 = var59.getDelegateServantNotActive();
    org.omg.CORBA.BAD_OPERATION var63 = var54.badActivateTieCall((java.lang.Throwable)var62);
    org.omg.CORBA.INTERNAL var64 = var1.badGiopRequestType((java.lang.Throwable)var62);
    
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
    assertNotNull(var7);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var51);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var4 = var1.getDelegateServantNotActive();
    org.omg.CORBA.INTERNAL var5 = var1.wrongClientsc();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var8 = var7.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var9 = var7.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var12 = var11.contextNotImplemented();
    org.omg.CORBA.INTERNAL var13 = var7.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var12);
    org.omg.CORBA.MARSHAL var14 = var7.invalidTypecodeKindMarshal();
    org.omg.CORBA.INTERNAL var15 = var1.problemWithExceptionTypecode((java.lang.Throwable)var14);
    org.omg.CORBA.DATA_CONVERSION var16 = var1.badStringifiedIor();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var16);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.jar.Attributes var1 = new java.util.jar.Attributes(100);
    java.util.jar.Attributes var3 = new java.util.jar.Attributes(100);
    var1.putAll((java.util.Map)var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    org.omg.CORBA.MARSHAL var8 = var1.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var12 = var10.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var15 = var14.contextNotImplemented();
    org.omg.CORBA.INTERNAL var16 = var10.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var10.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.MARSHAL var21 = var10.badDigitInFixed((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var23 = var1.badValueTag((java.lang.Throwable)var21, (java.lang.Object)0L);
    org.omg.CORBA.COMM_FAILURE var24 = var1.writeErrorSend();
    
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
    assertNotNull(var7);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var24);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    org.omg.CORBA.MARSHAL var8 = var1.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var12 = var10.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var15 = var14.contextNotImplemented();
    org.omg.CORBA.INTERNAL var16 = var10.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var10.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.MARSHAL var21 = var10.badDigitInFixed((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var23 = var1.badValueTag((java.lang.Throwable)var21, (java.lang.Object)0L);
    org.omg.CORBA.COMM_FAILURE var24 = var1.ioexceptionWhenReadingConnection();
    
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
    assertNotNull(var7);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var24);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    org.omg.CORBA.INTERNAL var8 = var1.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.MARSHAL var12 = var1.badDigitInFixed((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var15 = var14.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var16 = var14.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var19 = var18.contextNotImplemented();
    org.omg.CORBA.INTERNAL var20 = var14.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var21 = var1.statementNotReachable1((java.lang.Throwable)var20);
    
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
    assertNotNull(var7);
    
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

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#"+ "'", var1.equals("#"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var4 = var1.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var7 = var6.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var9 = var1.selectionKeyInvalid((java.lang.Throwable)var7, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var10 = var1.invalidSingleCharCtb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var13 = var12.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var14 = var12.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var15 = var12.getDelegateServantNotActive();
    org.omg.CORBA.INTERNAL var16 = var12.wrongClientsc();
    org.omg.CORBA.INTERNAL var17 = var1.javaStreamInitFailed((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var21 = var19.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var24 = var23.contextNotImplemented();
    org.omg.CORBA.INTERNAL var25 = var19.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var24);
    org.omg.CORBA.MARSHAL var27 = var1.invalidIndirection((java.lang.Throwable)var25, (java.lang.Object)(short)(-1));
    
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
    assertNotNull(var7);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var10 = var9.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var11 = var9.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var14 = var13.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var16 = var9.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var19 = var18.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var20 = var18.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var21 = var18.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var24 = var23.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var26 = var18.selectionKeyInvalid((java.lang.Throwable)var24, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var27 = var1.fragmentSizeDiv((java.lang.Object)var9, (java.lang.Object)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var30 = var29.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var31 = var29.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var34 = var33.contextNotImplemented();
    org.omg.CORBA.INTERNAL var35 = var29.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var34);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var38 = var37.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var39 = var37.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var42 = var41.contextNotImplemented();
    org.omg.CORBA.INTERNAL var43 = var37.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var42);
    org.omg.CORBA.INTERNAL var44 = var37.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var47 = var46.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var48 = var46.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var49 = var46.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var52 = var51.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var54 = var46.selectionKeyInvalid((java.lang.Throwable)var52, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var55 = var29.fragmentSizeDiv((java.lang.Object)var37, (java.lang.Object)var54);
    org.omg.CORBA.MARSHAL var57 = var1.badValueTag((java.lang.Throwable)var54, (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var60 = var59.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var61 = var59.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var64 = var63.contextNotImplemented();
    org.omg.CORBA.INTERNAL var65 = var59.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var64);
    org.omg.CORBA.INTERNAL var66 = var1.invalidIsstreamedTckind((java.lang.Object)var59);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var69 = var68.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var70 = var68.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var73 = var72.contextNotImplemented();
    org.omg.CORBA.INTERNAL var74 = var68.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var73);
    org.omg.CORBA.MARSHAL var75 = var68.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var78 = var77.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var79 = var77.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var81 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var82 = var81.contextNotImplemented();
    org.omg.CORBA.INTERNAL var83 = var77.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var82);
    org.omg.CORBA.INTERNAL var84 = var77.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var86 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var87 = var86.contextNotImplemented();
    org.omg.CORBA.MARSHAL var88 = var77.badDigitInFixed((java.lang.Throwable)var87);
    org.omg.CORBA.MARSHAL var90 = var68.badValueTag((java.lang.Throwable)var88, (java.lang.Object)0L);
    org.omg.CORBA.NO_IMPLEMENT var91 = var59.genericNoImpl((java.lang.Throwable)var88);
    
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
    assertNotNull(var14);
    
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
    assertNotNull(var34);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNotNull(var64);
    
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
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var10 = var9.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var11 = var9.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var14 = var13.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var16 = var9.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var19 = var18.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var20 = var18.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var21 = var18.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var24 = var23.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var26 = var18.selectionKeyInvalid((java.lang.Throwable)var24, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var27 = var1.fragmentSizeDiv((java.lang.Object)var9, (java.lang.Object)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var30 = var29.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var31 = var29.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var34 = var33.contextNotImplemented();
    org.omg.CORBA.INTERNAL var35 = var29.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var34);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var38 = var37.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var39 = var37.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var42 = var41.contextNotImplemented();
    org.omg.CORBA.INTERNAL var43 = var37.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var42);
    org.omg.CORBA.INTERNAL var44 = var37.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var47 = var46.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var48 = var46.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var49 = var46.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var52 = var51.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var54 = var46.selectionKeyInvalid((java.lang.Throwable)var52, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var55 = var29.fragmentSizeDiv((java.lang.Object)var37, (java.lang.Object)var54);
    org.omg.CORBA.MARSHAL var57 = var1.badValueTag((java.lang.Throwable)var54, (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var60 = var59.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var61 = var59.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var64 = var63.contextNotImplemented();
    org.omg.CORBA.INTERNAL var65 = var59.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var64);
    org.omg.CORBA.INTERNAL var66 = var1.invalidIsstreamedTckind((java.lang.Object)var59);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var69 = var68.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var70 = var68.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var71 = var68.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var74 = var73.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var76 = var68.selectionKeyInvalid((java.lang.Throwable)var74, (java.lang.Object)1);
    org.omg.CORBA.INTERNAL var77 = var1.unableToSetSocketFactoryOrb((java.lang.Throwable)var74);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var79 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var80 = var79.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var81 = var79.genericNoImpl();
    org.omg.CORBA.INTERNAL var82 = var79.locationforwardError();
    org.omg.CORBA.COMM_FAILURE var83 = var1.recvMsgError((java.lang.Throwable)var82);
    
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
    assertNotNull(var14);
    
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
    assertNotNull(var34);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNotNull(var64);
    
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
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    org.omg.CORBA.INTERNAL var4 = var1.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var7 = var6.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var8 = var6.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var9 = var6.getDelegateServantNotActive();
    org.omg.CORBA.BAD_OPERATION var10 = var1.badActivateTieCall((java.lang.Throwable)var9);
    org.omg.CORBA.COMM_FAILURE var11 = var1.connectionRebind();
    org.omg.CORBA.BAD_OPERATION var12 = var1.getDelegateRequiresStub();
    
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

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var10 = var9.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var11 = var9.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var14 = var13.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var16 = var9.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var19 = var18.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var20 = var18.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var21 = var18.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var24 = var23.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var26 = var18.selectionKeyInvalid((java.lang.Throwable)var24, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var27 = var1.fragmentSizeDiv((java.lang.Object)var9, (java.lang.Object)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var30 = var29.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var31 = var29.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var34 = var33.contextNotImplemented();
    org.omg.CORBA.INTERNAL var35 = var29.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var34);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var38 = var37.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var39 = var37.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var42 = var41.contextNotImplemented();
    org.omg.CORBA.INTERNAL var43 = var37.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var42);
    org.omg.CORBA.INTERNAL var44 = var37.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var47 = var46.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var48 = var46.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var49 = var46.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var52 = var51.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var54 = var46.selectionKeyInvalid((java.lang.Throwable)var52, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var55 = var29.fragmentSizeDiv((java.lang.Object)var37, (java.lang.Object)var54);
    org.omg.CORBA.MARSHAL var57 = var1.badValueTag((java.lang.Throwable)var54, (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var60 = var59.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var61 = var59.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var64 = var63.contextNotImplemented();
    org.omg.CORBA.INTERNAL var65 = var59.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var64);
    org.omg.CORBA.INTERNAL var66 = var1.invalidIsstreamedTckind((java.lang.Object)var59);
    org.omg.CORBA.BAD_PARAM var67 = var1.acceptorsAndLegacySocketFactoryAtSameTime();
    
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
    assertNotNull(var14);
    
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
    assertNotNull(var34);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    org.omg.CORBA.MARSHAL var8 = var1.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var12 = var10.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var15 = var14.contextNotImplemented();
    org.omg.CORBA.INTERNAL var16 = var10.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var19 = var18.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var20 = var18.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var23 = var22.contextNotImplemented();
    org.omg.CORBA.INTERNAL var24 = var18.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var23);
    org.omg.CORBA.INTERNAL var25 = var18.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var28 = var27.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var29 = var27.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var30 = var27.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var33 = var32.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var35 = var27.selectionKeyInvalid((java.lang.Throwable)var33, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var36 = var10.fragmentSizeDiv((java.lang.Object)var18, (java.lang.Object)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var39 = var38.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var40 = var38.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var43 = var42.contextNotImplemented();
    org.omg.CORBA.INTERNAL var44 = var38.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var47 = var46.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var48 = var46.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var51 = var50.contextNotImplemented();
    org.omg.CORBA.INTERNAL var52 = var46.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var51);
    org.omg.CORBA.INTERNAL var53 = var46.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var56 = var55.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var57 = var55.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var58 = var55.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var61 = var60.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var63 = var55.selectionKeyInvalid((java.lang.Throwable)var61, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var64 = var38.fragmentSizeDiv((java.lang.Object)var46, (java.lang.Object)var63);
    org.omg.CORBA.MARSHAL var66 = var10.badValueTag((java.lang.Throwable)var63, (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var69 = var68.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var70 = var68.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var73 = var72.contextNotImplemented();
    org.omg.CORBA.INTERNAL var74 = var68.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var73);
    org.omg.CORBA.INTERNAL var75 = var10.invalidIsstreamedTckind((java.lang.Object)var68);
    org.omg.CORBA.INTERNAL var76 = var1.threadGroupDestroyFailed((java.lang.Object)var68);
    org.omg.CORBA.INTERNAL var77 = var68.peekstringFailed();
    
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
    assertNotNull(var7);
    
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
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    org.omg.CORBA.INTERNAL var4 = var1.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var7 = var6.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var8 = var6.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.INTERNAL var12 = var6.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var6.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var16 = var15.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var17 = var15.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.INTERNAL var21 = var15.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var20);
    org.omg.CORBA.INTERNAL var22 = var15.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var25 = var24.contextNotImplemented();
    org.omg.CORBA.MARSHAL var26 = var15.badDigitInFixed((java.lang.Throwable)var25);
    org.omg.CORBA.MARSHAL var28 = var6.badValueTag((java.lang.Throwable)var26, (java.lang.Object)0L);
    org.omg.CORBA.MARSHAL var31 = var1.readObjectLoadClassFailure((java.lang.Throwable)var28, (java.lang.Object)(byte)10, (java.lang.Object)100L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var35 = var34.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var36 = var34.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var37 = var34.getDelegateServantNotActive();
    org.omg.CORBA.INTERNAL var38 = var34.wrongClientsc();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var41 = var40.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var42 = var40.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var45 = var44.contextNotImplemented();
    org.omg.CORBA.INTERNAL var46 = var40.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var45);
    org.omg.CORBA.MARSHAL var47 = var40.invalidTypecodeKindMarshal();
    org.omg.CORBA.INTERNAL var48 = var34.problemWithExceptionTypecode((java.lang.Throwable)var47);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var51 = var50.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var52 = var50.genericNoImpl();
    org.omg.CORBA.INTERNAL var53 = var50.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var56 = var55.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var57 = var55.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var58 = var55.getDelegateServantNotActive();
    org.omg.CORBA.BAD_OPERATION var59 = var50.badActivateTieCall((java.lang.Throwable)var58);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var63 = var62.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var64 = var62.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var67 = var66.contextNotImplemented();
    org.omg.CORBA.INTERNAL var68 = var62.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var67);
    org.omg.CORBA.INTERNAL var69 = var62.numInvocationsAlreadyZero();
    org.omg.CORBA.BAD_PARAM var70 = var1.couldNotSetArray((java.lang.Object)(-1L), (java.lang.Object)var47, (java.lang.Object)var58, (java.lang.Object)0, (java.lang.Object)var62);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var73 = var72.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var74 = var72.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var76 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var77 = var76.contextNotImplemented();
    org.omg.CORBA.INTERNAL var78 = var72.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var77);
    org.omg.CORBA.MARSHAL var79 = var1.unexpectedUnionDefault((java.lang.Throwable)var78);
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNotNull(var20);
    
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
    assertNotNull(var31);
    
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
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    org.omg.CORBA.INTERNAL var4 = var1.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var7 = var6.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var8 = var6.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var9 = var6.getDelegateServantNotActive();
    org.omg.CORBA.BAD_OPERATION var10 = var1.badActivateTieCall((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var13 = var12.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var14 = var12.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var15 = var12.getDelegateServantNotActive();
    org.omg.CORBA.INTERNAL var16 = var12.wrongClientsc();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var19 = var18.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var20 = var18.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var23 = var22.contextNotImplemented();
    org.omg.CORBA.INTERNAL var24 = var18.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var23);
    org.omg.CORBA.MARSHAL var25 = var18.invalidTypecodeKindMarshal();
    org.omg.CORBA.INTERNAL var26 = var12.problemWithExceptionTypecode((java.lang.Throwable)var25);
    org.omg.CORBA.MARSHAL var27 = var1.valuehandlerReadError((java.lang.Throwable)var26);
    
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
    assertNotNull(var27);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    org.omg.CORBA.MARSHAL var8 = var1.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var12 = var10.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var15 = var14.contextNotImplemented();
    org.omg.CORBA.INTERNAL var16 = var10.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var10.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.MARSHAL var21 = var10.badDigitInFixed((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var23 = var1.badValueTag((java.lang.Throwable)var21, (java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var26 = var25.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var27 = var25.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var30 = var29.contextNotImplemented();
    org.omg.CORBA.INTERNAL var31 = var25.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var34 = var33.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var35 = var33.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var38 = var37.contextNotImplemented();
    org.omg.CORBA.INTERNAL var39 = var33.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var38);
    org.omg.CORBA.INTERNAL var40 = var33.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var43 = var42.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var44 = var42.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var45 = var42.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var48 = var47.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var50 = var42.selectionKeyInvalid((java.lang.Throwable)var48, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var51 = var25.fragmentSizeDiv((java.lang.Object)var33, (java.lang.Object)var50);
    org.omg.CORBA.BAD_OPERATION var52 = var1.orbConfiguratorError((java.lang.Throwable)var51);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var55 = var54.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var56 = var54.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var57 = var54.getDelegateServantNotActive();
    org.omg.CORBA.INTERNAL var58 = var54.wrongClientsc();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var61 = var60.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var62 = var60.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var65 = var64.contextNotImplemented();
    org.omg.CORBA.INTERNAL var66 = var60.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var65);
    org.omg.CORBA.MARSHAL var67 = var60.invalidTypecodeKindMarshal();
    org.omg.CORBA.INTERNAL var68 = var54.problemWithExceptionTypecode((java.lang.Throwable)var67);
    org.omg.CORBA.MARSHAL var70 = var1.negativeStringLength((java.lang.Throwable)var67, (java.lang.Object)1L);
    
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
    assertNotNull(var7);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var51);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var4 = var1.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var7 = var6.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var9 = var1.selectionKeyInvalid((java.lang.Throwable)var7, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var10 = var1.invalidSingleCharCtb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var13 = var12.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var14 = var12.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var15 = var12.getDelegateServantNotActive();
    org.omg.CORBA.INTERNAL var16 = var12.wrongClientsc();
    org.omg.CORBA.INTERNAL var17 = var1.javaStreamInitFailed((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var21 = var19.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var24 = var23.contextNotImplemented();
    org.omg.CORBA.INTERNAL var25 = var19.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var24);
    org.omg.CORBA.INTERNAL var26 = var19.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var29 = var28.contextNotImplemented();
    org.omg.CORBA.MARSHAL var30 = var19.badDigitInFixed((java.lang.Throwable)var29);
    org.omg.CORBA.BAD_INV_ORDER var31 = var1.setResultCalledMultiple((java.lang.Throwable)var29);
    
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
    assertNotNull(var7);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var6 = var5.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var10 = var9.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var11 = var9.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var14 = var13.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var16 = var9.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var19 = var18.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var20 = var18.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var21 = var18.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var24 = var23.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var26 = var18.selectionKeyInvalid((java.lang.Throwable)var24, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var27 = var1.fragmentSizeDiv((java.lang.Object)var9, (java.lang.Object)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var30 = var29.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var31 = var29.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var34 = var33.contextNotImplemented();
    org.omg.CORBA.INTERNAL var35 = var29.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var34);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var38 = var37.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var39 = var37.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var42 = var41.contextNotImplemented();
    org.omg.CORBA.INTERNAL var43 = var37.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var42);
    org.omg.CORBA.INTERNAL var44 = var37.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var47 = var46.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var48 = var46.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var49 = var46.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var52 = var51.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var54 = var46.selectionKeyInvalid((java.lang.Throwable)var52, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var55 = var29.fragmentSizeDiv((java.lang.Object)var37, (java.lang.Object)var54);
    org.omg.CORBA.MARSHAL var57 = var1.badValueTag((java.lang.Throwable)var54, (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var60 = var59.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var61 = var59.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var64 = var63.contextNotImplemented();
    org.omg.CORBA.INTERNAL var65 = var59.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var64);
    org.omg.CORBA.INTERNAL var66 = var1.invalidIsstreamedTckind((java.lang.Object)var59);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var69 = var68.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var70 = var68.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var71 = var68.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var74 = var73.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var76 = var68.selectionKeyInvalid((java.lang.Throwable)var74, (java.lang.Object)1);
    org.omg.CORBA.INTERNAL var77 = var1.unableToSetSocketFactoryOrb((java.lang.Throwable)var74);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var79 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var80 = var79.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var81 = var79.genericNoImpl();
    org.omg.CORBA.INTERNAL var82 = var79.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var84 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var85 = var84.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var86 = var84.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var87 = var84.getDelegateServantNotActive();
    org.omg.CORBA.BAD_OPERATION var88 = var79.badActivateTieCall((java.lang.Throwable)var87);
    org.omg.CORBA.COMM_FAILURE var89 = var79.connectionRebind();
    org.omg.CORBA.INTERNAL var90 = var1.bootstrapApplicationException((java.lang.Throwable)var89);
    
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
    assertNotNull(var14);
    
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
    assertNotNull(var34);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNotNull(var64);
    
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
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    org.omg.CORBA.INTERNAL var4 = var1.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var7 = var6.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var8 = var6.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.INTERNAL var12 = var6.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var6.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var16 = var15.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var17 = var15.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.INTERNAL var21 = var15.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var20);
    org.omg.CORBA.INTERNAL var22 = var15.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var25 = var24.contextNotImplemented();
    org.omg.CORBA.MARSHAL var26 = var15.badDigitInFixed((java.lang.Throwable)var25);
    org.omg.CORBA.MARSHAL var28 = var6.badValueTag((java.lang.Throwable)var26, (java.lang.Object)0L);
    org.omg.CORBA.MARSHAL var31 = var1.readObjectLoadClassFailure((java.lang.Throwable)var28, (java.lang.Object)(byte)10, (java.lang.Object)100L);
    org.omg.CORBA.DATA_CONVERSION var32 = var1.codesetIncompatible();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNotNull(var20);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var3 = var2.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var4 = var2.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var7 = var6.contextNotImplemented();
    org.omg.CORBA.INTERNAL var8 = var2.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var11 = var10.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var12 = var10.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var15 = var14.contextNotImplemented();
    org.omg.CORBA.INTERNAL var16 = var10.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var10.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var20 = var19.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var21 = var19.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var22 = var19.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var25 = var24.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var27 = var19.selectionKeyInvalid((java.lang.Throwable)var25, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var28 = var2.fragmentSizeDiv((java.lang.Object)var10, (java.lang.Object)var27);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var31 = var30.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var32 = var30.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var35 = var34.contextNotImplemented();
    org.omg.CORBA.INTERNAL var36 = var30.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var39 = var38.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var40 = var38.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var43 = var42.contextNotImplemented();
    org.omg.CORBA.INTERNAL var44 = var38.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var43);
    org.omg.CORBA.INTERNAL var45 = var38.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var48 = var47.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var49 = var47.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var50 = var47.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var53 = var52.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var55 = var47.selectionKeyInvalid((java.lang.Throwable)var53, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var56 = var30.fragmentSizeDiv((java.lang.Object)var38, (java.lang.Object)var55);
    org.omg.CORBA.MARSHAL var58 = var2.badValueTag((java.lang.Throwable)var55, (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var61 = var60.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var62 = var60.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var65 = var64.contextNotImplemented();
    org.omg.CORBA.INTERNAL var66 = var60.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var65);
    org.omg.CORBA.INTERNAL var67 = var2.invalidIsstreamedTckind((java.lang.Object)var60);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var69 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var70 = var69.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var71 = var69.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var72 = var69.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var74 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var75 = var74.contextNotImplemented();
    org.omg.CORBA.COMM_FAILURE var77 = var69.selectionKeyInvalid((java.lang.Throwable)var75, (java.lang.Object)1);
    org.omg.CORBA.INTERNAL var78 = var2.unableToSetSocketFactoryOrb((java.lang.Throwable)var75);
    java.lang.Throwable var79 = new java.lang.Throwable("hi!", (java.lang.Throwable)var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var25);
    
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
    assertNotNull(var49);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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
    assertNotNull(var78);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var2 = var1.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var3 = var1.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var4 = var1.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var7 = var6.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var8 = var6.genericNoImpl();
    org.omg.CORBA.INTERNAL var9 = var6.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var12 = var11.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var13 = var11.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var16 = var15.contextNotImplemented();
    org.omg.CORBA.INTERNAL var17 = var11.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var16);
    org.omg.CORBA.MARSHAL var18 = var11.invalidTypecodeKindMarshal();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var21 = var20.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var22 = var20.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var25 = var24.contextNotImplemented();
    org.omg.CORBA.INTERNAL var26 = var20.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var25);
    org.omg.CORBA.INTERNAL var27 = var20.numInvocationsAlreadyZero();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var30 = var29.contextNotImplemented();
    org.omg.CORBA.MARSHAL var31 = var20.badDigitInFixed((java.lang.Throwable)var30);
    org.omg.CORBA.MARSHAL var33 = var11.badValueTag((java.lang.Throwable)var31, (java.lang.Object)0L);
    org.omg.CORBA.MARSHAL var36 = var6.readObjectLoadClassFailure((java.lang.Throwable)var33, (java.lang.Object)(byte)10, (java.lang.Object)100L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var40 = var39.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var41 = var39.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var42 = var39.getDelegateServantNotActive();
    org.omg.CORBA.INTERNAL var43 = var39.wrongClientsc();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var46 = var45.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var47 = var45.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var50 = var49.contextNotImplemented();
    org.omg.CORBA.INTERNAL var51 = var45.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var50);
    org.omg.CORBA.MARSHAL var52 = var45.invalidTypecodeKindMarshal();
    org.omg.CORBA.INTERNAL var53 = var39.problemWithExceptionTypecode((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var56 = var55.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var57 = var55.genericNoImpl();
    org.omg.CORBA.INTERNAL var58 = var55.locationforwardError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var61 = var60.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var62 = var60.genericNoImpl();
    org.omg.CORBA.BAD_OPERATION var63 = var60.getDelegateServantNotActive();
    org.omg.CORBA.BAD_OPERATION var64 = var55.badActivateTieCall((java.lang.Throwable)var63);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var67 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var68 = var67.contextNotImplemented();
    org.omg.CORBA.NO_IMPLEMENT var69 = var67.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.NO_IMPLEMENT var72 = var71.contextNotImplemented();
    org.omg.CORBA.INTERNAL var73 = var67.invalidContactInfoListIteratorFailureException((java.lang.Throwable)var72);
    org.omg.CORBA.INTERNAL var74 = var67.numInvocationsAlreadyZero();
    org.omg.CORBA.BAD_PARAM var75 = var6.couldNotSetArray((java.lang.Object)(-1L), (java.lang.Object)var52, (java.lang.Object)var63, (java.lang.Object)0, (java.lang.Object)var67);
    org.omg.CORBA.DATA_CONVERSION var76 = var1.badCustomIiopPrimaryToContactInfo((java.lang.Object)var75);
    org.omg.CORBA.DATA_CONVERSION var78 = var1.acceptorInstantiationTypeFailure((java.lang.Object)100);
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

}
