
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("true", "true");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = new java.lang.String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var2 = new byte[] { (byte)1, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, (-1), 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.text.DateFormat var0 = java.text.DateFormat.getTimeInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("true");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.SimpleDateFormat var1 = new java.text.SimpleDateFormat("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var4 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var8 = var7.requestRequiresStub();
    org.omg.CORBA.INTERNAL var9 = var7.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var10 = var3.invalidRequestPartitioningId((java.lang.Object)var4, (java.lang.Object)true, (java.lang.Object)var9);
    java.util.logging.Logger var11 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var13 = var1.malformedUrl((java.lang.Throwable)var10, (java.lang.Object)var11, (java.lang.Object)'#');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var16 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var20 = var19.requestRequiresStub();
    org.omg.CORBA.INTERNAL var21 = var19.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var22 = var15.invalidRequestPartitioningId((java.lang.Object)var16, (java.lang.Object)true, (java.lang.Object)var21);
    org.omg.CORBA.UNKNOWN var23 = var1.unknownDsiSysex((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var26 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var30 = var29.requestRequiresStub();
    org.omg.CORBA.INTERNAL var31 = var29.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var32 = var25.invalidRequestPartitioningId((java.lang.Object)var26, (java.lang.Object)true, (java.lang.Object)var31);
    java.text.DateFormat var35 = java.text.DateFormat.getDateInstance(1);
    var35.setLenient(false);
    org.omg.CORBA.BAD_PARAM var38 = var1.errorSettingField((java.lang.Throwable)var31, (java.lang.Object)100.0d, (java.lang.Object)false);
    org.omg.CORBA.INTERNAL var39 = var1.requestdispatcherregistryError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var42 = var41.requestRequiresStub();
    java.util.Hashtable var44 = new java.util.Hashtable();
    boolean var46 = var44.containsKey((java.lang.Object)"");
    java.util.Set var47 = var44.entrySet();
    org.omg.CORBA.MARSHAL var48 = var41.badChunkLength((java.lang.Object)(-1), (java.lang.Object)var44);
    org.omg.CORBA.BAD_INV_ORDER var49 = var1.argumentsCalledMultiple((java.lang.Throwable)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var2 = var1.javaStreamInitFailed();
    org.omg.CORBA.INTERNAL var3 = var1.locationforwardError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var2 = var1.requestRequiresStub();
    org.omg.CORBA.INTERNAL var3 = var1.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var5 = var1.couldNotLoadClass((java.lang.Object)0.0f);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var10 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var14 = var13.requestRequiresStub();
    org.omg.CORBA.INTERNAL var15 = var13.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var16 = var9.invalidRequestPartitioningId((java.lang.Object)var10, (java.lang.Object)true, (java.lang.Object)var15);
    org.omg.CORBA.INTERNAL var17 = var7.getSystemExReturnedNull((java.lang.Throwable)var16);
    org.omg.CORBA.INTERNAL var19 = var1.badHelperIdMethod((java.lang.Throwable)var16, (java.lang.Object)100L);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var2 = var1.recvMsgError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var7 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var10.requestRequiresStub();
    org.omg.CORBA.INTERNAL var12 = var10.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var13 = var6.invalidRequestPartitioningId((java.lang.Object)var7, (java.lang.Object)true, (java.lang.Object)var12);
    java.util.logging.Logger var14 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var16 = var4.malformedUrl((java.lang.Throwable)var13, (java.lang.Object)var14, (java.lang.Object)'#');
    org.omg.CORBA.MARSHAL var17 = var1.unexpectedEof((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var4 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var8 = var7.requestRequiresStub();
    org.omg.CORBA.INTERNAL var9 = var7.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var10 = var3.invalidRequestPartitioningId((java.lang.Object)var4, (java.lang.Object)true, (java.lang.Object)var9);
    java.util.logging.Logger var11 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var13 = var1.malformedUrl((java.lang.Throwable)var10, (java.lang.Object)var11, (java.lang.Object)'#');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var16 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var20 = var19.requestRequiresStub();
    org.omg.CORBA.INTERNAL var21 = var19.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var22 = var15.invalidRequestPartitioningId((java.lang.Object)var16, (java.lang.Object)true, (java.lang.Object)var21);
    org.omg.CORBA.UNKNOWN var23 = var1.unknownDsiSysex((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var26 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var30 = var29.requestRequiresStub();
    org.omg.CORBA.INTERNAL var31 = var29.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var32 = var25.invalidRequestPartitioningId((java.lang.Object)var26, (java.lang.Object)true, (java.lang.Object)var31);
    java.text.DateFormat var35 = java.text.DateFormat.getDateInstance(1);
    var35.setLenient(false);
    org.omg.CORBA.BAD_PARAM var38 = var1.errorSettingField((java.lang.Throwable)var31, (java.lang.Object)100.0d, (java.lang.Object)false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var41 = var40.requestRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var46 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var50 = var49.requestRequiresStub();
    org.omg.CORBA.INTERNAL var51 = var49.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var52 = var45.invalidRequestPartitioningId((java.lang.Object)var46, (java.lang.Object)true, (java.lang.Object)var51);
    java.util.logging.Logger var53 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var55 = var43.malformedUrl((java.lang.Throwable)var52, (java.lang.Object)var53, (java.lang.Object)'#');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var58 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var62 = var61.requestRequiresStub();
    org.omg.CORBA.INTERNAL var63 = var61.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var64 = var57.invalidRequestPartitioningId((java.lang.Object)var58, (java.lang.Object)true, (java.lang.Object)var63);
    org.omg.CORBA.UNKNOWN var65 = var43.unknownDsiSysex((java.lang.Throwable)var64);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var67 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var68 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var72 = var71.requestRequiresStub();
    org.omg.CORBA.INTERNAL var73 = var71.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var74 = var67.invalidRequestPartitioningId((java.lang.Object)var68, (java.lang.Object)true, (java.lang.Object)var73);
    java.text.DateFormat var77 = java.text.DateFormat.getDateInstance(1);
    var77.setLenient(false);
    org.omg.CORBA.BAD_PARAM var80 = var43.errorSettingField((java.lang.Throwable)var73, (java.lang.Object)100.0d, (java.lang.Object)false);
    org.omg.CORBA.INTERNAL var81 = var1.illegalSubcontractId((java.lang.Throwable)var41, (java.lang.Object)false);
    org.omg.CORBA.INTERNAL var82 = var1.problemWithExceptionTypecode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
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
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var2 = var1.requestRequiresStub();
    org.omg.CORBA.INTERNAL var3 = var1.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var4 = var1.abstractFromNonAbstract();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var2 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var6 = var5.requestRequiresStub();
    org.omg.CORBA.INTERNAL var7 = var5.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)true, (java.lang.Object)var7);
    org.omg.CORBA.BAD_OPERATION var9 = var1.setDelegateRequiresStub();
    org.omg.CORBA.COMM_FAILURE var10 = var1.bootstrapServerNotAvail();
    
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

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var4 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var8 = var7.requestRequiresStub();
    org.omg.CORBA.INTERNAL var9 = var7.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var10 = var3.invalidRequestPartitioningId((java.lang.Object)var4, (java.lang.Object)true, (java.lang.Object)var9);
    java.util.logging.Logger var11 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var13 = var1.malformedUrl((java.lang.Throwable)var10, (java.lang.Object)var11, (java.lang.Object)'#');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var16 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var20 = var19.requestRequiresStub();
    org.omg.CORBA.INTERNAL var21 = var19.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var22 = var15.invalidRequestPartitioningId((java.lang.Object)var16, (java.lang.Object)true, (java.lang.Object)var21);
    org.omg.CORBA.UNKNOWN var23 = var1.unknownDsiSysex((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var26 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var30 = var29.requestRequiresStub();
    org.omg.CORBA.INTERNAL var31 = var29.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var32 = var25.invalidRequestPartitioningId((java.lang.Object)var26, (java.lang.Object)true, (java.lang.Object)var31);
    java.text.DateFormat var35 = java.text.DateFormat.getDateInstance(1);
    var35.setLenient(false);
    org.omg.CORBA.BAD_PARAM var38 = var1.errorSettingField((java.lang.Throwable)var31, (java.lang.Object)100.0d, (java.lang.Object)false);
    org.omg.CORBA.OBJ_ADAPTER var39 = var1.noServerScInDispatch();
    org.omg.CORBA.INTERNAL var40 = var1.cancelNotSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var4 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var8 = var7.requestRequiresStub();
    org.omg.CORBA.INTERNAL var9 = var7.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var10 = var3.invalidRequestPartitioningId((java.lang.Object)var4, (java.lang.Object)true, (java.lang.Object)var9);
    java.util.logging.Logger var11 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var13 = var1.malformedUrl((java.lang.Throwable)var10, (java.lang.Object)var11, (java.lang.Object)'#');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var16 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var20 = var19.requestRequiresStub();
    org.omg.CORBA.INTERNAL var21 = var19.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var22 = var15.invalidRequestPartitioningId((java.lang.Object)var16, (java.lang.Object)true, (java.lang.Object)var21);
    org.omg.CORBA.UNKNOWN var23 = var1.unknownDsiSysex((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var26 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var30 = var29.requestRequiresStub();
    org.omg.CORBA.INTERNAL var31 = var29.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var32 = var25.invalidRequestPartitioningId((java.lang.Object)var26, (java.lang.Object)true, (java.lang.Object)var31);
    java.text.DateFormat var35 = java.text.DateFormat.getDateInstance(1);
    var35.setLenient(false);
    org.omg.CORBA.BAD_PARAM var38 = var1.errorSettingField((java.lang.Throwable)var31, (java.lang.Object)100.0d, (java.lang.Object)false);
    org.omg.CORBA.OBJ_ADAPTER var39 = var1.noServerScInDispatch();
    org.omg.CORBA.INTERNAL var40 = var1.invalidCodeSetNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var4 = var3.requestRequiresStub();
    java.util.Hashtable var6 = new java.util.Hashtable();
    boolean var8 = var6.containsKey((java.lang.Object)"");
    java.util.Set var9 = var6.entrySet();
    org.omg.CORBA.MARSHAL var10 = var3.badChunkLength((java.lang.Object)(-1), (java.lang.Object)var6);
    org.omg.CORBA.MARSHAL var11 = var1.invalidComplexTypecode((java.lang.Throwable)var10);
    org.omg.CORBA.DATA_CONVERSION var12 = var1.badStringifiedIor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var2 = var1.requestRequiresStub();
    org.omg.CORBA.INTERNAL var3 = var1.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var5 = var1.couldNotLoadClass((java.lang.Object)0.0f);
    java.util.Hashtable var6 = new java.util.Hashtable();
    boolean var8 = var6.containsKey((java.lang.Object)"");
    org.omg.CORBA.MARSHAL var10 = var1.badFixed((java.lang.Object)var8, (java.lang.Object)'a');
    org.omg.CORBA.MARSHAL var11 = var1.iiopinputstreamGrow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var4 = var3.recvMsgError();
    org.omg.CORBA.INTERNAL var6 = var1.invalidCtbConverterName((java.lang.Throwable)var4, (java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var4 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var8 = var7.requestRequiresStub();
    org.omg.CORBA.INTERNAL var9 = var7.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var10 = var3.invalidRequestPartitioningId((java.lang.Object)var4, (java.lang.Object)true, (java.lang.Object)var9);
    java.util.logging.Logger var11 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var13 = var1.malformedUrl((java.lang.Throwable)var10, (java.lang.Object)var11, (java.lang.Object)'#');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var16 = var15.requestRequiresStub();
    org.omg.CORBA.INTERNAL var17 = var15.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var19 = var15.couldNotLoadClass((java.lang.Object)0.0f);
    java.util.Hashtable var20 = new java.util.Hashtable();
    boolean var22 = var20.containsKey((java.lang.Object)"");
    org.omg.CORBA.MARSHAL var24 = var15.badFixed((java.lang.Object)var22, (java.lang.Object)'a');
    org.omg.CORBA.MARSHAL var25 = var1.readValueAndNoRepId((java.lang.Throwable)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var2 = var1.recvMsgError();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.BAD_OPERATION var4 = var1.badOrbConfigurator((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var2 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var6 = var5.requestRequiresStub();
    org.omg.CORBA.INTERNAL var7 = var5.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var8 = var1.invalidRequestPartitioningId((java.lang.Object)var2, (java.lang.Object)true, (java.lang.Object)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var13 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var17 = var16.requestRequiresStub();
    org.omg.CORBA.INTERNAL var18 = var16.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var19 = var12.invalidRequestPartitioningId((java.lang.Object)var13, (java.lang.Object)true, (java.lang.Object)var18);
    java.util.logging.Logger var20 = java.util.logging.Logger.getAnonymousLogger();
    org.omg.CORBA.MARSHAL var22 = var10.malformedUrl((java.lang.Throwable)var19, (java.lang.Object)var20, (java.lang.Object)'#');
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var25 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var28.requestRequiresStub();
    org.omg.CORBA.INTERNAL var30 = var28.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var31 = var24.invalidRequestPartitioningId((java.lang.Object)var25, (java.lang.Object)true, (java.lang.Object)var30);
    org.omg.CORBA.UNKNOWN var32 = var10.unknownDsiSysex((java.lang.Throwable)var31);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    java.util.Formatter var35 = new java.util.Formatter();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_OPERATION var39 = var38.requestRequiresStub();
    org.omg.CORBA.INTERNAL var40 = var38.duplicateOrbVersionServiceContext();
    org.omg.CORBA.BAD_PARAM var41 = var34.invalidRequestPartitioningId((java.lang.Object)var35, (java.lang.Object)true, (java.lang.Object)var40);
    java.text.DateFormat var44 = java.text.DateFormat.getDateInstance(1);
    var44.setLenient(false);
    org.omg.CORBA.BAD_PARAM var47 = var10.errorSettingField((java.lang.Throwable)var40, (java.lang.Object)100.0d, (java.lang.Object)false);
    org.omg.CORBA.OBJ_ADAPTER var48 = var10.noServerScInDispatch();
    org.omg.CORBA.INTERNAL var49 = var1.locationforwardError((java.lang.Throwable)var48);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var34);
    
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

}
