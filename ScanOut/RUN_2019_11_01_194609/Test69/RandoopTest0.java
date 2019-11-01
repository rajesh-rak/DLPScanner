
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, (-1), 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(1, "hi!", (-1), 0, (-1), 0, 100, 1, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var2 = var1.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var11.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var15 = var14.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var20 = var19.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var21 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var22 = var17.orbInitializerFailure((java.lang.Throwable)var20, (java.lang.Object)var21);
    org.omg.CORBA.BAD_PARAM var25 = var11.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var15, (java.lang.Object)var21, (java.lang.Object)10, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var26 = var1.writeUndeclaredException((java.lang.Throwable)var7, (java.lang.Object)var21);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    org.omg.CORBA.MARSHAL var3 = var1.badKind();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var6 = var5.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var9 = var8.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.BAD_PARAM var19 = var5.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var9, (java.lang.Object)var15, (java.lang.Object)10, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var24 = var23.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var25 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var26 = var21.orbInitializerFailure((java.lang.Throwable)var24, (java.lang.Object)var25);
    org.omg.CORBA.BAD_OPERATION var27 = var21.orbDestroyed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var31 = var30.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var34 = var33.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var39 = var38.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var40 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var41 = var36.orbInitializerFailure((java.lang.Throwable)var39, (java.lang.Object)var40);
    org.omg.CORBA.BAD_PARAM var44 = var30.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var34, (java.lang.Object)var40, (java.lang.Object)10, (java.lang.Object)"hi!");
    org.omg.CORBA.DATA_CONVERSION var45 = var5.fragmentSizeDiv((java.lang.Throwable)var27, (java.lang.Object)10.0d, (java.lang.Object)10);
    org.omg.CORBA.COMM_FAILURE var46 = var1.recvMsgError((java.lang.Throwable)var45);
    
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
    assertNotNull(var16);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var18 = var1.workerThreadNotNeeded((java.lang.Object)var4, (java.lang.Object)var11, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var21 = var20.negativeBounds();
    org.omg.CORBA.INTERNAL var22 = var11.illegalReplyStatus((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var24.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var28 = var27.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var33 = var32.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var34 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var35 = var30.orbInitializerFailure((java.lang.Throwable)var33, (java.lang.Object)var34);
    org.omg.CORBA.BAD_PARAM var38 = var24.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var28, (java.lang.Object)var34, (java.lang.Object)10, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var43 = var42.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var44 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var45 = var40.orbInitializerFailure((java.lang.Throwable)var43, (java.lang.Object)var44);
    org.omg.CORBA.BAD_OPERATION var46 = var40.orbDestroyed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var50 = var49.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var53 = var52.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var58 = var57.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var59 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var60 = var55.orbInitializerFailure((java.lang.Throwable)var58, (java.lang.Object)var59);
    org.omg.CORBA.BAD_PARAM var63 = var49.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var53, (java.lang.Object)var59, (java.lang.Object)10, (java.lang.Object)"hi!");
    org.omg.CORBA.DATA_CONVERSION var64 = var24.fragmentSizeDiv((java.lang.Throwable)var46, (java.lang.Object)10.0d, (java.lang.Object)10);
    org.omg.CORBA.INTERNAL var67 = var11.workQueueThreadInterrupted((java.lang.Throwable)var64, (java.lang.Object)10.0d, (java.lang.Object)0.0f);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
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
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var18 = var1.workerThreadNotNeeded((java.lang.Object)var4, (java.lang.Object)var11, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var21 = var20.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var26 = var25.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var27 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var28 = var23.orbInitializerFailure((java.lang.Throwable)var26, (java.lang.Object)var27);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var33 = var32.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var34 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var35 = var30.orbInitializerFailure((java.lang.Throwable)var33, (java.lang.Object)var34);
    org.omg.CORBA.INTERNAL var37 = var20.workerThreadNotNeeded((java.lang.Object)var23, (java.lang.Object)var30, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var40 = var39.negativeBounds();
    org.omg.CORBA.INTERNAL var41 = var30.illegalReplyStatus((java.lang.Throwable)var40);
    org.omg.CORBA.INTERNAL var43 = var30.badCompletionStatusInReply((java.lang.Object)0);
    org.omg.CORBA.TRANSIENT var44 = var11.requestCanceled((java.lang.Throwable)var43);
    
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
    assertNotNull(var44);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var18 = var1.workerThreadNotNeeded((java.lang.Object)var4, (java.lang.Object)var11, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var21 = var20.contextCalledOutOfOrder();
    org.omg.CORBA.INTERNAL var22 = var11.boundsCannotOccur((java.lang.Throwable)var21);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("", "hi!");
    var0.entering("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var2 = var1.negativeBounds();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var5 = var4.contextCalledOutOfOrder();
    org.omg.CORBA.INITIALIZE var6 = var4.persistentServerportNotSet();
    org.omg.CORBA.BAD_OPERATION var7 = var1.connectingServant((java.lang.Throwable)var6);
    
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

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var2 = var1.negativeBounds();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var5 = var4.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var10 = var9.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var11 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var12 = var7.orbInitializerFailure((java.lang.Throwable)var10, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var17 = var16.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var18 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var19 = var14.orbInitializerFailure((java.lang.Throwable)var17, (java.lang.Object)var18);
    org.omg.CORBA.INTERNAL var21 = var4.workerThreadNotNeeded((java.lang.Object)var7, (java.lang.Object)var14, (java.lang.Object)"");
    org.omg.CORBA.COMM_FAILURE var22 = var14.recvMsgError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var24.unexpectedEof();
    org.omg.CORBA.MARSHAL var26 = var24.badKind();
    org.omg.CORBA.INTERNAL var27 = var14.badCompletionStatusInLocateReply((java.lang.Object)var26);
    org.omg.CORBA.BAD_OPERATION var28 = var1.connectRequiresStub((java.lang.Throwable)var27);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.remove("");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var5 = var4.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var10 = var9.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var11 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var12 = var7.orbInitializerFailure((java.lang.Throwable)var10, (java.lang.Object)var11);
    org.omg.CORBA.BAD_PARAM var15 = var1.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var5, (java.lang.Object)var11, (java.lang.Object)10, (java.lang.Object)"hi!");
    org.omg.CORBA.INTERNAL var16 = var1.badReplystatus();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var18 = var1.workerThreadNotNeeded((java.lang.Object)var4, (java.lang.Object)var11, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var21 = var20.negativeBounds();
    org.omg.CORBA.INTERNAL var22 = var11.illegalReplyStatus((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var24 = var11.badCompletionStatusInReply((java.lang.Object)0);
    org.omg.CORBA.DATA_CONVERSION var26 = var11.illegalIiopPrimaryToContactInfoType((java.lang.Object)'4');
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var18 = var1.workerThreadNotNeeded((java.lang.Object)var4, (java.lang.Object)var11, (java.lang.Object)"");
    org.omg.CORBA.COMM_FAILURE var19 = var11.recvMsgError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var22 = var21.unexpectedEof();
    org.omg.CORBA.MARSHAL var23 = var21.badKind();
    org.omg.CORBA.INTERNAL var24 = var11.badCompletionStatusInLocateReply((java.lang.Object)var23);
    org.omg.CORBA.INTERNAL var25 = var11.illegalTargetAddressDisposition();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var28 = var27.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var32 = var31.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var37 = var36.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var38 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var39 = var34.orbInitializerFailure((java.lang.Throwable)var37, (java.lang.Object)var38);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var44 = var43.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var45 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var46 = var41.orbInitializerFailure((java.lang.Throwable)var44, (java.lang.Object)var45);
    org.omg.CORBA.INTERNAL var48 = var31.workerThreadNotNeeded((java.lang.Object)var34, (java.lang.Object)var41, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var51 = var50.negativeBounds();
    org.omg.CORBA.INTERNAL var52 = var41.illegalReplyStatus((java.lang.Throwable)var51);
    org.omg.CORBA.INTERNAL var54 = var41.badCompletionStatusInReply((java.lang.Object)0);
    org.omg.CORBA.DATA_CONVERSION var55 = var27.badSequenceBounds((java.lang.Object)10.0f, (java.lang.Object)var54);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var58 = var57.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var61 = var60.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var66 = var65.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var67 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var68 = var63.orbInitializerFailure((java.lang.Throwable)var66, (java.lang.Object)var67);
    org.omg.CORBA.BAD_PARAM var71 = var57.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var61, (java.lang.Object)var67, (java.lang.Object)10, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var75 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var76 = var75.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var77 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var78 = var73.orbInitializerFailure((java.lang.Throwable)var76, (java.lang.Object)var77);
    org.omg.CORBA.BAD_OPERATION var79 = var73.orbDestroyed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var82 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var83 = var82.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var85 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var86 = var85.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var88 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var90 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var91 = var90.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var92 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var93 = var88.orbInitializerFailure((java.lang.Throwable)var91, (java.lang.Object)var92);
    org.omg.CORBA.BAD_PARAM var96 = var82.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var86, (java.lang.Object)var92, (java.lang.Object)10, (java.lang.Object)"hi!");
    org.omg.CORBA.DATA_CONVERSION var97 = var57.fragmentSizeDiv((java.lang.Throwable)var79, (java.lang.Object)10.0d, (java.lang.Object)10);
    org.omg.CORBA.DATA_CONVERSION var98 = var11.illegalIiopPrimaryToContactInfoType((java.lang.Throwable)var54, (java.lang.Object)var79);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
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
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var18 = var1.workerThreadNotNeeded((java.lang.Object)var4, (java.lang.Object)var11, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var21 = var20.negativeBounds();
    org.omg.CORBA.INTERNAL var22 = var11.illegalReplyStatus((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var24 = var11.badCompletionStatusInReply((java.lang.Object)0);
    org.omg.CORBA.DATA_CONVERSION var26 = var11.badCustomSocketFactory((java.lang.Object)100.0f);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var5 = var4.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var10 = var9.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var11 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var12 = var7.orbInitializerFailure((java.lang.Throwable)var10, (java.lang.Object)var11);
    org.omg.CORBA.BAD_PARAM var15 = var1.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var5, (java.lang.Object)var11, (java.lang.Object)10, (java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var20 = var19.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var21 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var22 = var17.orbInitializerFailure((java.lang.Throwable)var20, (java.lang.Object)var21);
    org.omg.CORBA.BAD_OPERATION var23 = var17.orbDestroyed();
    org.omg.CORBA.MARSHAL var24 = var1.badCodebaseIndirection((java.lang.Object)var17);
    org.omg.CORBA.BAD_OPERATION var25 = var17.getTypeIdsRequiresStub();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var4 = var3.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var5 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var6 = var1.orbInitializerFailure((java.lang.Throwable)var4, (java.lang.Object)var5);
    org.omg.CORBA.BAD_OPERATION var7 = var1.orbDestroyed();
    org.omg.CORBA.BAD_OPERATION var8 = var1.extractNotInitialized();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var18 = var1.workerThreadNotNeeded((java.lang.Object)var4, (java.lang.Object)var11, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var21 = var20.negativeBounds();
    org.omg.CORBA.INTERNAL var22 = var11.illegalReplyStatus((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var24 = var11.badCompletionStatusInReply((java.lang.Object)0);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var29 = var28.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var30 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var31 = var26.orbInitializerFailure((java.lang.Throwable)var29, (java.lang.Object)var30);
    org.omg.CORBA.OBJECT_NOT_EXIST var32 = var11.badAdapterId((java.lang.Throwable)var29);
    
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
    assertNotNull(var32);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var2 = var1.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var7 = var6.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var8 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var9 = var4.orbInitializerFailure((java.lang.Throwable)var7, (java.lang.Object)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var14 = var13.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var15 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var16 = var11.orbInitializerFailure((java.lang.Throwable)var14, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var18 = var1.workerThreadNotNeeded((java.lang.Object)var4, (java.lang.Object)var11, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var21 = var20.negativeBounds();
    org.omg.CORBA.INTERNAL var22 = var11.illegalReplyStatus((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var24.unexpectedEof();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var28 = var27.contextCalledOutOfOrder();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.BAD_OPERATION var33 = var32.contextCalledOutOfOrder();
    java.util.logging.LoggingMXBean var34 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.DATA_CONVERSION var35 = var30.orbInitializerFailure((java.lang.Throwable)var33, (java.lang.Object)var34);
    org.omg.CORBA.BAD_PARAM var38 = var24.invalidRequestPartitioningPolicyValue((java.lang.Throwable)var28, (java.lang.Object)var34, (java.lang.Object)10, (java.lang.Object)"hi!");
    org.omg.CORBA.NO_IMPLEMENT var39 = var24.contextNotImplemented();
    org.omg.CORBA.DATA_CONVERSION var40 = var11.illegalContactInfoListFactoryType((java.lang.Object)var24);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

}
