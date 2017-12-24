
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.org.apache.xml.internal.res.XMLErrorResources_sk var0 = new com.sun.org.apache.xml.internal.res.XMLErrorResources_sk();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var6 = var3.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    org.omg.CORBA.BAD_PARAM var27 = var1.couldNotLoadClass((java.lang.Throwable)var25, (java.lang.Object)(short)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var34 = var31.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var39 = var36.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var40 = var29.badCodebaseIndirection((java.lang.Throwable)var34, (java.lang.Object)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var47 = var44.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var52 = var49.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var53 = var42.badCodebaseIndirection((java.lang.Throwable)var47, (java.lang.Object)var52);
    org.omg.CORBA.BAD_PARAM var55 = var29.couldNotLoadClass((java.lang.Throwable)var53, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var56 = var1.dsiResultException((java.lang.Throwable)var55);
    org.omg.CORBA.INTERNAL var59 = var1.interruptedJoinCallWhileClosingThreadPool((java.lang.Object)(short)1, (java.lang.Object)"\u0001d");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var6 = var3.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    org.omg.CORBA.BAD_PARAM var27 = var1.couldNotLoadClass((java.lang.Throwable)var25, (java.lang.Object)(short)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var34 = var31.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var39 = var36.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var40 = var29.badCodebaseIndirection((java.lang.Throwable)var34, (java.lang.Object)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var47 = var44.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var52 = var49.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var53 = var42.badCodebaseIndirection((java.lang.Throwable)var47, (java.lang.Object)var52);
    org.omg.CORBA.BAD_PARAM var55 = var29.couldNotLoadClass((java.lang.Throwable)var53, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var56 = var1.dsiResultException((java.lang.Throwable)var55);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var63 = var60.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var68 = var65.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var69 = var58.badCodebaseIndirection((java.lang.Throwable)var63, (java.lang.Object)var68);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var76 = var73.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var78 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var81 = var78.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var82 = var71.badCodebaseIndirection((java.lang.Throwable)var76, (java.lang.Object)var81);
    org.omg.CORBA.BAD_PARAM var84 = var58.couldNotLoadClass((java.lang.Throwable)var82, (java.lang.Object)(short)(-1));
    byte[] var87 = new byte[] { (byte)1, (byte)100};
    java.lang.String var88 = new java.lang.String(var87);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var90 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var93 = var90.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.INTERNAL var96 = var90.workQueueThreadInterrupted((java.lang.Object)(-1L), (java.lang.Object)0L);
    org.omg.CORBA.INTERNAL var97 = var1.workerThreadThrowableFromRequestWork((java.lang.Object)var58, (java.lang.Object)var87, (java.lang.Object)0L);
    org.omg.CORBA.BAD_OPERATION var99 = var58.classNotFound2((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "\u0001d"+ "'", var88.equals("\u0001d"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var6 = var3.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var32 = var29.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var37 = var34.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var38 = var27.badCodebaseIndirection((java.lang.Throwable)var32, (java.lang.Object)var37);
    org.omg.CORBA.BAD_PARAM var40 = var14.couldNotLoadClass((java.lang.Throwable)var38, (java.lang.Object)(short)(-1));
    org.omg.CORBA.INTERNAL var42 = var1.invalidBuffMgrStrategy((java.lang.Throwable)var38, (java.lang.Object)0.0f);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var49 = var46.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var54 = var51.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var55 = var44.badCodebaseIndirection((java.lang.Throwable)var49, (java.lang.Object)var54);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var62 = var59.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var67 = var64.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var68 = var57.badCodebaseIndirection((java.lang.Throwable)var62, (java.lang.Object)var67);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var72 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var75 = var72.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var80 = var77.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var81 = var70.badCodebaseIndirection((java.lang.Throwable)var75, (java.lang.Object)var80);
    org.omg.CORBA.BAD_PARAM var83 = var57.couldNotLoadClass((java.lang.Throwable)var81, (java.lang.Object)(short)(-1));
    org.omg.CORBA.INTERNAL var85 = var44.invalidBuffMgrStrategy((java.lang.Throwable)var81, (java.lang.Object)0.0f);
    org.omg.CORBA.INTERNAL var87 = var1.invalidCodeSetString((java.lang.Throwable)var85, (java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.jar.Manifest var0 = new java.util.jar.Manifest();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.DATA_CONVERSION var5 = var1.badCodesetsFromClient();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var2 = new byte[] { (byte)1, (byte)100};
    java.lang.String var3 = new java.lang.String(var2);
    byte[] var4 = sun.net.util.IPAddressUtil.convertFromIPv4MappedAddress(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u0001d"+ "'", var3.equals("\u0001d"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var5 = var1.invalidObjectKey();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var12 = var9.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var17 = var14.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var18 = var7.badCodebaseIndirection((java.lang.Throwable)var12, (java.lang.Object)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var25 = var22.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var30 = var27.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var31 = var20.badCodebaseIndirection((java.lang.Throwable)var25, (java.lang.Object)var30);
    org.omg.CORBA.BAD_PARAM var33 = var7.couldNotLoadClass((java.lang.Throwable)var31, (java.lang.Object)(short)(-1));
    org.omg.CORBA.INTERNAL var34 = var1.invocationInfoStackEmpty((java.lang.Throwable)var33);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var41 = var38.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var46 = var43.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var47 = var36.badCodebaseIndirection((java.lang.Throwable)var41, (java.lang.Object)var46);
    org.omg.CORBA.BAD_OPERATION var48 = var1.orbDestroyed((java.lang.Throwable)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    char[] var1 = new char[] { 'a'};
    java.lang.String var2 = java.lang.String.copyValueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "a"+ "'", var2.equals("a"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var6 = var3.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    org.omg.CORBA.BAD_PARAM var27 = var1.couldNotLoadClass((java.lang.Throwable)var25, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var28 = var1.recursiveTypecodeError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.INTERNAL var7 = var1.workQueueThreadInterrupted((java.lang.Object)(-1L), (java.lang.Object)0L);
    org.omg.CORBA.MARSHAL var8 = var1.endOfStream();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var13 = var10.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.INTERNAL var16 = var10.workQueueThreadInterrupted((java.lang.Object)(-1L), (java.lang.Object)0L);
    org.omg.CORBA.MARSHAL var17 = var10.endOfStream();
    org.omg.CORBA.BAD_PARAM var18 = var1.bootstrapRuntimeException((java.lang.Throwable)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var5 = var1.invalidObjectKey();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var12 = var9.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var17 = var14.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var18 = var7.badCodebaseIndirection((java.lang.Throwable)var12, (java.lang.Object)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var25 = var22.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var30 = var27.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var31 = var20.badCodebaseIndirection((java.lang.Throwable)var25, (java.lang.Object)var30);
    org.omg.CORBA.BAD_PARAM var33 = var7.couldNotLoadClass((java.lang.Throwable)var31, (java.lang.Object)(short)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var38 = var35.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var39 = var35.invalidObjectKey();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var46 = var43.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var51 = var48.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var52 = var41.badCodebaseIndirection((java.lang.Throwable)var46, (java.lang.Object)var51);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var59 = var56.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var64 = var61.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var65 = var54.badCodebaseIndirection((java.lang.Throwable)var59, (java.lang.Object)var64);
    org.omg.CORBA.BAD_PARAM var67 = var41.couldNotLoadClass((java.lang.Throwable)var65, (java.lang.Object)(short)(-1));
    org.omg.CORBA.INTERNAL var68 = var35.invocationInfoStackEmpty((java.lang.Throwable)var67);
    byte[] var72 = new byte[] { (byte)1, (byte)100};
    java.lang.String var73 = new java.lang.String(var72);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var75 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var78 = var75.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var79 = var75.invalidObjectKey();
    org.omg.CORBA.BAD_PARAM var80 = var7.invalidRequestPartitioningComponentValue((java.lang.Throwable)var68, (java.lang.Object)0.0d, (java.lang.Object)var72, (java.lang.Object)var79);
    org.omg.CORBA.DATA_CONVERSION var81 = var1.illegalIiopPrimaryToContactInfoType((java.lang.Object)var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "\u0001d"+ "'", var73.equals("\u0001d"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var6 = var3.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    org.omg.CORBA.BAD_PARAM var27 = var1.couldNotLoadClass((java.lang.Throwable)var25, (java.lang.Object)(short)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var34 = var31.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var39 = var36.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var40 = var29.badCodebaseIndirection((java.lang.Throwable)var34, (java.lang.Object)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var47 = var44.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var52 = var49.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var53 = var42.badCodebaseIndirection((java.lang.Throwable)var47, (java.lang.Object)var52);
    org.omg.CORBA.BAD_PARAM var55 = var29.couldNotLoadClass((java.lang.Throwable)var53, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var56 = var1.dsiResultException((java.lang.Throwable)var55);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var63 = var60.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var68 = var65.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var69 = var58.badCodebaseIndirection((java.lang.Throwable)var63, (java.lang.Object)var68);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var76 = var73.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var78 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var81 = var78.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var82 = var71.badCodebaseIndirection((java.lang.Throwable)var76, (java.lang.Object)var81);
    org.omg.CORBA.BAD_PARAM var84 = var58.couldNotLoadClass((java.lang.Throwable)var82, (java.lang.Object)(short)(-1));
    byte[] var87 = new byte[] { (byte)1, (byte)100};
    java.lang.String var88 = new java.lang.String(var87);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var90 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var93 = var90.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.INTERNAL var96 = var90.workQueueThreadInterrupted((java.lang.Object)(-1L), (java.lang.Object)0L);
    org.omg.CORBA.INTERNAL var97 = var1.workerThreadThrowableFromRequestWork((java.lang.Object)var58, (java.lang.Object)var87, (java.lang.Object)0L);
    org.omg.CORBA.OBJECT_NOT_EXIST var98 = var58.badSkeleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "\u0001d"+ "'", var88.equals("\u0001d"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var6 = var3.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    org.omg.CORBA.BAD_PARAM var27 = var1.couldNotLoadClass((java.lang.Throwable)var25, (java.lang.Object)(short)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var34 = var31.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var39 = var36.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var40 = var29.badCodebaseIndirection((java.lang.Throwable)var34, (java.lang.Object)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var47 = var44.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var52 = var49.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var53 = var42.badCodebaseIndirection((java.lang.Throwable)var47, (java.lang.Object)var52);
    org.omg.CORBA.BAD_PARAM var55 = var29.couldNotLoadClass((java.lang.Throwable)var53, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var56 = var1.dsiResultException((java.lang.Throwable)var55);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var61 = var58.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var62 = var58.invalidObjectKey();
    org.omg.CORBA.DATA_CONVERSION var63 = var58.badCodesetsFromClient();
    org.omg.CORBA.MARSHAL var64 = var1.readValueAndNoRepId((java.lang.Throwable)var63);
    org.omg.CORBA.INTERNAL var65 = var1.badServantReadObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.UNKNOWN var5 = var1.runtimeexception();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var5 = var1.couldNotFindClass();
    org.omg.CORBA.NO_IMPLEMENT var6 = var1.sendDeferredNotimplemented();
    org.omg.CORBA.BAD_INV_ORDER var7 = var1.argumentsCalledAfterException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var8 = var5.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var13 = var10.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var14 = var3.badCodebaseIndirection((java.lang.Throwable)var8, (java.lang.Object)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var21 = var18.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var26 = var23.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var27 = var16.badCodebaseIndirection((java.lang.Throwable)var21, (java.lang.Object)var26);
    org.omg.CORBA.BAD_PARAM var29 = var3.couldNotLoadClass((java.lang.Throwable)var27, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var30 = var1.iiopinputstreamGrow((java.lang.Throwable)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var6 = var3.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    org.omg.CORBA.BAD_PARAM var27 = var1.couldNotLoadClass((java.lang.Throwable)var25, (java.lang.Object)(short)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var34 = var31.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var39 = var36.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var40 = var29.badCodebaseIndirection((java.lang.Throwable)var34, (java.lang.Object)var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var47 = var44.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var52 = var49.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var53 = var42.badCodebaseIndirection((java.lang.Throwable)var47, (java.lang.Object)var52);
    org.omg.CORBA.BAD_PARAM var55 = var29.couldNotLoadClass((java.lang.Throwable)var53, (java.lang.Object)(short)(-1));
    org.omg.CORBA.MARSHAL var56 = var1.dsiResultException((java.lang.Throwable)var55);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var61 = var58.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var62 = var58.invalidObjectKey();
    org.omg.CORBA.DATA_CONVERSION var63 = var58.badCodesetsFromClient();
    org.omg.CORBA.MARSHAL var64 = var1.readValueAndNoRepId((java.lang.Throwable)var63);
    org.omg.CORBA.INTERNAL var65 = var1.errorInitBadserveridhandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var5 = var1.invalidObjectKey();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var12 = var9.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var17 = var14.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var18 = var7.badCodebaseIndirection((java.lang.Throwable)var12, (java.lang.Object)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var25 = var22.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var30 = var27.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var31 = var20.badCodebaseIndirection((java.lang.Throwable)var25, (java.lang.Object)var30);
    org.omg.CORBA.BAD_PARAM var33 = var7.couldNotLoadClass((java.lang.Throwable)var31, (java.lang.Object)(short)(-1));
    org.omg.CORBA.INTERNAL var34 = var1.invocationInfoStackEmpty((java.lang.Throwable)var33);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var39 = var36.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.INTERNAL var42 = var36.workQueueThreadInterrupted((java.lang.Object)(-1L), (java.lang.Object)0L);
    org.omg.CORBA.MARSHAL var43 = var36.endOfStream();
    org.omg.CORBA.DATA_CONVERSION var45 = var36.badCustomIorToSocketInfo((java.lang.Object)10L);
    org.omg.CORBA.MARSHAL var46 = var1.characterOutofrange((java.lang.Throwable)var45);
    org.omg.CORBA.DATA_CONVERSION var47 = var1.invalidSingleCharCtb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    boolean var2 = java.util.regex.Pattern.matches("-1", (java.lang.CharSequence)"\u0001d");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var5 = var1.invalidObjectKey();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var10 = var7.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var11 = var7.invalidObjectKey();
    org.omg.CORBA.DATA_CONVERSION var12 = var7.badCodesetsFromClient();
    org.omg.CORBA.BAD_INV_ORDER var13 = var1.setResultAfterException((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.INTERNAL var7 = var1.workQueueThreadInterrupted((java.lang.Object)(-1L), (java.lang.Object)0L);
    org.omg.CORBA.MARSHAL var8 = var1.endOfStream();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var15 = var12.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var20 = var17.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var21 = var10.badCodebaseIndirection((java.lang.Throwable)var15, (java.lang.Object)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var28 = var25.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var33 = var30.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var34 = var23.badCodebaseIndirection((java.lang.Throwable)var28, (java.lang.Object)var33);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var41 = var38.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var46 = var43.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var47 = var36.badCodebaseIndirection((java.lang.Throwable)var41, (java.lang.Object)var46);
    org.omg.CORBA.BAD_PARAM var49 = var23.couldNotLoadClass((java.lang.Throwable)var47, (java.lang.Object)(short)(-1));
    org.omg.CORBA.OBJ_ADAPTER var50 = var10.orbConnectError((java.lang.Throwable)var49);
    org.omg.CORBA.INTERNAL var52 = var1.noInvocationHandler((java.lang.Throwable)var49, (java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var1 = java.lang.String.valueOf((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var6 = var3.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var1.badCodebaseIndirection((java.lang.Throwable)var6, (java.lang.Object)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var32 = var29.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var37 = var34.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var38 = var27.badCodebaseIndirection((java.lang.Throwable)var32, (java.lang.Object)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var45 = var42.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var50 = var47.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var51 = var40.badCodebaseIndirection((java.lang.Throwable)var45, (java.lang.Object)var50);
    org.omg.CORBA.BAD_PARAM var53 = var27.couldNotLoadClass((java.lang.Throwable)var51, (java.lang.Object)(short)(-1));
    org.omg.CORBA.INTERNAL var55 = var14.invalidBuffMgrStrategy((java.lang.Throwable)var51, (java.lang.Object)0.0f);
    org.omg.CORBA.COMM_FAILURE var56 = var1.bufferReadManagerTimeout((java.lang.Throwable)var51);
    org.omg.CORBA.DATA_CONVERSION var58 = var1.badContactInfoListFactory((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var4 = var1.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var5 = var1.couldNotFindClass();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var11 = var8.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var12 = var8.invalidObjectKey();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var19 = var16.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var24 = var21.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var25 = var14.badCodebaseIndirection((java.lang.Throwable)var19, (java.lang.Object)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var32 = var29.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var37 = var34.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.MARSHAL var38 = var27.badCodebaseIndirection((java.lang.Throwable)var32, (java.lang.Object)var37);
    org.omg.CORBA.BAD_PARAM var40 = var14.couldNotLoadClass((java.lang.Throwable)var38, (java.lang.Object)(short)(-1));
    org.omg.CORBA.INTERNAL var41 = var8.invocationInfoStackEmpty((java.lang.Throwable)var40);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("\u0001d");
    org.omg.CORBA.MARSHAL var46 = var43.couldNotSkipBytes((java.lang.Object)1L, (java.lang.Object)true);
    org.omg.CORBA.INTERNAL var49 = var43.workQueueThreadInterrupted((java.lang.Object)(-1L), (java.lang.Object)0L);
    org.omg.CORBA.MARSHAL var50 = var43.endOfStream();
    org.omg.CORBA.DATA_CONVERSION var52 = var43.badCustomIorToSocketInfo((java.lang.Object)10L);
    org.omg.CORBA.MARSHAL var53 = var8.characterOutofrange((java.lang.Throwable)var52);
    org.omg.CORBA.BAD_OPERATION var54 = var8.getDelegateServantNotActive();
    org.omg.CORBA.INTERNAL var55 = var1.workQueueThreadInterrupted((java.lang.Object)10.0f, (java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

}
