
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Thread var1 = new java.lang.Thread("hi!");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Integer var2 = java.lang.Integer.getInteger("", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 1+ "'", var2.equals(1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Map var2 = java.util.Collections.singletonMap((java.lang.Object)100.0f, (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();
    java.security.Provider var1 = var0.getProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Integer var1 = java.lang.Integer.getInteger("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = java.lang.Integer.toOctalString(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var2 = java.lang.Integer.valueOf("0", 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();
    java.security.Policy.setPolicy((java.security.Policy)var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.lang.Integer.toOctalString(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.NoClassDefFoundError var0 = new java.lang.NoClassDefFoundError();
    java.util.Set var1 = java.util.Collections.singleton((java.lang.Object)var0);
    java.lang.Throwable[] var2 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    int var1 = java.lang.Integer.reverseBytes(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    sun.security.provider.PolicyFile var1 = new sun.security.provider.PolicyFile();
    boolean var2 = var0.isInstance((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Map var0 = java.util.Collections.emptyMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.Permissions var0 = new java.security.Permissions();
    var0.setReadOnly();
    java.util.Enumeration var2 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Enumeration var0 = java.util.Collections.emptyEnumeration();
    java.util.ArrayList var1 = java.util.Collections.list(var0);
    java.util.Collections.rotate((java.util.List)var1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    int var2 = java.lang.Integer.rotateRight(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    int var1 = java.lang.Integer.reverse(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2147483648));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Comparator var0 = java.util.Collections.reverseOrder();
    java.util.Comparator var1 = java.util.Collections.reverseOrder(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.NoClassDefFoundError var0 = new java.lang.NoClassDefFoundError();
    java.util.Set var1 = java.util.Collections.singleton((java.lang.Object)var0);
    java.lang.Object var2 = java.util.Collections.max((java.util.Collection)var1);
    java.lang.Object var3 = java.util.Collections.max((java.util.Collection)var1);
    java.util.Set var4 = java.util.Collections.synchronizedSet(var1);
    java.lang.NoClassDefFoundError var5 = new java.lang.NoClassDefFoundError();
    java.util.Set var6 = java.util.Collections.singleton((java.lang.Object)var5);
    java.lang.Object var7 = java.util.Collections.max((java.util.Collection)var6);
    java.lang.Object var8 = java.util.Collections.max((java.util.Collection)var6);
    int var9 = java.util.Collections.frequency((java.util.Collection)var1, (java.lang.Object)var6);
    java.lang.Object var10 = java.util.Collections.max((java.util.Collection)var1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = var0.getEnclosingClass();
    java.lang.reflect.Method[] var2 = var0.getDeclaredMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Integer var2 = java.lang.Integer.getInteger("", (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 1+ "'", var2.equals(1));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Set var0 = java.util.Collections.emptySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Enumeration var0 = java.util.Collections.emptyEnumeration();
    java.util.ArrayList var1 = java.util.Collections.list(var0);
    java.util.Collections.shuffle((java.util.List)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Enumeration var0 = java.util.Collections.emptyEnumeration();
    java.util.ArrayList var1 = java.util.Collections.list(var0);
    java.util.Collection var2 = java.util.Collections.synchronizedCollection((java.util.Collection)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.NumberFormatException var2 = new java.lang.NumberFormatException();
    java.lang.Exception var3 = new java.lang.Exception((java.lang.Throwable)var2);
    java.lang.Throwable var4 = new java.lang.Throwable("hi!", (java.lang.Throwable)var2);
    java.lang.Exception var5 = new java.lang.Exception("1", (java.lang.Throwable)var2);

  }

}
