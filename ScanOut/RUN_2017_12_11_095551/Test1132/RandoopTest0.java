
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


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Throwable: hi!"+ "'", var2.equals("java.lang.Throwable: hi!"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.annotation.Annotation[] var0 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var1 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPropertyAccess("java.lang.Throwable: hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Formatter var1 = new java.util.Formatter("java.lang.Throwable: hi!");

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var6 = var1.divide(var3, 0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    char[] var2 = new char[] { '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var5 = new java.math.BigDecimal(var2, (-1), 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkConnect("", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkConnect("", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Formatter var0 = new java.util.Formatter();
    var0.close();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "java.lang.Throwable: hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("java.lang.Throwable: hi!");
    java.math.BigDecimal var4 = new java.math.BigDecimal(1.0d);
    java.lang.String var5 = var4.toString();
    long var6 = var4.longValue();
    java.math.BigDecimal var8 = new java.math.BigDecimal(1.0d);
    java.lang.String var9 = var8.toString();
    long var10 = var8.longValue();
    java.math.BigDecimal var11 = var4.subtract(var8);
    java.math.BigDecimal var13 = var11.setScale(100);
    boolean var14 = var0.checkTopLevelWindow((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1"+ "'", var5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "1"+ "'", var9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPrintJobAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1.0d);
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal var5 = var1.remainder(var3);
    java.math.BigDecimal var7 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var8 = var3.remainder(var7);
    int var9 = var3.intValue();
    java.math.BigDecimal var11 = new java.math.BigDecimal(1.0d);
    java.lang.String var12 = var11.toString();
    long var13 = var11.longValue();
    java.math.BigDecimal var15 = new java.math.BigDecimal(1.0d);
    java.lang.String var16 = var15.toString();
    long var17 = var15.longValue();
    java.math.BigDecimal var18 = var11.subtract(var15);
    java.math.BigDecimal var19 = var3.min(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "1"+ "'", var12.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "1"+ "'", var16.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getPatternSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == ';');

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("1", 0);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1.0d);
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal var5 = var1.remainder(var3);
    java.math.BigDecimal var7 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var8 = var3.remainder(var7);
    java.lang.String var9 = var8.toPlainString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "0"+ "'", var9.equals("0"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Formatter var0 = new java.util.Formatter();
    var0.flush();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("java.lang.Throwable: hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAwtEventQueueAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    java.lang.String var2 = var1.toString();
    long var3 = var1.longValue();
    java.math.BigDecimal var5 = new java.math.BigDecimal(1.0d);
    java.lang.String var6 = var5.toString();
    long var7 = var5.longValue();
    java.math.BigDecimal var8 = var1.subtract(var5);
    java.math.BigDecimal var10 = var8.setScale(100);
    java.math.BigDecimal var11 = var8.negate();
    java.math.BigDecimal var13 = new java.math.BigDecimal(1.0d);
    java.lang.String var14 = var13.toString();
    long var15 = var13.longValue();
    java.math.BigDecimal var17 = new java.math.BigDecimal(1.0d);
    java.lang.String var18 = var17.toString();
    long var19 = var17.longValue();
    java.math.BigDecimal var20 = var13.subtract(var17);
    java.math.BigDecimal var22 = var20.setScale(100);
    int var23 = var8.compareTo(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "1"+ "'", var6.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "1"+ "'", var14.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "1"+ "'", var18.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("java.lang.Throwable: hi!");
    var0.checkPackageDefinition("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPrintJobAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("java.lang.Throwable: hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("hi!", (java.lang.Object)0L);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    java.lang.String var2 = var1.toString();
    long var3 = var1.longValue();
    java.math.BigDecimal var5 = new java.math.BigDecimal(1.0d);
    java.lang.String var6 = var5.toString();
    long var7 = var5.longValue();
    java.math.BigDecimal var8 = var1.subtract(var5);
    java.math.BigDecimal var10 = var8.setScale(100);
    java.math.BigDecimal var11 = var8.negate();
    java.math.BigInteger var12 = var11.toBigIntegerExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "1"+ "'", var6.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
