
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    char[] var3 = new char[] { 'a', '4', ' '};
    java.lang.String var6 = new java.lang.String(var3, 0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = java.lang.String.valueOf(var3, 10, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var3 = new char[] { 'a', '4', ' '};
    java.lang.String var6 = new java.lang.String(var3, 0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = new java.lang.String(var3, 100, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var1 = new byte[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, 10, (-1), 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = new java.lang.String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    char[] var3 = new char[] { ' ', ' ', '#'};
    java.lang.String var4 = new java.lang.String(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "  #"+ "'", var4.equals("  #"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.String.valueOf(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("{}", "{}");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.lang.Object var2 = var1.clone();
    java.lang.String var3 = var1.toString();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.util.Set var5 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var7 = var6.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var8 = var4.noServerScInDispatch((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var11 = var10.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var14 = var13.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INTERNAL var15 = var10.errorResolvingAlias((java.lang.Throwable)var14);
    org.omg.CORBA.BAD_OPERATION var17 = var4.classNotFound1((java.lang.Throwable)var15, (java.lang.Object)1);
    org.omg.CORBA.MARSHAL var18 = var1.readObjectLoadClassFailure((java.lang.Object)(-1L), (java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var2 = var1.recvMsgError();
    org.omg.CORBA.INTERNAL var3 = var1.requestdispatcherregistryError();
    org.omg.CORBA.BAD_OPERATION var4 = var1.serverIdNotAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var4 = var3.recvMsgError();
    org.omg.CORBA.INTERNAL var5 = var3.requestdispatcherregistryError();
    org.omg.CORBA.INTERNAL var6 = var1.statementNotReachable5((java.lang.Throwable)var5);
    
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

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var4 = var3.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var5 = var1.noServerScInDispatch((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var10 = var9.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var11 = var7.noServerScInDispatch((java.lang.Throwable)var10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var16 = var15.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var17 = var13.noServerScInDispatch((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var20 = var19.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var23 = var22.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INTERNAL var24 = var19.errorResolvingAlias((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var29 = var28.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var30 = var26.noServerScInDispatch((java.lang.Throwable)var29);
    org.omg.CORBA.DATA_CONVERSION var31 = var19.badHexDigit((java.lang.Throwable)var29);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var36 = var35.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var37 = var33.noServerScInDispatch((java.lang.Throwable)var36);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var40 = var39.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var43 = var42.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INTERNAL var44 = var39.errorResolvingAlias((java.lang.Throwable)var43);
    org.omg.CORBA.BAD_OPERATION var46 = var33.classNotFound1((java.lang.Throwable)var44, (java.lang.Object)1);
    org.omg.CORBA.BAD_PARAM var47 = var19.abstractFromNonAbstract((java.lang.Throwable)var46);
    org.omg.CORBA.OBJECT_NOT_EXIST var48 = var13.locateUnknownObject((java.lang.Throwable)var47);
    org.omg.CORBA.INTERNAL var49 = var7.illegalTargetAddressDisposition((java.lang.Throwable)var48);
    org.omg.CORBA.COMM_FAILURE var50 = var1.writeErrorSend((java.lang.Throwable)var48);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
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
    assertNotNull(var50);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    java.util.Hashtable var3 = new java.util.Hashtable(100);
    java.lang.Object var4 = var3.clone();
    java.util.Enumeration var5 = var3.elements();
    org.omg.CORBA.MARSHAL var6 = var1.javaSerializationException((java.lang.Object)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var9 = var8.recvMsgError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var12 = var11.recvMsgError();
    org.omg.CORBA.BAD_OPERATION var13 = var8.setExceptionCalledNullArgs((java.lang.Throwable)var12);
    org.omg.CORBA.OBJ_ADAPTER var14 = var1.adapterInactiveInActivation((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var2 = var1.recvMsgError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var5 = var4.recvMsgError();
    org.omg.CORBA.BAD_OPERATION var6 = var1.setExceptionCalledNullArgs((java.lang.Throwable)var5);
    org.omg.CORBA.MARSHAL var7 = var1.characterOutofrange();
    
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

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.lang.Object var2 = var1.clone();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var2 = var1.recvMsgError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var5 = var4.recvMsgError();
    org.omg.CORBA.INTERNAL var6 = var4.requestdispatcherregistryError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var11 = var10.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var12 = var8.noServerScInDispatch((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var15 = var14.recvMsgError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var18 = var17.recvMsgError();
    org.omg.CORBA.BAD_OPERATION var19 = var14.setExceptionCalledNullArgs((java.lang.Throwable)var18);
    org.omg.CORBA.BAD_OPERATION var21 = var8.badOrbConfigurator((java.lang.Throwable)var18, (java.lang.Object)10L);
    org.omg.CORBA.MARSHAL var22 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var8);
    org.omg.CORBA.MARSHAL var23 = var1.chunkOverflow();
    
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
    assertNotNull(var23);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var4 = var3.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var5 = var1.noServerScInDispatch((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var8 = var7.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var11 = var10.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INTERNAL var12 = var7.errorResolvingAlias((java.lang.Throwable)var11);
    org.omg.CORBA.DATA_CONVERSION var13 = var1.orbInitialreferenceSyntax((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var14 = var1.badToaOaid();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var2 = var1.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var5 = var4.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INTERNAL var6 = var1.errorResolvingAlias((java.lang.Throwable)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var11 = var10.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var12 = var8.noServerScInDispatch((java.lang.Throwable)var11);
    org.omg.CORBA.DATA_CONVERSION var13 = var1.badHexDigit((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var18 = var17.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var19 = var15.noServerScInDispatch((java.lang.Throwable)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var22 = var21.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var25 = var24.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INTERNAL var26 = var21.errorResolvingAlias((java.lang.Throwable)var25);
    org.omg.CORBA.BAD_OPERATION var28 = var15.classNotFound1((java.lang.Throwable)var26, (java.lang.Object)1);
    org.omg.CORBA.BAD_PARAM var29 = var1.abstractFromNonAbstract((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var32 = var31.recvMsgError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var37 = var36.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var38 = var34.noServerScInDispatch((java.lang.Throwable)var37);
    org.omg.CORBA.MARSHAL var39 = var31.endOfStream((java.lang.Throwable)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var44 = var43.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var45 = var41.noServerScInDispatch((java.lang.Throwable)var44);
    org.omg.CORBA.INTERNAL var48 = var1.workerThreadNotNeeded((java.lang.Throwable)var37, (java.lang.Object)var44, (java.lang.Object)"  #", (java.lang.Object)100);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var53 = var52.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var54 = var50.noServerScInDispatch((java.lang.Throwable)var53);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var57 = var56.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var60 = var59.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INTERNAL var61 = var56.errorResolvingAlias((java.lang.Throwable)var60);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var66 = var65.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var67 = var63.noServerScInDispatch((java.lang.Throwable)var66);
    org.omg.CORBA.DATA_CONVERSION var68 = var56.badHexDigit((java.lang.Throwable)var66);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var73 = var72.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var74 = var70.noServerScInDispatch((java.lang.Throwable)var73);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var76 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var77 = var76.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var79 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var80 = var79.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INTERNAL var81 = var76.errorResolvingAlias((java.lang.Throwable)var80);
    org.omg.CORBA.BAD_OPERATION var83 = var70.classNotFound1((java.lang.Throwable)var81, (java.lang.Object)1);
    org.omg.CORBA.BAD_PARAM var84 = var56.abstractFromNonAbstract((java.lang.Throwable)var83);
    org.omg.CORBA.OBJECT_NOT_EXIST var85 = var50.locateUnknownObject((java.lang.Throwable)var84);
    org.omg.CORBA.INTERNAL var88 = var1.workQueueRequestWorkNoWorkFound((java.lang.Throwable)var85, (java.lang.Object)1, (java.lang.Object)0);
    
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
    assertNotNull(var48);
    
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
    assertNotNull(var88);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.BAD_PARAM var4 = var3.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.OBJ_ADAPTER var5 = var1.noServerScInDispatch((java.lang.Throwable)var4);
    org.omg.CORBA.MARSHAL var6 = var1.valuehandlerReadException();
    
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

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.COMM_FAILURE var2 = var1.recvMsgError();
    org.omg.CORBA.INTERNAL var3 = var1.requestdispatcherregistryError();
    org.omg.CORBA.BAD_OPERATION var4 = var1.ioExceptionOnClose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
