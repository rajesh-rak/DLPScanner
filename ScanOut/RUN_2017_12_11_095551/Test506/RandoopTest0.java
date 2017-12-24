
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv4LiteralAddress("## ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv4LiteralAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    char[] var3 = new char[] { '#', '#', ' '};
    java.lang.String var4 = java.lang.String.copyValueOf(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "## "+ "'", var4.equals("## "));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var3 = new byte[] { (byte)100, (byte)10, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var3, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("", (-1));
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.String var3 = var2.pattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "## "+ "'", var3.equals("## "));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    boolean var2 = java.util.regex.Pattern.matches("## ", (java.lang.CharSequence)"10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL[] var1 = sun.misc.URLClassPath.pathToURLs("");
    sun.misc.URLClassPath var2 = new sun.misc.URLClassPath(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, 10, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.String[] var5 = var2.split((java.lang.CharSequence)"hi!", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("## ", 0);
    java.util.regex.Matcher var4 = var2.matcher((java.lang.CharSequence)"true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.String.valueOf(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    byte[] var2 = new byte[] { (byte)10, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 0, 100, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Q1\\E"+ "'", var1.equals("\\Q1\\E"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var1 = new java.lang.String("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String var1 = java.lang.String.valueOf((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.exiting("", "10", (java.lang.Object)1.0d);
    var0.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var9 = var0.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.OBJECT_NOT_EXIST var11 = var10.badAdapterId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.exiting("", "10", (java.lang.Object)1.0d);
    var0.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var9 = var0.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.MARSHAL var12 = var10.cnfeReadClass((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.exiting("", "10", (java.lang.Object)1.0d);
    var0.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var9 = var0.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var11 = java.util.logging.Logger.getAnonymousLogger();
    var11.exiting("", "10", (java.lang.Object)1.0d);
    var11.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var20 = var11.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var11);
    java.util.regex.Pattern var26 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var27 = new java.lang.Object[] { var26};
    java.lang.String var28 = java.lang.String.format("hi!", var27);
    org.omg.CORBA.INTERNAL var29 = var21.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var27);
    org.omg.CORBA.MARSHAL var31 = var10.javaSerializationException((java.lang.Throwable)var29, (java.lang.Object)(-1.0f));
    org.omg.CORBA.BAD_INV_ORDER var32 = var10.setResultAfterException();
    java.util.logging.Logger var33 = java.util.logging.Logger.getAnonymousLogger();
    var33.exiting("", "10", (java.lang.Object)1.0d);
    var33.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var42 = var33.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var33);
    java.util.regex.Pattern var48 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var49 = new java.lang.Object[] { var48};
    java.lang.String var50 = java.lang.String.format("hi!", var49);
    org.omg.CORBA.INTERNAL var51 = var43.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var49);
    java.util.logging.Logger var52 = java.util.logging.Logger.getAnonymousLogger();
    var52.exiting("", "10", (java.lang.Object)1.0d);
    var52.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var61 = var52.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var52);
    java.util.logging.Logger var63 = java.util.logging.Logger.getAnonymousLogger();
    var63.exiting("", "10", (java.lang.Object)1.0d);
    var63.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var72 = var63.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var63);
    java.util.regex.Pattern var78 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var79 = new java.lang.Object[] { var78};
    java.lang.String var80 = java.lang.String.format("hi!", var79);
    org.omg.CORBA.INTERNAL var81 = var73.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var79);
    org.omg.CORBA.MARSHAL var83 = var62.javaSerializationException((java.lang.Throwable)var81, (java.lang.Object)(-1.0f));
    org.omg.CORBA.BAD_OPERATION var84 = var43.connectingServant((java.lang.Throwable)var83);
    org.omg.CORBA.INITIALIZE var85 = var10.cannotWriteOrbidDb((java.lang.Throwable)var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!"+ "'", var80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.exiting("", "10", (java.lang.Object)1.0d);
    var0.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var9 = var0.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.regex.Pattern var15 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var16 = new java.lang.Object[] { var15};
    java.lang.String var17 = java.lang.String.format("hi!", var16);
    org.omg.CORBA.INTERNAL var18 = var10.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var16);
    org.omg.CORBA.INTERNAL var19 = var10.errorResolvingAlias();
    java.util.logging.Logger var20 = java.util.logging.Logger.getAnonymousLogger();
    var20.exiting("", "10", (java.lang.Object)1.0d);
    var20.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var29 = var20.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    java.util.regex.Pattern var35 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var36 = new java.lang.Object[] { var35};
    java.lang.String var37 = java.lang.String.format("hi!", var36);
    org.omg.CORBA.INTERNAL var38 = var30.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var36);
    java.util.logging.Logger var39 = java.util.logging.Logger.getAnonymousLogger();
    var39.exiting("", "10", (java.lang.Object)1.0d);
    var39.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var48 = var39.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var39);
    java.util.logging.Logger var50 = java.util.logging.Logger.getAnonymousLogger();
    var50.exiting("", "10", (java.lang.Object)1.0d);
    var50.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var59 = var50.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var50);
    java.util.regex.Pattern var65 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var66 = new java.lang.Object[] { var65};
    java.lang.String var67 = java.lang.String.format("hi!", var66);
    org.omg.CORBA.INTERNAL var68 = var60.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var66);
    org.omg.CORBA.MARSHAL var70 = var49.javaSerializationException((java.lang.Throwable)var68, (java.lang.Object)(-1.0f));
    org.omg.CORBA.BAD_OPERATION var71 = var30.connectingServant((java.lang.Throwable)var70);
    org.omg.CORBA.INTERNAL var73 = var30.badHelperWriteMethod((java.lang.Object)(short)(-1));
    org.omg.CORBA.INITIALIZE var74 = var10.cannotWriteOrbidDb((java.lang.Throwable)var73);
    org.omg.CORBA.INTERNAL var75 = var10.noClientScClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
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

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.exiting("", "10", (java.lang.Object)1.0d);
    var0.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var9 = var0.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.regex.Pattern var15 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var16 = new java.lang.Object[] { var15};
    java.lang.String var17 = java.lang.String.format("hi!", var16);
    org.omg.CORBA.INTERNAL var18 = var10.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var16);
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    var19.exiting("", "10", (java.lang.Object)1.0d);
    var19.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var28 = var19.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var19);
    java.util.logging.Logger var30 = java.util.logging.Logger.getAnonymousLogger();
    var30.exiting("", "10", (java.lang.Object)1.0d);
    var30.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var39 = var30.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var30);
    java.util.regex.Pattern var45 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var46 = new java.lang.Object[] { var45};
    java.lang.String var47 = java.lang.String.format("hi!", var46);
    org.omg.CORBA.INTERNAL var48 = var40.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var46);
    org.omg.CORBA.MARSHAL var50 = var29.javaSerializationException((java.lang.Throwable)var48, (java.lang.Object)(-1.0f));
    org.omg.CORBA.BAD_OPERATION var51 = var10.connectingServant((java.lang.Throwable)var50);
    java.util.logging.Logger var52 = java.util.logging.Logger.getAnonymousLogger();
    var52.exiting("", "10", (java.lang.Object)1.0d);
    var52.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var61 = var52.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var52);
    java.util.logging.Logger var63 = java.util.logging.Logger.getAnonymousLogger();
    var63.exiting("", "10", (java.lang.Object)1.0d);
    var63.entering("true", "", (java.lang.Object)'a');
    java.util.logging.Level var72 = var63.getLevel();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var63);
    java.util.regex.Pattern var78 = java.util.regex.Pattern.compile("## ", 0);
    java.lang.Object[] var79 = new java.lang.Object[] { var78};
    java.lang.String var80 = java.lang.String.format("hi!", var79);
    org.omg.CORBA.INTERNAL var81 = var73.workerThreadCaughtUnexpectedThrowable((java.lang.Object)(byte)(-1), (java.lang.Object)var79);
    org.omg.CORBA.MARSHAL var83 = var62.javaSerializationException((java.lang.Throwable)var81, (java.lang.Object)(-1.0f));
    org.omg.CORBA.BAD_INV_ORDER var84 = var10.argumentsCalledAfterException((java.lang.Throwable)var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!"+ "'", var80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

}
