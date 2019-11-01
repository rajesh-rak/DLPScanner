
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finest("hi!");
    var0.warning("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var1 = new byte[] { (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var1, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.ResourceBundle.clearCache();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("4", "");
    java.util.logging.Handler[] var4 = var0.getHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var5 = var1.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var6 = var1.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var8 = var1.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    org.omg.CORBA.INTERNAL var9 = var1.unableToSetSocketFactoryOrb();
    
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

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var5 = var1.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var6 = var1.wcharDataInGiop10();
    org.omg.CORBA.MARSHAL var7 = var1.couldNotFindClass();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var10 = var9.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var12 = var9.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var13 = var9.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var14 = var9.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var16 = var9.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    org.omg.CORBA.BAD_INV_ORDER var17 = var9.argumentsNotCalled();
    org.omg.CORBA.BAD_PARAM var18 = var1.stringExpected((java.lang.Throwable)var17);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var5 = var1.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var6 = var1.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var8 = var1.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var11 = var10.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var13 = var10.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var14 = var10.argumentsNotCalled();
    org.omg.CORBA.INTERNAL var15 = var1.illegalGiopMsgType((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var20 = var19.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var21 = var19.insertObjectFailed();
    org.omg.CORBA.BAD_OPERATION var22 = var17.getDelegateServantNotActive((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var24 = var1.writeUndeclaredException((java.lang.Throwable)var22, (java.lang.Object)10.0d);
    
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
    assertNotNull(var24);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var5 = var1.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var6 = var1.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var8 = var1.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.DATA_CONVERSION var13 = var10.badSequenceBounds((java.lang.Object)true, (java.lang.Object)1);
    org.omg.CORBA.INTERNAL var14 = var1.exceptionWhenSendingCloseConnection((java.lang.Throwable)var13);
    org.omg.CORBA.MARSHAL var15 = var1.invalidObjectKey();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.MARSHAL var3 = var1.customWrapperIndirection();
    org.omg.CORBA.INITIALIZE var4 = var1.persistentServerportNotSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.expectedTypeNullAndNoRepId();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    org.omg.CORBA.MARSHAL var6 = var4.unableToLocateRepIdArray((java.lang.Object)var5);
    org.omg.CORBA.INTERNAL var7 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var6);
    org.omg.CORBA.MARSHAL var10 = var1.badFixed((java.lang.Object)10.0f, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var12.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var15 = var12.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var16 = var12.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var17 = var12.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var19 = var12.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var22 = var21.expectedTypeNullAndNoRepId();
    org.omg.CORBA.UNKNOWN var23 = var12.noInterfaceDefStub((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var26 = var25.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var28 = var25.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var29 = var25.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var30 = var25.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var32 = var25.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    org.omg.CORBA.BAD_PARAM var34 = var1.couldNotCreateArray((java.lang.Object)var22, (java.lang.Object)(byte)100, (java.lang.Object)10);
    
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

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var5 = var1.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var6 = var1.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var8 = var1.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var11 = var10.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var13 = var10.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var14 = var10.argumentsNotCalled();
    org.omg.CORBA.INTERNAL var15 = var1.illegalGiopMsgType((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var18 = var17.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var20 = var17.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var21 = var17.argumentsNotCalled();
    org.omg.CORBA.NO_IMPLEMENT var22 = var1.genericNoImpl((java.lang.Throwable)var21);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var5 = var1.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var6 = var1.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var8 = var1.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    org.omg.CORBA.BAD_INV_ORDER var9 = var1.argumentsNotCalled();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var11.expectedTypeNullAndNoRepId();
    org.omg.CORBA.BAD_OPERATION var13 = var11.objectAdapterIdNotAvailable();
    org.omg.CORBA.BAD_OPERATION var14 = var1.connectingServant((java.lang.Throwable)var13);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var4 = var3.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var5 = var3.insertObjectFailed();
    org.omg.CORBA.BAD_OPERATION var6 = var1.getDelegateServantNotActive((java.lang.Throwable)var5);
    org.omg.CORBA.INTERNAL var8 = var1.workerThreadCreationFailure((java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var9 = var1.badOrbForServant();
    
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
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.expectedTypeNullAndNoRepId();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    org.omg.CORBA.MARSHAL var6 = var4.unableToLocateRepIdArray((java.lang.Object)var5);
    org.omg.CORBA.INTERNAL var7 = var1.badSystemExceptionInLocateReply((java.lang.Throwable)var6);
    org.omg.CORBA.INTERNAL var8 = var1.problemWithExceptionTypecode();
    
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

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var5 = var1.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var6 = var1.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var8 = var1.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    org.omg.CORBA.BAD_INV_ORDER var9 = var1.argumentsNotCalled();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var12 = var11.ioexceptionWhenReadingConnection();
    org.omg.CORBA.OBJECT_NOT_EXIST var13 = var11.locateUnknownObject();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var16 = var15.ioexceptionWhenReadingConnection();
    org.omg.CORBA.OBJECT_NOT_EXIST var17 = var15.locateUnknownObject();
    org.omg.CORBA.MARSHAL var18 = var11.invalidTypecodeKindMarshal((java.lang.Throwable)var17);
    org.omg.CORBA.DATA_CONVERSION var20 = var1.fragmentSizeDiv((java.lang.Object)var11, (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var23 = var22.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var25 = var22.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_INV_ORDER var26 = var22.argumentsNotCalled();
    org.omg.CORBA.MARSHAL var27 = var22.wcharDataInGiop10();
    org.omg.CORBA.INTERNAL var29 = var22.threadGroupIsDestroyed((java.lang.Object)(byte)100);
    org.omg.CORBA.BAD_INV_ORDER var30 = var22.argumentsNotCalled();
    org.omg.CORBA.INTERNAL var31 = var1.bootstrapApplicationException((java.lang.Throwable)var30);
    
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
    assertNotNull(var31);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.ioexceptionWhenReadingConnection();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)(byte)0);
    org.omg.CORBA.MARSHAL var5 = var1.couldNotFindClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

}
