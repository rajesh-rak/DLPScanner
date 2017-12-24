
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


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    boolean var4 = var0.equals((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var9 = var3.getDeclaredField("hi!");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    boolean var9 = sun.reflect.Reflection.quickCheckMemberAccess(var3, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.reflect.Field[] var8 = var1.getFields();
    java.lang.reflect.Field[] var9 = var1.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Thread var1 = new java.lang.Thread("");
    java.lang.Thread var2 = new java.lang.Thread((java.lang.Runnable)var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    boolean var8 = var1.isMemberClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.ClassLoader var1 = sun.rmi.server.LoaderHandler.getClassLoader("hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var1 = java.lang.Class.forName("sun.reflect.Reflection");
    java.lang.annotation.Annotation[] var2 = var1.getAnnotations();
    java.lang.reflect.Field[] var3 = var1.getDeclaredFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var12 = var11.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var9, var11, (java.lang.Object)10L, 0);
    boolean var16 = var3.isAnnotationPresent(var9);
    java.lang.Class var18 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var20 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var21 = var20.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var18, var20, (java.lang.Object)10L, 0);
    java.lang.Class[] var25 = new java.lang.Class[] { var20};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var26 = var3.getDeclaredConstructor(var25);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.String var8 = var1.getCanonicalName();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var13 = var12.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var10, var12, (java.lang.Object)10L, 0);
    java.lang.reflect.TypeVariable[] var17 = var12.getTypeParameters();
    java.lang.Class var19 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var21 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var22 = var21.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var19, var21, (java.lang.Object)10L, 0);
    java.lang.String var26 = var19.getCanonicalName();
    boolean var27 = var19.isInterface();
    boolean var28 = var12.isAssignableFrom(var19);
    boolean var29 = var19.isArray();
    java.lang.Class var31 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var33 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var34 = var33.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var31, var33, (java.lang.Object)10L, 0);
    java.lang.Class var39 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var41 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var42 = var41.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var39, var41, (java.lang.Object)10L, 0);
    boolean var46 = var33.isAnnotationPresent(var39);
    boolean var48 = sun.reflect.Reflection.verifyMemberAccess(var1, var19, (java.lang.Object)var39, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "sun.reflect.Reflection"+ "'", var26.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.String var8 = var1.getCanonicalName();
    java.lang.String var9 = var1.getCanonicalName();
    boolean var10 = var1.isArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "sun.reflect.Reflection"+ "'", var9.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = java.security.AccessController.getContext();
    boolean var4 = var2.equals((java.lang.Object)(-1L));
    boolean var5 = var1.equals((java.lang.Object)var2);
    java.security.DomainCombiner var6 = var2.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.reflect.Constructor var8 = var1.getEnclosingConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.String var8 = var1.getCanonicalName();
    boolean var9 = var1.isInterface();
    java.lang.String var10 = var1.getCanonicalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "sun.reflect.Reflection"+ "'", var10.equals("sun.reflect.Reflection"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var12 = var11.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var9, var11, (java.lang.Object)10L, 0);
    boolean var16 = var3.isAnnotationPresent(var9);
    java.lang.String var17 = sun.rmi.server.LoaderHandler.getClassAnnotation(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = java.lang.Class.forName("sun.reflect.Reflection");
    java.lang.annotation.Annotation[] var2 = var1.getAnnotations();
    java.lang.reflect.Field[] var3 = var1.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.reflect.TypeVariable[] var8 = var3.getTypeParameters();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var13 = var12.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var10, var12, (java.lang.Object)10L, 0);
    java.lang.String var17 = var10.getCanonicalName();
    boolean var18 = var10.isInterface();
    boolean var19 = var3.isAssignableFrom(var10);
    java.lang.String var20 = sun.rmi.server.LoaderHandler.getClassAnnotation(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "sun.reflect.Reflection"+ "'", var17.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.reflect.TypeVariable[] var8 = var3.getTypeParameters();
    java.lang.String[] var10 = new java.lang.String[] { "sun.reflect.Reflection"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.reflect.Reflection.registerFieldsToFilter(var3, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.String var8 = var1.getCanonicalName();
    boolean var9 = var1.isInterface();
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var14 = var13.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var11, var13, (java.lang.Object)10L, 0);
    java.lang.Class var19 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var21 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var22 = var21.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var19, var21, (java.lang.Object)10L, 0);
    boolean var26 = var13.isAnnotationPresent(var19);
    boolean var27 = var1.isInstance((java.lang.Object)var26);
    boolean var28 = var1.isInterface();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var1 = java.lang.Class.forName("sun.reflect.Reflection");
    java.lang.annotation.Annotation[] var2 = var1.getAnnotations();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var7 = var6.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var4, var6, (java.lang.Object)10L, 0);
    java.lang.String var11 = var4.getCanonicalName();
    boolean var12 = var4.isInterface();
    boolean var13 = var4.isAnonymousClass();
    boolean var14 = var1.isAssignableFrom(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "sun.reflect.Reflection"+ "'", var11.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Thread var1 = new java.lang.Thread("sun.reflect.Reflection");

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = var3.getComponentType();
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)10L, 0);
    java.lang.reflect.Type var8 = var3.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
