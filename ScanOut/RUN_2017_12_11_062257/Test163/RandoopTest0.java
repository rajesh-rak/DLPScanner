
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.CoreResourceBundleControl var1 = sun.util.CoreResourceBundleControl.getRBControlInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.DATA_CONVERSION var5 = var1.illegalSocketFactoryType((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var1 = new byte[] { (byte)0};
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


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.badExceptionDetailMessageServiceContextType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var5 = var3.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var6 = var3.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.badkindCannotOccur((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var11.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var14 = var11.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.badkindCannotOccur((java.lang.Throwable)var14);
    org.omg.CORBA.BAD_TYPECODE var16 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var17 = var1.invocationInfoStackEmpty();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var4 = var1.bootstrapServerNotAvail();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var10 = var8.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var11 = var8.contextNotImplemented();
    org.omg.CORBA.INTERNAL var12 = var6.badkindCannotOccur((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var18 = var16.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var19 = var16.contextNotImplemented();
    org.omg.CORBA.INTERNAL var20 = var14.badkindCannotOccur((java.lang.Throwable)var19);
    org.omg.CORBA.BAD_TYPECODE var21 = var6.unresolvedRecursiveTypecode((java.lang.Throwable)var19);
    org.omg.CORBA.MARSHAL var23 = var1.unknownCodeset((java.lang.Throwable)var21, (java.lang.Object)10L);
    org.omg.CORBA.INTERNAL var25 = var1.unsupportedGiopVersion((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var25);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var5 = var3.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var6 = var3.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.badkindCannotOccur((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var11.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var14 = var11.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.badkindCannotOccur((java.lang.Throwable)var14);
    org.omg.CORBA.OBJECT_NOT_EXIST var16 = var1.noObjectAdapterFactory((java.lang.Throwable)var15);
    org.omg.CORBA.NO_IMPLEMENT var17 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var19.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var22 = var19.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var30 = var28.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var31 = var28.contextNotImplemented();
    org.omg.CORBA.INTERNAL var32 = var26.badkindCannotOccur((java.lang.Throwable)var31);
    org.omg.CORBA.INTERNAL var33 = var24.applicationExceptionInSpecialMethod((java.lang.Throwable)var32);
    org.omg.CORBA.MARSHAL var35 = var19.indirectionNotFound((java.lang.Throwable)var32, (java.lang.Object)100.0f);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var41 = var39.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var42 = var39.contextNotImplemented();
    org.omg.CORBA.INTERNAL var43 = var37.badkindCannotOccur((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var49 = var47.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var50 = var47.contextNotImplemented();
    org.omg.CORBA.INTERNAL var51 = var45.badkindCannotOccur((java.lang.Throwable)var50);
    org.omg.CORBA.BAD_TYPECODE var52 = var37.unresolvedRecursiveTypecode((java.lang.Throwable)var50);
    org.omg.CORBA.DATA_CONVERSION var53 = var1.badCustomSocketFactory((java.lang.Throwable)var35, (java.lang.Object)var52);
    
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
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var4 = var1.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var8 = var6.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var9 = var6.bootstrapServerNotAvail();
    org.omg.CORBA.INTERNAL var10 = var6.emptyStackRunServantPostInvoke();
    org.omg.CORBA.INTERNAL var11 = var1.locationforwardError((java.lang.Throwable)var10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var15 = var13.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var16 = var13.bootstrapServerNotAvail();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var22 = var20.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var23 = var20.contextNotImplemented();
    org.omg.CORBA.INTERNAL var24 = var18.badkindCannotOccur((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var30 = var28.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var31 = var28.contextNotImplemented();
    org.omg.CORBA.INTERNAL var32 = var26.badkindCannotOccur((java.lang.Throwable)var31);
    org.omg.CORBA.BAD_TYPECODE var33 = var18.unresolvedRecursiveTypecode((java.lang.Throwable)var31);
    org.omg.CORBA.MARSHAL var35 = var13.unknownCodeset((java.lang.Throwable)var33, (java.lang.Object)10L);
    org.omg.CORBA.INTERNAL var37 = var1.workerThreadCreationFailure((java.lang.Throwable)var33, (java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var4 = var1.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var10 = var8.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var11 = var8.contextNotImplemented();
    org.omg.CORBA.INTERNAL var12 = var6.badkindCannotOccur((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var18 = var16.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var19 = var16.contextNotImplemented();
    org.omg.CORBA.INTERNAL var20 = var14.badkindCannotOccur((java.lang.Throwable)var19);
    org.omg.CORBA.OBJECT_NOT_EXIST var21 = var6.noObjectAdapterFactory((java.lang.Throwable)var20);
    org.omg.CORBA.DATA_CONVERSION var22 = var1.orbInitialreferenceSyntax((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var26.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var29 = var26.contextNotImplemented();
    org.omg.CORBA.INTERNAL var30 = var24.badkindCannotOccur((java.lang.Throwable)var29);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var34.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var37 = var34.contextNotImplemented();
    org.omg.CORBA.INTERNAL var38 = var32.badkindCannotOccur((java.lang.Throwable)var37);
    org.omg.CORBA.OBJECT_NOT_EXIST var39 = var24.noObjectAdapterFactory((java.lang.Throwable)var38);
    org.omg.CORBA.OBJECT_NOT_EXIST var40 = var1.badAdapterId((java.lang.Throwable)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var44 = var42.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var45 = var42.bootstrapServerNotAvail();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var49 = var47.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.INTERNAL var50 = var42.emptyStackRunServantPostInvoke((java.lang.Throwable)var49);
    org.omg.CORBA.MARSHAL var51 = var42.characterOutofrange();
    org.omg.CORBA.OBJECT_NOT_EXIST var52 = var1.servantNotFound((java.lang.Throwable)var51);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var56 = var54.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var57 = var54.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var63 = var61.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var64 = var61.contextNotImplemented();
    org.omg.CORBA.INTERNAL var65 = var59.badkindCannotOccur((java.lang.Throwable)var64);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var67 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var69 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var71 = var69.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var72 = var69.contextNotImplemented();
    org.omg.CORBA.INTERNAL var73 = var67.badkindCannotOccur((java.lang.Throwable)var72);
    org.omg.CORBA.OBJECT_NOT_EXIST var74 = var59.noObjectAdapterFactory((java.lang.Throwable)var73);
    org.omg.CORBA.DATA_CONVERSION var75 = var54.orbInitialreferenceSyntax((java.lang.Throwable)var73);
    org.omg.CORBA.MARSHAL var76 = var1.unknownCodeset((java.lang.Object)var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
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
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var4 = var1.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var10 = var8.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var11 = var8.contextNotImplemented();
    org.omg.CORBA.INTERNAL var12 = var6.badkindCannotOccur((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var18 = var16.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var19 = var16.contextNotImplemented();
    org.omg.CORBA.INTERNAL var20 = var14.badkindCannotOccur((java.lang.Throwable)var19);
    org.omg.CORBA.OBJECT_NOT_EXIST var21 = var6.noObjectAdapterFactory((java.lang.Throwable)var20);
    org.omg.CORBA.DATA_CONVERSION var22 = var1.orbInitialreferenceSyntax((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var26.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var29 = var26.contextNotImplemented();
    org.omg.CORBA.INTERNAL var30 = var24.badkindCannotOccur((java.lang.Throwable)var29);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var34.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var37 = var34.contextNotImplemented();
    org.omg.CORBA.INTERNAL var38 = var32.badkindCannotOccur((java.lang.Throwable)var37);
    org.omg.CORBA.OBJECT_NOT_EXIST var39 = var24.noObjectAdapterFactory((java.lang.Throwable)var38);
    org.omg.CORBA.OBJECT_NOT_EXIST var40 = var1.badAdapterId((java.lang.Throwable)var39);
    org.omg.CORBA.BAD_PARAM var41 = var1.localObjectNotAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var41);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var5 = var3.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var6 = var3.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.badkindCannotOccur((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var11.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var14 = var11.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.badkindCannotOccur((java.lang.Throwable)var14);
    org.omg.CORBA.COMM_FAILURE var16 = var1.recvMsgError((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var24 = var22.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var25 = var22.contextNotImplemented();
    org.omg.CORBA.INTERNAL var26 = var20.badkindCannotOccur((java.lang.Throwable)var25);
    org.omg.CORBA.INTERNAL var27 = var18.applicationExceptionInSpecialMethod((java.lang.Throwable)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var33 = var31.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var34 = var31.contextNotImplemented();
    org.omg.CORBA.INTERNAL var35 = var29.badkindCannotOccur((java.lang.Throwable)var34);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var41 = var39.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var42 = var39.contextNotImplemented();
    org.omg.CORBA.INTERNAL var43 = var37.badkindCannotOccur((java.lang.Throwable)var42);
    org.omg.CORBA.OBJECT_NOT_EXIST var44 = var29.noObjectAdapterFactory((java.lang.Throwable)var43);
    org.omg.CORBA.NO_IMPLEMENT var45 = var29.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var51 = var49.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var52 = var49.contextNotImplemented();
    org.omg.CORBA.INTERNAL var53 = var47.badkindCannotOccur((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var59 = var57.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var60 = var57.contextNotImplemented();
    org.omg.CORBA.INTERNAL var61 = var55.badkindCannotOccur((java.lang.Throwable)var60);
    org.omg.CORBA.OBJECT_NOT_EXIST var62 = var47.noObjectAdapterFactory((java.lang.Throwable)var61);
    org.omg.CORBA.NO_IMPLEMENT var63 = var47.genericNoImpl();
    org.omg.CORBA.BAD_PARAM var64 = var29.abstractFromNonAbstract((java.lang.Throwable)var63);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var70 = var68.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var71 = var68.contextNotImplemented();
    org.omg.CORBA.INTERNAL var72 = var66.badkindCannotOccur((java.lang.Throwable)var71);
    org.omg.CORBA.INTERNAL var73 = var1.workerThreadCaughtUnexpectedThrowable((java.lang.Throwable)var26, (java.lang.Object)var64, (java.lang.Object)var72);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var27);
    
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
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var4 = var1.bootstrapServerNotAvail();
    org.omg.CORBA.INTERNAL var5 = var1.emptyStackRunServantPostInvoke();
    org.omg.CORBA.BAD_PARAM var6 = var1.boundsErrorInDiiRequest();
    
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

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var5 = var3.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var6 = var3.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.badkindCannotOccur((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var11.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var14 = var11.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.badkindCannotOccur((java.lang.Throwable)var14);
    org.omg.CORBA.BAD_TYPECODE var16 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var22 = var20.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var23 = var20.contextNotImplemented();
    org.omg.CORBA.INTERNAL var24 = var18.badkindCannotOccur((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var30 = var28.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var31 = var28.contextNotImplemented();
    org.omg.CORBA.INTERNAL var32 = var26.badkindCannotOccur((java.lang.Throwable)var31);
    org.omg.CORBA.OBJECT_NOT_EXIST var33 = var18.noObjectAdapterFactory((java.lang.Throwable)var32);
    org.omg.CORBA.NO_IMPLEMENT var34 = var18.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var40 = var38.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var41 = var38.contextNotImplemented();
    org.omg.CORBA.INTERNAL var42 = var36.badkindCannotOccur((java.lang.Throwable)var41);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var48 = var46.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var49 = var46.contextNotImplemented();
    org.omg.CORBA.INTERNAL var50 = var44.badkindCannotOccur((java.lang.Throwable)var49);
    org.omg.CORBA.OBJECT_NOT_EXIST var51 = var36.noObjectAdapterFactory((java.lang.Throwable)var50);
    org.omg.CORBA.NO_IMPLEMENT var52 = var36.genericNoImpl();
    org.omg.CORBA.BAD_PARAM var53 = var18.abstractFromNonAbstract((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var57 = var55.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var58 = var55.bootstrapServerNotAvail();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var64 = var62.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var65 = var62.contextNotImplemented();
    org.omg.CORBA.INTERNAL var66 = var60.badkindCannotOccur((java.lang.Throwable)var65);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var72 = var70.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var73 = var70.contextNotImplemented();
    org.omg.CORBA.INTERNAL var74 = var68.badkindCannotOccur((java.lang.Throwable)var73);
    org.omg.CORBA.BAD_TYPECODE var75 = var60.unresolvedRecursiveTypecode((java.lang.Throwable)var73);
    org.omg.CORBA.MARSHAL var77 = var55.unknownCodeset((java.lang.Throwable)var75, (java.lang.Object)10L);
    org.omg.CORBA.INTERNAL var78 = var1.badCompletionStatusInReply((java.lang.Throwable)var52, (java.lang.Object)10L);
    
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
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
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

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var4 = var1.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var12 = var10.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var13 = var10.contextNotImplemented();
    org.omg.CORBA.INTERNAL var14 = var8.badkindCannotOccur((java.lang.Throwable)var13);
    org.omg.CORBA.INTERNAL var15 = var6.applicationExceptionInSpecialMethod((java.lang.Throwable)var14);
    org.omg.CORBA.MARSHAL var17 = var1.indirectionNotFound((java.lang.Throwable)var14, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_OPERATION var18 = var1.getDelegateRequiresStub();
    org.omg.CORBA.BAD_OPERATION var19 = var1.isLocalRequiresStub();
    org.omg.CORBA.MARSHAL var20 = var1.valuehandlerReadException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var4 = var1.bootstrapServerNotAvail();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var8 = var6.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.INTERNAL var9 = var1.emptyStackRunServantPostInvoke((java.lang.Throwable)var8);
    org.omg.CORBA.INTERNAL var10 = var1.getLocalHostFailed();
    org.omg.CORBA.DATA_CONVERSION var11 = var1.invalidSingleCharCtb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var15 = var13.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var16 = var13.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var22 = var20.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var23 = var20.contextNotImplemented();
    org.omg.CORBA.INTERNAL var24 = var18.badkindCannotOccur((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var30 = var28.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var31 = var28.contextNotImplemented();
    org.omg.CORBA.INTERNAL var32 = var26.badkindCannotOccur((java.lang.Throwable)var31);
    org.omg.CORBA.OBJECT_NOT_EXIST var33 = var18.noObjectAdapterFactory((java.lang.Throwable)var32);
    org.omg.CORBA.DATA_CONVERSION var34 = var13.orbInitialreferenceSyntax((java.lang.Throwable)var32);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var40 = var38.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var41 = var38.contextNotImplemented();
    org.omg.CORBA.INTERNAL var42 = var36.badkindCannotOccur((java.lang.Throwable)var41);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var48 = var46.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var49 = var46.contextNotImplemented();
    org.omg.CORBA.INTERNAL var50 = var44.badkindCannotOccur((java.lang.Throwable)var49);
    org.omg.CORBA.OBJECT_NOT_EXIST var51 = var36.noObjectAdapterFactory((java.lang.Throwable)var50);
    org.omg.CORBA.OBJECT_NOT_EXIST var52 = var13.badAdapterId((java.lang.Throwable)var51);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var56 = var54.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var57 = var54.bootstrapServerNotAvail();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var61 = var59.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.INTERNAL var62 = var54.emptyStackRunServantPostInvoke((java.lang.Throwable)var61);
    org.omg.CORBA.MARSHAL var63 = var54.characterOutofrange();
    org.omg.CORBA.OBJECT_NOT_EXIST var64 = var13.servantNotFound((java.lang.Throwable)var63);
    org.omg.CORBA.BAD_PARAM var65 = var1.invalidTypecodeKind((java.lang.Object)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.URL[] var1 = sun.misc.URLClassPath.pathToURLs("");
    sun.misc.URLClassPath var2 = new sun.misc.URLClassPath(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var5 = var3.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var6 = var3.contextNotImplemented();
    org.omg.CORBA.INTERNAL var7 = var1.badkindCannotOccur((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var11.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.NO_IMPLEMENT var14 = var11.contextNotImplemented();
    org.omg.CORBA.INTERNAL var15 = var9.badkindCannotOccur((java.lang.Throwable)var14);
    org.omg.CORBA.COMM_FAILURE var16 = var1.recvMsgError((java.lang.Throwable)var14);
    org.omg.CORBA.BAD_INV_ORDER var17 = var1.argumentsCalledNullArgs();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var19.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var22 = var19.bootstrapServerNotAvail();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var26 = var24.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.INTERNAL var27 = var19.emptyStackRunServantPostInvoke((java.lang.Throwable)var26);
    org.omg.CORBA.INTERNAL var28 = var1.badCompletionStatusInLocateReply((java.lang.Object)var19);
    org.omg.CORBA.INTERNAL var29 = var19.bootstrapApplicationException();
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var7 = var5.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var8 = var5.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var12 = var10.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var13 = var10.bootstrapServerNotAvail();
    org.omg.CORBA.INTERNAL var14 = var10.emptyStackRunServantPostInvoke();
    org.omg.CORBA.INTERNAL var15 = var5.locationforwardError((java.lang.Throwable)var14);
    org.omg.CORBA.DATA_CONVERSION var18 = var1.badSequenceBounds((java.lang.Throwable)var15, (java.lang.Object)(short)0, (java.lang.Object)(-1.0f));
    org.omg.CORBA.NO_IMPLEMENT var19 = var1.contextNotImplemented();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var3 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.BAD_OPERATION var4 = var1.extractObjectFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var8 = var6.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)(short)100);
    org.omg.CORBA.COMM_FAILURE var9 = var6.bootstrapServerNotAvail();
    org.omg.CORBA.INTERNAL var10 = var6.emptyStackRunServantPostInvoke();
    org.omg.CORBA.INTERNAL var11 = var1.locationforwardError((java.lang.Throwable)var10);
    org.omg.CORBA.INTERNAL var12 = var1.numInvocationsAlreadyZero();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
