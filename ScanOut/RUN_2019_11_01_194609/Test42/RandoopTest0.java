
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("hi!", "");
    java.lang.Object[] var7 = new java.lang.Object[] { "hi!"};
    var0.entering("hi!", "hi!", var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.jar.Attributes var1 = new java.util.jar.Attributes(0);
    boolean var2 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.putIfAbsent((java.lang.Object)(-1.0f), (java.lang.Object)0L);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.jar.Attributes var1 = new java.util.jar.Attributes(0);
    boolean var2 = var1.isEmpty();
    java.util.Collection var3 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.jar.Attributes var1 = new java.util.jar.Attributes(0);
    boolean var2 = var1.isEmpty();
    var1.clear();
    java.util.jar.Attributes var5 = new java.util.jar.Attributes(0);
    boolean var6 = var5.isEmpty();
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    boolean var9 = var1.replace((java.lang.Object)var5, (java.lang.Object)(byte)10, (java.lang.Object)var8);
    var8.finer("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var9 = var3.badCompletionStatusInReply((java.lang.Object)var5);
    java.util.logging.Logger var10 = java.util.logging.Logger.getGlobal();
    var10.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    org.omg.CORBA.BAD_PARAM var14 = var13.localObjectNotAllowed();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    var15.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    org.omg.CORBA.INTERNAL var19 = var13.badCompletionStatusInReply((java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var20 = var3.fragmentationDisallowed((java.lang.Throwable)var19);
    java.util.logging.Logger var21 = java.util.logging.Logger.getGlobal();
    var21.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    org.omg.CORBA.BAD_PARAM var25 = var24.localObjectNotAllowed();
    java.util.logging.Logger var26 = java.util.logging.Logger.getGlobal();
    var26.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var26);
    org.omg.CORBA.INTERNAL var30 = var24.badCompletionStatusInReply((java.lang.Object)var26);
    org.omg.CORBA.DATA_CONVERSION var31 = var24.badStringifiedIorLen();
    java.util.logging.Logger var32 = java.util.logging.Logger.getGlobal();
    var32.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var32);
    org.omg.CORBA.BAD_PARAM var36 = var35.localObjectNotAllowed();
    java.util.logging.Logger var37 = java.util.logging.Logger.getGlobal();
    var37.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var37);
    org.omg.CORBA.INTERNAL var41 = var35.badCompletionStatusInReply((java.lang.Object)var37);
    java.util.logging.Logger var42 = java.util.logging.Logger.getGlobal();
    var42.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var42);
    org.omg.CORBA.BAD_OPERATION var46 = var45.fixedNotMatch();
    org.omg.CORBA.BAD_PARAM var47 = var35.nullParam((java.lang.Throwable)var46);
    org.omg.CORBA.INTERNAL var48 = var24.duplicateExceptionDetailMessage((java.lang.Throwable)var46);
    org.omg.CORBA.INTERNAL var49 = var3.multIiopProfNotSupported((java.lang.Throwable)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    org.omg.CORBA.DATA_CONVERSION var5 = var3.badStringifiedIorLen();
    org.omg.CORBA.UNKNOWN var6 = var3.unknownDsiSysex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    org.omg.CORBA.DATA_CONVERSION var5 = var3.badStringifiedIorLen();
    java.util.logging.Logger var6 = java.util.logging.Logger.getGlobal();
    var6.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    org.omg.CORBA.BAD_PARAM var10 = var9.localObjectNotAllowed();
    java.util.jar.Manifest var11 = new java.util.jar.Manifest();
    java.util.logging.Logger var12 = java.util.logging.Logger.getGlobal();
    var12.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.BAD_PARAM var16 = var15.localObjectNotAllowed();
    java.util.logging.Logger var17 = java.util.logging.Logger.getGlobal();
    var17.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    org.omg.CORBA.BAD_PARAM var21 = var20.localObjectNotAllowed();
    org.omg.CORBA.DATA_CONVERSION var22 = var15.badHexDigit((java.lang.Throwable)var21);
    java.util.logging.Logger var23 = java.util.logging.Logger.getGlobal();
    var23.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var23);
    org.omg.CORBA.BAD_PARAM var27 = var26.localObjectNotAllowed();
    java.util.logging.Logger var28 = java.util.logging.Logger.getGlobal();
    var28.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var28);
    org.omg.CORBA.BAD_PARAM var32 = var31.localObjectNotAllowed();
    org.omg.CORBA.DATA_CONVERSION var33 = var26.badHexDigit((java.lang.Throwable)var32);
    org.omg.CORBA.INTERNAL var34 = var9.workerThreadThrowableFromRequestWork((java.lang.Object)var11, (java.lang.Object)var21, (java.lang.Object)var33);
    org.omg.CORBA.DATA_CONVERSION var36 = var3.illegalIorToSocketInfoType((java.lang.Throwable)var21, (java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var9 = var3.badCompletionStatusInReply((java.lang.Object)var5);
    java.util.logging.Logger var10 = java.util.logging.Logger.getGlobal();
    var10.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    org.omg.CORBA.BAD_PARAM var14 = var13.localObjectNotAllowed();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    var15.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    org.omg.CORBA.INTERNAL var19 = var13.badCompletionStatusInReply((java.lang.Object)var15);
    java.util.logging.Logger var20 = java.util.logging.Logger.getGlobal();
    var20.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    org.omg.CORBA.BAD_PARAM var24 = var23.localObjectNotAllowed();
    java.util.logging.Logger var25 = java.util.logging.Logger.getGlobal();
    var25.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var25);
    org.omg.CORBA.INTERNAL var29 = var23.badCompletionStatusInReply((java.lang.Object)var25);
    org.omg.CORBA.INTERNAL var30 = var13.fragmentationDisallowed((java.lang.Throwable)var29);
    org.omg.CORBA.OBJECT_NOT_EXIST var31 = var3.badServerId((java.lang.Throwable)var30);
    java.util.logging.Logger var32 = java.util.logging.Logger.getGlobal();
    var32.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var32);
    org.omg.CORBA.BAD_PARAM var36 = var35.localObjectNotAllowed();
    java.util.logging.Logger var37 = java.util.logging.Logger.getGlobal();
    var37.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var37);
    org.omg.CORBA.INTERNAL var41 = var35.badCompletionStatusInReply((java.lang.Object)var37);
    java.util.logging.Logger var42 = java.util.logging.Logger.getGlobal();
    var42.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var42);
    org.omg.CORBA.BAD_OPERATION var46 = var45.fixedNotMatch();
    org.omg.CORBA.BAD_PARAM var47 = var35.nullParam((java.lang.Throwable)var46);
    org.omg.CORBA.MARSHAL var48 = var3.badToaOaid((java.lang.Throwable)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    org.omg.CORBA.OBJECT_NOT_EXIST var5 = var3.noObjectAdapterFactory();
    java.util.logging.Logger var6 = java.util.logging.Logger.getGlobal();
    var6.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    org.omg.CORBA.BAD_PARAM var10 = var9.localObjectNotAllowed();
    java.util.logging.Logger var11 = java.util.logging.Logger.getGlobal();
    var11.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var11);
    org.omg.CORBA.INTERNAL var15 = var9.badCompletionStatusInReply((java.lang.Object)var11);
    java.util.logging.Logger var16 = java.util.logging.Logger.getGlobal();
    var16.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var16);
    org.omg.CORBA.BAD_OPERATION var20 = var19.fixedNotMatch();
    org.omg.CORBA.BAD_PARAM var21 = var9.nullParam((java.lang.Throwable)var20);
    org.omg.CORBA.BAD_OPERATION var22 = var3.getTypeIdsRequiresStub((java.lang.Throwable)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.BAD_PARAM var9 = var8.localObjectNotAllowed();
    org.omg.CORBA.DATA_CONVERSION var10 = var3.badHexDigit((java.lang.Throwable)var9);
    org.omg.CORBA.COMM_FAILURE var12 = var3.selectionKeyInvalid((java.lang.Object)1.0f);
    org.omg.CORBA.COMM_FAILURE var13 = var3.invokeError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.BAD_PARAM var9 = var8.localObjectNotAllowed();
    org.omg.CORBA.DATA_CONVERSION var10 = var3.badHexDigit((java.lang.Throwable)var9);
    org.omg.CORBA.BAD_PARAM var12 = var3.invalidTypecodeKind((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var9 = var3.badCompletionStatusInReply((java.lang.Object)var5);
    java.util.logging.Logger var10 = java.util.logging.Logger.getGlobal();
    var10.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    org.omg.CORBA.BAD_PARAM var14 = var13.localObjectNotAllowed();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    var15.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    org.omg.CORBA.INTERNAL var19 = var13.badCompletionStatusInReply((java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var20 = var3.fragmentationDisallowed((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var21 = var3.noToa();
    org.omg.CORBA.BAD_PARAM var22 = var3.objrefFromForeignOrb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    org.omg.CORBA.OBJECT_NOT_EXIST var5 = var3.noObjectAdapterFactory();
    org.omg.CORBA.INTERNAL var6 = var3.unableToSetSocketFactoryOrb();
    java.util.logging.Logger var7 = java.util.logging.Logger.getGlobal();
    var7.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    org.omg.CORBA.BAD_PARAM var11 = var10.localObjectNotAllowed();
    java.util.logging.Logger var12 = java.util.logging.Logger.getGlobal();
    var12.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.BAD_PARAM var16 = var15.localObjectNotAllowed();
    org.omg.CORBA.DATA_CONVERSION var17 = var10.badHexDigit((java.lang.Throwable)var16);
    java.util.logging.Logger var18 = java.util.logging.Logger.getGlobal();
    var18.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var18);
    org.omg.CORBA.BAD_PARAM var22 = var21.localObjectNotAllowed();
    org.omg.CORBA.OBJECT_NOT_EXIST var23 = var21.noObjectAdapterFactory();
    org.omg.CORBA.BAD_TYPECODE var24 = var10.unresolvedRecursiveTypecode((java.lang.Throwable)var23);
    org.omg.CORBA.BAD_OPERATION var25 = var10.ioExceptionOnClose();
    org.omg.CORBA.BAD_INV_ORDER var26 = var3.setResultCalledNullArgs((java.lang.Throwable)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var9 = var3.badCompletionStatusInReply((java.lang.Object)var5);
    java.util.logging.Logger var10 = java.util.logging.Logger.getGlobal();
    var10.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    org.omg.CORBA.BAD_PARAM var14 = var13.localObjectNotAllowed();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    var15.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    org.omg.CORBA.INTERNAL var19 = var13.badCompletionStatusInReply((java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var20 = var3.exceptionWhenSendingCloseConnection((java.lang.Throwable)var19);
    org.omg.CORBA.COMM_FAILURE var21 = var3.connectionRebind();
    java.util.logging.Logger var22 = java.util.logging.Logger.getGlobal();
    var22.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var22);
    org.omg.CORBA.MARSHAL var26 = var25.illegalUnionDiscriminatorType();
    org.omg.CORBA.MARSHAL var27 = var3.couldNotInvokeHelperReadMethod((java.lang.Object)var26);
    java.util.logging.Logger var28 = java.util.logging.Logger.getGlobal();
    var28.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var28);
    org.omg.CORBA.BAD_PARAM var32 = var31.localObjectNotAllowed();
    java.util.logging.Logger var33 = java.util.logging.Logger.getGlobal();
    var33.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var33);
    org.omg.CORBA.INTERNAL var37 = var31.badCompletionStatusInReply((java.lang.Object)var33);
    java.util.logging.Logger var38 = java.util.logging.Logger.getGlobal();
    var38.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var38);
    org.omg.CORBA.BAD_PARAM var42 = var41.localObjectNotAllowed();
    java.util.logging.Logger var43 = java.util.logging.Logger.getGlobal();
    var43.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var43);
    org.omg.CORBA.INTERNAL var47 = var41.badCompletionStatusInReply((java.lang.Object)var43);
    org.omg.CORBA.INTERNAL var48 = var31.exceptionWhenSendingCloseConnection((java.lang.Throwable)var47);
    org.omg.CORBA.COMM_FAILURE var49 = var31.connectionRebind();
    java.util.logging.Logger var50 = java.util.logging.Logger.getGlobal();
    var50.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var50);
    org.omg.CORBA.MARSHAL var54 = var53.illegalUnionDiscriminatorType();
    org.omg.CORBA.MARSHAL var55 = var31.couldNotInvokeHelperReadMethod((java.lang.Object)var54);
    org.omg.CORBA.INV_OBJREF var56 = var3.badCorbalocString((java.lang.Throwable)var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_PARAM var4 = var3.localObjectNotAllowed();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var9 = var3.badCompletionStatusInReply((java.lang.Object)var5);
    org.omg.CORBA.DATA_CONVERSION var10 = var3.badStringifiedIorLen();
    java.util.logging.Logger var11 = java.util.logging.Logger.getGlobal();
    var11.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var11);
    org.omg.CORBA.BAD_PARAM var15 = var14.localObjectNotAllowed();
    java.util.logging.Logger var16 = java.util.logging.Logger.getGlobal();
    var16.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var16);
    org.omg.CORBA.INTERNAL var20 = var14.badCompletionStatusInReply((java.lang.Object)var16);
    java.util.logging.Logger var21 = java.util.logging.Logger.getGlobal();
    var21.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    org.omg.CORBA.BAD_PARAM var25 = var24.localObjectNotAllowed();
    java.util.logging.Logger var26 = java.util.logging.Logger.getGlobal();
    var26.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var26);
    org.omg.CORBA.INTERNAL var30 = var24.badCompletionStatusInReply((java.lang.Object)var26);
    org.omg.CORBA.INTERNAL var31 = var14.fragmentationDisallowed((java.lang.Throwable)var30);
    org.omg.CORBA.BAD_OPERATION var32 = var3.insertObjectFailed((java.lang.Throwable)var30);
    java.util.logging.Logger var33 = java.util.logging.Logger.getGlobal();
    var33.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var33);
    org.omg.CORBA.BAD_PARAM var37 = var36.localObjectNotAllowed();
    java.util.logging.Logger var38 = java.util.logging.Logger.getGlobal();
    var38.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var38);
    org.omg.CORBA.INTERNAL var42 = var36.badCompletionStatusInReply((java.lang.Object)var38);
    java.util.logging.Logger var43 = java.util.logging.Logger.getGlobal();
    var43.info("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var43);
    org.omg.CORBA.BAD_OPERATION var47 = var46.fixedNotMatch();
    org.omg.CORBA.BAD_PARAM var48 = var36.nullParam((java.lang.Throwable)var47);
    org.omg.CORBA.BAD_OPERATION var49 = var3.orbIdNotAvailable((java.lang.Throwable)var47);
    org.omg.CORBA.UNKNOWN var50 = var3.unknownCorbaExc();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

}
