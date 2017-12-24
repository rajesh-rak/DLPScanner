
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, 100, (-1), "");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var3 = java.util.logging.Logger.getLogger("hi!");
    var1.setParent(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var14 = var9.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var22 = var9.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.badFixed((java.lang.Object)'a', (java.lang.Object)var22);
    org.omg.CORBA.BAD_PARAM var24 = var1.persistentServerInitError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var31.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var43 = var38.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var44 = var31.badCodeSetString((java.lang.Throwable)var43);
    org.omg.CORBA.INITIALIZE var45 = var16.cannotCreateOrbidDb((java.lang.Throwable)var43);
    org.omg.CORBA.INTERNAL var46 = var1.badReplystatus((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var53 = var48.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var60 = var55.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var61 = var48.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var60);
    org.omg.CORBA.BAD_OPERATION var62 = var1.setExceptionCalledNullArgs((java.lang.Throwable)var61);
    org.omg.CORBA.BAD_INV_ORDER var63 = var1.setResultCalledMultiple();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    org.omg.CORBA.DATA_CONVERSION var30 = var1.badHexDigit((java.lang.Throwable)var28);
    org.omg.CORBA.BAD_OPERATION var31 = var1.extractObjectIncompatible();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var38 = var33.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var45 = var40.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var46 = var33.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var53 = var48.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var60 = var55.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var61 = var48.badCodeSetString((java.lang.Throwable)var60);
    org.omg.CORBA.INITIALIZE var62 = var33.cannotCreateOrbidDb((java.lang.Throwable)var60);
    org.omg.CORBA.BAD_PARAM var63 = var33.bootstrapRuntimeException();
    org.omg.CORBA.BAD_PARAM var64 = var1.boundsErrorInDiiRequest((java.lang.Throwable)var63);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var71 = var66.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var78 = var73.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var79 = var66.badCodeSetString((java.lang.Throwable)var78);
    org.omg.CORBA.INTERNAL var81 = var1.badHelperIdMethod((java.lang.Throwable)var79, (java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
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
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    org.omg.CORBA.DATA_CONVERSION var30 = var1.badHexDigit((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var37 = var32.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var44 = var39.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var45 = var32.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var44);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var52 = var47.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var59 = var54.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var60 = var47.badCodeSetString((java.lang.Throwable)var59);
    org.omg.CORBA.INITIALIZE var61 = var32.cannotCreateOrbidDb((java.lang.Throwable)var59);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var68 = var63.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var75 = var70.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.MARSHAL var77 = var32.readObjectLoadClassFailure((java.lang.Throwable)var68, (java.lang.Object)100.0d, (java.lang.Object)10);
    org.omg.CORBA.INTERNAL var78 = var1.cancelNotSupported((java.lang.Throwable)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var20 = var15.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var27 = var22.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var28 = var15.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var27);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.DATA_CONVERSION var32 = var15.badSequenceBounds((java.lang.Object)"", (java.lang.Object)0.0d);
    org.omg.CORBA.INTERNAL var33 = var8.badServantReadObject((java.lang.Throwable)var32);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var40 = var35.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var47 = var42.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var48 = var35.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var47);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var55 = var50.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var62 = var57.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var63 = var50.badCodeSetString((java.lang.Throwable)var62);
    org.omg.CORBA.INITIALIZE var64 = var35.cannotCreateOrbidDb((java.lang.Throwable)var62);
    org.omg.CORBA.BAD_PARAM var65 = var35.bootstrapRuntimeException();
    org.omg.CORBA.DATA_CONVERSION var66 = var1.badSequenceBounds((java.lang.Object)var8, (java.lang.Object)var65);
    org.omg.CORBA.INTERNAL var69 = var8.workQueueRequestWorkNoWorkFound((java.lang.Object)0.0d, (java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.entering("", "0.0");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var20 = var15.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var27 = var22.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var34 = var29.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var35 = var22.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var34);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.DATA_CONVERSION var39 = var22.badSequenceBounds((java.lang.Object)"", (java.lang.Object)0.0d);
    org.omg.CORBA.INTERNAL var40 = var15.badServantReadObject((java.lang.Throwable)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var47 = var42.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var54 = var49.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var55 = var42.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var54);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var62 = var57.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var69 = var64.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var70 = var57.badCodeSetString((java.lang.Throwable)var69);
    org.omg.CORBA.INITIALIZE var71 = var42.cannotCreateOrbidDb((java.lang.Throwable)var69);
    org.omg.CORBA.BAD_PARAM var72 = var42.bootstrapRuntimeException();
    org.omg.CORBA.DATA_CONVERSION var73 = var8.badSequenceBounds((java.lang.Object)var15, (java.lang.Object)var72);
    java.lang.Object[] var74 = new java.lang.Object[] { var73};
    var1.entering("0", "hi!", var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    java.util.logging.Logger var17 = java.util.logging.Logger.getLogger("hi!");
    org.omg.CORBA.MARSHAL var18 = var1.unexpectedEnclosingValuetype((java.lang.Object)'4', (java.lang.Object)var17);
    java.lang.String var19 = var17.getResourceBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var31.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var43 = var38.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var44 = var31.badCodeSetString((java.lang.Throwable)var43);
    org.omg.CORBA.INITIALIZE var45 = var16.cannotCreateOrbidDb((java.lang.Throwable)var43);
    org.omg.CORBA.INTERNAL var46 = var1.badReplystatus((java.lang.Throwable)var45);
    org.omg.CORBA.BAD_TYPECODE var47 = var1.badRemoteTypecode();
    org.omg.CORBA.MARSHAL var48 = var1.valuehandlerReadException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    java.util.logging.Logger var17 = java.util.logging.Logger.getLogger("hi!");
    org.omg.CORBA.MARSHAL var18 = var1.unexpectedEnclosingValuetype((java.lang.Object)'4', (java.lang.Object)var17);
    var17.exiting("", "", (java.lang.Object)"0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var20 = var15.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var21 = var8.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.DATA_CONVERSION var25 = var8.badSequenceBounds((java.lang.Object)"", (java.lang.Object)0.0d);
    org.omg.CORBA.INTERNAL var26 = var1.badServantReadObject((java.lang.Throwable)var25);
    org.omg.CORBA.BAD_OPERATION var27 = var1.contextCalledOutOfOrder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badCodeSetString((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var31.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var43 = var38.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var44 = var31.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var51 = var46.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var58 = var53.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var59 = var46.badCodeSetString((java.lang.Throwable)var58);
    org.omg.CORBA.INITIALIZE var60 = var31.cannotCreateOrbidDb((java.lang.Throwable)var58);
    org.omg.CORBA.INTERNAL var61 = var16.badReplystatus((java.lang.Throwable)var60);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var68 = var63.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var75 = var70.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var76 = var63.badCodeSetString((java.lang.Throwable)var75);
    org.omg.CORBA.DATA_CONVERSION var77 = var1.illegalSocketFactoryType((java.lang.Throwable)var60, (java.lang.Object)var63);
    org.omg.CORBA.INTERNAL var79 = var1.writeUndeclaredException((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var1 = new byte[] { (byte)10};
    java.lang.String var2 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\n"+ "'", var2.equals("\n"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badCodeSetString((java.lang.Throwable)var13);
    org.omg.CORBA.INTERNAL var15 = var1.badMessageTypeForCancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var20 = var15.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var27 = var22.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var28 = var15.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var27);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.DATA_CONVERSION var32 = var15.badSequenceBounds((java.lang.Object)"", (java.lang.Object)0.0d);
    org.omg.CORBA.INTERNAL var33 = var8.badServantReadObject((java.lang.Throwable)var32);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var40 = var35.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var47 = var42.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var48 = var35.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var47);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var55 = var50.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var62 = var57.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var63 = var50.badCodeSetString((java.lang.Throwable)var62);
    org.omg.CORBA.INITIALIZE var64 = var35.cannotCreateOrbidDb((java.lang.Throwable)var62);
    org.omg.CORBA.BAD_PARAM var65 = var35.bootstrapRuntimeException();
    org.omg.CORBA.DATA_CONVERSION var66 = var1.badSequenceBounds((java.lang.Object)var8, (java.lang.Object)var65);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var73 = var68.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var76 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var81 = var76.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var83 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var88 = var83.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var89 = var76.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var88);
    org.omg.CORBA.MARSHAL var90 = var68.badFixed((java.lang.Object)'a', (java.lang.Object)var89);
    org.omg.CORBA.INITIALIZE var91 = var1.cannotReadOrbidDb((java.lang.Throwable)var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
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
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var14 = var9.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var22 = var9.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.badFixed((java.lang.Object)'a', (java.lang.Object)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var30 = var25.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var37 = var32.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var44 = var39.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var45 = var32.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var44);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.DATA_CONVERSION var49 = var32.badSequenceBounds((java.lang.Object)"", (java.lang.Object)0.0d);
    org.omg.CORBA.INTERNAL var50 = var25.badServantReadObject((java.lang.Throwable)var49);
    org.omg.CORBA.BAD_OPERATION var51 = var1.connectingServant((java.lang.Throwable)var49);
    org.omg.CORBA.INTERNAL var52 = var1.nullReplyInGetAddrDisposition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var31.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var43 = var38.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var44 = var31.badCodeSetString((java.lang.Throwable)var43);
    org.omg.CORBA.INITIALIZE var45 = var16.cannotCreateOrbidDb((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var52 = var47.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var59 = var54.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.MARSHAL var61 = var16.readObjectLoadClassFailure((java.lang.Throwable)var52, (java.lang.Object)100.0d, (java.lang.Object)10);
    org.omg.CORBA.BAD_OPERATION var62 = var1.contextCalledOutOfOrder((java.lang.Throwable)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    org.omg.CORBA.DATA_CONVERSION var30 = var1.badHexDigit((java.lang.Throwable)var28);
    org.omg.CORBA.BAD_OPERATION var31 = var1.extractObjectIncompatible();
    org.omg.CORBA.COMM_FAILURE var32 = var1.connectionAbort();
    org.omg.CORBA.BAD_OPERATION var33 = var1.fixedNotMatch();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var31.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var43 = var38.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var44 = var31.badCodeSetString((java.lang.Throwable)var43);
    org.omg.CORBA.INITIALIZE var45 = var16.cannotCreateOrbidDb((java.lang.Throwable)var43);
    org.omg.CORBA.INTERNAL var46 = var1.badReplystatus((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var53 = var48.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.BAD_OPERATION var54 = var1.badActivateTieCall((java.lang.Throwable)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var14 = var1.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var21 = var16.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var29 = var16.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var31.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var43 = var38.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var44 = var31.badCodeSetString((java.lang.Throwable)var43);
    org.omg.CORBA.INITIALIZE var45 = var16.cannotCreateOrbidDb((java.lang.Throwable)var43);
    org.omg.CORBA.INTERNAL var46 = var1.badReplystatus((java.lang.Throwable)var45);
    org.omg.CORBA.INTERNAL var47 = var1.couldNotDuplicateCdrInputStream();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var54 = var49.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var61 = var56.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var62 = var49.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var61);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var69 = var64.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var76 = var71.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var77 = var64.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var76);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var79 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var84 = var79.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var86 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var91 = var86.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var92 = var79.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var91);
    org.omg.CORBA.DATA_CONVERSION var93 = var64.badHexDigit((java.lang.Throwable)var91);
    org.omg.CORBA.INTERNAL var96 = var49.workerThreadNotNeeded((java.lang.Object)var91, (java.lang.Object)(short)10, (java.lang.Object)(byte)100);
    org.omg.CORBA.MARSHAL var97 = var1.couldNotFindClass((java.lang.Throwable)var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var13 = var8.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var20 = var15.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var21 = var8.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.DATA_CONVERSION var25 = var8.badSequenceBounds((java.lang.Object)"", (java.lang.Object)0.0d);
    org.omg.CORBA.INTERNAL var26 = var1.badServantReadObject((java.lang.Throwable)var25);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var33 = var28.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var40 = var35.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var41 = var28.badCodeSetString((java.lang.Throwable)var40);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var49 = var44.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var56 = var51.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var57 = var44.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var56);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var64 = var59.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var71 = var66.transportReadTimeoutExceeded((java.lang.Object)0.0f, (java.lang.Object)"hi!", (java.lang.Object)100.0d, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var72 = var59.badExceptionDetailMessageServiceContextType((java.lang.Throwable)var71);
    org.omg.CORBA.DATA_CONVERSION var73 = var44.badHexDigit((java.lang.Throwable)var71);
    org.omg.CORBA.INITIALIZE var74 = var44.getServerPortCalledBeforeEndpointsInitialized();
    org.omg.CORBA.BAD_PARAM var76 = var1.invalidRequestPartitioningComponentValue((java.lang.Throwable)var40, (java.lang.Object)(short)10, (java.lang.Object)var44, (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
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

  }

}
