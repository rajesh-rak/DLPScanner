
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.NamingEnumeration var4 = var0.listBindings("hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var2 = var0.getSchemaClassDefinition("");
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.bind("hi!", (java.lang.Object)(short)0);
      fail("Expected exception of type javax.naming.directory.SchemaViolationException");
    } catch (javax.naming.directory.SchemaViolationException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.unbind("hi!/hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    var0.checkPackageDefinition("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("", (-1));
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    java.lang.String var5 = var0.composeName("hi!", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var7 = var0.createSubcontext("");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!/hi!"+ "'", var5.equals("hi!/hi!"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    var0.unbind("hi!");

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("hi!", 1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkExec("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPropertyAccess("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("hi!/hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    var0.checkPackageDefinition("hi!");
    var0.checkPackageDefinition("hi!/hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    java.lang.String var5 = var0.composeName("hi!", "hi!");
    java.util.Hashtable var6 = var0.getEnvironment();
    java.util.Set var7 = var6.entrySet();
    java.util.Hashtable var8 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!/hi!"+ "'", var5.equals("hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    java.lang.String var5 = var0.composeName("hi!", "hi!");
    java.util.Hashtable var6 = var0.getEnvironment();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.Attributes var8 = var0.getAttributes("hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!/hi!"+ "'", var5.equals("hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSecurityAccess("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    var0.checkPackageDefinition("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkLink("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    var0.checkPackageDefinition("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    java.lang.String var5 = var0.composeName("hi!", "hi!");
    java.util.Hashtable var6 = var0.getEnvironment();
    java.util.Enumeration var7 = var6.keys();
    java.lang.Object var8 = var6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!/hi!"+ "'", var5.equals("hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    var0.checkPackageDefinition("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    java.lang.String var5 = var0.composeName("hi!", "hi!");
    var0.unbind("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.lookup("hi!/hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!/hi!"+ "'", var5.equals("hi!/hi!"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSetFactory();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var1.setIgnoreCase(true);
    java.lang.String var6 = var1.composeName("hi!", "hi!");
    java.util.Hashtable var7 = var1.getEnvironment();
    java.util.Set var8 = var7.entrySet();
    javax.naming.Context var9 = javax.naming.spi.NamingManager.getURLContext("hi!", var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!/hi!"+ "'", var6.equals("hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    java.lang.String var5 = var0.composeName("hi!", "hi!");
    var0.unbind("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var9 = var0.createSubcontext("hi!/hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!/hi!"+ "'", var5.equals("hi!/hi!"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    var0.checkPackageDefinition("hi!");
    var0.checkPackageDefinition("hi!/hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSetFactory();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.lookupLink("hi!/hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.close();
    java.lang.Object var3 = var0.lookupLink("hi!/hi!");

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(true);
    java.lang.String var5 = var0.composeName("hi!", "hi!");
    java.util.Hashtable var6 = var0.getEnvironment();
    java.util.Set var7 = var6.entrySet();
    boolean var9 = var6.contains((java.lang.Object)(-1.0f));
    com.sun.jndi.toolkit.dir.HierMemDirCtx var11 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var11.setIgnoreCase(true);
    java.lang.String var16 = var11.composeName("hi!", "hi!");
    java.util.Hashtable var17 = var11.getEnvironment();
    boolean var19 = var17.contains((java.lang.Object)(short)100);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var20 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var20.setIgnoreCase(true);
    java.lang.Object var25 = com.sun.naming.internal.ResourceManager.getFactory("hi!/hi!", var17, (javax.naming.Context)var20, "", "hi!/hi!");
    boolean var27 = var17.contains((java.lang.Object)' ');
    java.lang.Object var28 = var6.get((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!/hi!"+ "'", var5.equals("hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!/hi!"+ "'", var16.equals("hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

}
