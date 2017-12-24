
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var1 = new java.util.Date((-1L));
    int var2 = var1.getDate();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = new java.util.Date(0L);
    int var2 = var1.getTimezoneOffset();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var1 = new java.util.Date((-1L));
    var1.setMinutes(0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var5 = var1.getDelegateWrongPolicy((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var7 = var1.invalidBuffMgrStrategy((java.lang.Object)false);
    org.omg.CORBA.INTERNAL var9 = var1.illegalSubcontractId((java.lang.Object)(short)(-1));
    
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

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var2 = var1.badStringifiedIor();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var7 = var6.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var8 = var4.getDelegateWrongPolicy((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var10 = var4.invalidBuffMgrStrategy((java.lang.Object)false);
    org.omg.CORBA.BAD_OPERATION var11 = var1.extractObjectIncompatible((java.lang.Throwable)var10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var16 = var15.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var17 = var13.getDelegateWrongPolicy((java.lang.Throwable)var16);
    org.omg.CORBA.INTERNAL var18 = var1.ctbConverterFailure((java.lang.Throwable)var17);
    
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

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.util.Set var1 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var5 = var1.unknownCorbaExc((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var8 = var7.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var10 = var1.illegalSocketFactoryType((java.lang.Throwable)var8, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var15 = var14.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var16 = var12.unknownCorbaExc((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var19 = var18.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var21 = var12.illegalSocketFactoryType((java.lang.Throwable)var19, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var22 = var1.illegalContactInfoListFactoryType((java.lang.Object)var12);
    org.omg.CORBA.OBJ_ADAPTER var23 = var1.noServerScInDispatch();
    org.omg.CORBA.MARSHAL var24 = var1.writeLocalObject();
    
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

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var2 = var1.badStringifiedIor();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var5 = var4.badStringifiedIor();
    org.omg.CORBA.INITIALIZE var6 = var1.cannotWriteOrbidDb((java.lang.Throwable)var5);
    org.omg.CORBA.MARSHAL var7 = var1.illegalUnionDiscriminatorType();
    
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

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var2 = var1.badStringifiedIor();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var5 = var4.badStringifiedIor();
    org.omg.CORBA.INITIALIZE var6 = var1.cannotWriteOrbidDb((java.lang.Throwable)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var9 = var8.badStringifiedIor();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var14 = var13.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var15 = var11.getDelegateWrongPolicy((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var17 = var11.invalidBuffMgrStrategy((java.lang.Object)false);
    org.omg.CORBA.BAD_OPERATION var18 = var8.extractObjectIncompatible((java.lang.Throwable)var17);
    org.omg.CORBA.OBJECT_NOT_EXIST var19 = var1.badServerId((java.lang.Throwable)var18);
    
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
    assertNotNull(var19);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var2 = var1.badStringifiedIor();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var5 = var4.badStringifiedIor();
    org.omg.CORBA.INITIALIZE var6 = var1.cannotWriteOrbidDb((java.lang.Throwable)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var11 = var10.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var12 = var8.unknownCorbaExc((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var17 = var16.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var18 = var14.getDelegateWrongPolicy((java.lang.Throwable)var17);
    org.omg.CORBA.BAD_OPERATION var19 = var8.insertObjectFailed((java.lang.Throwable)var18);
    org.omg.CORBA.BAD_INV_ORDER var20 = var8.argumentsCalledMultiple();
    org.omg.CORBA.INTERNAL var21 = var1.badGiopRequestType((java.lang.Throwable)var20);
    
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

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var5 = var1.unknownCorbaExc((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var8 = var7.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var10 = var1.illegalSocketFactoryType((java.lang.Throwable)var8, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var15 = var14.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var16 = var12.unknownCorbaExc((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var19 = var18.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var21 = var12.illegalSocketFactoryType((java.lang.Throwable)var19, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var22 = var1.illegalContactInfoListFactoryType((java.lang.Object)var12);
    org.omg.CORBA.UNKNOWN var23 = var12.unknownDsiSysex();
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var5 = var1.getDelegateWrongPolicy((java.lang.Throwable)var4);
    org.omg.CORBA.MARSHAL var6 = var1.characterOutofrange();
    org.omg.CORBA.INTERNAL var9 = var1.workerThreadDoWorkThrowable((java.lang.Object)(short)1, (java.lang.Object)1.0f);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var5 = var1.unknownCorbaExc((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var10 = var9.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var11 = var7.getDelegateWrongPolicy((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_OPERATION var12 = var1.insertObjectFailed((java.lang.Throwable)var11);
    org.omg.CORBA.INTERNAL var13 = var1.nonExistentOrbid();
    
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
    assertNotNull(var13);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var5 = var1.getDelegateWrongPolicy((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var7 = var1.invalidBuffMgrStrategy((java.lang.Object)false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var12 = var11.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var13 = var9.unknownCorbaExc((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var16 = var15.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var18 = var9.illegalSocketFactoryType((java.lang.Throwable)var16, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var23 = var22.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var24 = var20.unknownCorbaExc((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var27 = var26.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var29 = var20.illegalSocketFactoryType((java.lang.Throwable)var27, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var30 = var9.illegalContactInfoListFactoryType((java.lang.Object)var20);
    org.omg.CORBA.INTERNAL var31 = var20.duplicateIndirectionOffset();
    org.omg.CORBA.INTERNAL var32 = var20.boundsCannotOccur();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var37 = var36.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var38 = var34.unknownCorbaExc((java.lang.Throwable)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var41 = var40.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var43 = var34.illegalSocketFactoryType((java.lang.Throwable)var41, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var48 = var47.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var49 = var45.unknownCorbaExc((java.lang.Throwable)var48);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var52 = var51.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var54 = var45.illegalSocketFactoryType((java.lang.Throwable)var52, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var55 = var34.illegalContactInfoListFactoryType((java.lang.Object)var45);
    org.omg.CORBA.INTERNAL var56 = var20.invalidBtcConverterName((java.lang.Object)var55);
    org.omg.CORBA.INTERNAL var57 = var1.badkindCannotOccur((java.lang.Throwable)var55);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var62 = var61.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var63 = var59.getDelegateWrongPolicy((java.lang.Throwable)var62);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var66 = var65.badStringifiedIor();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var69 = var68.badStringifiedIor();
    org.omg.CORBA.INITIALIZE var70 = var65.cannotWriteOrbidDb((java.lang.Throwable)var69);
    org.omg.CORBA.MARSHAL var71 = var59.dsiResultException((java.lang.Throwable)var70);
    org.omg.CORBA.INTERNAL var72 = var1.threadGroupIsDestroyed((java.lang.Object)var71);
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
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
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var5 = var1.getDelegateWrongPolicy((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var7 = var1.invalidBuffMgrStrategy((java.lang.Object)false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var12 = var11.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var13 = var9.unknownCorbaExc((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var16 = var15.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var18 = var9.illegalSocketFactoryType((java.lang.Throwable)var16, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var23 = var22.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var24 = var20.unknownCorbaExc((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var27 = var26.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var29 = var20.illegalSocketFactoryType((java.lang.Throwable)var27, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var30 = var9.illegalContactInfoListFactoryType((java.lang.Object)var20);
    org.omg.CORBA.INTERNAL var31 = var20.duplicateIndirectionOffset();
    org.omg.CORBA.INTERNAL var32 = var20.boundsCannotOccur();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var37 = var36.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var38 = var34.unknownCorbaExc((java.lang.Throwable)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var41 = var40.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var43 = var34.illegalSocketFactoryType((java.lang.Throwable)var41, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var48 = var47.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var49 = var45.unknownCorbaExc((java.lang.Throwable)var48);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var52 = var51.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var54 = var45.illegalSocketFactoryType((java.lang.Throwable)var52, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var55 = var34.illegalContactInfoListFactoryType((java.lang.Object)var45);
    org.omg.CORBA.INTERNAL var56 = var20.invalidBtcConverterName((java.lang.Object)var55);
    org.omg.CORBA.OBJECT_NOT_EXIST var57 = var1.noObjectAdapterFactory((java.lang.Throwable)var55);
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var5 = var1.getDelegateWrongPolicy((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var7 = var1.invalidBuffMgrStrategy((java.lang.Object)false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var12 = var11.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var13 = var9.unknownCorbaExc((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var16 = var15.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var18 = var9.illegalSocketFactoryType((java.lang.Throwable)var16, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var19 = var1.badModifier((java.lang.Throwable)var16);
    org.omg.CORBA.BAD_OPERATION var20 = var1.getDelegateServantNotActive();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var25 = var24.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var26 = var22.getDelegateWrongPolicy((java.lang.Throwable)var25);
    org.omg.CORBA.INTERNAL var28 = var22.invalidBuffMgrStrategy((java.lang.Object)false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var33 = var32.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var34 = var30.unknownCorbaExc((java.lang.Throwable)var33);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var37 = var36.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var39 = var30.illegalSocketFactoryType((java.lang.Throwable)var37, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var44 = var43.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var45 = var41.unknownCorbaExc((java.lang.Throwable)var44);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var48 = var47.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var50 = var41.illegalSocketFactoryType((java.lang.Throwable)var48, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var51 = var30.illegalContactInfoListFactoryType((java.lang.Object)var41);
    org.omg.CORBA.INTERNAL var52 = var41.duplicateIndirectionOffset();
    org.omg.CORBA.INTERNAL var53 = var41.boundsCannotOccur();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var58 = var57.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var59 = var55.unknownCorbaExc((java.lang.Throwable)var58);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var62 = var61.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var64 = var55.illegalSocketFactoryType((java.lang.Throwable)var62, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var69 = var68.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var70 = var66.unknownCorbaExc((java.lang.Throwable)var69);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var73 = var72.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var75 = var66.illegalSocketFactoryType((java.lang.Throwable)var73, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var76 = var55.illegalContactInfoListFactoryType((java.lang.Object)var66);
    org.omg.CORBA.INTERNAL var77 = var41.invalidBtcConverterName((java.lang.Object)var76);
    org.omg.CORBA.INTERNAL var78 = var22.badkindCannotOccur((java.lang.Throwable)var76);
    org.omg.CORBA.INTERNAL var80 = var1.badCompletionStatusInLocateReply((java.lang.Throwable)var78, (java.lang.Object)(-1.0f));
    
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
    assertNotNull(var25);
    
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
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
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
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var2 = var1.badStringifiedIor();
    org.omg.CORBA.INTERNAL var3 = var1.statementNotReachable5();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var5 = var1.getDelegateWrongPolicy((java.lang.Throwable)var4);
    org.omg.CORBA.MARSHAL var6 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var11 = var10.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var12 = var8.unknownCorbaExc((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var17 = var16.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var18 = var14.getDelegateWrongPolicy((java.lang.Throwable)var17);
    org.omg.CORBA.BAD_OPERATION var19 = var8.insertObjectFailed((java.lang.Throwable)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var24 = var23.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var25 = var21.unknownCorbaExc((java.lang.Throwable)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var30 = var29.badStringifiedIor();
    org.omg.CORBA.BAD_OPERATION var31 = var27.getDelegateWrongPolicy((java.lang.Throwable)var30);
    org.omg.CORBA.BAD_OPERATION var32 = var21.insertObjectFailed((java.lang.Throwable)var31);
    org.omg.CORBA.BAD_INV_ORDER var33 = var21.argumentsCalledMultiple();
    org.omg.CORBA.INTERNAL var34 = var8.getLocalHostFailed((java.lang.Throwable)var33);
    org.omg.CORBA.INTERNAL var35 = var1.unableToSetSocketFactoryOrb((java.lang.Throwable)var33);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var5 = var1.unknownCorbaExc((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var8 = var7.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var10 = var1.illegalSocketFactoryType((java.lang.Throwable)var8, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var15 = var14.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var16 = var12.unknownCorbaExc((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var19 = var18.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var21 = var12.illegalSocketFactoryType((java.lang.Throwable)var19, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var22 = var1.illegalContactInfoListFactoryType((java.lang.Object)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var25 = var24.badStringifiedIor();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var28 = var27.badStringifiedIor();
    org.omg.CORBA.INITIALIZE var29 = var24.cannotWriteOrbidDb((java.lang.Throwable)var28);
    org.omg.CORBA.BAD_TYPECODE var30 = var1.badRemoteTypecode((java.lang.Throwable)var29);
    
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

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var4 = var3.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var5 = var1.unknownCorbaExc((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var8 = var7.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var10 = var1.illegalSocketFactoryType((java.lang.Throwable)var8, (java.lang.Object)(short)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var15 = var14.badStringifiedIor();
    org.omg.CORBA.UNKNOWN var16 = var12.unknownCorbaExc((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.DATA_CONVERSION var19 = var18.orbInitialreferenceSyntax();
    org.omg.CORBA.DATA_CONVERSION var21 = var12.illegalSocketFactoryType((java.lang.Throwable)var19, (java.lang.Object)(short)10);
    org.omg.CORBA.DATA_CONVERSION var22 = var1.illegalContactInfoListFactoryType((java.lang.Object)var12);
    org.omg.CORBA.OBJ_ADAPTER var23 = var1.noServerScInDispatch();
    org.omg.CORBA.OBJ_ADAPTER var24 = var1.orbConnectError();
    
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

}
