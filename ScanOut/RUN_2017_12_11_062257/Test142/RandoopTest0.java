
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)1};
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

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var3 = new char[] { 'a', '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, (-1), 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.propertyNames();
    java.util.Enumeration var2 = var0.propertyNames();
    char[] var5 = new char[] { ' ', '4'};
    java.lang.String var8 = java.lang.String.valueOf(var5, 0, 0);
    boolean var9 = var0.containsValue((java.lang.Object)var5);
    java.lang.String var10 = java.lang.String.valueOf(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var13 = java.lang.String.copyValueOf(var5, 100, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " 4"+ "'", var10.equals(" 4"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.parseObject("10");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv4LiteralAddress("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();
    var0.setLenient(true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    boolean var2 = java.util.regex.Pattern.matches("4", (java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.propertyNames();
    java.util.Enumeration var2 = var0.propertyNames();
    java.lang.String var3 = java.lang.String.valueOf((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SunJCE version 1.7"+ "'", var3.equals("SunJCE version 1.7"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var1 = sun.net.util.IPAddressUtil.textToNumericFormatV4(" 4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();
    java.text.DateFormatSymbols var1 = var0.getDateFormatSymbols();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.format((java.lang.Object)"");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();
    java.text.SimpleDateFormat var1 = new java.text.SimpleDateFormat();
    java.text.DateFormatSymbols var2 = var1.getDateFormatSymbols();
    var0.setDateFormatSymbols(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();
    java.text.DateFormatSymbols var1 = var0.getDateFormatSymbols();
    java.text.NumberFormat var2 = var0.getNumberFormat();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.propertyNames();
    java.util.Enumeration var2 = var0.propertyNames();
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.propertyNames();
    java.util.Enumeration var2 = var0.propertyNames();
    char[] var5 = new char[] { ' ', '4'};
    java.lang.String var8 = java.lang.String.valueOf(var5, 0, 0);
    boolean var9 = var0.containsValue((java.lang.Object)var5);
    java.lang.String var10 = java.lang.String.copyValueOf(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " 4"+ "'", var10.equals(" 4"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();
    var0.setLenient(false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.net.util.IPAddressUtil var0 = new sun.net.util.IPAddressUtil();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.text.DateFormat var0 = java.text.DateFormat.getDateTimeInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.text.DateFormat var0 = java.text.DateFormat.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.invalidTaggedProfile();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.OBJECT_NOT_EXIST var5 = var4.dynAnyDestroyed();
    com.sun.crypto.provider.SunJCE var6 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var7 = var6.propertyNames();
    java.util.Enumeration var8 = var6.propertyNames();
    java.lang.String var11 = var6.getProperty("", "hi!");
    java.lang.Object var14 = var6.setProperty(" 4", "4");
    org.omg.CORBA.MARSHAL var15 = var1.badCodebaseIndirection((java.lang.Throwable)var5, (java.lang.Object)" 4");
    org.omg.CORBA.NO_IMPLEMENT var16 = var1.contextNotImplemented();
    java.text.SimpleDateFormat var17 = new java.text.SimpleDateFormat();
    org.omg.CORBA.MARSHAL var18 = var1.invalidIndirection((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var4 = var3.invalidTaggedProfile();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.OBJECT_NOT_EXIST var7 = var6.dynAnyDestroyed();
    com.sun.crypto.provider.SunJCE var8 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var9 = var8.propertyNames();
    java.util.Enumeration var10 = var8.propertyNames();
    java.lang.String var13 = var8.getProperty("", "hi!");
    java.lang.Object var16 = var8.setProperty(" 4", "4");
    org.omg.CORBA.MARSHAL var17 = var3.badCodebaseIndirection((java.lang.Throwable)var7, (java.lang.Object)" 4");
    org.omg.CORBA.INTERNAL var18 = var1.badServantReadObject((java.lang.Throwable)var17);
    org.omg.CORBA.COMM_FAILURE var20 = var1.selectionKeyInvalid((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.OBJECT_NOT_EXIST var2 = var1.dynAnyDestroyed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.OBJECT_NOT_EXIST var5 = var4.dynAnyDestroyed();
    org.omg.CORBA.INTERNAL var6 = var1.serverScTempSize((java.lang.Throwable)var5);
    
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

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.propertyNames();
    java.util.Set var2 = var0.entrySet();
    java.lang.Object var5 = var0.setProperty("4", "hi!");
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    int var1 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.invalidTaggedProfile();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.OBJECT_NOT_EXIST var5 = var4.dynAnyDestroyed();
    com.sun.crypto.provider.SunJCE var6 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var7 = var6.propertyNames();
    java.util.Enumeration var8 = var6.propertyNames();
    java.lang.String var11 = var6.getProperty("", "hi!");
    java.lang.Object var14 = var6.setProperty(" 4", "4");
    org.omg.CORBA.MARSHAL var15 = var1.badCodebaseIndirection((java.lang.Throwable)var5, (java.lang.Object)" 4");
    java.text.SimpleDateFormat var16 = new java.text.SimpleDateFormat();
    java.text.DateFormatSymbols var17 = var16.getDateFormatSymbols();
    java.text.SimpleDateFormat var18 = new java.text.SimpleDateFormat();
    java.text.DateFormatSymbols var19 = var18.getDateFormatSymbols();
    var16.setDateFormatSymbols(var19);
    com.sun.crypto.provider.SunJCE var21 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var22 = var21.propertyNames();
    java.util.Enumeration var23 = var21.propertyNames();
    char[] var26 = new char[] { ' ', '4'};
    java.lang.String var29 = java.lang.String.valueOf(var26, 0, 0);
    boolean var30 = var21.containsValue((java.lang.Object)var26);
    java.util.Enumeration var31 = var21.elements();
    org.omg.CORBA.MARSHAL var32 = var1.badChunkLength((java.lang.Object)var16, (java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

}
