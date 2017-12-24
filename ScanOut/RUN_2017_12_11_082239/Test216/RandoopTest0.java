
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var1 = new byte[] { (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, (-1), 1, "");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)(byte)(-1), "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Qhi!\\E"+ "'", var1.equals("\\Qhi!\\E"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    boolean var2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence)"\\Qhi!\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    char[] var4 = new char[] { };
    java.security.Key var5 = var0.engineGetKey("", var4);
    java.util.Enumeration var6 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Runtime.runFinalizersOnExit(false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Process var3 = var2.start();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.lang.String.valueOf(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    char[] var4 = new char[] { };
    java.security.Key var5 = var0.engineGetKey("", var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var6 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)var0);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.lang.String[] var4 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var5 = new java.lang.ProcessBuilder(var4);
    java.lang.ProcessBuilder.Redirect var6 = var5.redirectOutput();
    java.lang.ProcessBuilder var7 = var2.redirectError(var6);
    java.util.List var8 = var7.command();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("\u0000\u0001\u00FF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Q\u0000\u0001\u00FF\\E"+ "'", var1.equals("\\Q\u0000\u0001\u00FF\\E"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Q10\\E"+ "'", var1.equals("\\Q10\\E"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    boolean var4 = var0.engineContainsAlias("10");
    com.sun.crypto.provider.JceKeyStore var6 = new com.sun.crypto.provider.JceKeyStore();
    var6.engineDeleteEntry("");
    char[] var10 = new char[] { };
    java.security.Key var11 = var6.engineGetKey("", var10);
    java.security.Key var12 = var0.engineGetKey("", var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.lang.ProcessBuilder var3 = var2.inheritIO();
    java.util.List var4 = var2.command();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.lang.String[] var4 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var5 = new java.lang.ProcessBuilder(var4);
    java.lang.ProcessBuilder.Redirect var6 = var5.redirectOutput();
    java.lang.ProcessBuilder var7 = var2.redirectError(var6);
    java.io.File var8 = var7.directory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    int var3 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.lang.String[] var4 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var5 = new java.lang.ProcessBuilder(var4);
    java.lang.ProcessBuilder.Redirect var6 = var5.redirectOutput();
    java.lang.ProcessBuilder var7 = var2.redirectError(var6);
    java.lang.String[] var9 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var10 = new java.lang.ProcessBuilder(var9);
    java.lang.String[] var12 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var13 = new java.lang.ProcessBuilder(var12);
    java.lang.ProcessBuilder.Redirect var14 = var13.redirectOutput();
    java.lang.ProcessBuilder var15 = var10.redirectError(var14);
    java.lang.ProcessBuilder var16 = var2.redirectError(var14);
    java.lang.String[] var18 = new java.lang.String[] { "\\Q\u0000\u0001\u00FF\\E"};
    java.lang.ProcessBuilder var19 = var16.command(var18);
    java.lang.ProcessBuilder.Redirect var20 = var16.redirectInput();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var3 = new javax.management.MBeanConstructorInfo("0.0", "10", var2);
    java.lang.String var4 = var3.getDescription();
    java.lang.Object var5 = var3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10"+ "'", var4.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.lang.ProcessBuilder var3 = var2.inheritIO();
    java.lang.ProcessBuilder.Redirect var4 = var3.redirectError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    boolean var4 = var0.engineContainsAlias("10");
    boolean var6 = var0.engineIsCertificateEntry("\\Q\u0000\u0001\u00FF\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.lang.String[] var4 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var5 = new java.lang.ProcessBuilder(var4);
    java.lang.ProcessBuilder.Redirect var6 = var5.redirectOutput();
    java.lang.ProcessBuilder var7 = var2.redirectError(var6);
    java.lang.String[] var9 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var10 = new java.lang.ProcessBuilder(var9);
    java.lang.String[] var12 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var13 = new java.lang.ProcessBuilder(var12);
    java.lang.ProcessBuilder.Redirect var14 = var13.redirectOutput();
    java.lang.ProcessBuilder var15 = var10.redirectError(var14);
    java.lang.ProcessBuilder var16 = var2.redirectError(var14);
    java.lang.ProcessBuilder var18 = var16.redirectErrorStream(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    java.security.cert.Certificate[] var4 = var0.engineGetCertificateChain("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var3 = new javax.management.MBeanConstructorInfo("0.0", "10", var2);
    java.lang.String var4 = var3.getDescription();
    javax.management.MBeanParameterInfo[] var5 = var3.getSignature();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10"+ "'", var4.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.lang.ProcessBuilder.Redirect var3 = var2.redirectOutput();
    java.lang.ProcessBuilder.Redirect var4 = var2.redirectInput();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Runtime var0 = java.lang.Runtime.getRuntime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    com.sun.crypto.provider.JceKeyStore var4 = new com.sun.crypto.provider.JceKeyStore();
    var4.engineDeleteEntry("");
    char[] var8 = new char[] { };
    java.security.Key var9 = var4.engineGetKey("", var8);
    java.lang.String var10 = java.lang.String.copyValueOf(var8);
    java.security.Key var11 = var0.engineGetKey("hi!", var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = new java.lang.String(var8, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    char[] var4 = new char[] { };
    java.security.Key var5 = var0.engineGetKey("", var4);
    boolean var7 = var0.engineIsKeyEntry("\\Qhi!\\E");
    byte[] var12 = new byte[] { (byte)0, (byte)1, (byte)(-1)};
    java.lang.String var14 = new java.lang.String(var12, 0);
    java.security.cert.Certificate[] var15 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("\u0000\u0001\u00FF", var12, var15);
    int var17 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "\u0000\u0001\u00FF"+ "'", var14.equals("\u0000\u0001\u00FF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

}
