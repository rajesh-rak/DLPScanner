
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Thread var1 = new java.lang.Thread("hi!");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(10, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(10);
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.set(0, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    char[] var4 = new char[] { '4', ' '};
    java.security.Key var5 = var0.engineGetKey("hi!", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.removeElement((java.lang.Object)100);
    boolean var5 = var1.add((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector(10);
    boolean var4 = var2.removeElement((java.lang.Object)100);
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var7 = var2.retainAll((java.util.Collection)var6);
    boolean var8 = var0.containsAll((java.util.Collection)var6);
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var13 = var11.removeElement((java.lang.Object)100);
    java.util.Vector var15 = new java.util.Vector(10);
    boolean var16 = var11.retainAll((java.util.Collection)var15);
    boolean var17 = var9.containsAll((java.util.Collection)var15);
    boolean var18 = var0.containsAll((java.util.Collection)var15);
    java.util.ListIterator var19 = var15.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.removeElement((java.lang.Object)100);
    java.util.ListIterator var4 = var1.listIterator();
    var1.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = sun.net.www.ParseUtil.encodePath("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "%7b%7d"+ "'", var1.equals("%7b%7d"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.Object var3 = var1.remove((java.lang.Object)1L);
    java.lang.String var4 = var1.toString();
    boolean var6 = var1.containsValue((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("", "", "%7b%7d");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector(10);
    boolean var4 = var2.removeElement((java.lang.Object)100);
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var7 = var2.retainAll((java.util.Collection)var6);
    boolean var8 = var0.containsAll((java.util.Collection)var6);
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var13 = var11.removeElement((java.lang.Object)100);
    java.util.Vector var15 = new java.util.Vector(10);
    boolean var16 = var11.retainAll((java.util.Collection)var15);
    boolean var17 = var9.containsAll((java.util.Collection)var15);
    boolean var18 = var0.containsAll((java.util.Collection)var15);
    java.util.Vector var20 = new java.util.Vector(10);
    boolean var22 = var20.removeElement((java.lang.Object)100);
    java.util.ListIterator var23 = var20.listIterator();
    java.lang.Object[] var24 = var20.toArray();
    boolean var26 = var20.contains((java.lang.Object)100.0d);
    boolean var27 = var15.containsAll((java.util.Collection)var20);
    var20.setSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector(10);
    boolean var4 = var2.removeElement((java.lang.Object)100);
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var7 = var2.retainAll((java.util.Collection)var6);
    boolean var8 = var0.containsAll((java.util.Collection)var6);
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var13 = var11.removeElement((java.lang.Object)100);
    java.util.Vector var15 = new java.util.Vector(10);
    boolean var16 = var11.retainAll((java.util.Collection)var15);
    boolean var17 = var9.containsAll((java.util.Collection)var15);
    boolean var18 = var0.containsAll((java.util.Collection)var15);
    java.util.Vector var20 = new java.util.Vector(10);
    boolean var22 = var20.removeElement((java.lang.Object)100);
    java.util.ListIterator var23 = var20.listIterator();
    java.lang.Object[] var24 = var20.toArray();
    boolean var26 = var20.contains((java.lang.Object)100.0d);
    boolean var27 = var15.containsAll((java.util.Collection)var20);
    var15.ensureCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.Object var2 = var1.clone();
    java.util.Vector var4 = new java.util.Vector(10);
    boolean var6 = var4.removeElement((java.lang.Object)100);
    java.util.ListIterator var7 = var4.listIterator();
    java.lang.Object[] var8 = var4.toArray();
    boolean var9 = var1.equals((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.misc.Launcher var0 = new sun.misc.Launcher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var2 = java.io.ObjectStreamClass.lookupAny(var1);
    boolean var3 = var1.isAnonymousClass();
    boolean var4 = var1.isArray();
    java.lang.Class[] var5 = new java.lang.Class[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var6 = var0.getConstructor(var5);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var1 = java.io.ObjectStreamClass.lookupAny(var0);
    boolean var2 = var0.isAnonymousClass();
    boolean var3 = var0.isArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var5 = var0.getField("%7b%7d");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var1 = java.io.ObjectStreamClass.lookupAny(var0);
    java.lang.reflect.Method[] var2 = var0.getDeclaredMethods();
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var4 = java.io.ObjectStreamClass.lookupAny(var3);
    java.lang.Class var5 = var0.asSubclass(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
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

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.removeElement((java.lang.Object)100);
    java.util.Vector var5 = new java.util.Vector(10);
    boolean var6 = var1.retainAll((java.util.Collection)var5);
    int var7 = var1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    java.util.Set var3 = var1.entrySet();
    java.util.Vector var4 = new java.util.Vector();
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var8 = var6.removeElement((java.lang.Object)100);
    java.util.Vector var10 = new java.util.Vector(10);
    boolean var11 = var6.retainAll((java.util.Collection)var10);
    boolean var12 = var4.containsAll((java.util.Collection)var10);
    int var13 = var4.capacity();
    boolean var14 = var1.contains((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector(10);
    boolean var4 = var2.removeElement((java.lang.Object)100);
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var7 = var2.retainAll((java.util.Collection)var6);
    boolean var8 = var0.containsAll((java.util.Collection)var6);
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var13 = var11.removeElement((java.lang.Object)100);
    java.util.Vector var15 = new java.util.Vector(10);
    boolean var16 = var11.retainAll((java.util.Collection)var15);
    boolean var17 = var9.containsAll((java.util.Collection)var15);
    boolean var18 = var0.containsAll((java.util.Collection)var15);
    java.util.Vector var20 = new java.util.Vector(10);
    boolean var22 = var20.removeElement((java.lang.Object)100);
    java.util.ListIterator var23 = var20.listIterator();
    java.lang.Object[] var24 = var20.toArray();
    boolean var26 = var20.contains((java.lang.Object)100.0d);
    boolean var27 = var15.containsAll((java.util.Collection)var20);
    java.util.Vector var29 = new java.util.Vector(10);
    boolean var31 = var29.removeElement((java.lang.Object)100);
    java.util.ListIterator var32 = var29.listIterator();
    java.lang.Object[] var33 = var29.toArray();
    boolean var35 = var29.contains((java.lang.Object)100.0d);
    int var36 = var20.lastIndexOf((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var1 = java.io.ObjectStreamClass.lookupAny(var0);
    java.lang.reflect.Method[] var2 = var0.getDeclaredMethods();
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var4 = java.io.ObjectStreamClass.lookupAny(var3);
    java.lang.Class[] var5 = new java.lang.Class[] { var3};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var6 = var0.getDeclaredConstructor(var5);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
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

}
