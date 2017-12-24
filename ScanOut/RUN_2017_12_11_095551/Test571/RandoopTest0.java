
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    javax.naming.NamingEnumeration var2 = var0.listBindings("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.lang.Object var3 = var0.removeFromEnvironment("hi!");
    var0.unbind("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.lang.Object var3 = var1.remove((java.lang.Object)(byte)0);
    boolean var5 = var1.containsValue((java.lang.Object)1L);
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var7 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var2 = var1.getEnvironment();
    java.lang.Object var4 = var2.remove((java.lang.Object)(byte)0);
    boolean var6 = var2.containsValue((java.lang.Object)1L);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var7 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var8 = var7.getEnvironment();
    java.lang.String var10 = com.sun.naming.internal.ResourceManager.getProperty("", var2, (javax.naming.Context)var7, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var12 = var7.getSchema("hi!");
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var3 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var4 = var3.getEnvironment();
    java.lang.Object var6 = var3.removeFromEnvironment("hi!");
    java.lang.Object var7 = var0.addToEnvironment("", (java.lang.Object)"hi!");
    javax.naming.directory.ModificationItem[] var9 = new javax.naming.directory.ModificationItem[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.modifyAttributes("hi!", var9);
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var2 = var0.createSubcontext("");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.destroySubcontext("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.NamingEnumeration var4 = var0.list("hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var2 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var3 = var2.getEnvironment();
    java.lang.Object var5 = var3.remove((java.lang.Object)(byte)0);
    boolean var7 = var3.containsValue((java.lang.Object)1L);
    java.util.Hashtable var8 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var3);
    boolean var9 = var1.contains((java.lang.Object)var3);
    java.lang.Object var11 = var1.remove((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.util.Enumeration var3 = var2.elements();
    java.util.Enumeration var4 = var2.keys();
    java.util.Set var5 = var2.entrySet();
    
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

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.destroySubcontext("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.getNameInNamespace();
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.lang.Object var3 = var1.remove((java.lang.Object)(byte)0);
    boolean var5 = var1.containsValue((java.lang.Object)1L);
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.lang.Object var3 = var1.remove((java.lang.Object)(byte)0);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var5 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var6 = var5.getEnvironment();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var7 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var8 = var7.getEnvironment();
    java.lang.Object var10 = var8.remove((java.lang.Object)(byte)0);
    boolean var12 = var8.containsValue((java.lang.Object)1L);
    java.util.Hashtable var13 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var8);
    boolean var14 = var6.contains((java.lang.Object)var8);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var16 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var17 = var16.getEnvironment();
    java.lang.Object var19 = var17.remove((java.lang.Object)(byte)0);
    boolean var21 = var17.containsValue((java.lang.Object)1L);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var22 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var23 = var22.getEnvironment();
    java.lang.String var25 = com.sun.naming.internal.ResourceManager.getProperty("", var17, (javax.naming.Context)var22, false);
    java.lang.String var27 = com.sun.naming.internal.ResourceManager.getProperty("hi!", var8, (javax.naming.Context)var22, false);
    java.lang.Object var28 = var1.remove((java.lang.Object)"hi!");
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.lang.Object var3 = var1.remove((java.lang.Object)(byte)0);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var5 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var6 = var5.getEnvironment();
    java.lang.Object var8 = var6.remove((java.lang.Object)(byte)0);
    int var9 = var6.size();
    java.util.Enumeration var10 = var6.keys();
    java.lang.Object var11 = var1.put((java.lang.Object)1.0f, (java.lang.Object)var10);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var13 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(var1, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var2 = var1.getEnvironment();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var3 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var4 = var3.getEnvironment();
    java.lang.Object var6 = var4.remove((java.lang.Object)(byte)0);
    boolean var8 = var4.containsValue((java.lang.Object)1L);
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var4);
    boolean var10 = var2.contains((java.lang.Object)var4);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var12 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var13 = var12.getEnvironment();
    java.lang.Object var15 = var13.remove((java.lang.Object)(byte)0);
    boolean var17 = var13.containsValue((java.lang.Object)1L);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var18 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var19 = var18.getEnvironment();
    java.lang.String var21 = com.sun.naming.internal.ResourceManager.getProperty("", var13, (javax.naming.Context)var18, false);
    java.lang.String var23 = com.sun.naming.internal.ResourceManager.getProperty("hi!", var4, (javax.naming.Context)var18, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.NamingEnumeration var25 = var18.list("hi!");
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.util.Collection var3 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.destroySubcontext("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var3 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.lang.Object var3 = var1.remove((java.lang.Object)(byte)0);
    boolean var5 = var1.containsValue((java.lang.Object)1L);
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var7 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var8 = var7.getEnvironment();
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var8);
    java.util.Enumeration var10 = var9.elements();
    java.util.Enumeration var11 = var9.keys();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var13 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var14 = var13.getEnvironment();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var15 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var16 = var15.getEnvironment();
    java.lang.Object var18 = var16.remove((java.lang.Object)(byte)0);
    boolean var20 = var16.containsValue((java.lang.Object)1L);
    java.util.Hashtable var21 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var16);
    boolean var22 = var14.contains((java.lang.Object)var16);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var24 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var25 = var24.getEnvironment();
    java.lang.Object var27 = var25.remove((java.lang.Object)(byte)0);
    boolean var29 = var25.containsValue((java.lang.Object)1L);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var30 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var31 = var30.getEnvironment();
    java.lang.String var33 = com.sun.naming.internal.ResourceManager.getProperty("", var25, (javax.naming.Context)var30, false);
    java.lang.String var35 = com.sun.naming.internal.ResourceManager.getProperty("hi!", var16, (javax.naming.Context)var30, false);
    javax.naming.Context var37 = var30.createSubcontext("hi!");
    java.lang.Object var38 = var6.put((java.lang.Object)var11, (java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    boolean var4 = var1.equals((java.lang.Object)(short)0);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var5 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var6 = var5.getEnvironment();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var7 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var8 = var7.getEnvironment();
    java.lang.Object var10 = var8.remove((java.lang.Object)(byte)0);
    boolean var12 = var8.containsValue((java.lang.Object)1L);
    java.util.Hashtable var13 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var8);
    boolean var14 = var6.contains((java.lang.Object)var8);
    boolean var15 = var1.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.util.Enumeration var3 = var2.elements();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var4 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var5 = var4.getEnvironment();
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var5);
    var2.putAll((java.util.Map)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var1 = var0.getEnvironment();
    javax.naming.directory.ModificationItem[] var3 = new javax.naming.directory.ModificationItem[] { };
    var0.modifyAttributes("", var3);
    com.sun.jndi.toolkit.dir.HierMemDirCtx var6 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    java.util.Hashtable var7 = var6.getEnvironment();
    javax.naming.directory.Attributes var9 = var6.getAttributes("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var10 = var0.createSubcontext("hi!", var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
