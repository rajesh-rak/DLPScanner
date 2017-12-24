
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.net.URL[] var1 = sun.misc.URLClassPath.pathToURLs("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var2 = new char[] { ' ', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("", 10);
    java.lang.String var3 = var2.toString();
    int var4 = var2.flags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("1.0");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("1.0");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    char[] var2 = new char[] { 'a', '4'};
    java.lang.String var3 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4"+ "'", var3.equals("a4"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.regex.Pattern var1 = java.util.regex.Pattern.compile("hi!");
    java.lang.String[] var3 = var1.split((java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.regex.Pattern var1 = java.util.regex.Pattern.compile("hi!");
    java.util.regex.Matcher var3 = var1.matcher((java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.String.valueOf(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    byte[] var0 = new byte[] { };
    byte[] var1 = sun.net.util.IPAddressUtil.convertFromIPv4MappedAddress(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.URL[] var1 = sun.misc.URLClassPath.pathToURLs("100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv6LiteralAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    char[] var2 = new char[] { '4', '4'};
    java.lang.String var3 = new java.lang.String(var2);
    java.lang.String var4 = java.lang.String.copyValueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "44"+ "'", var3.equals("44"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "44"+ "'", var4.equals("44"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    byte[] var1 = sun.net.util.IPAddressUtil.textToNumericFormatV4("44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    int[] var2 = new int[] { 1, (-1)};
    java.lang.String var5 = new java.lang.String(var2, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)1};
    java.lang.String var5 = new java.lang.String(var3, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u640A\u6401\u6401"+ "'", var5.equals("\u640A\u6401\u6401"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv4LiteralAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    var2.setContentType("\u640A\u6401\u6401");

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.net.util.IPAddressUtil var0 = new sun.net.util.IPAddressUtil();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("false", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("\u640A\u6401\u6401");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Q\u640A\u6401\u6401\\E"+ "'", var1.equals("\\Q\u640A\u6401\u6401\\E"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("\\Q\u640A\u6401\u6401\\E", "null/null");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("false", "a4");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();
    boolean var1 = var0.acceptFastInfoset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();
    var0.setLazyAttachments(false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    java.lang.String var3 = var2.getBaseType();
    javax.xml.soap.AttachmentPart var6 = var2.createAttachmentPart((java.lang.Object)100.0d, "\\Q\u640A\u6401\u6401\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null/null"+ "'", var3.equals("null/null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    byte[] var1 = sun.net.util.IPAddressUtil.textToNumericFormatV6("false");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("\u640A\u6401\u6401");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    javax.xml.soap.MimeHeaders var3 = var2.getMimeHeaders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.regex.Pattern var1 = java.util.regex.Pattern.compile("hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finest("\u640A\u6401\u6401");
    java.util.logging.Logger var3 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    char[] var1 = new char[] { ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = java.lang.String.valueOf(var1, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();
    java.util.logging.Logger var1 = java.util.logging.Logger.getGlobal();
    javax.xml.soap.AttachmentPart var3 = var0.createAttachmentPart((java.lang.Object)var1, "\u640A\u6401\u6401");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();
    javax.xml.soap.SOAPBody var1 = var0.getSOAPBody();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
