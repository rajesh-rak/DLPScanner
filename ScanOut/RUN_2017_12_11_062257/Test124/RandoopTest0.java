
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.AlgorithmParameters var2 = java.security.AlgorithmParameters.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders("");
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.Security.removeProvider("hi!");

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.Security.removeProvider("");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.misc.JarIndex var0 = new sun.misc.JarIndex();
    var0.add("", "");

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isBlockOrSF("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var1 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var2 = java.net.InetAddress.getByAddress("{}", var1);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.misc.JarIndex var0 = new sun.misc.JarIndex();
    java.lang.String[] var1 = var0.getJarFiles();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.pkcs.PKCS9Attribute[] var0 = new sun.security.pkcs.PKCS9Attribute[] { };
    sun.security.pkcs.PKCS9Attributes var1 = new sun.security.pkcs.PKCS9Attributes(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isLinkLocalAddress();
    java.lang.String var2 = var0.getHostName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "localhost"+ "'", var2.equals("localhost"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getEncAlgFromSigAlg("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    byte[] var2 = new byte[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var3 = java.net.InetAddress.getByAddress("127.0.0.1", var2);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    byte[] var1 = var0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostName();
    boolean var2 = var0.isMCSiteLocal();
    boolean var3 = var0.isMCSiteLocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "localhost"+ "'", var1.equals("localhost"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.security.Provider[] var2 = java.security.Security.getProviders((java.util.Map)var0);
    boolean var4 = var0.contains((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.lang.Object var3 = var0.remove((java.lang.Object)1);
    java.net.InetAddress var4 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var5 = var4.getHostName();
    java.lang.Object var7 = var0.put((java.lang.Object)var4, (java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "localhost"+ "'", var5.equals("localhost"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.security.Provider[] var2 = java.security.Security.getProviders((java.util.Map)var0);
    java.util.Hashtable var3 = new java.util.Hashtable();
    java.lang.String var4 = var3.toString();
    java.util.Hashtable var5 = new java.util.Hashtable((java.util.Map)var3);
    boolean var6 = var0.contains((java.lang.Object)var3);
    boolean var8 = var0.contains((java.lang.Object)"127.0.0.1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var1 = java.net.InetAddress.getByName("{}");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.JarIndex var2 = new sun.misc.JarIndex(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("{}", "localhost");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("127.0.0.1", "{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostName();
    boolean var2 = var0.isMCSiteLocal();
    boolean var3 = var0.isLinkLocalAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "localhost"+ "'", var1.equals("localhost"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.util.Enumeration var2 = var0.elements();
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getStandardDigestName("127.0.0.1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCOrgLocal();
    boolean var2 = var0.isMCOrgLocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
