
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = new com.sun.xml.internal.ws.server.EndpointFactory();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    boolean var4 = var0.contains((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.lang.annotation.Annotation[] var4 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var3);
    boolean var5 = var3.isEmpty();
    var0.putAll((java.util.Map)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    boolean var3 = var0.containsValue((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.util.Enumeration var2 = var1.keys();
    java.util.Set var3 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    int var2 = var1.size();
    java.util.Enumeration var3 = var1.elements();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("");
    var0.checkExit((-1));
    java.lang.ThreadGroup var5 = var0.getThreadGroup();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.util.Enumeration var2 = var1.elements();
    java.util.Hashtable var4 = new java.util.Hashtable(0);
    java.util.Enumeration var5 = var4.elements();
    java.security.ProtectionDomain[] var6 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var7 = new java.security.AccessControlContext(var6);
    java.lang.Object var9 = var4.put((java.lang.Object)var7, (java.lang.Object)1);
    java.lang.SecurityManager var10 = new java.lang.SecurityManager();
    boolean var11 = var7.equals((java.lang.Object)var10);
    java.lang.Object var12 = var1.remove((java.lang.Object)var7);
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.lang.Object var4 = var1.remove((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    boolean var2 = var0.isEmpty();
    java.util.Collection var3 = var0.values();
    java.util.Enumeration var4 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Set var2 = var1.entrySet();
    java.util.Enumeration var3 = var1.elements();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("");
    var0.checkExit((-1));
    java.util.Hashtable var7 = new java.util.Hashtable();
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("", 0, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("");
    java.lang.ThreadGroup var3 = var0.getThreadGroup();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.util.Hashtable var4 = new java.util.Hashtable();
    java.util.Hashtable var5 = new java.util.Hashtable((java.util.Map)var4);
    boolean var6 = var4.isEmpty();
    java.util.Collection var7 = var4.values();
    java.lang.Object var8 = var4.clone();
    java.lang.Object var9 = var1.remove((java.lang.Object)var4);
    boolean var11 = var4.contains((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


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

}
