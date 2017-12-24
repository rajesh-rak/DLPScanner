
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


    java.util.Date var1 = new java.util.Date(1L);
    long var2 = var1.getTime();
    int var3 = var1.getMonth();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(0, 1, 10, 10, 1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var6.getLeastMaximum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = new java.util.Date(1L);
    long var2 = var1.getTime();
    java.util.Date var4 = new java.util.Date(1L);
    long var5 = var4.getTime();
    boolean var6 = var1.before(var4);
    var4.setMonth(1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Constructor[] var1 = var0.getDeclaredConstructors();
    int var2 = var0.getModifiers();
    java.lang.reflect.Type var3 = var0.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.HashMap var2 = new java.util.HashMap(10, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(0, 0, 1025, 1, 100, 100);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var1 = java.io.ObjectStreamClass.lookupAny(var0);
    java.lang.reflect.Method[] var2 = var0.getDeclaredMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var1 = java.io.ObjectStreamClass.lookupAny(var0);
    boolean var3 = var0.isInstance((java.lang.Object)(byte)10);
    java.lang.reflect.Constructor[] var4 = var0.getConstructors();
    boolean var5 = var0.isSynthetic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.cast((java.lang.Object)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(0, 1, 10, 10, 1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var6.getLeastMaximum(1025);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(0, 1, 10, 10, 1, (-1));
    int var7 = var6.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(0, 1, 10, 10, 1, (-1));
    var6.clear(10);
    var6.set(10, 1025, 1025, (-1), 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var1 = var0.getEnumConstants();
    java.lang.Class[] var2 = var0.getClasses();
    boolean var3 = var0.isEnum();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(0, 1, 10, 10, 1, (-1));
    var6.clear(10);
    int var9 = var6.getMinimalDaysInFirstWeek();
    int var10 = var6.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var1 = java.io.ObjectStreamClass.lookupAny(var0);
    boolean var3 = var0.isInstance((java.lang.Object)(byte)10);
    java.lang.String var4 = var0.getCanonicalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "randoop.util.ReflectionCode"+ "'", var4.equals("randoop.util.ReflectionCode"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Constructor[] var1 = var0.getDeclaredConstructors();
    int var2 = var0.getModifiers();
    java.lang.String var3 = var0.getName();
    java.lang.reflect.TypeVariable[] var4 = var0.getTypeParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "randoop.util.ReflectionCode"+ "'", var3.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var1 = var0.getEnumConstants();
    java.lang.String var2 = var0.getName();
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    boolean var4 = var0.isAssignableFrom(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "randoop.util.ReflectionCode"+ "'", var2.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(0, 1, 10, 10, 1, (-1));
    var6.clear(10);
    int var9 = var6.getMinimalDaysInFirstWeek();
    var6.setMinimalDaysInFirstWeek(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.io.ObjectStreamClass var1 = java.io.ObjectStreamClass.lookupAny(var0);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "randoop.util.ReflectionCode: static final long serialVersionUID = 0L;"+ "'", var2.equals("randoop.util.ReflectionCode: static final long serialVersionUID = 0L;"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var1 = new java.util.Date(1L);
    long var2 = var1.getTime();
    java.util.Date var4 = new java.util.Date(1L);
    long var5 = var4.getTime();
    boolean var6 = var1.before(var4);
    int var7 = var4.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var1 = var0.getEnumConstants();
    java.lang.String var2 = var0.getName();
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Constructor[] var4 = var3.getDeclaredConstructors();
    int var5 = var3.getModifiers();
    java.lang.String var6 = var3.getName();
    java.lang.Class var7 = var0.asSubclass(var3);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var9 = var8.getEnumConstants();
    java.lang.String var10 = var8.getName();
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Constructor[] var12 = var11.getDeclaredConstructors();
    int var13 = var11.getModifiers();
    java.lang.String var14 = var11.getName();
    java.lang.Class var15 = var8.asSubclass(var11);
    java.lang.Class[] var16 = new java.lang.Class[] { var8};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var17 = var7.getDeclaredConstructor(var16);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "randoop.util.ReflectionCode"+ "'", var2.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "randoop.util.ReflectionCode"+ "'", var6.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "randoop.util.ReflectionCode"+ "'", var10.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "randoop.util.ReflectionCode"+ "'", var14.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(0, 1, 10, 10, 1, (-1));
    boolean var7 = var6.isWeekDateSupported();
    long var8 = var6.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-62163919741000L));

  }

}
