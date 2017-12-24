
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var3 = new byte[] { (byte)(-1), (byte)1, (byte)1};
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

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var3 = new byte[] { (byte)(-1), (byte)(-1), (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, 100, 1, "hi!");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Qhi!\\E"+ "'", var1.equals("\\Qhi!\\E"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.font.FontFamily var4 = new sun.font.FontFamily("\\Qhi!\\E", true, 10);
    java.lang.Object[] var5 = new java.lang.Object[] { var4};
    java.lang.String var6 = java.lang.String.format(" ##", var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ##"+ "'", var6.equals(" ##"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("", 10);
    java.lang.String[] var5 = var2.split((java.lang.CharSequence)"", 10);
    java.lang.String[] var8 = var2.split((java.lang.CharSequence)"hi!", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var3 = new char[] { 'a', 'a', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var3, 10, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.font.FontFamily var3 = new sun.font.FontFamily("\\Qhi!\\E", true, 10);
    sun.font.Font2D var5 = var3.getFontWithExactStyleMatch(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("Font family: \\Qhi!\\E plain=null bold=null italic=null bolditalic=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\QFont family: \\Qhi!\\E\\\\E\\Q plain=null bold=null italic=null bolditalic=null\\E"+ "'", var1.equals("\\QFont family: \\Qhi!\\E\\\\E\\Q plain=null bold=null italic=null bolditalic=null\\E"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.font.FontFamily var1 = sun.font.FontFamily.getFamily("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.lang.String.valueOf(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.io.InputStream var2 = java.lang.ClassLoader.getSystemResourceAsStream("");
    char[] var6 = new char[] { ' ', '#', '#'};
    java.lang.String var7 = java.lang.String.valueOf(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.engineLoad(var2, var6);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ##"+ "'", var7.equals(" ##"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.font.FontFamily var1 = sun.font.FontFamily.getLocaleFamily("\\Qhi!\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)"1.0");
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    java.net.URL var3 = var0.getResource("\\Qhi!\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.lang.ClassLoader var2 = java.lang.ClassLoader.getSystemClassLoader();
    java.io.InputStream var4 = var2.getResourceAsStream("hi!");
    var2.setDefaultAssertionStatus(false);
    java.lang.Class[] var7 = new java.lang.Class[] { };
    java.lang.Class var8 = java.lang.reflect.Proxy.getProxyClass(var2, var7);
    boolean var9 = var0.engineEntryInstanceOf("1", var8);
    var0.engineDeleteEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = java.lang.String.copyValueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("", "", var4);
    java.lang.String var6 = var5.getName();
    javax.management.MBeanParameterInfo[] var7 = var5.getSignature();
    java.lang.annotation.Annotation[] var8 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var9 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var8);
    javax.management.MBeanConstructorInfo var10 = new javax.management.MBeanConstructorInfo("\\Qhi!\\E", "", var7, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.lang.ClassLoader var2 = java.lang.ClassLoader.getSystemClassLoader();
    java.io.InputStream var4 = var2.getResourceAsStream("hi!");
    var2.setDefaultAssertionStatus(false);
    java.lang.Class[] var7 = new java.lang.Class[] { };
    java.lang.Class var8 = java.lang.reflect.Proxy.getProxyClass(var2, var7);
    boolean var9 = var0.engineEntryInstanceOf("1", var8);
    java.security.cert.Certificate var11 = var0.engineGetCertificate("Font family: \\Qhi!\\E plain=null bold=null italic=null bolditalic=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.lang.ClassLoader var2 = java.lang.ClassLoader.getSystemClassLoader();
    java.io.InputStream var4 = var2.getResourceAsStream("hi!");
    var2.setDefaultAssertionStatus(false);
    java.lang.Class[] var7 = new java.lang.Class[] { };
    java.lang.Class var8 = java.lang.reflect.Proxy.getProxyClass(var2, var7);
    boolean var9 = var0.engineEntryInstanceOf("1", var8);
    boolean var10 = java.lang.reflect.Proxy.isProxyClass(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.MBeanInfo var11 = com.sun.jmx.mbeanserver.Introspector.testCompliance(var8);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.font.FontFamily var3 = new sun.font.FontFamily("\\Qhi!\\E", true, 10);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Font family: \\Qhi!\\E plain=null bold=null italic=null bolditalic=null"+ "'", var4.equals("Font family: \\Qhi!\\E plain=null bold=null italic=null bolditalic=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Font family: \\Qhi!\\E plain=null bold=null italic=null bolditalic=null"+ "'", var5.equals("Font family: \\Qhi!\\E plain=null bold=null italic=null bolditalic=null"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.lang.ClassLoader var2 = java.lang.ClassLoader.getSystemClassLoader();
    java.io.InputStream var4 = var2.getResourceAsStream("hi!");
    var2.setDefaultAssertionStatus(false);
    java.lang.Class[] var7 = new java.lang.Class[] { };
    java.lang.Class var8 = java.lang.reflect.Proxy.getProxyClass(var2, var7);
    boolean var9 = var0.engineEntryInstanceOf("1", var8);
    char[] var14 = new char[] { ' ', '#', '#'};
    java.lang.String var15 = java.lang.String.valueOf(var14);
    java.security.Key var16 = var0.engineGetKey("0.0", var14);
    java.io.InputStream var18 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    char[] var22 = new char[] { ' ', '#', '#'};
    java.lang.String var23 = java.lang.String.valueOf(var22);
    java.lang.String var26 = new java.lang.String(var22, 0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.engineLoad(var18, var22);
      fail("Expected exception of type java.io.EOFException");
    } catch (java.io.EOFException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + " ##"+ "'", var15.equals(" ##"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + " ##"+ "'", var23.equals(" ##"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.net.util.IPAddressUtil var0 = new sun.net.util.IPAddressUtil();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.font.FontFamily var3 = new sun.font.FontFamily("", true, 1);

  }

}
