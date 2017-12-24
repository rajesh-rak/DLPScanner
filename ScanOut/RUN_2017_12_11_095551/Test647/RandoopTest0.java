
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)1.0d);
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
      java.io.File var2 = java.io.File.createTempFile("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.remove(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.lang.String var4 = var3.toString();
    java.util.WeakHashMap var6 = new java.util.WeakHashMap(1);
    java.util.Set var7 = var6.entrySet();
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var7);
    int var10 = var8.indexOf((java.lang.Object)(short)100);
    boolean var11 = var3.retainAll((java.util.Collection)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.add((-1), (java.lang.Object)1.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.lang.String var4 = var3.toString();
    java.util.WeakHashMap var6 = new java.util.WeakHashMap(1);
    java.util.Set var7 = var6.entrySet();
    boolean var8 = var3.addAll((java.util.Collection)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.lang.String var4 = var3.toString();
    java.util.WeakHashMap var6 = new java.util.WeakHashMap(1);
    java.util.Set var7 = var6.entrySet();
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var7);
    int var10 = var8.indexOf((java.lang.Object)(short)100);
    boolean var11 = var3.retainAll((java.util.Collection)var8);
    java.util.WeakHashMap var13 = new java.util.WeakHashMap(1);
    java.lang.Object var15 = var13.get((java.lang.Object)'#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.insertElementAt((java.lang.Object)var13, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.lang.String var4 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.WeakHashMap var4 = new java.util.WeakHashMap(1);
    java.util.Set var5 = var4.entrySet();
    var1.putAll((java.util.Map)var4);
    java.util.WeakHashMap var8 = new java.util.WeakHashMap(1);
    java.util.Set var9 = var8.entrySet();
    boolean var11 = var8.containsValue((java.lang.Object)1);
    var1.putAll((java.util.Map)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.util.ListIterator var4 = var3.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var6 = var3.listIterator(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkWrite("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.WeakHashMap var2 = new java.util.WeakHashMap(0, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.WeakHashMap var4 = new java.util.WeakHashMap(1);
    java.util.Set var5 = var4.entrySet();
    var1.putAll((java.util.Map)var4);
    java.lang.Object var8 = var4.get((java.lang.Object)100.0d);
    java.util.WeakHashMap var10 = new java.util.WeakHashMap(1);
    java.util.Set var11 = var10.entrySet();
    java.util.WeakHashMap var13 = new java.util.WeakHashMap(1);
    java.util.Set var14 = var13.entrySet();
    var10.putAll((java.util.Map)var13);
    var4.putAll((java.util.Map)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var17 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var4 = var2.setReadable(false);
    boolean var5 = var2.isHidden();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    int var5 = var3.indexOf((java.lang.Object)(short)100);
    var3.trimToSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var3.lastIndexOf((java.lang.Object)'a', 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isAbsolute();
    boolean var4 = var2.canExecute();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(0, (-1), 1);
    var3.expire(100L);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("hi!", (-1));
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.lang.String var4 = var3.toString();
    java.util.WeakHashMap var6 = new java.util.WeakHashMap(1);
    java.util.Set var7 = var6.entrySet();
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var7);
    int var10 = var8.indexOf((java.lang.Object)(short)100);
    boolean var11 = var3.retainAll((java.util.Collection)var8);
    int var14 = var3.indexOf((java.lang.Object)10L, 0);
    java.util.WeakHashMap var16 = new java.util.WeakHashMap(1);
    java.util.Set var17 = var16.entrySet();
    java.util.Vector var18 = new java.util.Vector((java.util.Collection)var17);
    java.lang.String var19 = var18.toString();
    boolean var20 = var3.addAll((java.util.Collection)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var4 = var2.setReadable(false);
    long var5 = var2.lastModified();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var4 = var2.setReadable(false);
    boolean var6 = var2.setExecutable(false);
    boolean var7 = var2.canExecute();
    long var8 = var2.lastModified();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var4 = var2.setReadable(false);
    boolean var6 = var2.setExecutable(false);
    boolean var7 = var2.canExecute();
    boolean var10 = var2.setWritable(true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.lang.String var4 = var3.toString();
    java.util.WeakHashMap var6 = new java.util.WeakHashMap(1);
    java.util.Set var7 = var6.entrySet();
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var7);
    int var10 = var8.indexOf((java.lang.Object)(short)100);
    boolean var11 = var3.retainAll((java.util.Collection)var8);
    boolean var12 = var3.isEmpty();
    java.lang.Object[] var13 = var3.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var3.subList(100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

}
