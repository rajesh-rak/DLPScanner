
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv4LiteralAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int[] var3 = new int[] { 0, 10, 0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, 100, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var2 = new byte[] { (byte)0, (byte)100};
    byte[] var3 = sun.net.util.IPAddressUtil.convertFromIPv4MappedAddress(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var4 = new java.lang.Object[] { 1L};
    var0.entering("hi!", "", var4);
    var0.fine("hi!");
    var0.severe("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var9 = new java.lang.Object[] { 1L};
    var5.entering("hi!", "", var9);
    org.omg.CORBA.MARSHAL var11 = var3.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var9);
    org.omg.CORBA.MARSHAL var12 = var1.iiopinputstreamGrow((java.lang.Throwable)var11);
    java.util.logging.Logger var13 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var14 = var1.badValueTag((java.lang.Object)var13);
    org.omg.CORBA.OBJ_ADAPTER var15 = var1.adapterInactiveInActivation();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var20 = var17.badUrl((java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var26 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var30 = new java.lang.Object[] { 1L};
    var26.entering("hi!", "", var30);
    org.omg.CORBA.MARSHAL var32 = var24.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var30);
    org.omg.CORBA.INV_OBJREF var33 = var22.badCorbalocString((java.lang.Throwable)var32);
    org.omg.CORBA.MARSHAL var34 = var17.readValueAndNoRepId((java.lang.Throwable)var33);
    org.omg.CORBA.MARSHAL var35 = var1.javaSerializationException((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var9 = new java.lang.Object[] { 1L};
    var5.entering("hi!", "", var9);
    org.omg.CORBA.MARSHAL var11 = var3.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var9);
    org.omg.CORBA.MARSHAL var12 = var1.iiopinputstreamGrow((java.lang.Throwable)var11);
    java.util.logging.Logger var13 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var14 = var1.badValueTag((java.lang.Object)var13);
    java.util.logging.Level var15 = var13.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNull(var15);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var7 = new java.lang.Object[] { 1L};
    var3.entering("hi!", "", var7);
    org.omg.CORBA.MARSHAL var9 = var1.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var7);
    org.omg.CORBA.INTERNAL var13 = var1.workerThreadSetNameFailure((java.lang.Object)(byte)(-1), (java.lang.Object)(-1.0d), (java.lang.Object)'a');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var17 = var15.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var20 = var15.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var19);
    java.util.logging.Logger var21 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.BAD_PARAM var23 = var1.invalidRequestPartitioningId((java.lang.Object)var19, (java.lang.Object)var21, (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var9 = new java.lang.Object[] { 1L};
    var5.entering("hi!", "", var9);
    org.omg.CORBA.MARSHAL var11 = var3.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var9);
    org.omg.CORBA.MARSHAL var12 = var1.iiopinputstreamGrow((java.lang.Throwable)var11);
    org.omg.CORBA.BAD_OPERATION var13 = var1.isLocalRequiresStub();
    org.omg.CORBA.INTERNAL var15 = var1.readUndeclaredException((java.lang.Object)(-1L));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var21 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var25 = new java.lang.Object[] { 1L};
    var21.entering("hi!", "", var25);
    org.omg.CORBA.MARSHAL var27 = var19.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var25);
    org.omg.CORBA.INV_OBJREF var28 = var17.badCorbalocString((java.lang.Throwable)var27);
    org.omg.CORBA.BAD_OPERATION var29 = var1.classNotFound2((java.lang.Object)var27);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var33 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var37 = new java.lang.Object[] { 1L};
    var33.entering("hi!", "", var37);
    org.omg.CORBA.MARSHAL var39 = var31.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var45 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var49 = new java.lang.Object[] { 1L};
    var45.entering("hi!", "", var49);
    org.omg.CORBA.MARSHAL var51 = var43.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var49);
    org.omg.CORBA.MARSHAL var52 = var41.iiopinputstreamGrow((java.lang.Throwable)var51);
    org.omg.CORBA.MARSHAL var53 = var31.badDigitInFixed((java.lang.Throwable)var51);
    org.omg.CORBA.BAD_TYPECODE var54 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var53);
    org.omg.CORBA.BAD_OPERATION var55 = var1.badActivateTieCall();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var4 = var1.badUrl((java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var14 = new java.lang.Object[] { 1L};
    var10.entering("hi!", "", var14);
    org.omg.CORBA.MARSHAL var16 = var8.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var14);
    org.omg.CORBA.INV_OBJREF var17 = var6.badCorbalocString((java.lang.Throwable)var16);
    org.omg.CORBA.MARSHAL var18 = var1.readValueAndNoRepId((java.lang.Throwable)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var22 = var20.fieldNotFound((java.lang.Object)100);
    org.omg.CORBA.BAD_OPERATION var23 = var1.getDelegateRequiresStub((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var29 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var33 = new java.lang.Object[] { 1L};
    var29.entering("hi!", "", var33);
    org.omg.CORBA.MARSHAL var35 = var27.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var33);
    org.omg.CORBA.MARSHAL var36 = var25.iiopinputstreamGrow((java.lang.Throwable)var35);
    org.omg.CORBA.BAD_OPERATION var37 = var25.isLocalRequiresStub();
    org.omg.CORBA.INTERNAL var39 = var25.readUndeclaredException((java.lang.Object)(-1L));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var45 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var49 = new java.lang.Object[] { 1L};
    var45.entering("hi!", "", var49);
    org.omg.CORBA.MARSHAL var51 = var43.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var49);
    org.omg.CORBA.INV_OBJREF var52 = var41.badCorbalocString((java.lang.Throwable)var51);
    org.omg.CORBA.BAD_OPERATION var53 = var25.classNotFound2((java.lang.Object)var51);
    org.omg.CORBA.OBJECT_NOT_EXIST var54 = var1.badServerId((java.lang.Throwable)var51);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNotNull(var29);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var9 = new java.lang.Object[] { 1L};
    var5.entering("hi!", "", var9);
    org.omg.CORBA.MARSHAL var11 = var3.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var9);
    org.omg.CORBA.MARSHAL var12 = var1.iiopinputstreamGrow((java.lang.Throwable)var11);
    org.omg.CORBA.INTERNAL var13 = var1.giopMagicError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var23 = new java.lang.Object[] { 1L};
    var19.entering("hi!", "", var23);
    org.omg.CORBA.MARSHAL var25 = var17.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var23);
    org.omg.CORBA.MARSHAL var26 = var15.iiopinputstreamGrow((java.lang.Throwable)var25);
    org.omg.CORBA.BAD_OPERATION var27 = var15.isLocalRequiresStub();
    org.omg.CORBA.INTERNAL var29 = var15.readUndeclaredException((java.lang.Object)(-1L));
    org.omg.CORBA.BAD_OPERATION var30 = var1.contextCalledOutOfOrder((java.lang.Throwable)var29);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var36 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var40 = new java.lang.Object[] { 1L};
    var36.entering("hi!", "", var40);
    org.omg.CORBA.MARSHAL var42 = var34.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var40);
    org.omg.CORBA.MARSHAL var43 = var32.iiopinputstreamGrow((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var49 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var53 = new java.lang.Object[] { 1L};
    var49.entering("hi!", "", var53);
    org.omg.CORBA.MARSHAL var55 = var47.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var53);
    org.omg.CORBA.MARSHAL var56 = var45.iiopinputstreamGrow((java.lang.Throwable)var55);
    org.omg.CORBA.INTERNAL var57 = var45.giopMagicError();
    org.omg.CORBA.INTERNAL var58 = var32.boundsCannotOccur((java.lang.Throwable)var57);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var62 = var60.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var64 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var65 = var60.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var64);
    org.omg.CORBA.INTERNAL var67 = var60.badHelperIdMethod((java.lang.Object)(-1.0d));
    org.omg.CORBA.COMM_FAILURE var68 = var1.securityExceptionInAccept((java.lang.Object)var57, (java.lang.Object)var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
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
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var3 = var1.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var6 = var1.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var5);
    org.omg.CORBA.INTERNAL var8 = var1.badHelperIdMethod((java.lang.Object)(-1.0d));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var12 = var10.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var14 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var15 = var10.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var14);
    org.omg.CORBA.INTERNAL var17 = var10.badHelperIdMethod((java.lang.Object)(-1.0d));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var21 = var19.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var23 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var24 = var19.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var23);
    org.omg.CORBA.INTERNAL var26 = var19.badHelperIdMethod((java.lang.Object)(-1.0d));
    org.omg.CORBA.OBJECT_NOT_EXIST var27 = var10.badServerId((java.lang.Throwable)var26);
    org.omg.CORBA.UNKNOWN var28 = var1.unknownCorbaExc((java.lang.Throwable)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Level var1 = var0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var3 = var1.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var6 = var1.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var14 = new java.lang.Object[] { 1L};
    var10.entering("hi!", "", var14);
    org.omg.CORBA.MARSHAL var16 = var8.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var14);
    org.omg.CORBA.INTERNAL var20 = var8.workerThreadSetNameFailure((java.lang.Object)(byte)(-1), (java.lang.Object)(-1.0d), (java.lang.Object)'a');
    org.omg.CORBA.DATA_CONVERSION var21 = var1.btcResultMoreThanOneChar((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var25 = var23.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var27 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var28 = var23.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var27);
    org.omg.CORBA.INTERNAL var30 = var23.badHelperIdMethod((java.lang.Object)(-1.0d));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var38 = var36.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var40 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var41 = var36.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var40);
    org.omg.CORBA.BAD_PARAM var42 = var23.couldNotSetArray((java.lang.Object)1.0f, (java.lang.Object)10.0f, (java.lang.Object)1.0f, (java.lang.Object)(-1), (java.lang.Object)var36);
    org.omg.CORBA.MARSHAL var43 = var1.cannotMarshalNative((java.lang.Throwable)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = java.lang.String.valueOf((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var9 = new java.lang.Object[] { 1L};
    var5.entering("hi!", "", var9);
    org.omg.CORBA.MARSHAL var11 = var3.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var9);
    org.omg.CORBA.MARSHAL var12 = var1.iiopinputstreamGrow((java.lang.Throwable)var11);
    org.omg.CORBA.BAD_OPERATION var13 = var1.isLocalRequiresStub();
    org.omg.CORBA.BAD_OPERATION var14 = var1.negativeBounds();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var19 = var16.badUrl((java.lang.Object)"hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var25 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var29 = new java.lang.Object[] { 1L};
    var25.entering("hi!", "", var29);
    org.omg.CORBA.MARSHAL var31 = var23.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var29);
    org.omg.CORBA.INV_OBJREF var32 = var21.badCorbalocString((java.lang.Throwable)var31);
    org.omg.CORBA.MARSHAL var33 = var16.readValueAndNoRepId((java.lang.Throwable)var32);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var37 = var35.fieldNotFound((java.lang.Object)100);
    org.omg.CORBA.BAD_OPERATION var38 = var16.getDelegateRequiresStub((java.lang.Throwable)var37);
    org.omg.CORBA.MARSHAL var39 = var1.badInsertobjParam((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var7 = new java.lang.Object[] { 1L};
    var3.entering("hi!", "", var7);
    org.omg.CORBA.MARSHAL var9 = var1.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var7);
    org.omg.CORBA.INTERNAL var13 = var1.workerThreadSetNameFailure((java.lang.Object)(byte)(-1), (java.lang.Object)(-1.0d), (java.lang.Object)'a');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var17 = var15.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var20 = var15.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var19);
    org.omg.CORBA.INTERNAL var22 = var15.badHelperIdMethod((java.lang.Object)(-1.0d));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var30 = var28.fieldNotFound((java.lang.Object)100);
    java.util.logging.Logger var32 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.INTERNAL var33 = var28.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)"", (java.lang.Object)var32);
    org.omg.CORBA.BAD_PARAM var34 = var15.couldNotSetArray((java.lang.Object)1.0f, (java.lang.Object)10.0f, (java.lang.Object)1.0f, (java.lang.Object)(-1), (java.lang.Object)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var40 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var44 = new java.lang.Object[] { 1L};
    var40.entering("hi!", "", var44);
    org.omg.CORBA.MARSHAL var46 = var38.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var44);
    org.omg.CORBA.INV_OBJREF var47 = var36.badCorbalocString((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var53 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var57 = new java.lang.Object[] { 1L};
    var53.entering("hi!", "", var57);
    org.omg.CORBA.MARSHAL var59 = var51.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var57);
    org.omg.CORBA.INV_OBJREF var60 = var49.badCorbalocString((java.lang.Throwable)var59);
    org.omg.CORBA.BAD_OPERATION var61 = var36.setExceptionCalledNullArgs((java.lang.Throwable)var60);
    org.omg.CORBA.INTERNAL var63 = var28.invalidBuffMgrStrategy((java.lang.Throwable)var61, (java.lang.Object)100.0d);
    org.omg.CORBA.INTERNAL var64 = var1.wrongClientsc((java.lang.Throwable)var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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
    assertNotNull(var22);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
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
    assertNotNull(var64);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var9 = new java.lang.Object[] { 1L};
    var5.entering("hi!", "", var9);
    org.omg.CORBA.MARSHAL var11 = var3.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var9);
    org.omg.CORBA.MARSHAL var12 = var1.iiopinputstreamGrow((java.lang.Throwable)var11);
    org.omg.CORBA.BAD_OPERATION var13 = var1.isLocalRequiresStub();
    org.omg.CORBA.INTERNAL var15 = var1.readUndeclaredException((java.lang.Object)(-1L));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var21 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var25 = new java.lang.Object[] { 1L};
    var21.entering("hi!", "", var25);
    org.omg.CORBA.MARSHAL var27 = var19.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var25);
    org.omg.CORBA.INV_OBJREF var28 = var17.badCorbalocString((java.lang.Throwable)var27);
    org.omg.CORBA.BAD_OPERATION var29 = var1.classNotFound2((java.lang.Object)var27);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var33 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var37 = new java.lang.Object[] { 1L};
    var33.entering("hi!", "", var37);
    org.omg.CORBA.MARSHAL var39 = var31.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var45 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var49 = new java.lang.Object[] { 1L};
    var45.entering("hi!", "", var49);
    org.omg.CORBA.MARSHAL var51 = var43.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var49);
    org.omg.CORBA.MARSHAL var52 = var41.iiopinputstreamGrow((java.lang.Throwable)var51);
    org.omg.CORBA.MARSHAL var53 = var31.badDigitInFixed((java.lang.Throwable)var51);
    org.omg.CORBA.BAD_TYPECODE var54 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var53);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.logging.Logger var60 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var64 = new java.lang.Object[] { 1L};
    var60.entering("hi!", "", var64);
    org.omg.CORBA.MARSHAL var66 = var58.badChunkLength((java.lang.Object)1.0f, (java.lang.Object)var64);
    org.omg.CORBA.MARSHAL var67 = var56.iiopinputstreamGrow((java.lang.Throwable)var66);
    org.omg.CORBA.BAD_OPERATION var68 = var56.isLocalRequiresStub();
    org.omg.CORBA.INTERNAL var70 = var56.readUndeclaredException((java.lang.Object)(-1L));
    org.omg.CORBA.MARSHAL var71 = var1.characterOutofrange((java.lang.Throwable)var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.setUseParentHandlers(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
