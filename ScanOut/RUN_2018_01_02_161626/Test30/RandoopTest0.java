
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int[] var2 = new int[] { (-1), (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var2 = new byte[] { (byte)1, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 1, 100, "1.0");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)100.0d);
    java.lang.Object var4 = var0.get((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    char[] var3 = new char[] { '4', '4', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var3, 0, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var7 = var1.getPropertiesError();
    org.omg.CORBA.BAD_OPERATION var8 = var1.connectingServant();
    org.omg.CORBA.BAD_OPERATION var9 = var1.getDelegateWrongPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var6 = var1.localObjectNotAllowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var9 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var12 = var8.invalidRequestPartitioningId((java.lang.Object)var9, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var13 = var8.codesetIncompatible();
    org.omg.CORBA.MARSHAL var15 = var1.javaSerializationException((java.lang.Throwable)var13, (java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var7 = var1.getPropertiesError();
    org.omg.CORBA.INTERNAL var8 = var1.unexpectedNonDirectByteBufferWithChannelSocket();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    char[] var3 = new char[] { ' ', '#', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.valueOf(var3, 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var6 = var1.localObjectNotAllowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var9 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var12 = var8.invalidRequestPartitioningId((java.lang.Object)var9, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var13 = var8.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var14 = var8.getPropertiesError();
    org.omg.CORBA.OBJECT_NOT_EXIST var15 = var1.badAdapterId((java.lang.Throwable)var14);
    org.omg.CORBA.UNKNOWN var16 = var1.unknownDsiSysex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var6 = var1.localObjectNotAllowed();
    org.omg.CORBA.NO_IMPLEMENT var7 = var1.genericNoImpl();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    org.omg.CORBA.MARSHAL var11 = var9.badRepIdIndirection((java.lang.Object)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    org.omg.CORBA.MARSHAL var15 = var13.badRepIdIndirection((java.lang.Object)10);
    org.omg.CORBA.INTERNAL var16 = var9.numInvocationsAlreadyZero((java.lang.Throwable)var15);
    org.omg.CORBA.NO_IMPLEMENT var17 = var1.getinterfaceNotImplemented((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var7 = var1.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var8 = var1.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var11 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var14 = var10.invalidRequestPartitioningId((java.lang.Object)var11, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var15 = var10.localObjectNotAllowed();
    org.omg.CORBA.NO_IMPLEMENT var16 = var10.genericNoImpl();
    org.omg.CORBA.INTERNAL var17 = var1.unexpectedNonDirectByteBufferWithChannelSocket((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var20 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var23 = var19.invalidRequestPartitioningId((java.lang.Object)var20, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var24 = var19.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var25 = var19.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var26 = var19.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var29 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var32 = var28.invalidRequestPartitioningId((java.lang.Object)var29, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var33 = var28.localObjectNotAllowed();
    org.omg.CORBA.NO_IMPLEMENT var34 = var28.genericNoImpl();
    org.omg.CORBA.INTERNAL var35 = var19.emptyStackRunServantPostInvoke((java.lang.Throwable)var34);
    org.omg.CORBA.INTERNAL var36 = var1.invocationInfoStackEmpty((java.lang.Throwable)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var7 = var1.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var8 = var1.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var11 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var14 = var10.invalidRequestPartitioningId((java.lang.Object)var11, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var15 = var10.localObjectNotAllowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var18 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var21 = var17.invalidRequestPartitioningId((java.lang.Object)var18, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var22 = var17.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var23 = var17.getPropertiesError();
    org.omg.CORBA.OBJECT_NOT_EXIST var24 = var10.badAdapterId((java.lang.Throwable)var23);
    org.omg.CORBA.DATA_CONVERSION var25 = var1.badStringifiedIor((java.lang.Throwable)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    org.omg.CORBA.MARSHAL var29 = var27.badRepIdIndirection((java.lang.Object)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var32 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var35 = var31.invalidRequestPartitioningId((java.lang.Object)var32, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var36 = var31.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var37 = var31.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var38 = var31.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var41 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var44 = var40.invalidRequestPartitioningId((java.lang.Object)var41, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var45 = var40.localObjectNotAllowed();
    org.omg.CORBA.NO_IMPLEMENT var46 = var40.genericNoImpl();
    org.omg.CORBA.INTERNAL var47 = var31.emptyStackRunServantPostInvoke((java.lang.Throwable)var46);
    org.omg.CORBA.INTERNAL var48 = var27.threadPoolCloseError((java.lang.Throwable)var47);
    org.omg.CORBA.MARSHAL var49 = var1.customWrapperWithCodebase((java.lang.Throwable)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    org.omg.CORBA.MARSHAL var3 = var1.badRepIdIndirection((java.lang.Object)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var6 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var9 = var5.invalidRequestPartitioningId((java.lang.Object)var6, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var10 = var5.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var11 = var5.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var12 = var5.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var15 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var18 = var14.invalidRequestPartitioningId((java.lang.Object)var15, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var19 = var14.localObjectNotAllowed();
    org.omg.CORBA.NO_IMPLEMENT var20 = var14.genericNoImpl();
    org.omg.CORBA.INTERNAL var21 = var5.emptyStackRunServantPostInvoke((java.lang.Throwable)var20);
    org.omg.CORBA.INTERNAL var22 = var1.threadPoolCloseError((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var25 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var28 = var24.invalidRequestPartitioningId((java.lang.Object)var25, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var29 = var24.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var30 = var24.getPropertiesError();
    org.omg.CORBA.BAD_OPERATION var31 = var24.connectingServant();
    org.omg.CORBA.MARSHAL var32 = var1.cannotMarshalNative((java.lang.Throwable)var31);
    org.omg.CORBA.BAD_PARAM var33 = var1.stringExpected();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var7 = var1.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var8 = var1.orbInitialreferenceSyntax();
    org.omg.CORBA.INTERNAL var9 = var1.badMessageTypeForCancel();
    org.omg.CORBA.INTERNAL var10 = var1.unexpectedNonDirectByteBufferWithChannelSocket();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    java.lang.Object var6 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var7 = var1.invalidIndirection(var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    org.omg.CORBA.MARSHAL var11 = var9.badRepIdIndirection((java.lang.Object)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    org.omg.CORBA.MARSHAL var15 = var13.badRepIdIndirection((java.lang.Object)10);
    org.omg.CORBA.INTERNAL var16 = var9.numInvocationsAlreadyZero((java.lang.Throwable)var15);
    org.omg.CORBA.OBJECT_NOT_EXIST var17 = var1.dynAnyDestroyed((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var7 = var1.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var8 = var1.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var11 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var14 = var10.invalidRequestPartitioningId((java.lang.Object)var11, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var15 = var10.localObjectNotAllowed();
    org.omg.CORBA.NO_IMPLEMENT var16 = var10.genericNoImpl();
    org.omg.CORBA.INTERNAL var17 = var1.emptyStackRunServantPostInvoke((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var20 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var23 = var19.invalidRequestPartitioningId((java.lang.Object)var20, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var24 = var19.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var25 = var19.getPropertiesError();
    org.omg.CORBA.BAD_INV_ORDER var26 = var1.argumentsCalledNullArgs((java.lang.Throwable)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var4 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var7 = var3.invalidRequestPartitioningId((java.lang.Object)var4, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var8 = var3.localObjectNotAllowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var11 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var14 = var10.invalidRequestPartitioningId((java.lang.Object)var11, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var15 = var10.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var16 = var10.getPropertiesError();
    org.omg.CORBA.OBJECT_NOT_EXIST var17 = var3.badAdapterId((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var20 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var23 = var19.invalidRequestPartitioningId((java.lang.Object)var20, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var24 = var1.workerThreadCreated((java.lang.Object)var17, (java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var7 = var1.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var8 = var1.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var11 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var14 = var10.invalidRequestPartitioningId((java.lang.Object)var11, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var15 = var10.localObjectNotAllowed();
    org.omg.CORBA.NO_IMPLEMENT var16 = var10.genericNoImpl();
    org.omg.CORBA.INTERNAL var17 = var1.emptyStackRunServantPostInvoke((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var20 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var23 = var19.invalidRequestPartitioningId((java.lang.Object)var20, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var24 = var19.localObjectNotAllowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var27 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var30 = var26.invalidRequestPartitioningId((java.lang.Object)var27, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var31 = var26.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var32 = var26.getPropertiesError();
    org.omg.CORBA.OBJECT_NOT_EXIST var33 = var19.badAdapterId((java.lang.Throwable)var32);
    org.omg.CORBA.INTERNAL var34 = var1.badReplystatus((java.lang.Throwable)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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
    assertNotNull(var34);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var2 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var5 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var6 = var1.codesetIncompatible();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var9 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var12 = var8.invalidRequestPartitioningId((java.lang.Object)var9, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var13 = var8.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var14 = var8.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var15 = var8.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var18 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var21 = var17.invalidRequestPartitioningId((java.lang.Object)var18, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var22 = var17.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var23 = var17.getPropertiesError();
    org.omg.CORBA.BAD_OPERATION var24 = var17.connectingServant();
    org.omg.CORBA.OBJECT_NOT_EXIST var25 = var8.badSkeleton((java.lang.Throwable)var24);
    org.omg.CORBA.BAD_OPERATION var27 = var8.classNotFound2((java.lang.Object)(short)100);
    org.omg.CORBA.DATA_CONVERSION var28 = var1.orbInitializerFailure((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    org.omg.CORBA.MARSHAL var3 = var1.badRepIdIndirection((java.lang.Object)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var6 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var9 = var5.invalidRequestPartitioningId((java.lang.Object)var6, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.DATA_CONVERSION var10 = var5.codesetIncompatible();
    org.omg.CORBA.COMM_FAILURE var11 = var5.getPropertiesError();
    org.omg.CORBA.DATA_CONVERSION var12 = var5.orbInitialreferenceSyntax();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("10.0");
    java.util.Hashtable var15 = new java.util.Hashtable();
    org.omg.CORBA.BAD_PARAM var18 = var14.invalidRequestPartitioningId((java.lang.Object)var15, (java.lang.Object)1L, (java.lang.Object)1L);
    org.omg.CORBA.BAD_PARAM var19 = var14.localObjectNotAllowed();
    org.omg.CORBA.NO_IMPLEMENT var20 = var14.genericNoImpl();
    org.omg.CORBA.INTERNAL var21 = var5.unexpectedNonDirectByteBufferWithChannelSocket((java.lang.Throwable)var20);
    org.omg.CORBA.INTERNAL var22 = var5.noToa();
    org.omg.CORBA.INTERNAL var23 = var1.invalidJdk131PatchLevel((java.lang.Throwable)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var23);

  }

}
