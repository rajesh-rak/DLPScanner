
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    java.lang.String var3 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u0000\u0001"+ "'", var3.equals("\u0000\u0001"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var3 = new byte[] { (byte)(-1), (byte)10, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, 0, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.Object var4 = var1.put((java.lang.Object)(short)(-1), (java.lang.Object)(short)(-1));
    java.lang.Object var7 = var1.put((java.lang.Object)(byte)1, (java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var2 = var1.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var3 = var1.characterOutofrange();
    org.omg.CORBA.DATA_CONVERSION var5 = var1.orbInitializerType((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var2 = var1.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var3 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var7 = var5.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var8 = var1.unexpectedException((java.lang.Throwable)var7);
    org.omg.CORBA.OBJ_ADAPTER var9 = var1.noServerScInDispatch();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var2 = var1.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var3 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var7 = var5.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var8 = var1.unexpectedException((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var9 = var1.invocationInfoStackEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var3 = var1.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var9 = var7.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var10 = var5.nullReplyInGetAddrDisposition((java.lang.Throwable)var9);
    org.omg.CORBA.INTERNAL var11 = var1.javaStreamInitFailed((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var15 = var13.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var21 = var19.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var22 = var17.nullReplyInGetAddrDisposition((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var23 = var13.javaStreamInitFailed((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var24 = var1.javaSerializationException((java.lang.Object)var21);
    org.omg.CORBA.INTERNAL var25 = var1.badCodeSetString();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var28 = var27.insertObjectIncompatible();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var31 = var1.badHelperWriteMethod((java.lang.Throwable)var28, (java.lang.Object)"\u0000\u0001");
    
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
    assertNotNull(var11);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var2 = var1.insertObjectIncompatible();
    org.omg.CORBA.INTERNAL var3 = var1.errorInitBadserveridhandler();
    org.omg.CORBA.BAD_PARAM var4 = var1.nullParam();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    com.sun.corba.se.impl.orb.PropertyOnlyDataCollector var4 = new com.sun.corba.se.impl.orb.PropertyOnlyDataCollector(var0, "hi!", "10");
    java.util.Enumeration var5 = var0.propertyNames();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var9 = var7.illegalSubcontractId((java.lang.Object)(byte)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var13 = var11.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var19 = var17.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var20 = var15.nullReplyInGetAddrDisposition((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var21 = var11.javaStreamInitFailed((java.lang.Throwable)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var24 = var23.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var25 = var23.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var29 = var27.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var30 = var23.unexpectedException((java.lang.Throwable)var29);
    org.omg.CORBA.BAD_OPERATION var31 = var11.fixedNotMatch((java.lang.Throwable)var29);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var34 = var33.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var35 = var33.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var39 = var37.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var40 = var33.unexpectedException((java.lang.Throwable)var39);
    org.omg.CORBA.DATA_CONVERSION var42 = var7.fragmentSizeMinimum((java.lang.Throwable)var31, (java.lang.Object)var40, (java.lang.Object)100);
    java.util.Properties var43 = new java.util.Properties();
    java.util.Hashtable var44 = new java.util.Hashtable((java.util.Map)var43);
    com.sun.corba.se.impl.orb.PropertyOnlyDataCollector var47 = new com.sun.corba.se.impl.orb.PropertyOnlyDataCollector(var43, "hi!", "10");
    java.util.Enumeration var48 = var43.propertyNames();
    java.lang.Object var49 = var0.put((java.lang.Object)var40, (java.lang.Object)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertNotNull(var19);
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var3 = var1.illegalSubcontractId((java.lang.Object)(byte)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var7 = var5.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var13 = var11.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var14 = var9.nullReplyInGetAddrDisposition((java.lang.Throwable)var13);
    org.omg.CORBA.INTERNAL var15 = var5.javaStreamInitFailed((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var18 = var17.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var19 = var17.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var23 = var21.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var24 = var17.unexpectedException((java.lang.Throwable)var23);
    org.omg.CORBA.BAD_OPERATION var25 = var5.fixedNotMatch((java.lang.Throwable)var23);
    org.omg.CORBA.DATA_CONVERSION var26 = var1.invalidSingleCharCtb((java.lang.Throwable)var23);
    org.omg.CORBA.UNKNOWN var27 = var1.runtimeexception();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var31 = var29.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var32 = var1.wrongClientsc((java.lang.Throwable)var31);
    org.omg.CORBA.INTERNAL var33 = var1.badExceptionDetailMessageServiceContextType();
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var3 = var1.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var9 = var7.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var10 = var5.nullReplyInGetAddrDisposition((java.lang.Throwable)var9);
    org.omg.CORBA.INTERNAL var11 = var1.javaStreamInitFailed((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var15 = var13.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var21 = var19.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var22 = var17.nullReplyInGetAddrDisposition((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var23 = var13.javaStreamInitFailed((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var24 = var1.javaSerializationException((java.lang.Object)var21);
    org.omg.CORBA.INTERNAL var25 = var1.badCodeSetString();
    org.omg.CORBA.INTERNAL var26 = var1.threadPoolCloseError();
    
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
    assertNotNull(var11);
    
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
    assertNotNull(var26);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var3 = var1.illegalSubcontractId((java.lang.Object)(byte)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var7 = var5.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var13 = var11.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var14 = var9.nullReplyInGetAddrDisposition((java.lang.Throwable)var13);
    org.omg.CORBA.INTERNAL var15 = var5.javaStreamInitFailed((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var19 = var17.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var25 = var23.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var26 = var21.nullReplyInGetAddrDisposition((java.lang.Throwable)var25);
    org.omg.CORBA.INTERNAL var27 = var17.javaStreamInitFailed((java.lang.Throwable)var25);
    org.omg.CORBA.MARSHAL var28 = var5.javaSerializationException((java.lang.Object)var25);
    org.omg.CORBA.INTERNAL var29 = var5.badCodeSetString();
    org.omg.CORBA.COMM_FAILURE var30 = var1.bufferReadManagerTimeout((java.lang.Throwable)var29);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var3 = var1.illegalSubcontractId((java.lang.Object)(byte)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var7 = var5.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var13 = var11.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var14 = var9.nullReplyInGetAddrDisposition((java.lang.Throwable)var13);
    org.omg.CORBA.INTERNAL var15 = var5.javaStreamInitFailed((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var18 = var17.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var19 = var17.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var23 = var21.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var24 = var17.unexpectedException((java.lang.Throwable)var23);
    org.omg.CORBA.BAD_OPERATION var25 = var5.fixedNotMatch((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var28 = var27.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var29 = var27.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var33 = var31.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var34 = var27.unexpectedException((java.lang.Throwable)var33);
    org.omg.CORBA.DATA_CONVERSION var36 = var1.fragmentSizeMinimum((java.lang.Throwable)var25, (java.lang.Object)var34, (java.lang.Object)100);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var40 = var38.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var46 = var44.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var47 = var42.nullReplyInGetAddrDisposition((java.lang.Throwable)var46);
    org.omg.CORBA.INTERNAL var48 = var38.javaStreamInitFailed((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var52 = var50.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var58 = var56.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var59 = var54.nullReplyInGetAddrDisposition((java.lang.Throwable)var58);
    org.omg.CORBA.INTERNAL var60 = var50.javaStreamInitFailed((java.lang.Throwable)var58);
    org.omg.CORBA.MARSHAL var61 = var38.javaSerializationException((java.lang.Object)var58);
    org.omg.CORBA.INTERNAL var62 = var38.badMessageTypeForCancel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var65 = var64.insertObjectIncompatible();
    org.omg.CORBA.INTERNAL var66 = var64.errorInitBadserveridhandler();
    org.omg.CORBA.DATA_CONVERSION var67 = var64.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var69 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var70 = var69.insertObjectIncompatible();
    org.omg.CORBA.INTERNAL var71 = var69.errorInitBadserveridhandler();
    java.util.Properties var72 = new java.util.Properties();
    java.util.Hashtable var73 = new java.util.Hashtable((java.util.Map)var72);
    com.sun.corba.se.impl.orb.PropertyOnlyDataCollector var76 = new com.sun.corba.se.impl.orb.PropertyOnlyDataCollector(var72, "hi!", "10");
    org.omg.CORBA.INTERNAL var78 = var64.workerThreadSetNameFailure((java.lang.Object)var71, (java.lang.Object)"10", (java.lang.Object)1);
    org.omg.CORBA.INTERNAL var79 = var38.tkLongDoubleNotSupported((java.lang.Throwable)var78);
    org.omg.CORBA.INTERNAL var80 = var1.unexpectedDirectByteBufferWithNonChannelSocket((java.lang.Throwable)var78);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var5 = var3.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var6 = var1.nullReplyInGetAddrDisposition((java.lang.Throwable)var5);
    org.omg.CORBA.BAD_INV_ORDER var7 = var1.argumentsCalledAfterException();
    
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

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var3 = var1.readUndeclaredException((java.lang.Object)true);
    org.omg.CORBA.BAD_OPERATION var4 = var1.badActivateTieCall();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var8 = var6.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var14 = var12.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var15 = var10.nullReplyInGetAddrDisposition((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var16 = var6.javaStreamInitFailed((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var20 = var18.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var26 = var24.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var27 = var22.nullReplyInGetAddrDisposition((java.lang.Throwable)var26);
    org.omg.CORBA.INTERNAL var28 = var18.javaStreamInitFailed((java.lang.Throwable)var26);
    org.omg.CORBA.MARSHAL var29 = var6.javaSerializationException((java.lang.Object)var26);
    org.omg.CORBA.INTERNAL var30 = var6.badCodeSetString();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var33 = var32.insertObjectIncompatible();
    org.omg.CORBA.INTERNAL var34 = var32.errorInitBadserveridhandler();
    org.omg.CORBA.DATA_CONVERSION var35 = var32.badHexDigit();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var38 = var37.insertObjectIncompatible();
    org.omg.CORBA.INTERNAL var39 = var37.errorInitBadserveridhandler();
    java.util.Properties var40 = new java.util.Properties();
    java.util.Hashtable var41 = new java.util.Hashtable((java.util.Map)var40);
    com.sun.corba.se.impl.orb.PropertyOnlyDataCollector var44 = new com.sun.corba.se.impl.orb.PropertyOnlyDataCollector(var40, "hi!", "10");
    org.omg.CORBA.INTERNAL var46 = var32.workerThreadSetNameFailure((java.lang.Object)var39, (java.lang.Object)"10", (java.lang.Object)1);
    org.omg.CORBA.COMM_FAILURE var47 = var6.ioexceptionWhenReadingConnection((java.lang.Throwable)var39);
    org.omg.CORBA.MARSHAL var48 = var1.badArgumentsNvlist((java.lang.Throwable)var39);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var4 = var3.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var5 = var3.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var9 = var7.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var10 = var3.unexpectedException((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var13 = var12.insertObjectIncompatible();
    org.omg.CORBA.INTERNAL var14 = var12.errorInitBadserveridhandler();
    org.omg.CORBA.COMM_FAILURE var18 = var3.transportReadTimeoutExceeded((java.lang.Object)var12, (java.lang.Object)' ', (java.lang.Object)(byte)1, (java.lang.Object)(byte)100);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var22 = var20.illegalSubcontractId((java.lang.Object)(byte)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var26 = var24.readUndeclaredException((java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var32 = var30.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var33 = var28.nullReplyInGetAddrDisposition((java.lang.Throwable)var32);
    org.omg.CORBA.INTERNAL var34 = var24.javaStreamInitFailed((java.lang.Throwable)var32);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var37 = var36.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var38 = var36.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var42 = var40.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var43 = var36.unexpectedException((java.lang.Throwable)var42);
    org.omg.CORBA.BAD_OPERATION var44 = var24.fixedNotMatch((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var47 = var46.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var48 = var46.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var52 = var50.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var53 = var46.unexpectedException((java.lang.Throwable)var52);
    org.omg.CORBA.DATA_CONVERSION var55 = var20.fragmentSizeMinimum((java.lang.Throwable)var44, (java.lang.Object)var53, (java.lang.Object)100);
    org.omg.CORBA.BAD_PARAM var56 = var1.badUrl((java.lang.Throwable)var18, (java.lang.Object)var55);
    org.omg.CORBA.INTERNAL var57 = var1.exceptionWhenSendingCloseConnection();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
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
    assertNotNull(var50);
    
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

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var2 = var1.insertObjectIncompatible();
    org.omg.CORBA.MARSHAL var3 = var1.characterOutofrange();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.INTERNAL var7 = var5.illegalSubcontractId((java.lang.Object)(byte)10);
    org.omg.CORBA.INTERNAL var8 = var1.unexpectedException((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0000\u0001");
    org.omg.CORBA.BAD_OPERATION var11 = var10.insertObjectIncompatible();
    org.omg.CORBA.INTERNAL var12 = var10.errorInitBadserveridhandler();
    org.omg.CORBA.COMM_FAILURE var16 = var1.transportReadTimeoutExceeded((java.lang.Object)var10, (java.lang.Object)' ', (java.lang.Object)(byte)1, (java.lang.Object)(byte)100);
    org.omg.CORBA.BAD_PARAM var17 = var10.unableFindValueFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

}
