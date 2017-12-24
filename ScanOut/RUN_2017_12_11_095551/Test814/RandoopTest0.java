
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var3 = new java.util.Hashtable(10, 100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var4 = javax.management.ObjectName.getInstance("hi!", var3);
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.set("", (java.lang.Object)(-1L));
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.remove(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var4 = var2.isEmpty();
    int var6 = var2.lastIndexOf((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var3 = new java.util.Hashtable(10, 100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var4 = new javax.management.ObjectName("hi!", var3);
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = new javax.management.ObjectName("hi!");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var5 = var2.remove((java.lang.Object)true);
    java.util.Vector var8 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var9 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var8);
    boolean var10 = var8.isEmpty();
    boolean var11 = var2.removeAll((java.util.Collection)var8);
    java.util.ListIterator var13 = var2.listIterator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var5 = var2.remove((java.lang.Object)true);
    java.util.Vector var8 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var9 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var8);
    boolean var10 = var8.isEmpty();
    boolean var11 = var2.removeAll((java.util.Collection)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)(short)100, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var3 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var3);
    boolean var5 = var3.isEmpty();
    java.util.Iterator var6 = var3.iterator();
    sun.security.x509.ExtendedKeyUsageExtension var7 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.ExtendedKeyUsageExtension var8 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = javax.management.ObjectName.unquote("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var4 = var2.isEmpty();
    java.util.Iterator var5 = var2.iterator();
    sun.security.x509.ExtendedKeyUsageExtension var6 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    java.util.Vector var10 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var11 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var10);
    boolean var13 = var10.remove((java.lang.Object)true);
    boolean var14 = var2.addAll(0, (java.util.Collection)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var5 = var2.remove((java.lang.Object)true);
    java.util.Vector var8 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var9 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var8);
    boolean var10 = var8.isEmpty();
    boolean var11 = var2.removeAll((java.util.Collection)var8);
    var8.trimToSize();
    sun.security.x509.ExtendedKeyUsageExtension var13 = new sun.security.x509.ExtendedKeyUsageExtension(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var5 = var2.remove((java.lang.Object)true);
    java.util.Vector var8 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var9 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var8);
    boolean var10 = var8.isEmpty();
    boolean var11 = var2.removeAll((java.util.Collection)var8);
    var8.trimToSize();
    boolean var14 = var8.removeElement((java.lang.Object)(byte)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var8.elementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var5 = var2.remove((java.lang.Object)true);
    java.util.Vector var8 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var9 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var8);
    boolean var10 = var8.isEmpty();
    boolean var11 = var2.removeAll((java.util.Collection)var8);
    var8.trimToSize();
    boolean var14 = var8.removeElement((java.lang.Object)(byte)10);
    java.util.Vector var17 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var18 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var17);
    java.lang.Object var19 = var17.clone();
    boolean var20 = var8.add(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var5 = var2.remove((java.lang.Object)true);
    java.util.Vector var8 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var9 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var8);
    boolean var10 = var8.isEmpty();
    boolean var11 = var2.removeAll((java.util.Collection)var8);
    var8.trimToSize();
    boolean var14 = var8.removeElement((java.lang.Object)(byte)10);
    java.util.Vector var15 = new java.util.Vector((java.util.Collection)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var4 = var2.isEmpty();
    java.util.Iterator var5 = var2.iterator();
    java.lang.Object var6 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var4 = var2.isEmpty();
    java.util.Iterator var5 = var2.iterator();
    sun.security.x509.ExtendedKeyUsageExtension var6 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    boolean var7 = var6.isCritical();
    byte[] var8 = var6.getExtensionValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var6.get("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var4 = var2.isEmpty();
    java.util.Iterator var5 = var2.iterator();
    sun.security.x509.ExtendedKeyUsageExtension var6 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    int var7 = var2.capacity();
    java.lang.Object[] var9 = new java.lang.Object[] { 100};
    var2.copyInto(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("");

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)'#');
    var2.clear();
    java.util.Hashtable var8 = new java.util.Hashtable(10, 100.0f);
    java.lang.Object var10 = var8.remove((java.lang.Object)'#');
    var2.putAll((java.util.Map)var8);
    java.util.Hashtable var12 = new java.util.Hashtable((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var2 = sun.security.x509.X509CertImpl.isSelfSigned((java.security.cert.X509Certificate)var0, "hi!");

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


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

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var4 = var2.isEmpty();
    java.util.Iterator var5 = var2.iterator();
    sun.security.x509.ExtendedKeyUsageExtension var6 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    java.util.Iterator var7 = var2.iterator();
    java.lang.String var8 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var5 = new java.util.Hashtable(10, 100.0f);
    java.lang.Object var7 = var5.remove((java.lang.Object)'#');
    var5.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var10 = new com.sun.jndi.ldap.LdapCtx("", "", 100, var5, false);
      fail("Expected exception of type javax.naming.CommunicationException");
    } catch (javax.naming.CommunicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var2 = new java.util.Vector(100);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var2);
    boolean var5 = var3.equals((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

}
