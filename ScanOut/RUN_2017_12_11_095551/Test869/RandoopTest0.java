
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var6 = new java.util.Vector(1, (-1));
    int var7 = var6.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var2.addAll(100, (java.util.Collection)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ObjectId: 2.5.29.37 Criticality=false\nExtendedKeyUsages [\n  \n]\n"+ "'", var4.equals("ObjectId: 2.5.29.37 Criticality=false\nExtendedKeyUsages [\n  \n]\n"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var2.lastIndexOf((java.lang.Object)"ObjectId: 2.5.29.37 Criticality=false\nExtendedKeyUsages [\n  \n]\n", 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("ObjectId: 2.5.29.37 Criticality=false\nExtendedKeyUsages [\n  \n]\n");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, (java.lang.Object)100.0d);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    var2.clear();
    java.util.Vector var7 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var8 = new sun.security.x509.ExtendedKeyUsageExtension(var7);
    var7.clear();
    java.lang.Object[] var10 = new java.lang.Object[] { var7};
    var2.copyInto(var10);
    var2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate[] var2 = var0.engineGetCertificateChain("ObjectId: 2.5.29.37 Criticality=false\nExtendedKeyUsages [\n  \n]\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("ObjectId: 2.5.29.37 Criticality=false\nExtendedKeyUsages [\n  \n]\n");
    boolean var4 = var0.engineIsKeyEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    int var4 = var2.size();
    java.util.Vector var7 = new java.util.Vector(1, (-1));
    int var8 = var7.capacity();
    int var10 = var7.lastIndexOf((java.lang.Object)(short)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)var7, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    var2.clear();
    java.util.Vector var7 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var8 = new sun.security.x509.ExtendedKeyUsageExtension(var7);
    var7.clear();
    java.lang.Object[] var10 = new java.lang.Object[] { var7};
    var2.copyInto(var10);
    java.util.Vector var14 = new java.util.Vector(1, (-1));
    boolean var15 = var2.add((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.util.Vector var4 = new java.util.Vector(1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("", (java.lang.Object)var4);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, (java.lang.Object)'#');
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var3 = var2.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("hi!", 0);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkLink("ObjectId: 2.5.29.37 Criticality=false\nExtendedKeyUsages [\n  \n]\n");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var3 = var2.capacity();
    var2.ensureCapacity((-1));
    boolean var7 = var2.contains((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    sun.security.util.ObjectIdentifier var4 = var3.getExtensionId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    int var4 = var2.size();
    boolean var6 = var2.removeElement((java.lang.Object)"");
    boolean var8 = var2.remove((java.lang.Object)0);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    boolean var12 = var11.isEmpty();
    boolean var14 = var11.remove((java.lang.Object)0L);
    java.lang.Object[] var16 = new java.lang.Object[] { 0L};
    var11.copyInto(var16);
    var2.copyInto(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    java.util.Vector var6 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var7 = new sun.security.x509.ExtendedKeyUsageExtension(var6);
    var6.clear();
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var12 = new sun.security.x509.ExtendedKeyUsageExtension(var11);
    var11.clear();
    java.lang.Object[] var14 = new java.lang.Object[] { var11};
    var6.copyInto(var14);
    boolean var16 = var3.equals((java.lang.Object)var14);
    java.util.Enumeration var17 = var3.getElements();
    java.lang.String var18 = var3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2.5.29.37"+ "'", var18.equals("2.5.29.37"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    var2.clear();
    boolean var5 = var2.isEmpty();
    java.util.List var8 = var2.subList(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    int var4 = var2.size();
    boolean var6 = var2.removeElement((java.lang.Object)"");
    boolean var8 = var2.remove((java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)(short)0, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    boolean var3 = var2.isEmpty();
    boolean var5 = var2.remove((java.lang.Object)0L);
    java.lang.Object[] var7 = new java.lang.Object[] { 0L};
    var2.copyInto(var7);
    int var9 = var2.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

}
