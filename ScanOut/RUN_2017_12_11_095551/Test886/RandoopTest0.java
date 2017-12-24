
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var1 = sun.misc.VMSupport.isClassPathAttributePresent("hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    java.lang.String var4 = var0.getProperty("", "");
    java.util.Properties var5 = new java.util.Properties();
    java.util.Locale var6 = javax.swing.JComponent.getDefaultLocale();
    java.lang.Object var7 = var0.put((java.lang.Object)var5, (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Properties var0 = sun.misc.VMSupport.getAgentProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.misc.VMSupport var0 = new sun.misc.VMSupport();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var1 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, (java.lang.Object)10L);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var0 = sun.misc.VMSupport.serializePropertiesToByteArray();
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


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var3 = new java.util.Properties();
    var3.clear();
    java.lang.String var7 = var3.getProperty("", "");
    boolean var9 = var3.contains((java.lang.Object)1);
    java.util.Properties var10 = new java.util.Properties();
    var10.clear();
    boolean var12 = var3.contains((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var14 = new com.sun.jndi.ldap.LdapCtx("", "hi!", (-1), (java.util.Hashtable)var3, false);
      fail("Expected exception of type javax.naming.CommunicationException");
    } catch (javax.naming.CommunicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.containsValue((java.lang.Object)1.0f);
    java.util.Properties var3 = new java.util.Properties(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl var0 = new com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl();
    int var1 = var0.getTransletIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.ThreadGroup var2 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var4 = new java.lang.Thread("hi!");
    java.lang.Thread var6 = new java.lang.Thread((java.lang.Runnable)var4, "");
    java.lang.Thread[] var7 = new java.lang.Thread[] { var4};
    int var9 = var2.enumerate(var7, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.ExtendedKeyUsageExtension var10 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)true, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    java.lang.String var4 = var0.getProperty("", "");
    boolean var6 = var0.contains((java.lang.Object)1);
    java.util.Properties var7 = new java.util.Properties();
    var7.clear();
    boolean var9 = var0.contains((java.lang.Object)var7);
    javax.naming.NamingException var12 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(10, "");
    java.lang.Object var13 = var0.remove((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    int var3 = var1.getMaxPriority();
    java.lang.Thread var5 = new java.lang.Thread("hi!");
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var5, "");
    java.lang.Thread var10 = new java.lang.Thread(var1, (java.lang.Runnable)var7, "hi!", 0L);
    java.lang.Thread var11 = new java.lang.Thread((java.lang.Runnable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.List var1 = var0.getExtendedKeyUsage();
    java.util.Date var2 = var0.getNotAfter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var6 = new java.lang.Thread("hi!");
    java.lang.Thread var9 = new java.lang.Thread(var4, (java.lang.Runnable)var6, "hi!", 10L);
    java.lang.ThreadGroup[] var10 = new java.lang.ThreadGroup[] { var4};
    int var11 = var1.enumerate(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.util.Properties var1 = new java.util.Properties();
    var1.clear();
    java.lang.String var3 = var1.toString();
    boolean var4 = var0.checkTopLevelWindow((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.ThreadGroup var2 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var4 = new java.lang.Thread("hi!");
    java.lang.Thread var7 = new java.lang.Thread(var2, (java.lang.Runnable)var4, "hi!", 10L);
    boolean var8 = var0.checkTopLevelWindow((java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkExec("{}");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    var1.stop();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

}
