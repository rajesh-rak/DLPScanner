
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Throwable var1 = new java.lang.Throwable("");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Throwable: "+ "'", var2.equals("java.lang.Throwable: "));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Throwable var3 = new java.lang.Throwable("");
    java.io.IOException var4 = new java.io.IOException(var3);
    java.lang.Exception var5 = new java.lang.Exception("hi!", (java.lang.Throwable)var4);
    java.lang.Exception var6 = new java.lang.Exception("", (java.lang.Throwable)var4);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.String var5 = var4.getName();
    java.lang.Class[] var6 = new java.lang.Class[] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var7 = var1.getDeclaredMethod("", var6);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "sun.reflect.Reflection"+ "'", var5.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.security.ProtectionDomain var3 = var1.getProtectionDomain();
    java.security.CodeSource var4 = var3.getCodeSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.io.ObjectStreamClass var2 = java.io.ObjectStreamClass.lookup(var1);
    java.lang.reflect.Method var3 = var1.getEnclosingMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var5 = var1.isAssignableFrom(var4);
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.String var8 = var7.getName();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var11 = var10.getMethods();
    java.security.ProtectionDomain var12 = var10.getProtectionDomain();
    java.lang.String var13 = var10.getName();
    boolean var15 = sun.reflect.Reflection.verifyMemberAccess(var1, var7, (java.lang.Object)var13, 10);
    java.lang.Class var17 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class[] var18 = new java.lang.Class[] { var17};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var19 = var1.getDeclaredConstructor(var18);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "sun.reflect.Reflection"+ "'", var13.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.reflect.Constructor[] var3 = var1.getConstructors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Throwable var1 = new java.lang.Throwable("");
    java.io.IOException var2 = new java.io.IOException(var1);
    java.lang.Exception var3 = new java.lang.Exception(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    java.security.Policy.setPolicy(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var5 = var1.isAssignableFrom(var4);
    java.lang.String var6 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sun.reflect.Reflection"+ "'", var6.equals("sun.reflect.Reflection"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Random var0 = new java.util.Random();
    byte[] var2 = new byte[] { (byte)100};
    var0.nextBytes(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Random var0 = new java.util.Random();
    long var1 = var0.nextLong();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3351388694791719725L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.security.ProtectionDomain var3 = var1.getProtectionDomain();
    boolean var4 = var1.isSynthetic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var5 = var1.isAssignableFrom(var4);
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.String var8 = var7.getName();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var11 = var10.getMethods();
    java.security.ProtectionDomain var12 = var10.getProtectionDomain();
    java.lang.String var13 = var10.getName();
    boolean var15 = sun.reflect.Reflection.verifyMemberAccess(var1, var7, (java.lang.Object)var13, 10);
    java.lang.Object var16 = var1.newInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "sun.reflect.Reflection"+ "'", var13.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    java.security.Policy.Parameters var1 = var0.getParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.IOException var1 = new java.io.IOException("sun.reflect.Reflection");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var5 = var1.isAssignableFrom(var4);
    java.lang.reflect.Type[] var6 = var4.getGenericInterfaces();
    java.lang.String var7 = var4.getCanonicalName();
    java.lang.String var8 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "sun.reflect.Reflection"+ "'", var7.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.String var2 = var1.toString();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.String var5 = var4.getName();
    java.lang.Throwable var7 = new java.lang.Throwable("java.lang.Throwable: ");
    sun.reflect.Reflection.ensureMemberAccess(var1, var4, (java.lang.Object)var7, 0);
    boolean var11 = sun.reflect.Reflection.quickCheckMemberAccess(var4, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "class sun.reflect.Reflection"+ "'", var2.equals("class sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "sun.reflect.Reflection"+ "'", var5.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();
    var0.refresh();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var5 = var1.isAssignableFrom(var4);
    java.lang.reflect.Type[] var6 = var4.getGenericInterfaces();
    java.lang.String var7 = var4.getCanonicalName();
    java.lang.reflect.Method[] var8 = var4.getDeclaredMethods();
    java.lang.Class var9 = var4.getComponentType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "sun.reflect.Reflection"+ "'", var7.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.io.ObjectStreamClass var2 = java.io.ObjectStreamClass.lookup(var1);
    java.lang.reflect.TypeVariable[] var3 = var1.getTypeParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var5 = var1.isAssignableFrom(var4);
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.String var8 = var7.getName();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var11 = var10.getMethods();
    java.security.ProtectionDomain var12 = var10.getProtectionDomain();
    java.lang.String var13 = var10.getName();
    boolean var15 = sun.reflect.Reflection.verifyMemberAccess(var1, var7, (java.lang.Object)var13, 10);
    boolean var16 = var1.desiredAssertionStatus();
    java.lang.Class var18 = sun.reflect.Reflection.getCallerClass((-1));
    java.io.ObjectStreamClass var19 = java.io.ObjectStreamClass.lookup(var18);
    boolean var21 = var18.isInstance((java.lang.Object)0L);
    java.lang.annotation.Annotation var22 = var1.<java.lang.annotation.Annotation>getAnnotation(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "sun.reflect.Reflection"+ "'", var13.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.lang.Throwable var2 = new java.lang.Throwable("");
    boolean var3 = var0.equals((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var5 = var1.isAssignableFrom(var4);
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.String var8 = var7.getName();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var11 = var10.getMethods();
    java.security.ProtectionDomain var12 = var10.getProtectionDomain();
    java.lang.String var13 = var10.getName();
    boolean var15 = sun.reflect.Reflection.verifyMemberAccess(var1, var7, (java.lang.Object)var13, 10);
    java.lang.reflect.Method[] var16 = var1.getMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sun.reflect.Reflection"+ "'", var8.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "sun.reflect.Reflection"+ "'", var13.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

}
