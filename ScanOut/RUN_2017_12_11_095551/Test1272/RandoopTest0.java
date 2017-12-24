
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    java.util.Hashtable var7 = new java.util.Hashtable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.annotation.Annotation var8 = sun.reflect.annotation.AnnotationParser.annotationForMap(var1, (java.util.Map)var7);
      fail("Expected exception of type java.lang.annotation.AnnotationFormatError");
    } catch (java.lang.annotation.AnnotationFormatError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.MBeanInfo var8 = com.sun.jmx.mbeanserver.Introspector.testCompliance(var1);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    boolean var2 = var1.isEnum();
    boolean var3 = var1.isLocalClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    java.lang.reflect.Field[] var8 = var1.getFields();
    java.io.ObjectStreamClass var9 = java.io.ObjectStreamClass.lookupAny(var1);
    java.io.ObjectStreamField[] var10 = var9.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.get((java.lang.Object)(byte)0);
    boolean var4 = var0.equals((java.lang.Object)10.0f);
    boolean var5 = var0.isEmpty();
    boolean var7 = var0.equals((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    boolean var8 = var1.isSynthetic();
    java.io.ObjectStreamClass var9 = java.io.ObjectStreamClass.lookup(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(1);
    boolean var13 = sun.reflect.Reflection.verifyMemberAccess(var8, var10, (java.lang.Object)100.0d, 10);
    boolean var14 = var8.isAnnotation();
    java.lang.reflect.Field[] var15 = var8.getFields();
    java.io.ObjectStreamClass var16 = java.io.ObjectStreamClass.lookupAny(var8);
    java.lang.Class var17 = var16.forClass();
    java.lang.Class var18 = var1.asSubclass(var17);
    java.lang.Class[] var19 = var18.getClasses();
    boolean var20 = var18.isMemberClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    java.lang.reflect.Field[] var8 = var1.getFields();
    java.io.ObjectStreamClass var9 = java.io.ObjectStreamClass.lookupAny(var1);
    java.lang.reflect.Field[] var10 = var1.getDeclaredFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    boolean var9 = sun.reflect.Reflection.quickCheckMemberAccess(var1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var7 = com.sun.jmx.mbeanserver.Introspector.getStandardMBeanInterface(var3);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    boolean var8 = var1.isSynthetic();
    java.lang.Class var9 = var1.getEnclosingClass();
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForElement((java.lang.reflect.AnnotatedElement)var1);
    java.util.Hashtable var11 = new java.util.Hashtable();
    java.security.ProtectionDomain[] var12 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var13 = new java.security.AccessControlContext(var12);
    boolean var14 = var11.contains((java.lang.Object)var12);
    boolean var15 = var1.isInstance((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    java.lang.reflect.Field[] var8 = var1.getFields();
    java.io.ObjectStreamClass var9 = java.io.ObjectStreamClass.lookupAny(var1);
    java.lang.reflect.Constructor[] var10 = var1.getDeclaredConstructors();
    java.lang.String var11 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var11.equals("randoop.util.MethodReflectionCode"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jmx.mbeanserver.Introspector.testComplianceMXBeanInterface(var1);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.lang.Object var4 = var2.get((java.lang.Object)(byte)0);
    boolean var6 = var2.equals((java.lang.Object)10.0f);
    boolean var7 = var2.isEmpty();
    java.lang.Object var8 = var1.get((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Set var2 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(1);
    boolean var13 = sun.reflect.Reflection.verifyMemberAccess(var8, var10, (java.lang.Object)100.0d, 10);
    boolean var14 = var8.isAnnotation();
    java.lang.reflect.Field[] var15 = var8.getFields();
    java.io.ObjectStreamClass var16 = java.io.ObjectStreamClass.lookupAny(var8);
    java.lang.Class var17 = var16.forClass();
    java.lang.Class var18 = var1.asSubclass(var17);
    java.lang.Class var20 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var22 = sun.reflect.Reflection.getCallerClass(1);
    boolean var25 = sun.reflect.Reflection.verifyMemberAccess(var20, var22, (java.lang.Object)100.0d, 10);
    boolean var26 = var20.isAnnotation();
    java.lang.reflect.Field[] var27 = var20.getFields();
    boolean var28 = var1.isAssignableFrom(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var1.isAnnotation();
    java.lang.reflect.Field[] var8 = var1.getFields();
    java.lang.Class[] var9 = var1.getInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    boolean var2 = var1.isEnum();
    java.lang.Class[] var3 = var1.getClasses();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)100.0d, 10);
    boolean var9 = var3.isAnnotation();
    java.lang.reflect.Field[] var10 = var3.getFields();
    java.io.ObjectStreamClass var11 = java.io.ObjectStreamClass.lookupAny(var3);
    boolean var12 = var1.equals((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)10.0d);
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(1);
    boolean var9 = sun.reflect.Reflection.verifyMemberAccess(var4, var6, (java.lang.Object)100.0d, 10);
    boolean var10 = var0.equals((java.lang.Object)var4);
    java.security.ProtectionDomain[] var11 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var12 = new java.security.AccessControlContext(var11);
    java.security.DomainCombiner var13 = var12.getDomainCombiner();
    java.security.DomainCombiner var14 = var12.getDomainCombiner();
    boolean var15 = var0.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(1);
    boolean var13 = sun.reflect.Reflection.verifyMemberAccess(var8, var10, (java.lang.Object)100.0d, 10);
    boolean var14 = var8.isAnnotation();
    java.lang.reflect.Field[] var15 = var8.getFields();
    java.io.ObjectStreamClass var16 = java.io.ObjectStreamClass.lookupAny(var8);
    java.lang.Class var17 = var16.forClass();
    java.lang.Class var18 = var1.asSubclass(var17);
    java.lang.Class[] var19 = var18.getClasses();
    java.lang.Package var20 = var18.getPackage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)100.0d, 10);
    boolean var7 = var3.isArray();
    java.lang.Object[] var8 = var3.getEnumConstants();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

}
