
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.corba.se.impl.protocol.CorbaClientRequestDispatcherImpl var0 = new com.sun.corba.se.impl.protocol.CorbaClientRequestDispatcherImpl();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("", "hi!", "a4");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var2 = new char[] { 'a', '4'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var2, (-1), 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4"+ "'", var3.equals("a4"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = new java.lang.String(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(100, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var8 = var7.characterOutofrange();
    org.omg.CORBA.INTERNAL var9 = var7.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var10 = var4.unknownServerError((java.lang.Throwable)var9);
    org.omg.CORBA.BAD_OPERATION var12 = var4.classNotFound3((java.lang.Object)0L);
    org.omg.CORBA.BAD_PARAM var13 = var1.localObjectNotAllowed((java.lang.Throwable)var12);
    
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

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    char[] var2 = new char[] { 'a', '4'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    java.lang.String var6 = new java.lang.String(var2, 0, 1);
    java.lang.String var7 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4"+ "'", var3.equals("a4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "a"+ "'", var6.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "a4"+ "'", var7.equals("a4"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.INTERNAL var2 = var1.invalidCodeSetNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    org.omg.CORBA.INTERNAL var6 = var4.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var7 = var1.unknownServerError((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var10 = var9.characterOutofrange();
    org.omg.CORBA.INTERNAL var11 = var9.statementNotReachable3();
    org.omg.CORBA.MARSHAL var12 = var1.expectedTypeNullAndNoRepId((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var15 = var14.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var18 = var17.characterOutofrange();
    org.omg.CORBA.INTERNAL var19 = var17.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var20 = var14.unknownServerError((java.lang.Throwable)var19);
    org.omg.CORBA.BAD_OPERATION var22 = var14.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var25 = var24.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var28 = var27.characterOutofrange();
    org.omg.CORBA.INTERNAL var29 = var27.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var30 = var24.unknownServerError((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var14.noToa((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var33 = var14.badRepIdIndirection((java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var36 = var1.extractWrongTypeList((java.lang.Throwable)var33, (java.lang.Object)"hi!", (java.lang.Object)"a4");
    org.omg.CORBA.DATA_CONVERSION var38 = var1.illegalIiopPrimaryToContactInfoType((java.lang.Object)"a");
    org.omg.CORBA.MARSHAL var40 = var1.couldNotInvokeHelperReadMethod((java.lang.Object)(byte)100);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    org.omg.CORBA.INTERNAL var6 = var4.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var7 = var1.unknownServerError((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var10 = var9.characterOutofrange();
    org.omg.CORBA.INTERNAL var11 = var9.statementNotReachable3();
    org.omg.CORBA.MARSHAL var12 = var1.expectedTypeNullAndNoRepId((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var15 = var14.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var18 = var17.characterOutofrange();
    org.omg.CORBA.INTERNAL var19 = var17.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var20 = var14.unknownServerError((java.lang.Throwable)var19);
    org.omg.CORBA.BAD_OPERATION var22 = var14.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var25 = var24.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var28 = var27.characterOutofrange();
    org.omg.CORBA.INTERNAL var29 = var27.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var30 = var24.unknownServerError((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var14.noToa((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var33 = var14.badRepIdIndirection((java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var36 = var1.extractWrongTypeList((java.lang.Throwable)var33, (java.lang.Object)"hi!", (java.lang.Object)"a4");
    org.omg.CORBA.DATA_CONVERSION var38 = var1.illegalIiopPrimaryToContactInfoType((java.lang.Object)"a");
    org.omg.CORBA.MARSHAL var40 = var1.negativeStringLength((java.lang.Object)true);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    org.omg.CORBA.INTERNAL var6 = var4.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var7 = var1.unknownServerError((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var10 = var9.characterOutofrange();
    org.omg.CORBA.INTERNAL var11 = var9.statementNotReachable3();
    org.omg.CORBA.BAD_OPERATION var12 = var1.badActivateTieCall((java.lang.Throwable)var11);
    org.omg.CORBA.INITIALIZE var13 = var1.persistentServerportNotSet();
    org.omg.CORBA.INTERNAL var16 = var1.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)10L, (java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var17 = var1.illegalGiopMsgType();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.INTERNAL var2 = var1.giopVersionError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var8 = var7.characterOutofrange();
    org.omg.CORBA.INTERNAL var9 = var7.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var10 = var4.unknownServerError((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var13 = var12.characterOutofrange();
    org.omg.CORBA.INTERNAL var14 = var12.statementNotReachable3();
    org.omg.CORBA.MARSHAL var15 = var4.expectedTypeNullAndNoRepId((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var17 = var1.threadGroupHasActiveThreadsInClose((java.lang.Object)var15, (java.lang.Object)"");
    org.omg.CORBA.BAD_OPERATION var19 = var1.classNotFound2((java.lang.Object)"hi!");
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    org.omg.CORBA.INTERNAL var6 = var4.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var7 = var1.unknownServerError((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var10 = var9.characterOutofrange();
    org.omg.CORBA.INTERNAL var11 = var9.statementNotReachable3();
    org.omg.CORBA.MARSHAL var12 = var1.expectedTypeNullAndNoRepId((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var15 = var14.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var18 = var17.characterOutofrange();
    org.omg.CORBA.INTERNAL var19 = var17.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var20 = var14.unknownServerError((java.lang.Throwable)var19);
    org.omg.CORBA.BAD_OPERATION var22 = var14.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var25 = var24.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var28 = var27.characterOutofrange();
    org.omg.CORBA.INTERNAL var29 = var27.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var30 = var24.unknownServerError((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var14.noToa((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var33 = var14.badRepIdIndirection((java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var36 = var1.extractWrongTypeList((java.lang.Throwable)var33, (java.lang.Object)"hi!", (java.lang.Object)"a4");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var39 = var38.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var42 = var41.characterOutofrange();
    org.omg.CORBA.INTERNAL var43 = var41.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var44 = var38.unknownServerError((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var47 = var46.characterOutofrange();
    org.omg.CORBA.INTERNAL var48 = var46.statementNotReachable3();
    org.omg.CORBA.BAD_OPERATION var49 = var38.badActivateTieCall((java.lang.Throwable)var48);
    org.omg.CORBA.DATA_CONVERSION var51 = var38.badCustomIorToSocketInfo((java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var52 = var1.wrongClientsc((java.lang.Throwable)var51);
    org.omg.CORBA.INV_OBJREF var53 = var1.badCorbalocString();
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertNotNull(var53);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    char[] var2 = new char[] { 'a', '4'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var2, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4"+ "'", var3.equals("a4"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("a4", "a4", "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    org.omg.CORBA.INTERNAL var6 = var4.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var7 = var1.unknownServerError((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var10 = var9.characterOutofrange();
    org.omg.CORBA.INTERNAL var11 = var9.statementNotReachable3();
    org.omg.CORBA.MARSHAL var12 = var1.expectedTypeNullAndNoRepId((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var15 = var14.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var18 = var17.characterOutofrange();
    org.omg.CORBA.INTERNAL var19 = var17.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var20 = var14.unknownServerError((java.lang.Throwable)var19);
    org.omg.CORBA.BAD_OPERATION var22 = var14.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var25 = var24.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var28 = var27.characterOutofrange();
    org.omg.CORBA.INTERNAL var29 = var27.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var30 = var24.unknownServerError((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var14.noToa((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var33 = var14.badRepIdIndirection((java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var36 = var1.extractWrongTypeList((java.lang.Throwable)var33, (java.lang.Object)"hi!", (java.lang.Object)"a4");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var39 = var38.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var42 = var41.characterOutofrange();
    org.omg.CORBA.INTERNAL var43 = var41.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var44 = var38.unknownServerError((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var47 = var46.characterOutofrange();
    org.omg.CORBA.INTERNAL var48 = var46.statementNotReachable3();
    org.omg.CORBA.BAD_OPERATION var49 = var38.badActivateTieCall((java.lang.Throwable)var48);
    org.omg.CORBA.DATA_CONVERSION var51 = var38.badCustomIorToSocketInfo((java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var52 = var1.wrongClientsc((java.lang.Throwable)var51);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var55 = var54.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var58 = var57.characterOutofrange();
    org.omg.CORBA.INTERNAL var59 = var57.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var60 = var54.unknownServerError((java.lang.Throwable)var59);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var63 = var62.characterOutofrange();
    org.omg.CORBA.INTERNAL var64 = var62.statementNotReachable3();
    org.omg.CORBA.MARSHAL var65 = var54.expectedTypeNullAndNoRepId((java.lang.Throwable)var64);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var67 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var68 = var67.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var71 = var70.characterOutofrange();
    org.omg.CORBA.INTERNAL var72 = var70.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var73 = var67.unknownServerError((java.lang.Throwable)var72);
    org.omg.CORBA.BAD_OPERATION var75 = var67.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var78 = var77.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var80 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var81 = var80.characterOutofrange();
    org.omg.CORBA.INTERNAL var82 = var80.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var83 = var77.unknownServerError((java.lang.Throwable)var82);
    org.omg.CORBA.INTERNAL var84 = var67.noToa((java.lang.Throwable)var82);
    org.omg.CORBA.MARSHAL var86 = var67.badRepIdIndirection((java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var89 = var54.extractWrongTypeList((java.lang.Throwable)var86, (java.lang.Object)"hi!", (java.lang.Object)"a4");
    com.sun.corba.se.impl.encoding.BufferManagerFactory var90 = new com.sun.corba.se.impl.encoding.BufferManagerFactory();
    org.omg.CORBA.BAD_OPERATION var92 = var1.extractWrongType((java.lang.Throwable)var86, (java.lang.Object)var90, (java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_INV_ORDER var93 = var1.argumentsCalledAfterException();
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
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
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var4 = var3.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var7 = var6.characterOutofrange();
    org.omg.CORBA.INTERNAL var8 = var6.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var9 = var3.unknownServerError((java.lang.Throwable)var8);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var12 = var11.characterOutofrange();
    org.omg.CORBA.INTERNAL var13 = var11.statementNotReachable3();
    org.omg.CORBA.MARSHAL var14 = var3.expectedTypeNullAndNoRepId((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var17 = var16.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var20 = var19.characterOutofrange();
    org.omg.CORBA.INTERNAL var21 = var19.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var22 = var16.unknownServerError((java.lang.Throwable)var21);
    org.omg.CORBA.BAD_OPERATION var24 = var16.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var27 = var26.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var30 = var29.characterOutofrange();
    org.omg.CORBA.INTERNAL var31 = var29.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var32 = var26.unknownServerError((java.lang.Throwable)var31);
    org.omg.CORBA.INTERNAL var33 = var16.noToa((java.lang.Throwable)var31);
    org.omg.CORBA.MARSHAL var35 = var16.badRepIdIndirection((java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var38 = var3.extractWrongTypeList((java.lang.Throwable)var35, (java.lang.Object)"hi!", (java.lang.Object)"a4");
    org.omg.CORBA.DATA_CONVERSION var40 = var3.illegalIiopPrimaryToContactInfoType((java.lang.Object)"a");
    org.omg.CORBA.DATA_CONVERSION var41 = var1.badGiop11Ctb((java.lang.Throwable)var40);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var44 = var43.characterOutofrange();
    org.omg.CORBA.MARSHAL var45 = var43.valuehandlerReadException();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var48 = var47.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var51 = var50.characterOutofrange();
    org.omg.CORBA.INTERNAL var52 = var50.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var53 = var47.unknownServerError((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var56 = var55.characterOutofrange();
    org.omg.CORBA.INTERNAL var57 = var55.statementNotReachable3();
    org.omg.CORBA.MARSHAL var58 = var47.expectedTypeNullAndNoRepId((java.lang.Throwable)var57);
    org.omg.CORBA.MARSHAL var59 = var1.negativeStringLength((java.lang.Throwable)var45, (java.lang.Object)var47);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
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


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    org.omg.CORBA.INTERNAL var6 = var4.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var7 = var1.unknownServerError((java.lang.Throwable)var6);
    org.omg.CORBA.BAD_OPERATION var9 = var1.classNotFound3((java.lang.Object)0L);
    org.omg.CORBA.NO_IMPLEMENT var10 = var1.sendDeferredNotimplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var13 = var12.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var16 = var15.characterOutofrange();
    org.omg.CORBA.INTERNAL var17 = var15.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var18 = var12.unknownServerError((java.lang.Throwable)var17);
    org.omg.CORBA.BAD_OPERATION var20 = var12.classNotFound3((java.lang.Object)0L);
    org.omg.CORBA.NO_IMPLEMENT var21 = var12.sendDeferredNotimplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var24 = var23.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var27 = var26.characterOutofrange();
    org.omg.CORBA.INTERNAL var28 = var26.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var29 = var23.unknownServerError((java.lang.Throwable)var28);
    org.omg.CORBA.BAD_PARAM var31 = var1.errorSettingField((java.lang.Throwable)var21, (java.lang.Object)var28, (java.lang.Object)(byte)0);
    
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
    assertNotNull(var31);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    org.omg.CORBA.BAD_OPERATION var3 = var1.serverIdNotAvailable();
    org.omg.CORBA.INITIALIZE var4 = var1.cannotWriteOrbidDb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var8 = var7.characterOutofrange();
    org.omg.CORBA.INTERNAL var9 = var7.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var10 = var4.unknownServerError((java.lang.Throwable)var9);
    org.omg.CORBA.BAD_OPERATION var12 = var4.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var15 = var14.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var18 = var17.characterOutofrange();
    org.omg.CORBA.INTERNAL var19 = var17.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var20 = var14.unknownServerError((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var21 = var4.noToa((java.lang.Throwable)var19);
    org.omg.CORBA.MARSHAL var23 = var4.badRepIdIndirection((java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var24 = var1.serverIdNotAvailable((java.lang.Throwable)var23);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    org.omg.CORBA.INTERNAL var6 = var4.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var7 = var1.unknownServerError((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var10 = var9.characterOutofrange();
    org.omg.CORBA.INTERNAL var11 = var9.statementNotReachable3();
    org.omg.CORBA.BAD_OPERATION var12 = var1.badActivateTieCall((java.lang.Throwable)var11);
    org.omg.CORBA.INITIALIZE var13 = var1.persistentServerportNotSet();
    org.omg.CORBA.INTERNAL var16 = var1.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)10L, (java.lang.Object)(byte)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.INTERNAL var19 = var18.giopVersionError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var22 = var21.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var25 = var24.characterOutofrange();
    org.omg.CORBA.INTERNAL var26 = var24.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var27 = var21.unknownServerError((java.lang.Throwable)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var30 = var29.characterOutofrange();
    org.omg.CORBA.INTERNAL var31 = var29.statementNotReachable3();
    org.omg.CORBA.MARSHAL var32 = var21.expectedTypeNullAndNoRepId((java.lang.Throwable)var31);
    org.omg.CORBA.INTERNAL var34 = var18.threadGroupHasActiveThreadsInClose((java.lang.Object)var32, (java.lang.Object)"");
    org.omg.CORBA.INTERNAL var35 = var1.remarshalWithNowhereToGo((java.lang.Throwable)var32);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertNotNull(var35);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var2 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var5 = var4.characterOutofrange();
    org.omg.CORBA.INTERNAL var6 = var4.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var7 = var1.unknownServerError((java.lang.Throwable)var6);
    org.omg.CORBA.BAD_OPERATION var9 = var1.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var12 = var11.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var15 = var14.characterOutofrange();
    org.omg.CORBA.INTERNAL var16 = var14.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var17 = var11.unknownServerError((java.lang.Throwable)var16);
    org.omg.CORBA.INTERNAL var18 = var1.noToa((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var21 = var20.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var24 = var23.characterOutofrange();
    org.omg.CORBA.INTERNAL var25 = var23.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var26 = var20.unknownServerError((java.lang.Throwable)var25);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var29 = var28.characterOutofrange();
    org.omg.CORBA.INTERNAL var30 = var28.statementNotReachable3();
    org.omg.CORBA.BAD_OPERATION var31 = var20.badActivateTieCall((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var34 = var33.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var37 = var36.characterOutofrange();
    org.omg.CORBA.INTERNAL var38 = var36.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var39 = var33.unknownServerError((java.lang.Throwable)var38);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var42 = var41.characterOutofrange();
    org.omg.CORBA.INTERNAL var43 = var41.statementNotReachable3();
    org.omg.CORBA.MARSHAL var44 = var33.expectedTypeNullAndNoRepId((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var47 = var46.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var50 = var49.characterOutofrange();
    org.omg.CORBA.INTERNAL var51 = var49.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var52 = var46.unknownServerError((java.lang.Throwable)var51);
    org.omg.CORBA.BAD_OPERATION var54 = var46.classNotFound3((java.lang.Object)0L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var57 = var56.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var60 = var59.characterOutofrange();
    org.omg.CORBA.INTERNAL var61 = var59.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var62 = var56.unknownServerError((java.lang.Throwable)var61);
    org.omg.CORBA.INTERNAL var63 = var46.noToa((java.lang.Throwable)var61);
    org.omg.CORBA.MARSHAL var65 = var46.badRepIdIndirection((java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var68 = var33.extractWrongTypeList((java.lang.Throwable)var65, (java.lang.Object)"hi!", (java.lang.Object)"a4");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var71 = var70.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var74 = var73.characterOutofrange();
    org.omg.CORBA.INTERNAL var75 = var73.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var76 = var70.unknownServerError((java.lang.Throwable)var75);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var78 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var79 = var78.characterOutofrange();
    org.omg.CORBA.INTERNAL var80 = var78.statementNotReachable3();
    org.omg.CORBA.BAD_OPERATION var81 = var70.badActivateTieCall((java.lang.Throwable)var80);
    org.omg.CORBA.DATA_CONVERSION var83 = var70.badCustomIorToSocketInfo((java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var84 = var33.wrongClientsc((java.lang.Throwable)var83);
    org.omg.CORBA.INTERNAL var85 = var1.readUndeclaredException((java.lang.Throwable)var31, (java.lang.Object)var83);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var87 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var88 = var87.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var90 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("a4");
    org.omg.CORBA.MARSHAL var91 = var90.characterOutofrange();
    org.omg.CORBA.INTERNAL var92 = var90.statementNotReachable3();
    org.omg.CORBA.UNKNOWN var93 = var87.unknownServerError((java.lang.Throwable)var92);
    org.omg.CORBA.BAD_OPERATION var95 = var87.classNotFound3((java.lang.Object)0L);
    org.omg.CORBA.DATA_CONVERSION var96 = var1.illegalSocketFactoryType((java.lang.Object)var87);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
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
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
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
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

}
