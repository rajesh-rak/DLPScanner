
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.SecurityException var1 = new java.lang.SecurityException();
    java.lang.Exception var2 = new java.lang.Exception("", (java.lang.Throwable)var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getAction();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.entering("", "");
    java.lang.RuntimeException var6 = new java.lang.RuntimeException();
    java.lang.Exception var7 = new java.lang.Exception((java.lang.Throwable)var6);
    var0.throwing("hi!", "", (java.lang.Throwable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator(' ');
    var0.setGroupingSeparator('a');
    java.lang.String var5 = var0.getInternationalCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "INR"+ "'", var5.equals("INR"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("INR", "hi!", (java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator(' ');
    var0.setGroupingSeparator('a');
    java.lang.String var5 = var0.getExponentSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "E"+ "'", var5.equals("E"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    java.lang.String var3 = var2.getContentDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setNaN("hi!");
    var0.setDecimalSeparator('a');

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.fine("INR");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.io.PrintStream var1 = new java.io.PrintStream("INR");
    var1.println((-1));
    var1.println(100.0f);
    char[] var9 = new char[] { 'a', 'a', '4'};
    var1.println(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    javax.xml.soap.SOAPBody var3 = var2.getSOAPBody();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.getCharset();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator(' ');
    var0.setGroupingSeparator('a');
    char var5 = var0.getGroupingSeparator();
    char var6 = var0.getPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '%');

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    javax.xml.soap.SOAPBody var3 = var2.getSOAPBody();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.getAction();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    javax.xml.soap.SOAPHeader var3 = var2.getSOAPHeader();
    java.lang.SecurityException var4 = new java.lang.SecurityException();
    javax.xml.soap.AttachmentPart var6 = var2.createAttachmentPart((java.lang.Object)var4, "");
    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var7 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl((javax.xml.soap.SOAPMessage)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    javax.xml.soap.SOAPHeader var3 = var2.getSOAPHeader();
    java.lang.SecurityException var4 = new java.lang.SecurityException();
    javax.xml.soap.AttachmentPart var6 = var2.createAttachmentPart((java.lang.Object)var4, "");
    javax.xml.soap.AttachmentPart var7 = var2.createAttachmentPart();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    javax.xml.soap.SOAPHeader var3 = var2.getSOAPHeader();
    java.lang.SecurityException var4 = new java.lang.SecurityException();
    javax.xml.soap.AttachmentPart var6 = var2.createAttachmentPart((java.lang.Object)var4, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var2.getCharset();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.SecurityException var1 = new java.lang.SecurityException();
    java.lang.Exception var2 = new java.lang.Exception((java.lang.Throwable)var1);
    java.lang.Throwable var3 = new java.lang.Throwable((java.lang.Throwable)var2);
    java.lang.RuntimeException var4 = new java.lang.RuntimeException("hi!", var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.entering("", "");
    java.util.logging.Logger var4 = var0.getParent();
    java.util.logging.Handler[] var5 = var4.getHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    javax.xml.soap.SOAPHeader var3 = var2.getSOAPHeader();
    java.lang.SecurityException var4 = new java.lang.SecurityException();
    javax.xml.soap.AttachmentPart var6 = var2.createAttachmentPart((java.lang.Object)var4, "");
    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var9 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, true);
    javax.xml.soap.SOAPHeader var10 = var9.getSOAPHeader();
    java.lang.SecurityException var11 = new java.lang.SecurityException();
    javax.xml.soap.AttachmentPart var13 = var9.createAttachmentPart((java.lang.Object)var11, "");
    var2.addAttachmentPart(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Formatter var1 = new java.util.Formatter("INR");
    var1.close();
    var1.close();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.PrintStream var1 = new java.io.PrintStream("INR");
    var1.println((-1));
    var1.println(100.0f);
    var1.write(10);
    java.util.Locale[] var9 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    java.io.PrintStream var10 = var1.format("INR", (java.lang.Object[])var9);
    var10.print('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

}
