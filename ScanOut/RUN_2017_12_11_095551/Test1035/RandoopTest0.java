
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.misc.VMSupport var0 = new sun.misc.VMSupport();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.KeyAgreement var1 = javax.crypto.KeyAgreement.getInstance("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var0 = sun.misc.VMSupport.serializeAgentPropertiesToByteArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var0 = sun.misc.VMSupport.getVMTemporaryDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"+ "'", var0.equals("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var3 = new byte[] { };
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    java.security.cert.Certificate var7 = var0.engineGetCertificate("");
    java.security.cert.Certificate[] var9 = var0.engineGetCertificateChain("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/", "", "/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var3 = new byte[] { };
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    java.util.Date var7 = var0.engineGetCreationDate("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/");
    java.security.cert.Certificate[] var9 = var0.engineGetCertificateChain("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var3 = new byte[] { };
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    java.security.cert.Certificate[] var7 = var0.engineGetCertificateChain("");
    byte[] var12 = new byte[] { (byte)(-1), (byte)0, (byte)0};
    com.sun.crypto.provider.JceKeyStore var13 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var14 = var13.engineAliases();
    byte[] var16 = new byte[] { };
    java.security.cert.Certificate[] var17 = new java.security.cert.Certificate[] { };
    var13.engineSetKeyEntry("", var16, var17);
    java.security.cert.Certificate var20 = var13.engineGetCertificate("");
    com.sun.crypto.provider.JceKeyStore var22 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var23 = var22.engineAliases();
    byte[] var25 = new byte[] { };
    java.security.cert.Certificate[] var26 = new java.security.cert.Certificate[] { };
    var22.engineSetKeyEntry("", var25, var26);
    com.sun.crypto.provider.JceKeyStore var28 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var29 = var28.engineAliases();
    byte[] var31 = new byte[] { };
    java.security.cert.Certificate[] var32 = new java.security.cert.Certificate[] { };
    var28.engineSetKeyEntry("", var31, var32);
    var13.engineSetKeyEntry("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/", var25, var32);
    var0.engineSetKeyEntry("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/", var12, var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.reflect.AccessibleObject[] var1 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var1, false);
    java.lang.Object var4 = var0.get((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var3 = new byte[] { };
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    java.security.cert.Certificate var7 = var0.engineGetCertificate("");
    com.sun.crypto.provider.JceKeyStore var9 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var10 = var9.engineAliases();
    byte[] var12 = new byte[] { };
    java.security.cert.Certificate[] var13 = new java.security.cert.Certificate[] { };
    var9.engineSetKeyEntry("", var12, var13);
    com.sun.crypto.provider.JceKeyStore var15 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var16 = var15.engineAliases();
    byte[] var18 = new byte[] { };
    java.security.cert.Certificate[] var19 = new java.security.cert.Certificate[] { };
    var15.engineSetKeyEntry("", var18, var19);
    var0.engineSetKeyEntry("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/", var12, var19);
    java.security.cert.Certificate var23 = var0.engineGetCertificate("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Method[] var2 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var3 = sun.reflect.Reflection.filterMethods(var1, var2);
    java.lang.annotation.Annotation[] var4 = var1.getDeclaredAnnotations();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class[] var7 = new java.lang.Class[] { var6};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var8 = var1.getDeclaredConstructor(var7);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var3 = new byte[] { };
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    java.security.cert.Certificate var7 = var0.engineGetCertificate("");
    var0.engineDeleteEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Field[] var2 = var1.getFields();
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Field[] var6 = var5.getFields();
    java.lang.Class[] var7 = new java.lang.Class[] { var5};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var8 = var1.getMethod("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/", var7);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();
    com.sun.crypto.provider.JceKeyStore var2 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var3 = var2.engineAliases();
    java.lang.Object var5 = var0.put((java.lang.Object)var2, (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var3 = new byte[] { };
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    java.security.cert.Certificate var7 = var0.engineGetCertificate("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/");
    var0.engineDeleteEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Field[] var2 = var1.getFields();
    java.lang.Class var3 = var1.getComponentType();
    java.lang.String var4 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "sun.reflect.Reflection"+ "'", var4.equals("sun.reflect.Reflection"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Method[] var2 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var3 = sun.reflect.Reflection.filterMethods(var1, var2);
    java.lang.annotation.Annotation[] var4 = var1.getDeclaredAnnotations();
    java.lang.Class var5 = var1.getEnclosingClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Method[] var2 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var3 = sun.reflect.Reflection.filterMethods(var1, var2);
    java.lang.annotation.Annotation[] var4 = var1.getDeclaredAnnotations();
    boolean var5 = var1.isSynthetic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Properties var0 = new java.util.Properties();
    com.sun.crypto.provider.JceKeyStore var1 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var2 = var1.engineAliases();
    byte[] var4 = new byte[] { };
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    var1.engineSetKeyEntry("", var4, var5);
    java.security.cert.Certificate var8 = var1.engineGetCertificate("");
    com.sun.crypto.provider.JceKeyStore var10 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var11 = var10.engineAliases();
    byte[] var13 = new byte[] { };
    java.security.cert.Certificate[] var14 = new java.security.cert.Certificate[] { };
    var10.engineSetKeyEntry("", var13, var14);
    com.sun.crypto.provider.JceKeyStore var16 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var17 = var16.engineAliases();
    byte[] var19 = new byte[] { };
    java.security.cert.Certificate[] var20 = new java.security.cert.Certificate[] { };
    var16.engineSetKeyEntry("", var19, var20);
    var1.engineSetKeyEntry("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/", var13, var20);
    java.lang.Object var23 = var0.remove((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Method[] var2 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var3 = sun.reflect.Reflection.filterMethods(var1, var2);
    java.lang.annotation.Annotation[] var4 = var1.getDeclaredAnnotations();
    java.lang.reflect.Field[] var5 = var1.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

}
