
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var1 = new java.util.Vector(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElementAt((java.lang.Object)(byte)0, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var3.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("randoop.util.MethodReflectionCode", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var2 = var1.getEnclosingConstructor();
    java.lang.String var3 = var1.getName();
    java.lang.reflect.Method[] var4 = var1.getDeclaredMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var3.equals("randoop.util.MethodReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.util.Vector var3 = new java.util.Vector(0);
    java.util.Vector var5 = new java.util.Vector(0);
    boolean var6 = var3.retainAll((java.util.Collection)var5);
    java.util.Vector var8 = new java.util.Vector(0);
    java.util.Vector var10 = new java.util.Vector(0);
    boolean var11 = var8.retainAll((java.util.Collection)var10);
    boolean var12 = var5.containsAll((java.util.Collection)var10);
    java.util.Vector var14 = new java.util.Vector(0);
    boolean var15 = var5.removeAll((java.util.Collection)var14);
    java.lang.Class var17 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var18 = var17.getEnclosingConstructor();
    java.lang.String var19 = var17.getName();
    int var20 = var5.indexOf((java.lang.Object)var17);
    java.util.Vector var22 = new java.util.Vector(0);
    java.util.Vector var24 = new java.util.Vector(0);
    boolean var25 = var22.retainAll((java.util.Collection)var24);
    java.util.Vector var27 = new java.util.Vector(0);
    java.util.Vector var29 = new java.util.Vector(0);
    boolean var30 = var27.retainAll((java.util.Collection)var29);
    boolean var31 = var24.containsAll((java.util.Collection)var29);
    java.util.Vector var33 = new java.util.Vector(0);
    boolean var34 = var24.removeAll((java.util.Collection)var33);
    java.lang.Class var36 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var37 = var36.getEnclosingConstructor();
    java.lang.String var38 = var36.getName();
    int var39 = var24.indexOf((java.lang.Object)var36);
    java.lang.annotation.Annotation var40 = var17.<java.lang.annotation.Annotation>getAnnotation(var36);
    boolean var41 = var1.isAssignableFrom(var17);
    boolean var42 = var17.isLocalClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var19.equals("randoop.util.MethodReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var38.equals("randoop.util.MethodReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Vector var8 = new java.util.Vector(0);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var8);
    java.util.Vector var12 = new java.util.Vector(0);
    boolean var13 = var3.removeAll((java.util.Collection)var12);
    java.awt.Window[] var14 = java.awt.Window.getWindows();
    java.lang.Object[] var15 = var12.toArray((java.lang.Object[])var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(0);
    var1.ensureCapacity(10);
    java.lang.Object[] var4 = var1.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var2 = var1.getEnclosingConstructor();
    java.lang.Class[] var3 = var1.getClasses();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.cast((java.lang.Object)"randoop.util.MethodReflectionCode");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("[]");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Vector var8 = new java.util.Vector(0);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var8);
    var3.removeAllElements();
    int var14 = var3.indexOf((java.lang.Object)100.0f, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var3.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    var1.add(0, (java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var2 = var1.getEnclosingConstructor();
    java.lang.String var3 = var1.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.newInstance();
      fail("Expected exception of type java.lang.InstantiationException");
    } catch (java.lang.InstantiationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var3.equals("randoop.util.MethodReflectionCode"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var2 = var1.getEnclosingConstructor();
    java.lang.Class[] var3 = var1.getClasses();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.cast((java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Vector var8 = new java.util.Vector(0);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var8);
    java.util.Vector var12 = new java.util.Vector(0);
    boolean var13 = var3.removeAll((java.util.Collection)var12);
    java.lang.Class var15 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var16 = var15.getEnclosingConstructor();
    java.lang.String var17 = var15.getName();
    int var18 = var3.indexOf((java.lang.Object)var15);
    java.lang.String[] var20 = new java.lang.String[] { ""};
    sun.reflect.Reflection.registerMethodsToFilter(var15, var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var17.equals("randoop.util.MethodReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Vector var8 = new java.util.Vector(0);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var8);
    java.util.Vector var12 = new java.util.Vector(0);
    boolean var13 = var3.removeAll((java.util.Collection)var12);
    java.lang.Class var15 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var16 = var15.getEnclosingConstructor();
    java.lang.String var17 = var15.getName();
    int var18 = var3.indexOf((java.lang.Object)var15);
    java.lang.reflect.Field[] var19 = var15.getFields();
    boolean var20 = var15.isPrimitive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var17.equals("randoop.util.MethodReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Vector var8 = new java.util.Vector(0);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var8);
    var3.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var3.subList((-1), 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    int var1 = var0.getBasicConstraints();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var4 = new sun.security.x509.X509CertImpl(var3);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "x509"+ "'", var1.equals("x509"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Vector var8 = new java.util.Vector(0);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var8);
    java.util.Vector var12 = new java.util.Vector(0);
    boolean var13 = var3.removeAll((java.util.Collection)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var3.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getNonCriticalExtensionOIDs();
    java.security.Principal var2 = var0.getSubjectDN();
    boolean var4 = var0.equals((java.lang.Object)(short)100);
    java.util.List var5 = var0.getExtendedKeyUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var2 = var1.getEnclosingConstructor();
    java.lang.Class[] var3 = var1.getClasses();
    java.lang.reflect.Type[] var4 = var1.getGenericInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Vector var8 = new java.util.Vector(0);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var8);
    java.util.Vector var12 = new java.util.Vector(0);
    boolean var13 = var3.removeAll((java.util.Collection)var12);
    java.lang.Class var15 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var16 = var15.getEnclosingConstructor();
    java.lang.String var17 = var15.getName();
    int var18 = var3.indexOf((java.lang.Object)var15);
    java.util.Vector var20 = new java.util.Vector(0);
    java.util.Vector var22 = new java.util.Vector(0);
    boolean var23 = var20.retainAll((java.util.Collection)var22);
    java.util.Vector var25 = new java.util.Vector(0);
    java.util.Vector var27 = new java.util.Vector(0);
    boolean var28 = var25.retainAll((java.util.Collection)var27);
    boolean var29 = var22.containsAll((java.util.Collection)var27);
    java.util.Vector var31 = new java.util.Vector(0);
    boolean var32 = var22.removeAll((java.util.Collection)var31);
    java.lang.Class var34 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Constructor var35 = var34.getEnclosingConstructor();
    java.lang.String var36 = var34.getName();
    int var37 = var22.indexOf((java.lang.Object)var34);
    java.lang.annotation.Annotation var38 = var15.<java.lang.annotation.Annotation>getAnnotation(var34);
    boolean var39 = var15.desiredAssertionStatus();
    java.io.ObjectStreamClass var40 = java.io.ObjectStreamClass.lookupAny(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var17.equals("randoop.util.MethodReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var36.equals("randoop.util.MethodReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Vector var8 = new java.util.Vector(0);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var8);
    var3.removeAllElements();
    int var14 = var3.indexOf((java.lang.Object)100.0f, 1);
    java.util.Vector var16 = new java.util.Vector(0);
    java.util.Vector var18 = new java.util.Vector(0);
    boolean var19 = var16.retainAll((java.util.Collection)var18);
    java.util.Vector var21 = new java.util.Vector(0);
    java.util.Vector var23 = new java.util.Vector(0);
    boolean var24 = var21.retainAll((java.util.Collection)var23);
    boolean var25 = var18.containsAll((java.util.Collection)var23);
    java.lang.String var26 = var23.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insertElementAt((java.lang.Object)var26, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));

  }

}
