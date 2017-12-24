
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = java.lang.System.clearProperty("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var0, 10, 10, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.misc.VM.initializeOSEnvironment();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    char[] var4 = new char[] { ' ', ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var7 = var0.insert(1, var4, 100, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 10, 10, 0);
    var5.setHours(100);
    int var8 = var5.getYear();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean var0 = sun.misc.VM.allowGetCallerClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 10, 10, 0);
    long var6 = var5.getTime();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.util.TimeZoneNameUtility var0 = new sun.util.TimeZoneNameUtility();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var3 = var0.insert((-1), '#');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "libhi!.dylib"+ "'", var1.equals("libhi!.dylib"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.load("libhi!.dylib");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.nio.channels.Channel var0 = java.lang.System.inheritedChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var1 = var0.reverse();
    java.lang.StringBuilder var3 = var1.append(100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var6 = var3.insert(100, 1.0f);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var2 = var1.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var4 = var1.workerThreadCreationFailure((java.lang.Object)'4');
    java.lang.StringBuilder var5 = new java.lang.StringBuilder();
    int var7 = var5.lastIndexOf("");
    org.omg.CORBA.INTERNAL var8 = var1.invalidIsstreamedTckind((java.lang.Object)var5);
    org.omg.CORBA.INTERNAL var9 = var1.badExceptionDetailMessageServiceContextType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var2 = var1.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var4 = var1.workerThreadCreationFailure((java.lang.Object)'4');
    org.omg.CORBA.INTERNAL var5 = var1.invalidCodeSetNumber();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var8 = var7.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var10 = var7.workerThreadCreationFailure((java.lang.Object)'4');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var13 = var12.wcharArrayUnsupportedEncoding();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var18 = java.util.logging.Logger.getGlobal();
    var15.entering("hi!", "", (java.lang.Object)var18);
    org.omg.CORBA.DATA_CONVERSION var20 = var7.fragmentSizeDiv((java.lang.Throwable)var13, (java.lang.Object)(byte)0, (java.lang.Object)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var23 = var22.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var25 = var22.workerThreadCreationFailure((java.lang.Object)'4');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var28 = var27.wcharArrayUnsupportedEncoding();
    java.util.logging.Logger var30 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var33 = java.util.logging.Logger.getGlobal();
    var30.entering("hi!", "", (java.lang.Object)var33);
    org.omg.CORBA.DATA_CONVERSION var35 = var22.fragmentSizeDiv((java.lang.Throwable)var28, (java.lang.Object)(byte)0, (java.lang.Object)var30);
    byte[] var37 = new byte[] { };
    java.lang.String var38 = sun.security.util.Debug.toString(var37);
    org.omg.CORBA.MARSHAL var39 = var7.positiveEndTag((java.lang.Throwable)var28, (java.lang.Object)10L, (java.lang.Object)var38);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var42 = var41.badCorbalocString();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var45 = var44.badCorbalocString();
    org.omg.CORBA.BAD_OPERATION var46 = var41.getTypeIdsRequiresStub((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var49 = var48.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var51 = var48.workerThreadCreationFailure((java.lang.Object)'4');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var54 = var53.wcharArrayUnsupportedEncoding();
    java.util.logging.Logger var56 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var59 = java.util.logging.Logger.getGlobal();
    var56.entering("hi!", "", (java.lang.Object)var59);
    org.omg.CORBA.DATA_CONVERSION var61 = var48.fragmentSizeDiv((java.lang.Throwable)var54, (java.lang.Object)(byte)0, (java.lang.Object)var56);
    org.omg.CORBA.MARSHAL var62 = var41.errorInvokingHelperWrite((java.lang.Throwable)var54);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var65 = var64.badCorbalocString();
    org.omg.CORBA.COMM_FAILURE var66 = var41.connectionAbort((java.lang.Throwable)var65);
    org.omg.CORBA.DATA_CONVERSION var67 = var1.illegalContactInfoListFactoryType((java.lang.Throwable)var39, (java.lang.Object)var66);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
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

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var2 = var1.wcharArrayUnsupportedEncoding();
    sun.misc.VM var4 = new sun.misc.VM();
    org.omg.CORBA.INTERNAL var6 = var1.workerThreadNotNeeded((java.lang.Object)(short)(-1), (java.lang.Object)var4, (java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var2 = var1.badCorbalocString();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var5 = var4.badCorbalocString();
    org.omg.CORBA.BAD_OPERATION var6 = var1.getTypeIdsRequiresStub((java.lang.Throwable)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var9 = var8.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var11 = var8.workerThreadCreationFailure((java.lang.Object)'4');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var14 = var13.wcharArrayUnsupportedEncoding();
    java.util.logging.Logger var16 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var19 = java.util.logging.Logger.getGlobal();
    var16.entering("hi!", "", (java.lang.Object)var19);
    org.omg.CORBA.DATA_CONVERSION var21 = var8.fragmentSizeDiv((java.lang.Throwable)var14, (java.lang.Object)(byte)0, (java.lang.Object)var16);
    org.omg.CORBA.MARSHAL var22 = var1.errorInvokingHelperWrite((java.lang.Throwable)var14);
    org.omg.CORBA.BAD_OPERATION var23 = var1.ioExceptionOnClose();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var2 = var1.badCorbalocString();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var5 = var4.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var7 = var4.workerThreadCreationFailure((java.lang.Object)'4');
    org.omg.CORBA.INTERNAL var8 = var4.invalidCodeSetNumber();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var11 = var10.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.COMM_FAILURE var12 = var4.connectionAbort((java.lang.Throwable)var11);
    org.omg.CORBA.INTERNAL var13 = var1.emptyStackRunServantPostInvoke((java.lang.Throwable)var11);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var2 = var1.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var4 = var1.workerThreadCreationFailure((java.lang.Object)'4');
    org.omg.CORBA.INTERNAL var5 = var1.invalidCodeSetNumber();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var8 = var7.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.COMM_FAILURE var9 = var1.connectionAbort((java.lang.Throwable)var8);
    java.lang.Throwable var11 = new java.lang.Throwable("hi!");
    org.omg.CORBA.INITIALIZE var12 = var1.getServerPortCalledBeforeEndpointsInitialized(var11);
    
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
    assertNotNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 10, 10, 0);
    var5.setHours(100);
    int var8 = var5.getSeconds();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var2 = var1.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var4 = var1.workerThreadCreationFailure((java.lang.Object)'4');
    org.omg.CORBA.INTERNAL var5 = var1.invalidCodeSetNumber();
    org.omg.CORBA.BAD_PARAM var6 = var1.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var9 = var8.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var11 = var8.workerThreadCreationFailure((java.lang.Object)'4');
    org.omg.CORBA.INTERNAL var12 = var8.invalidCodeSetNumber();
    org.omg.CORBA.BAD_PARAM var13 = var8.abstractFromNonAbstract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var16 = var15.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var18 = var15.workerThreadCreationFailure((java.lang.Object)'4');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var21 = var20.wcharArrayUnsupportedEncoding();
    java.util.logging.Logger var23 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var26 = java.util.logging.Logger.getGlobal();
    var23.entering("hi!", "", (java.lang.Object)var26);
    org.omg.CORBA.DATA_CONVERSION var28 = var15.fragmentSizeDiv((java.lang.Throwable)var21, (java.lang.Object)(byte)0, (java.lang.Object)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var31 = var30.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var33 = var30.workerThreadCreationFailure((java.lang.Object)'4');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var36 = var35.wcharArrayUnsupportedEncoding();
    java.util.logging.Logger var38 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var41 = java.util.logging.Logger.getGlobal();
    var38.entering("hi!", "", (java.lang.Object)var41);
    org.omg.CORBA.DATA_CONVERSION var43 = var30.fragmentSizeDiv((java.lang.Throwable)var36, (java.lang.Object)(byte)0, (java.lang.Object)var38);
    byte[] var45 = new byte[] { };
    java.lang.String var46 = sun.security.util.Debug.toString(var45);
    org.omg.CORBA.MARSHAL var47 = var15.positiveEndTag((java.lang.Throwable)var36, (java.lang.Object)10L, (java.lang.Object)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var50 = var49.badCorbalocString();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var53 = var52.badCorbalocString();
    org.omg.CORBA.BAD_OPERATION var54 = var49.getTypeIdsRequiresStub((java.lang.Throwable)var53);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var57 = var56.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var59 = var56.workerThreadCreationFailure((java.lang.Object)'4');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var62 = var61.wcharArrayUnsupportedEncoding();
    java.util.logging.Logger var64 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var67 = java.util.logging.Logger.getGlobal();
    var64.entering("hi!", "", (java.lang.Object)var67);
    org.omg.CORBA.DATA_CONVERSION var69 = var56.fragmentSizeDiv((java.lang.Throwable)var62, (java.lang.Object)(byte)0, (java.lang.Object)var64);
    org.omg.CORBA.MARSHAL var70 = var49.errorInvokingHelperWrite((java.lang.Throwable)var62);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var73 = var72.badCorbalocString();
    org.omg.CORBA.COMM_FAILURE var74 = var49.connectionAbort((java.lang.Throwable)var73);
    org.omg.CORBA.INTERNAL var76 = var8.threadGroupHasActiveThreadsInClose((java.lang.Throwable)var47, (java.lang.Object)var73, (java.lang.Object)100);
    org.omg.CORBA.INTERNAL var77 = var1.remarshalWithNowhereToGo((java.lang.Throwable)var76);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
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

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var2 = var1.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var4 = var1.workerThreadCreationFailure((java.lang.Object)'4');
    org.omg.CORBA.INTERNAL var5 = var1.invalidCodeSetNumber();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var8 = var7.badCorbalocString();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INV_OBJREF var11 = var10.badCorbalocString();
    org.omg.CORBA.BAD_OPERATION var12 = var7.getTypeIdsRequiresStub((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var15 = var14.wcharArrayUnsupportedEncoding();
    org.omg.CORBA.INTERNAL var17 = var14.workerThreadCreationFailure((java.lang.Object)'4');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("libhi!.dylib");
    org.omg.CORBA.INTERNAL var20 = var19.wcharArrayUnsupportedEncoding();
    java.util.logging.Logger var22 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var25 = java.util.logging.Logger.getGlobal();
    var22.entering("hi!", "", (java.lang.Object)var25);
    org.omg.CORBA.DATA_CONVERSION var27 = var14.fragmentSizeDiv((java.lang.Throwable)var20, (java.lang.Object)(byte)0, (java.lang.Object)var22);
    org.omg.CORBA.MARSHAL var28 = var7.errorInvokingHelperWrite((java.lang.Throwable)var20);
    java.lang.StringBuilder var29 = new java.lang.StringBuilder();
    java.lang.StringBuilder var30 = var29.reverse();
    java.lang.StringBuilder var32 = var30.append(100.0f);
    org.omg.CORBA.MARSHAL var33 = var1.javaSerializationException((java.lang.Throwable)var20, (java.lang.Object)var32);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

}
