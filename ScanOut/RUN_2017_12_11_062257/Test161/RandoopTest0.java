
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var6 = var1.statementNotReachable3((java.lang.Throwable)var5);
    org.omg.CORBA.MARSHAL var7 = var1.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var8 = var1.ctbConverterFailure();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var11 = var10.ioexceptionWhenReadingConnection();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var14 = var13.multIiopProfNotSupported();
    org.omg.CORBA.DATA_CONVERSION var16 = var1.fragmentSizeDiv((java.lang.Throwable)var11, (java.lang.Object)var14, (java.lang.Object)(-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var8 = var7.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var9 = var4.statementNotReachable3((java.lang.Throwable)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var12 = var11.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var15 = var14.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var18 = var17.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var19 = var14.statementNotReachable3((java.lang.Throwable)var18);
    org.omg.CORBA.MARSHAL var20 = var14.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var21 = var11.badCodeSetString((java.lang.Throwable)var20);
    org.omg.CORBA.DATA_CONVERSION var22 = var4.btcResultMoreThanOneChar((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var25 = var24.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var28 = var27.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var29 = var24.statementNotReachable3((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var24.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var31 = var24.ctbConverterFailure();
    org.omg.CORBA.MARSHAL var32 = var4.cannotMarshalBadTckind((java.lang.Throwable)var31);
    org.omg.CORBA.UNKNOWN var33 = var1.unknownSysex((java.lang.Throwable)var32);
    
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
    assertNotNull(var9);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var6 = var1.statementNotReachable3((java.lang.Throwable)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var9 = var8.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var12 = var11.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var15 = var14.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var16 = var11.statementNotReachable3((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var8.badCompletionStatusInLocateReply((java.lang.Object)var16);
    org.omg.CORBA.DATA_CONVERSION var18 = var1.invalidSingleCharCtb((java.lang.Throwable)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var21 = var20.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var24 = var23.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var25 = var20.statementNotReachable3((java.lang.Throwable)var24);
    org.omg.CORBA.MARSHAL var26 = var20.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var27 = var20.ctbConverterFailure();
    org.omg.CORBA.BAD_PARAM var28 = var1.invalidTypecodeKind((java.lang.Object)var20);
    
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
    assertNotNull(var28);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var3 = var1.errorUnmarshalingUserexc();
    org.omg.CORBA.BAD_OPERATION var4 = var1.connectRequiresStub();
    org.omg.CORBA.BAD_OPERATION var5 = var1.insertObjectIncompatible();
    
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

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var8 = var7.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var9 = var4.statementNotReachable3((java.lang.Throwable)var8);
    org.omg.CORBA.INTERNAL var10 = var1.badCompletionStatusInLocateReply((java.lang.Object)var9);
    org.omg.CORBA.BAD_OPERATION var11 = var1.extractObjectIncompatible();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var14 = var13.errorInitBadserveridhandler();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var17 = var16.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var18 = var16.errorUnmarshalingUserexc();
    org.omg.CORBA.INTERNAL var19 = var13.illegalSubcontractId((java.lang.Object)var18);
    org.omg.CORBA.MARSHAL var21 = var1.badRepIdIndirection((java.lang.Throwable)var18, (java.lang.Object)(-1.0d));
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Enumeration var2 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var6 = var1.statementNotReachable3((java.lang.Throwable)var5);
    org.omg.CORBA.MARSHAL var7 = var1.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var8 = var1.ctbConverterFailure();
    org.omg.CORBA.OBJECT_NOT_EXIST var9 = var1.dynAnyDestroyed();
    org.omg.CORBA.NO_IMPLEMENT var10 = var1.getinterfaceNotImplemented();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.text.DateFormat var0 = java.text.DateFormat.getDateInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.INITIALIZE var3 = var1.cannotCreateOrbidDb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var6 = var1.statementNotReachable3((java.lang.Throwable)var5);
    org.omg.CORBA.MARSHAL var7 = var1.customWrapperIndirection();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var12 = var11.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var15 = var14.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var16 = var11.statementNotReachable3((java.lang.Throwable)var15);
    org.omg.CORBA.MARSHAL var17 = var11.customWrapperIndirection();
    org.omg.CORBA.BAD_OPERATION var18 = var9.requestRequiresStub((java.lang.Throwable)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var22 = var21.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var25 = var24.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var28 = var27.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var29 = var24.statementNotReachable3((java.lang.Throwable)var28);
    org.omg.CORBA.INTERNAL var30 = var21.badCompletionStatusInLocateReply((java.lang.Object)var29);
    org.omg.CORBA.BAD_OPERATION var31 = var21.extractObjectIncompatible();
    org.omg.CORBA.MARSHAL var32 = var1.malformedUrl((java.lang.Throwable)var17, (java.lang.Object)100, (java.lang.Object)var31);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.errorInitBadserveridhandler();
    org.omg.CORBA.MARSHAL var3 = var1.valuehandlerReadException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var8 = var7.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var9 = var4.statementNotReachable3((java.lang.Throwable)var8);
    org.omg.CORBA.MARSHAL var10 = var4.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var11 = var1.badCodeSetString((java.lang.Throwable)var10);
    org.omg.CORBA.INTERNAL var12 = var1.problemWithExceptionTypecode();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var15 = var14.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var18 = var17.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var19 = var14.statementNotReachable3((java.lang.Throwable)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var22 = var21.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var25 = var24.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var28 = var27.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var29 = var24.statementNotReachable3((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var24.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var31 = var21.badCodeSetString((java.lang.Throwable)var30);
    org.omg.CORBA.DATA_CONVERSION var32 = var14.btcResultMoreThanOneChar((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var35 = var34.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var38 = var37.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var39 = var34.statementNotReachable3((java.lang.Throwable)var38);
    org.omg.CORBA.MARSHAL var40 = var34.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var41 = var34.ctbConverterFailure();
    org.omg.CORBA.MARSHAL var42 = var14.cannotMarshalBadTckind((java.lang.Throwable)var41);
    org.omg.CORBA.OBJ_ADAPTER var43 = var1.adapterInactiveInActivation((java.lang.Throwable)var42);
    
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
    assertNotNull(var18);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.errorInitBadserveridhandler();
    org.omg.CORBA.MARSHAL var3 = var1.badKind();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var8 = var7.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var9 = var4.statementNotReachable3((java.lang.Throwable)var8);
    org.omg.CORBA.INTERNAL var10 = var1.badCompletionStatusInLocateReply((java.lang.Object)var9);
    org.omg.CORBA.BAD_OPERATION var11 = var1.extractObjectIncompatible();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var14 = var13.errorInitBadserveridhandler();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var17 = var16.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var18 = var16.errorUnmarshalingUserexc();
    org.omg.CORBA.INTERNAL var19 = var13.illegalSubcontractId((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var22 = var21.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var25 = var24.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var26 = var21.statementNotReachable3((java.lang.Throwable)var25);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var29 = var28.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var32 = var31.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var33 = var28.statementNotReachable3((java.lang.Throwable)var32);
    org.omg.CORBA.MARSHAL var34 = var28.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var35 = var28.ctbConverterFailure();
    org.omg.CORBA.MARSHAL var36 = var21.cannotMarshalBadTckind((java.lang.Throwable)var35);
    org.omg.CORBA.BAD_PARAM var37 = var13.acceptorsAndLegacySocketFactoryAtSameTime((java.lang.Throwable)var35);
    org.omg.CORBA.BAD_OPERATION var38 = var1.fixedBadTypecode((java.lang.Throwable)var35);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var6 = var4.errorUnmarshalingUserexc();
    org.omg.CORBA.MARSHAL var7 = var1.invalidTypecodeKindMarshal((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var10 = var9.errorInitBadserveridhandler();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var13 = var12.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var16 = var15.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var17 = var15.errorUnmarshalingUserexc();
    org.omg.CORBA.MARSHAL var18 = var12.invalidTypecodeKindMarshal((java.lang.Throwable)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var21 = var20.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var24 = var23.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var27 = var26.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var28 = var23.statementNotReachable3((java.lang.Throwable)var27);
    org.omg.CORBA.MARSHAL var29 = var23.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var30 = var20.badCodeSetString((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var31 = var9.couldNotInstantiateHelper((java.lang.Throwable)var17, (java.lang.Object)var20);
    org.omg.CORBA.MARSHAL var32 = var1.customWrapperNotSingleRepid((java.lang.Throwable)var17);
    
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
    assertNotNull(var23);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.errorInitBadserveridhandler();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var8 = var7.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var9 = var7.errorUnmarshalingUserexc();
    org.omg.CORBA.MARSHAL var10 = var4.invalidTypecodeKindMarshal((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var13 = var12.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var16 = var15.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var19 = var18.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var20 = var15.statementNotReachable3((java.lang.Throwable)var19);
    org.omg.CORBA.MARSHAL var21 = var15.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var22 = var12.badCodeSetString((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.couldNotInstantiateHelper((java.lang.Throwable)var9, (java.lang.Object)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var26 = var25.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var29 = var28.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var30 = var25.statementNotReachable3((java.lang.Throwable)var29);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var33 = var32.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var36 = var35.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var37 = var32.statementNotReachable3((java.lang.Throwable)var36);
    org.omg.CORBA.MARSHAL var38 = var32.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var39 = var32.ctbConverterFailure();
    org.omg.CORBA.MARSHAL var40 = var25.cannotMarshalBadTckind((java.lang.Throwable)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var43 = var42.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var46 = var45.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var47 = var42.statementNotReachable3((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var50 = var49.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var53 = var52.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var54 = var49.statementNotReachable3((java.lang.Throwable)var53);
    org.omg.CORBA.MARSHAL var55 = var49.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var56 = var49.ctbConverterFailure();
    org.omg.CORBA.MARSHAL var57 = var42.cannotMarshalBadTckind((java.lang.Throwable)var56);
    org.omg.CORBA.DATA_CONVERSION var58 = var25.orbInitialreferenceSyntax((java.lang.Throwable)var56);
    org.omg.CORBA.MARSHAL var59 = var1.badTypecodeForCustomValue((java.lang.Throwable)var58);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNotNull(var53);
    
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
    assertNotNull(var59);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.errorInitBadserveridhandler();
    org.omg.CORBA.MARSHAL var3 = var1.writeLocalObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var8 = var7.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var9 = var4.statementNotReachable3((java.lang.Throwable)var8);
    org.omg.CORBA.INTERNAL var10 = var1.badCompletionStatusInLocateReply((java.lang.Object)var9);
    org.omg.CORBA.BAD_OPERATION var11 = var1.extractObjectIncompatible();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var14 = var13.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var17 = var16.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var20 = var19.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var21 = var16.statementNotReachable3((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var22 = var16.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var23 = var13.badCodeSetString((java.lang.Throwable)var22);
    org.omg.CORBA.BAD_OPERATION var24 = var1.connectRequiresStub((java.lang.Throwable)var23);
    
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

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Collection var2 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.errorInitBadserveridhandler();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var8 = var7.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var9 = var7.errorUnmarshalingUserexc();
    org.omg.CORBA.MARSHAL var10 = var4.invalidTypecodeKindMarshal((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var13 = var12.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var16 = var15.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var19 = var18.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var20 = var15.statementNotReachable3((java.lang.Throwable)var19);
    org.omg.CORBA.MARSHAL var21 = var15.customWrapperIndirection();
    org.omg.CORBA.INTERNAL var22 = var12.badCodeSetString((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.couldNotInstantiateHelper((java.lang.Throwable)var9, (java.lang.Object)var12);
    org.omg.CORBA.BAD_INV_ORDER var24 = var1.setResultAfterException();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.multIiopProfNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var8 = var7.multIiopProfNotSupported();
    org.omg.CORBA.INTERNAL var9 = var4.statementNotReachable3((java.lang.Throwable)var8);
    org.omg.CORBA.INTERNAL var10 = var1.badCompletionStatusInLocateReply((java.lang.Object)var9);
    org.omg.CORBA.BAD_PARAM var11 = var1.nullObjectReference();
    org.omg.CORBA.OBJ_ADAPTER var12 = var1.adapterInactiveInActivation();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
