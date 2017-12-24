
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int[] var0 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, (-1), (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Qhi!\\E"+ "'", var1.equals("\\Qhi!\\E"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.regex.Pattern var1 = java.util.regex.Pattern.compile("hi!");
    int var2 = var1.flags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Q\\E"+ "'", var1.equals("\\Q\\E"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("\\Qhi!\\E");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var3 = new char[] { 'a', ' ', '#'};
    java.lang.String var4 = java.lang.String.valueOf(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "a #"+ "'", var4.equals("a #"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("\\Q\\E", "##");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.jmx.trace.TraceManager var0 = new com.sun.jmx.trace.TraceManager();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    char[] var2 = new char[] { '#', '#'};
    java.lang.String var3 = new java.lang.String(var2);
    java.lang.String var4 = new java.lang.String(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = java.lang.String.valueOf(var2, 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "##"+ "'", var3.equals("##"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "##"+ "'", var4.equals("##"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var5 = var3.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var9 = var7.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var10 = var3.badReplystatus((java.lang.Throwable)var9);
    org.omg.CORBA.MARSHAL var13 = var1.readObjectLoadClassFailure((java.lang.Throwable)var10, (java.lang.Object)1, (java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var4 = var1.getinterfaceNotImplemented();
    org.omg.CORBA.BAD_OPERATION var5 = var1.insertObjectFailed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var4 = var1.noServerSubcontract();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var8 = var6.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var12 = var10.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var13 = var6.wrongInterfaceDef((java.lang.Throwable)var12);
    org.omg.CORBA.BAD_OPERATION var14 = var6.getDelegateServantNotActive();
    org.omg.CORBA.DATA_CONVERSION var16 = var1.illegalSocketFactoryType((java.lang.Throwable)var14, (java.lang.Object)(-1.0f));
    
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
    assertNotNull(var16);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var4 = var1.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var8 = var6.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var9 = var6.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var15 = var13.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.COMM_FAILURE var16 = var1.connectFailure((java.lang.Throwable)var9, (java.lang.Object)' ', (java.lang.Object)(short)(-1), (java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var17 = var1.badSystemExceptionInLocateReply();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var21 = var19.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var25 = var23.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var26 = var19.badReplystatus((java.lang.Throwable)var25);
    org.omg.CORBA.INTERNAL var27 = var1.problemWithExceptionTypecode((java.lang.Throwable)var26);
    
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


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var7 = var5.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var8 = var1.wrongInterfaceDef((java.lang.Throwable)var7);
    org.omg.CORBA.MARSHAL var9 = var1.recursiveTypecodeError();
    
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
    assertNotNull(var9);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var4 = var1.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var8 = var6.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var9 = var6.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var15 = var13.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.COMM_FAILURE var16 = var1.connectFailure((java.lang.Throwable)var9, (java.lang.Object)' ', (java.lang.Object)(short)(-1), (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var20 = var18.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var21 = var18.typecodeNotSupported();
    org.omg.CORBA.BAD_OPERATION var22 = var1.classNotFound2((java.lang.Object)var18);
    org.omg.CORBA.BAD_PARAM var23 = var1.stringExpected();
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var4 = var1.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var8 = var6.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var9 = var6.getinterfaceNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var13 = var11.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var17 = var15.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var18 = var11.wrongInterfaceDef((java.lang.Throwable)var17);
    org.omg.CORBA.OBJECT_NOT_EXIST var19 = var6.dynAnyDestroyed((java.lang.Throwable)var18);
    org.omg.CORBA.DATA_CONVERSION var20 = var1.illegalIorToSocketInfoType((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var24 = var22.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var28 = var26.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var29 = var22.badReplystatus((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var33 = var31.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var34 = var31.getinterfaceNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var38 = var36.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var42 = var40.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var43 = var36.wrongInterfaceDef((java.lang.Throwable)var42);
    org.omg.CORBA.OBJECT_NOT_EXIST var44 = var31.dynAnyDestroyed((java.lang.Throwable)var43);
    java.util.logging.LoggingMXBean var45 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.INTERNAL var46 = var22.badCompletionStatusInReply((java.lang.Throwable)var43, (java.lang.Object)var45);
    org.omg.CORBA.INTERNAL var47 = var1.svcctxUnmarshalError((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var51 = var49.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var55 = var53.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var56 = var49.badReplystatus((java.lang.Throwable)var55);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var60 = var58.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var61 = var58.getinterfaceNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var65 = var63.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var67 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var69 = var67.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var70 = var63.wrongInterfaceDef((java.lang.Throwable)var69);
    org.omg.CORBA.OBJECT_NOT_EXIST var71 = var58.dynAnyDestroyed((java.lang.Throwable)var70);
    java.util.logging.LoggingMXBean var72 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.INTERNAL var73 = var49.badCompletionStatusInReply((java.lang.Throwable)var70, (java.lang.Object)var72);
    org.omg.CORBA.INTERNAL var74 = var1.couldNotDuplicateCdrInputStream((java.lang.Throwable)var70);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
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
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var7 = var5.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var8 = var1.badReplystatus((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var12 = var10.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var13 = var10.getinterfaceNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var17 = var15.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var21 = var19.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var22 = var15.wrongInterfaceDef((java.lang.Throwable)var21);
    org.omg.CORBA.OBJECT_NOT_EXIST var23 = var10.dynAnyDestroyed((java.lang.Throwable)var22);
    java.util.logging.LoggingMXBean var24 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.INTERNAL var25 = var1.badCompletionStatusInReply((java.lang.Throwable)var22, (java.lang.Object)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var29 = var27.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var30 = var27.typecodeNotSupported();
    org.omg.CORBA.NO_IMPLEMENT var31 = var1.getinterfaceNotImplemented((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var35 = var33.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var36 = var33.getinterfaceNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var40 = var38.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var41 = var38.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var45 = var43.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var46 = var43.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var52 = var50.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.COMM_FAILURE var53 = var38.connectFailure((java.lang.Throwable)var46, (java.lang.Object)' ', (java.lang.Object)(short)(-1), (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var57 = var55.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var58 = var55.typecodeNotSupported();
    org.omg.CORBA.BAD_OPERATION var59 = var38.classNotFound2((java.lang.Object)var55);
    org.omg.CORBA.MARSHAL var61 = var1.malformedUrl((java.lang.Throwable)var36, (java.lang.Object)var55, (java.lang.Object)(short)(-1));
    
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
    assertNotNull(var15);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertNotNull(var46);
    
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
    assertNotNull(var61);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.BAD_PARAM var4 = var1.unableFindValueFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var7 = var5.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var8 = var1.badReplystatus((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var12 = var10.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var13 = var10.getinterfaceNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var17 = var15.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var21 = var19.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var22 = var15.wrongInterfaceDef((java.lang.Throwable)var21);
    org.omg.CORBA.OBJECT_NOT_EXIST var23 = var10.dynAnyDestroyed((java.lang.Throwable)var22);
    java.util.logging.LoggingMXBean var24 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.INTERNAL var25 = var1.badCompletionStatusInReply((java.lang.Throwable)var22, (java.lang.Object)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var29 = var27.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var33 = var31.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var34 = var27.wrongInterfaceDef((java.lang.Throwable)var33);
    org.omg.CORBA.OBJECT_NOT_EXIST var35 = var27.locateUnknownObject();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var39 = var37.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var43 = var41.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var44 = var37.badReplystatus((java.lang.Throwable)var43);
    org.omg.CORBA.UNKNOWN var45 = var27.unknownSysex((java.lang.Throwable)var43);
    org.omg.CORBA.BAD_INV_ORDER var46 = var1.argumentsCalledMultiple((java.lang.Throwable)var45);
    
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
    assertNotNull(var15);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var3 = new byte[] { (byte)100, (byte)1, (byte)100};
    java.lang.String var5 = new java.lang.String(var3, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u6464\u6401\u6464"+ "'", var5.equals("\u6464\u6401\u6464"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var3 = var1.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var7 = var5.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var8 = var1.wrongInterfaceDef((java.lang.Throwable)var7);
    org.omg.CORBA.OBJECT_NOT_EXIST var9 = var1.locateUnknownObject();
    org.omg.CORBA.BAD_PARAM var10 = var1.localObjectNotAllowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var14 = var12.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var15 = var12.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var19 = var17.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var20 = var17.getinterfaceNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var24 = var22.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var28 = var26.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var29 = var22.wrongInterfaceDef((java.lang.Throwable)var28);
    org.omg.CORBA.OBJECT_NOT_EXIST var30 = var17.dynAnyDestroyed((java.lang.Throwable)var29);
    org.omg.CORBA.DATA_CONVERSION var31 = var12.illegalIorToSocketInfoType((java.lang.Object)var29);
    org.omg.CORBA.BAD_OPERATION var33 = var12.classNotFound1((java.lang.Object)'a');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var37 = var35.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var38 = var35.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var42 = var40.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var43 = var40.typecodeNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var49 = var47.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.COMM_FAILURE var50 = var35.connectFailure((java.lang.Throwable)var43, (java.lang.Object)' ', (java.lang.Object)(short)(-1), (java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var54 = var52.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var55 = var52.typecodeNotSupported();
    org.omg.CORBA.BAD_OPERATION var56 = var35.classNotFound2((java.lang.Object)var52);
    org.omg.CORBA.BAD_PARAM var57 = var12.fieldNotFound((java.lang.Object)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var61 = var59.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var65 = var63.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.INTERNAL var66 = var59.badReplystatus((java.lang.Throwable)var65);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var70 = var68.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.NO_IMPLEMENT var71 = var68.getinterfaceNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var75 = var73.noInvocationHandler((java.lang.Object)(byte)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("##");
    org.omg.CORBA.INTERNAL var79 = var77.noInvocationHandler((java.lang.Object)(byte)(-1));
    org.omg.CORBA.UNKNOWN var80 = var73.wrongInterfaceDef((java.lang.Throwable)var79);
    org.omg.CORBA.OBJECT_NOT_EXIST var81 = var68.dynAnyDestroyed((java.lang.Throwable)var80);
    java.util.logging.LoggingMXBean var82 = java.util.logging.LogManager.getLoggingMXBean();
    org.omg.CORBA.INTERNAL var83 = var59.badCompletionStatusInReply((java.lang.Throwable)var80, (java.lang.Object)var82);
    org.omg.CORBA.MARSHAL var84 = var35.recursiveTypecodeError((java.lang.Throwable)var80);
    org.omg.CORBA.INTERNAL var85 = var1.btcConverterFailure((java.lang.Throwable)var84);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

}
