
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.corba.se.impl.logging.NamingSystemException var1 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var2 = var1.insBadSchemeName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = java.lang.String.valueOf(var0, 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var2 = java.text.DateFormat.getDateTimeInstance(1, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    char[] var3 = new char[] { '#', '#', '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.valueOf(var3, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.text.DateFormat var0 = java.text.DateFormat.getDateInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.text.DateFormat var0 = java.text.DateFormat.getTimeInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    char[] var2 = new char[] { 'a', '4'};
    java.lang.String var3 = java.lang.String.valueOf(var2);
    java.lang.String var4 = java.lang.String.valueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4"+ "'", var3.equals("a4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "a4"+ "'", var4.equals("a4"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.NamingSystemException var1 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var3 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var4 = var3.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var5 = var1.resolveFailure((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.NamingSystemException var7 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var8 = var7.resolveFailure();
    org.omg.CORBA.BAD_PARAM var9 = var1.insBadAddress((java.lang.Throwable)var8);
    org.omg.CORBA.UNKNOWN var10 = var1.resolveConversionFailure();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DateFormat var0 = java.text.DateFormat.getDateTimeInstance();
    java.text.NumberFormat var1 = var0.getNumberFormat();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var3 = var0.parse("a4");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.String.valueOf(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, 10, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance(" ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "a4");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.NamingSystemException var1 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var3 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var4 = var3.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var5 = var1.resolveFailure((java.lang.Throwable)var4);
    org.omg.CORBA.INITIALIZE var6 = var1.transNsCannotCreateInitialNcSys();
    
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

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = java.lang.String.valueOf(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = java.lang.String.valueOf(var0, 10, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    var0.engineDeleteEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.NamingSystemException var1 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var2 = var1.resolveFailure();
    com.sun.corba.se.impl.logging.NamingSystemException var4 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var6 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var7 = var6.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var8 = var4.resolveFailure((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.NamingSystemException var10 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var11 = var10.resolveFailure();
    org.omg.CORBA.BAD_PARAM var12 = var4.insBadAddress((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.NamingSystemException var14 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var15 = var14.resolveFailure();
    org.omg.CORBA.UNKNOWN var16 = var4.resolveConversionFailure((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.NamingSystemException var18 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var20 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var21 = var20.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var22 = var18.resolveFailure((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var23 = var4.namingCtxRebindctxAlreadyBound((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.NamingSystemException var25 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var27 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var28 = var27.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var29 = var25.resolveFailure((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.NamingSystemException var31 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var32 = var31.resolveFailure();
    org.omg.CORBA.BAD_PARAM var33 = var25.insBadAddress((java.lang.Throwable)var32);
    org.omg.CORBA.INITIALIZE var34 = var4.transNsCannotCreateInitialNc((java.lang.Throwable)var33);
    org.omg.CORBA.UNKNOWN var35 = var1.bindFailure((java.lang.Throwable)var33);
    org.omg.CORBA.INITIALIZE var36 = var1.transNsCannotCreateInitialNcSys();
    com.sun.corba.se.impl.logging.NamingSystemException var38 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var39 = var38.transNcListGotExc();
    com.sun.corba.se.impl.logging.NamingSystemException var41 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var43 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var44 = var43.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var45 = var41.resolveFailure((java.lang.Throwable)var44);
    org.omg.CORBA.INTERNAL var46 = var38.insBadSchemeName((java.lang.Throwable)var45);
    org.omg.CORBA.INTERNAL var47 = var1.insOther((java.lang.Throwable)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    char[] var2 = new char[] { 'a', '4'};
    java.lang.String var3 = java.lang.String.valueOf(var2);
    java.lang.String var4 = new java.lang.String(var2);
    java.lang.String var5 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4"+ "'", var3.equals("a4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "a4"+ "'", var4.equals("a4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "a4"+ "'", var5.equals("a4"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.NamingSystemException var1 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var3 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var5 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var6 = var5.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var7 = var3.resolveFailure((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.NamingSystemException var9 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var10 = var9.resolveFailure();
    org.omg.CORBA.BAD_PARAM var11 = var3.insBadAddress((java.lang.Throwable)var10);
    com.sun.corba.se.impl.logging.NamingSystemException var13 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var14 = var13.resolveFailure();
    org.omg.CORBA.UNKNOWN var15 = var3.resolveConversionFailure((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.NamingSystemException var17 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var19 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var20 = var19.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var21 = var17.resolveFailure((java.lang.Throwable)var20);
    org.omg.CORBA.INTERNAL var22 = var3.namingCtxRebindctxAlreadyBound((java.lang.Throwable)var20);
    org.omg.CORBA.INTERNAL var23 = var1.insBadSchemeName((java.lang.Throwable)var22);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = new java.lang.String(var0);
    java.lang.String var2 = new java.lang.String(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var0, 0, 0, "a4");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Collection var1 = var0.values();
    java.util.Enumeration var2 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    byte[] var1 = new byte[] { };
    java.lang.String var2 = new java.lang.String(var1);
    java.lang.String var3 = new java.lang.String(var1);
    boolean var4 = var0.containsKey((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.corba.se.impl.logging.NamingSystemException var1 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var3 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var4 = var3.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var5 = var1.resolveFailure((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.NamingSystemException var7 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var8 = var7.resolveFailure();
    org.omg.CORBA.BAD_PARAM var9 = var1.insBadAddress((java.lang.Throwable)var8);
    com.sun.corba.se.impl.logging.NamingSystemException var11 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var12 = var11.resolveFailure();
    org.omg.CORBA.UNKNOWN var13 = var1.resolveConversionFailure((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.NamingSystemException var15 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var17 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var18 = var17.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var19 = var15.resolveFailure((java.lang.Throwable)var18);
    org.omg.CORBA.INTERNAL var20 = var1.namingCtxRebindctxAlreadyBound((java.lang.Throwable)var18);
    com.sun.corba.se.impl.logging.NamingSystemException var22 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var24 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var25 = var24.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var26 = var22.resolveFailure((java.lang.Throwable)var25);
    com.sun.corba.se.impl.logging.NamingSystemException var28 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var29 = var28.resolveFailure();
    org.omg.CORBA.BAD_PARAM var30 = var22.insBadAddress((java.lang.Throwable)var29);
    com.sun.corba.se.impl.logging.NamingSystemException var32 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var33 = var32.resolveFailure();
    org.omg.CORBA.UNKNOWN var34 = var22.resolveConversionFailure((java.lang.Throwable)var33);
    com.sun.corba.se.impl.logging.NamingSystemException var36 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var38 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var39 = var38.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var40 = var36.resolveFailure((java.lang.Throwable)var39);
    org.omg.CORBA.INTERNAL var41 = var22.namingCtxRebindctxAlreadyBound((java.lang.Throwable)var39);
    com.sun.corba.se.impl.logging.NamingSystemException var43 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    com.sun.corba.se.impl.logging.NamingSystemException var45 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var46 = var45.transNcListGotExc();
    org.omg.CORBA.UNKNOWN var47 = var43.resolveFailure((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.NamingSystemException var49 = com.sun.corba.se.impl.logging.NamingSystemException.get("hi!");
    org.omg.CORBA.UNKNOWN var50 = var49.resolveFailure();
    org.omg.CORBA.BAD_PARAM var51 = var43.insBadAddress((java.lang.Throwable)var50);
    org.omg.CORBA.INITIALIZE var52 = var22.transNsCannotCreateInitialNc((java.lang.Throwable)var51);
    org.omg.CORBA.INTERNAL var53 = var1.transNcBindAlreadyBound((java.lang.Throwable)var51);
    
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
    assertNotNull(var26);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertNotNull(var53);

  }

}
