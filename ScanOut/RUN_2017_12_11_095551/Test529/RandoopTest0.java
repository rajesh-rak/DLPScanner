
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getEncAlgFromSigAlg("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.Security.setProperty("", "");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.AlgorithmParameters var2 = java.security.AlgorithmParameters.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.AlgorithmId var1 = sun.security.x509.AlgorithmId.getAlgorithmId("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var3 = var1.getSchemaClassDefinition("hi!");
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl var0 = new com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl();
    javax.xml.transform.Transformer var1 = var0.newTransformer();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders("hi!");
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.Security.removeProvider("hi!");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.destroySubcontext("");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(1, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    javax.naming.NameParser var3 = var1.getNameParser("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.lang.Object var4 = var1.put((java.lang.Object)(byte)100, (java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl var0 = new com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl();
    com.sun.org.apache.xalan.internal.xsltc.DOM var1 = var0.getStylesheetDOM();
    java.util.Properties var2 = var0.getOutputProperties();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    var1.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var4 = var1.getSchema("hi!");
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getStandardDigestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    javax.naming.directory.Attributes var3 = var1.getAttributes("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var5 = var1.getSchemaClassDefinition("hi!");
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    javax.naming.directory.Attributes var3 = var1.getAttributes("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var5 = var1.getSchema("");
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    var1.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var1.getNameInNamespace();
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var4 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    javax.naming.directory.Attributes var6 = var4.getAttributes("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var7 = var1.createSubcontext("", var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    javax.naming.Context var3 = var1.createSubcontext("hi!");
    var1.setIgnoreCase(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.lang.Object var3 = var1.get((java.lang.Object)"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var4 = javax.naming.spi.NamingManager.getInitialContext(var1);
      fail("Expected exception of type javax.naming.NoInitialContextException");
    } catch (javax.naming.NoInitialContextException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.lang.Object var3 = var1.get((java.lang.Object)"");
    java.util.Hashtable var5 = new java.util.Hashtable(1);
    int var6 = var5.size();
    java.lang.Object var7 = var5.clone();
    var1.putAll((java.util.Map)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    javax.naming.directory.Attributes var3 = var1.getAttributes("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.lookupLink("hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.String var2 = sun.security.x509.AlgorithmId.makeSigAlg("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "with"+ "'", var2.equals("with"));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    int var2 = var1.size();
    java.util.Hashtable var3 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.util.Collection var4 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var5 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);
    javax.naming.directory.Attributes var7 = var5.getAttributes("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.modifyAttributes("", 0, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("", "with", "with");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl var0 = new com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl();
    com.sun.org.apache.xalan.internal.xsltc.DOM var1 = var0.getStylesheetDOM();
    com.sun.org.apache.xalan.internal.xsltc.DOM var2 = var0.getStylesheetDOM();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

}
