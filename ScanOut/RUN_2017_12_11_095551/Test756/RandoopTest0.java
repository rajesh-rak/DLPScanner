
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#"+ "'", var1.equals("#"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X500Name var2 = new sun.security.x509.X500Name("#", "#");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var2 = new byte[] { (byte)1, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 0, 1, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var1 = new char[] { '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = java.lang.String.copyValueOf(var1, 1, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X500Name var2 = new sun.security.x509.X500Name("10", "#");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.x509.X500Name var4 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.util.List var5 = var4.rdns();
    java.lang.String var6 = var4.getGivenName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X500Name var2 = new sun.security.x509.X500Name("CN=hi!, OU=hi!, O=, C=", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.x509.X500Name var4 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.lang.String var5 = var4.getRFC2253CanonicalName();
    java.lang.String var6 = var4.getCommonName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "cn=hi!,ou=hi!,o=,c="+ "'", var5.equals("cn=hi!,ou=hi!,o=,c="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isSigningRelated("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = new java.lang.String(var0);
    java.lang.String var2 = java.lang.String.copyValueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.security.util.ObjectIdentifier var1 = sun.security.pkcs.PKCS9Attribute.getOID("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.x509.X500Name var4 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.lang.String var5 = var4.getName();
    int var6 = var4.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "CN=hi!, OU=hi!, O=, C="+ "'", var5.equals("CN=hi!, OU=hi!, O=, C="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isBlockOrSF("CN=hi!, OU=hi!, O=, C=");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X500Name var4 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.util.List var5 = var4.rdns();
    int var6 = var4.avaSize();
    int var7 = var4.subtreeDepth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = java.lang.String.valueOf(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X500Name var4 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.lang.String var5 = var4.getDomain();
    com.sun.crypto.provider.SunJCE var6 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var9 = var6.setProperty("10", "hi!");
    java.lang.String var10 = var4.getRFC2253Name((java.util.Map)var6);
    java.lang.String var11 = var4.getRFC1779Name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "CN=hi!,OU=hi!,O=,C="+ "'", var10.equals("CN=hi!,OU=hi!,O=,C="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "CN=hi!, OU=hi!, O=, C="+ "'", var11.equals("CN=hi!, OU=hi!, O=, C="));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.RDN var1 = new sun.security.x509.RDN("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.x509.X500Name var4 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.lang.String var5 = var4.getDomain();
    java.lang.String var6 = var4.getRFC1779Name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "CN=hi!, OU=hi!, O=, C="+ "'", var6.equals("CN=hi!, OU=hi!, O=, C="));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.RDN[] var0 = new sun.security.x509.RDN[] { };
    sun.security.x509.X500Name var1 = new sun.security.x509.X500Name(var0);
    java.lang.String var2 = var1.getGeneration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var3 = new byte[] { (byte)1, (byte)0, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X500Name var4 = new sun.security.x509.X500Name(var3);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var1 = java.lang.String.valueOf(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    int var1 = var0.size();
    sun.security.x509.X500Name var7 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.lang.String var8 = var7.getDomain();
    com.sun.crypto.provider.SunJCE var9 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var12 = var9.setProperty("10", "hi!");
    java.lang.String var13 = var7.getRFC2253Name((java.util.Map)var9);
    com.sun.crypto.provider.SunJCE var14 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var17 = var14.setProperty("10", "hi!");
    var9.putAll((java.util.Map)var14);
    java.lang.Object var19 = var0.put((java.lang.Object)false, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "CN=hi!,OU=hi!,O=,C="+ "'", var13.equals("CN=hi!,OU=hi!,O=,C="));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X500Name var4 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.lang.String var5 = var4.getDomain();
    com.sun.crypto.provider.SunJCE var6 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var9 = var6.setProperty("10", "hi!");
    java.lang.String var10 = var4.getRFC2253Name((java.util.Map)var6);
    com.sun.crypto.provider.SunJCE var11 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var14 = var11.setProperty("10", "hi!");
    var6.putAll((java.util.Map)var11);
    java.util.Set var16 = var6.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "CN=hi!,OU=hi!,O=,C="+ "'", var10.equals("CN=hi!,OU=hi!,O=,C="));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    byte[] var2 = new byte[] { (byte)1, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.pkcs.PKCS7 var3 = new sun.security.pkcs.PKCS7(var2);
      fail("Expected exception of type sun.security.pkcs.ParsingException");
    } catch (sun.security.pkcs.ParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var0, 0, 0, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var3 = var0.setProperty("10", "hi!");
    com.sun.crypto.provider.SunJCE var4 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var7 = var4.put((java.lang.Object)0L, (java.lang.Object)0L);
    var0.putAll((java.util.Map)var4);
    java.util.Set var9 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var3 = var0.put((java.lang.Object)0L, (java.lang.Object)0L);
    java.lang.Object var6 = var0.setProperty("cn=hi!,ou=hi!,o=,c=", "1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.security.x509.X500Name var4 = new sun.security.x509.X500Name("hi!", "hi!", "", "");
    java.lang.String var5 = var4.getDomain();
    com.sun.crypto.provider.SunJCE var6 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var9 = var6.setProperty("10", "hi!");
    java.lang.String var10 = var4.getRFC2253Name((java.util.Map)var6);
    com.sun.crypto.provider.SunJCE var11 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var14 = var11.setProperty("10", "hi!");
    var6.putAll((java.util.Map)var11);
    java.util.Enumeration var16 = var11.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "CN=hi!,OU=hi!,O=,C="+ "'", var10.equals("CN=hi!,OU=hi!,O=,C="));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.String var1 = java.lang.String.valueOf(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100.0"+ "'", var1.equals("100.0"));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    sun.security.x509.AVA[] var0 = new sun.security.x509.AVA[] { };
    sun.security.x509.RDN var1 = new sun.security.x509.RDN(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
