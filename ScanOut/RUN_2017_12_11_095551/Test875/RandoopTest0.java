
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), (-1));
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
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var5 = new java.util.Hashtable(0, 100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var7 = new com.sun.jndi.ldap.LdapCtx("", "", 10, var5, false);
      fail("Expected exception of type javax.naming.CommunicationException");
    } catch (javax.naming.CommunicationException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    char[] var7 = new char[] { '#'};
    java.security.Key var8 = var0.engineGetKey("", var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var5 = var2.remove((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var3 = new javax.management.MBeanConstructorInfo("", "hi!", var2);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "javax.management.MBeanConstructorInfo[description=hi!, name=, signature=[], descriptor={}]"+ "'", var4.equals("javax.management.MBeanConstructorInfo[description=hi!, name=, signature=[], descriptor={}]"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    boolean var6 = var0.engineIsKeyEntry("");
    var0.engineDeleteEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var2 = var0.listIterator(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.remove(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.equals((java.lang.Object)10.0d);
    java.util.Vector var3 = new java.util.Vector();
    boolean var5 = var3.equals((java.lang.Object)10.0d);
    boolean var6 = var0.removeAll((java.util.Collection)var3);
    int var8 = var3.lastIndexOf((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 1);
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("", "javax.management.MBeanConstructorInfo[description=hi!, name=, signature=[], descriptor={}]", var4, "", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.lang.annotation.Annotation[] var3 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.util.Hashtable var5 = new java.util.Hashtable(1);
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var5);
    java.util.Enumeration var7 = var6.keys();
    var1.putAll((java.util.Map)var6);
    com.sun.crypto.provider.JceKeyStore var9 = new com.sun.crypto.provider.JceKeyStore();
    boolean var11 = var9.engineContainsAlias("");
    java.security.cert.Certificate var13 = var9.engineGetCertificate("");
    boolean var15 = var9.engineContainsAlias("");
    java.lang.Object var16 = var6.remove((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    byte[] var7 = new byte[] { (byte)0, (byte)(-1), (byte)0};
    java.security.cert.Certificate[] var8 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var7, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 1);
    java.lang.reflect.AccessibleObject[] var6 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var6, false);
    boolean var9 = var5.equals((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    boolean var4 = var0.engineContainsAlias("javax.management.MBeanConstructorInfo[description=hi!, name=, signature=[], descriptor={}]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 1);
    java.lang.Object var6 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.lang.reflect.AccessibleObject[] var3 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var3, false);
    java.lang.Object var7 = var2.put((java.lang.Object)false, (java.lang.Object)(short)(-1));
    boolean var9 = var2.equals((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(100, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    boolean var6 = var0.engineContainsAlias("");
    boolean var8 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.equals((java.lang.Object)10.0d);
    java.util.Vector var3 = new java.util.Vector();
    boolean var5 = var3.equals((java.lang.Object)10.0d);
    boolean var6 = var0.removeAll((java.util.Collection)var3);
    boolean var7 = var3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.util.Enumeration var3 = var2.keys();
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.equals((java.lang.Object)10.0d);
    java.util.Vector var3 = new java.util.Vector();
    boolean var5 = var3.equals((java.lang.Object)10.0d);
    boolean var6 = var0.removeAll((java.util.Collection)var3);
    java.util.Vector var7 = new java.util.Vector();
    boolean var9 = var7.equals((java.lang.Object)10.0d);
    java.util.Vector var10 = new java.util.Vector();
    boolean var12 = var10.equals((java.lang.Object)10.0d);
    boolean var13 = var7.removeAll((java.util.Collection)var10);
    boolean var14 = var0.addAll((java.util.Collection)var10);
    int var15 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.lang.annotation.Annotation[] var3 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.util.Hashtable var5 = new java.util.Hashtable(1);
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var5);
    java.util.Enumeration var7 = var6.keys();
    var1.putAll((java.util.Map)var6);
    java.util.Hashtable var10 = new java.util.Hashtable(1);
    java.util.Hashtable var11 = new java.util.Hashtable((java.util.Map)var10);
    var6.putAll((java.util.Map)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.lang.annotation.Annotation[] var3 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
