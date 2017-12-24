
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#"+ "'", var1.equals("#"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var1 = new byte[] { (byte)100};
    java.lang.String var3 = new java.lang.String(var1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFF64"+ "'", var3.equals("\uFF64"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var2 = new byte[] { (byte)0, (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "-1");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[] var3 = new java.lang.Object[] { "\uFF64"};
    java.lang.String var4 = java.lang.String.format("", var3);
    java.lang.String var5 = java.lang.String.format("-1", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-1"+ "'", var5.equals("-1"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.String.valueOf(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.text.DateFormat var0 = java.text.DateFormat.getDateInstance();
    java.util.TimeZone var1 = var0.getTimeZone();
    java.lang.String var3 = var0.format((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1 Jan, 1970"+ "'", var3.equals("1 Jan, 1970"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    char[] var1 = new char[] { ' '};
    java.lang.String var2 = java.lang.String.copyValueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " "+ "'", var2.equals(" "));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var4 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var4);
    char[] var6 = new char[] { };
    java.lang.String var7 = java.lang.String.copyValueOf(var6);
    org.omg.CORBA.BAD_PARAM var8 = var5.illegalBootstrapOperation((java.lang.Object)var6);
    org.omg.CORBA.COMM_FAILURE var10 = var2.createListenerFailed((java.lang.Throwable)var8, (java.lang.Object)true);
    org.omg.CORBA.INITIALIZE var11 = var2.cannotWriteOrbidDb();
    org.omg.CORBA.UNKNOWN var12 = var2.wrongInterfaceDef();
    java.util.logging.Logger var14 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var14);
    char[] var16 = new char[] { };
    java.lang.String var17 = java.lang.String.copyValueOf(var16);
    org.omg.CORBA.BAD_PARAM var18 = var15.illegalBootstrapOperation((java.lang.Object)var16);
    java.util.logging.Logger var20 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    java.util.logging.Logger var23 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var23);
    char[] var25 = new char[] { };
    java.lang.String var26 = java.lang.String.copyValueOf(var25);
    org.omg.CORBA.BAD_PARAM var27 = var24.illegalBootstrapOperation((java.lang.Object)var25);
    org.omg.CORBA.COMM_FAILURE var29 = var21.createListenerFailed((java.lang.Throwable)var27, (java.lang.Object)true);
    org.omg.CORBA.OBJ_ADAPTER var30 = var15.orbConnectError((java.lang.Throwable)var27);
    org.omg.CORBA.INTERNAL var31 = var2.giopMagicError((java.lang.Throwable)var30);
    java.util.logging.Logger var33 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var33);
    java.util.logging.Logger var36 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var36);
    char[] var38 = new char[] { };
    java.lang.String var39 = java.lang.String.copyValueOf(var38);
    org.omg.CORBA.BAD_PARAM var40 = var37.illegalBootstrapOperation((java.lang.Object)var38);
    org.omg.CORBA.COMM_FAILURE var42 = var34.createListenerFailed((java.lang.Throwable)var40, (java.lang.Object)true);
    org.omg.CORBA.INITIALIZE var43 = var34.cannotWriteOrbidDb();
    org.omg.CORBA.UNKNOWN var44 = var34.wrongInterfaceDef();
    java.util.logging.Logger var46 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var46);
    char[] var48 = new char[] { };
    java.lang.String var49 = java.lang.String.copyValueOf(var48);
    org.omg.CORBA.BAD_PARAM var50 = var47.illegalBootstrapOperation((java.lang.Object)var48);
    java.util.logging.Logger var52 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var52);
    java.util.logging.Logger var55 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var55);
    char[] var57 = new char[] { };
    java.lang.String var58 = java.lang.String.copyValueOf(var57);
    org.omg.CORBA.BAD_PARAM var59 = var56.illegalBootstrapOperation((java.lang.Object)var57);
    org.omg.CORBA.COMM_FAILURE var61 = var53.createListenerFailed((java.lang.Throwable)var59, (java.lang.Object)true);
    org.omg.CORBA.OBJ_ADAPTER var62 = var47.orbConnectError((java.lang.Throwable)var59);
    org.omg.CORBA.INTERNAL var63 = var34.giopMagicError((java.lang.Throwable)var62);
    org.omg.CORBA.COMM_FAILURE var64 = var2.getPropertiesError((java.lang.Throwable)var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
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
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
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

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var4 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var4);
    char[] var6 = new char[] { };
    java.lang.String var7 = java.lang.String.copyValueOf(var6);
    org.omg.CORBA.BAD_PARAM var8 = var5.illegalBootstrapOperation((java.lang.Object)var6);
    org.omg.CORBA.COMM_FAILURE var10 = var2.createListenerFailed((java.lang.Throwable)var8, (java.lang.Object)true);
    java.util.logging.Logger var12 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    java.util.logging.Logger var15 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    char[] var17 = new char[] { };
    java.lang.String var18 = java.lang.String.copyValueOf(var17);
    org.omg.CORBA.BAD_PARAM var19 = var16.illegalBootstrapOperation((java.lang.Object)var17);
    org.omg.CORBA.COMM_FAILURE var21 = var13.createListenerFailed((java.lang.Throwable)var19, (java.lang.Object)true);
    org.omg.CORBA.INTERNAL var23 = var2.writeUndeclaredException((java.lang.Throwable)var19, (java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    org.omg.CORBA.MARSHAL var3 = var2.invalidObjectKey();
    org.omg.CORBA.MARSHAL var4 = var2.characterOutofrange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    char[] var3 = new char[] { };
    java.lang.String var4 = java.lang.String.copyValueOf(var3);
    org.omg.CORBA.BAD_PARAM var5 = var2.illegalBootstrapOperation((java.lang.Object)var3);
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.util.logging.Logger var10 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    char[] var12 = new char[] { };
    java.lang.String var13 = java.lang.String.copyValueOf(var12);
    org.omg.CORBA.BAD_PARAM var14 = var11.illegalBootstrapOperation((java.lang.Object)var12);
    org.omg.CORBA.COMM_FAILURE var16 = var8.createListenerFailed((java.lang.Throwable)var14, (java.lang.Object)true);
    org.omg.CORBA.OBJ_ADAPTER var17 = var2.orbConnectError((java.lang.Throwable)var14);
    java.util.logging.Logger var19 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var19);
    org.omg.CORBA.COMM_FAILURE var21 = var20.connectionAbort();
    org.omg.CORBA.BAD_OPERATION var22 = var2.getTypeIdsRequiresStub((java.lang.Throwable)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    char[] var3 = new char[] { };
    java.lang.String var4 = java.lang.String.copyValueOf(var3);
    org.omg.CORBA.BAD_PARAM var5 = var2.illegalBootstrapOperation((java.lang.Object)var3);
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.util.logging.Logger var10 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    char[] var12 = new char[] { };
    java.lang.String var13 = java.lang.String.copyValueOf(var12);
    org.omg.CORBA.BAD_PARAM var14 = var11.illegalBootstrapOperation((java.lang.Object)var12);
    org.omg.CORBA.COMM_FAILURE var16 = var8.createListenerFailed((java.lang.Throwable)var14, (java.lang.Object)true);
    org.omg.CORBA.OBJ_ADAPTER var17 = var2.orbConnectError((java.lang.Throwable)var14);
    java.util.logging.Logger var19 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var19);
    char[] var21 = new char[] { };
    java.lang.String var22 = java.lang.String.copyValueOf(var21);
    org.omg.CORBA.BAD_PARAM var23 = var20.illegalBootstrapOperation((java.lang.Object)var21);
    org.omg.CORBA.INTERNAL var24 = var20.badkindCannotOccur();
    java.util.logging.Logger var26 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var26);
    java.util.logging.Logger var29 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var29);
    java.util.logging.Logger var32 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var32);
    char[] var34 = new char[] { };
    java.lang.String var35 = java.lang.String.copyValueOf(var34);
    org.omg.CORBA.BAD_PARAM var36 = var33.illegalBootstrapOperation((java.lang.Object)var34);
    org.omg.CORBA.COMM_FAILURE var38 = var30.createListenerFailed((java.lang.Throwable)var36, (java.lang.Object)true);
    org.omg.CORBA.INITIALIZE var39 = var30.cannotWriteOrbidDb();
    org.omg.CORBA.UNKNOWN var40 = var30.wrongInterfaceDef();
    java.util.logging.Logger var42 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var42);
    char[] var44 = new char[] { };
    java.lang.String var45 = java.lang.String.copyValueOf(var44);
    org.omg.CORBA.BAD_PARAM var46 = var43.illegalBootstrapOperation((java.lang.Object)var44);
    java.util.logging.Logger var48 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var48);
    java.util.logging.Logger var51 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var51);
    char[] var53 = new char[] { };
    java.lang.String var54 = java.lang.String.copyValueOf(var53);
    org.omg.CORBA.BAD_PARAM var55 = var52.illegalBootstrapOperation((java.lang.Object)var53);
    org.omg.CORBA.COMM_FAILURE var57 = var49.createListenerFailed((java.lang.Throwable)var55, (java.lang.Object)true);
    org.omg.CORBA.OBJ_ADAPTER var58 = var43.orbConnectError((java.lang.Throwable)var55);
    org.omg.CORBA.INTERNAL var59 = var30.giopMagicError((java.lang.Throwable)var58);
    org.omg.CORBA.BAD_OPERATION var60 = var27.connectingServant((java.lang.Throwable)var58);
    java.util.logging.Logger var62 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var62);
    char[] var64 = new char[] { };
    java.lang.String var65 = java.lang.String.copyValueOf(var64);
    org.omg.CORBA.BAD_PARAM var66 = var63.illegalBootstrapOperation((java.lang.Object)var64);
    java.util.logging.Logger var68 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var69 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var68);
    java.util.logging.Logger var71 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var71);
    char[] var73 = new char[] { };
    java.lang.String var74 = java.lang.String.copyValueOf(var73);
    org.omg.CORBA.BAD_PARAM var75 = var72.illegalBootstrapOperation((java.lang.Object)var73);
    org.omg.CORBA.COMM_FAILURE var77 = var69.createListenerFailed((java.lang.Throwable)var75, (java.lang.Object)true);
    java.util.logging.Logger var79 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var80 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var79);
    char[] var81 = new char[] { };
    java.lang.String var82 = java.lang.String.copyValueOf(var81);
    org.omg.CORBA.BAD_PARAM var83 = var80.illegalBootstrapOperation((java.lang.Object)var81);
    java.util.logging.Logger var85 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var86 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var85);
    java.util.logging.Logger var88 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var89 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var88);
    char[] var90 = new char[] { };
    java.lang.String var91 = java.lang.String.copyValueOf(var90);
    org.omg.CORBA.BAD_PARAM var92 = var89.illegalBootstrapOperation((java.lang.Object)var90);
    org.omg.CORBA.COMM_FAILURE var94 = var86.createListenerFailed((java.lang.Throwable)var92, (java.lang.Object)true);
    org.omg.CORBA.OBJ_ADAPTER var95 = var80.orbConnectError((java.lang.Throwable)var92);
    org.omg.CORBA.INTERNAL var96 = var63.threadGroupHasSubGroupsInClose((java.lang.Object)var77, (java.lang.Object)var92);
    org.omg.CORBA.DATA_CONVERSION var97 = var27.badHexDigit((java.lang.Throwable)var96);
    org.omg.CORBA.INTERNAL var98 = var2.workQueueRequestWorkNoWorkFound((java.lang.Object)var20, (java.lang.Object)var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + ""+ "'", var74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ""+ "'", var82.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + ""+ "'", var91.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var4 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var4);
    char[] var6 = new char[] { };
    java.lang.String var7 = java.lang.String.copyValueOf(var6);
    org.omg.CORBA.BAD_PARAM var8 = var5.illegalBootstrapOperation((java.lang.Object)var6);
    org.omg.CORBA.COMM_FAILURE var10 = var2.createListenerFailed((java.lang.Throwable)var8, (java.lang.Object)true);
    org.omg.CORBA.INITIALIZE var11 = var2.cannotWriteOrbidDb();
    org.omg.CORBA.INITIALIZE var12 = var2.getServerPortCalledBeforeEndpointsInitialized();
    org.omg.CORBA.DATA_CONVERSION var13 = var2.invalidSingleCharCtb();
    java.util.logging.Logger var15 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    char[] var17 = new char[] { };
    java.lang.String var18 = java.lang.String.copyValueOf(var17);
    org.omg.CORBA.BAD_PARAM var19 = var16.illegalBootstrapOperation((java.lang.Object)var17);
    org.omg.CORBA.INTERNAL var20 = var16.badkindCannotOccur();
    java.util.Locale[] var22 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.MARSHAL var23 = var2.malformedUrl((java.lang.Throwable)var20, (java.lang.Object)"1 Jan, 1970", (java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
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
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Level var3 = var1.getLevel();
    var1.finest("true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var4 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var4);
    char[] var6 = new char[] { };
    java.lang.String var7 = java.lang.String.copyValueOf(var6);
    org.omg.CORBA.BAD_PARAM var8 = var5.illegalBootstrapOperation((java.lang.Object)var6);
    org.omg.CORBA.COMM_FAILURE var10 = var2.createListenerFailed((java.lang.Throwable)var8, (java.lang.Object)true);
    org.omg.CORBA.INITIALIZE var11 = var2.cannotWriteOrbidDb();
    org.omg.CORBA.INITIALIZE var12 = var2.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var14 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var14);
    java.util.logging.Logger var17 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    char[] var19 = new char[] { };
    java.lang.String var20 = java.lang.String.copyValueOf(var19);
    org.omg.CORBA.BAD_PARAM var21 = var18.illegalBootstrapOperation((java.lang.Object)var19);
    org.omg.CORBA.COMM_FAILURE var23 = var15.createListenerFailed((java.lang.Throwable)var21, (java.lang.Object)true);
    org.omg.CORBA.INITIALIZE var24 = var15.cannotWriteOrbidDb();
    org.omg.CORBA.UNKNOWN var25 = var15.wrongInterfaceDef();
    java.util.logging.Logger var27 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var27);
    char[] var29 = new char[] { };
    java.lang.String var30 = java.lang.String.copyValueOf(var29);
    org.omg.CORBA.BAD_PARAM var31 = var28.illegalBootstrapOperation((java.lang.Object)var29);
    java.util.logging.Logger var33 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var33);
    java.util.logging.Logger var36 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var36);
    char[] var38 = new char[] { };
    java.lang.String var39 = java.lang.String.copyValueOf(var38);
    org.omg.CORBA.BAD_PARAM var40 = var37.illegalBootstrapOperation((java.lang.Object)var38);
    org.omg.CORBA.COMM_FAILURE var42 = var34.createListenerFailed((java.lang.Throwable)var40, (java.lang.Object)true);
    org.omg.CORBA.OBJ_ADAPTER var43 = var28.orbConnectError((java.lang.Throwable)var40);
    org.omg.CORBA.INTERNAL var44 = var15.giopMagicError((java.lang.Throwable)var43);
    org.omg.CORBA.MARSHAL var45 = var2.badTypecodeForCustomValue((java.lang.Throwable)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
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
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
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

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    char[] var3 = new char[] { };
    java.lang.String var4 = java.lang.String.copyValueOf(var3);
    org.omg.CORBA.BAD_PARAM var5 = var2.illegalBootstrapOperation((java.lang.Object)var3);
    org.omg.CORBA.INTERNAL var6 = var2.exceptionWhenSendingCloseConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("1 Jan, 1970");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    char[] var3 = new char[] { };
    java.lang.String var4 = java.lang.String.copyValueOf(var3);
    org.omg.CORBA.BAD_PARAM var5 = var2.illegalBootstrapOperation((java.lang.Object)var3);
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.util.logging.Logger var10 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    char[] var12 = new char[] { };
    java.lang.String var13 = java.lang.String.copyValueOf(var12);
    org.omg.CORBA.BAD_PARAM var14 = var11.illegalBootstrapOperation((java.lang.Object)var12);
    org.omg.CORBA.COMM_FAILURE var16 = var8.createListenerFailed((java.lang.Throwable)var14, (java.lang.Object)true);
    java.util.logging.Logger var18 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var18);
    java.util.logging.Logger var21 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    char[] var23 = new char[] { };
    java.lang.String var24 = java.lang.String.copyValueOf(var23);
    org.omg.CORBA.BAD_PARAM var25 = var22.illegalBootstrapOperation((java.lang.Object)var23);
    org.omg.CORBA.COMM_FAILURE var27 = var19.createListenerFailed((java.lang.Throwable)var25, (java.lang.Object)true);
    org.omg.CORBA.INITIALIZE var28 = var19.cannotWriteOrbidDb();
    org.omg.CORBA.UNKNOWN var29 = var19.wrongInterfaceDef();
    java.util.logging.Logger var31 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var31);
    char[] var33 = new char[] { };
    java.lang.String var34 = java.lang.String.copyValueOf(var33);
    org.omg.CORBA.BAD_PARAM var35 = var32.illegalBootstrapOperation((java.lang.Object)var33);
    java.util.logging.Logger var37 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var37);
    java.util.logging.Logger var40 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var40);
    char[] var42 = new char[] { };
    java.lang.String var43 = java.lang.String.copyValueOf(var42);
    org.omg.CORBA.BAD_PARAM var44 = var41.illegalBootstrapOperation((java.lang.Object)var42);
    org.omg.CORBA.COMM_FAILURE var46 = var38.createListenerFailed((java.lang.Throwable)var44, (java.lang.Object)true);
    org.omg.CORBA.OBJ_ADAPTER var47 = var32.orbConnectError((java.lang.Throwable)var44);
    org.omg.CORBA.INTERNAL var48 = var19.giopMagicError((java.lang.Throwable)var47);
    org.omg.CORBA.INTERNAL var49 = var8.badGiopRequestType((java.lang.Throwable)var48);
    org.omg.CORBA.INTERNAL var50 = var2.noClientScClass((java.lang.Throwable)var48);
    java.util.logging.Logger var52 = java.util.logging.Logger.getLogger("-1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var52);
    char[] var54 = new char[] { };
    java.lang.String var55 = java.lang.String.copyValueOf(var54);
    org.omg.CORBA.BAD_PARAM var56 = var53.illegalBootstrapOperation((java.lang.Object)var54);
    org.omg.CORBA.MARSHAL var57 = var2.chunkOverflow((java.lang.Throwable)var56);
    org.omg.CORBA.OBJ_ADAPTER var58 = var2.orbConnectError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

}
