
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.security.Security.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var1 = java.security.cert.CertificateFactory.getInstance("hi!");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var4 = var2.movePointLeft(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Set var1 = java.security.Security.getAlgorithms("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Exception var2 = new java.lang.Exception("", var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var3 = var2.toBigIntegerExact();
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.security.Provider[] var3 = java.security.Security.getProviders((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.util.Locale var2 = var1.locale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();
    java.util.Enumeration var2 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.Security.removeProvider("hi!");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var6 = var2.add(var5);
    java.math.BigDecimal var8 = var2.pow(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var9 = var2.toBigIntegerExact();
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.security.Provider[] var1 = java.security.Security.getProviders((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.security.Provider[] var3 = new java.security.Provider[] { };
    sun.security.jca.ProviderList var4 = sun.security.jca.ProviderList.newList(var3);
    java.util.Formatter var5 = var1.format("", (java.lang.Object[])var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var6 = var2.add(var5);
    float var7 = var2.floatValue();
    java.math.BigDecimal var10 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var13 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var14 = var10.add(var13);
    java.math.BigDecimal var15 = var10.ulp();
    java.math.BigDecimal var18 = var2.divide(var10, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0E-9f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var6 = var2.add(var5);
    java.math.BigDecimal var7 = var2.ulp();
    java.math.BigDecimal var9 = var7.movePointLeft(100);
    java.math.BigDecimal var11 = var7.pow(0);
    int var12 = var11.scale();
    java.math.BigDecimal var14 = var11.pow(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.security.Provider[] var0 = new java.security.Provider[] { };
    sun.security.jca.ProviderList var1 = sun.security.jca.ProviderList.newList(var0);
    java.security.Provider.Service var4 = var1.getService("hi!", "hi!");
    java.util.List var5 = var1.providers();
    java.util.List var6 = var1.providers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var6 = var2.add(var5);
    java.math.BigDecimal var7 = var2.ulp();
    java.math.BigDecimal var10 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var13 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var14 = var10.add(var13);
    java.math.BigDecimal var15 = var10.ulp();
    java.math.BigDecimal var16 = var7.divideToIntegralValue(var10);
    int var17 = var7.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var6 = var2.add(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var13 = var9.add(var12);
    java.math.BigDecimal var14 = var9.ulp();
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var20 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var21 = var17.add(var20);
    java.math.BigDecimal var22 = var17.ulp();
    java.math.BigDecimal var23 = var14.divideToIntegralValue(var17);
    int var24 = var5.compareTo(var23);
    java.math.BigDecimal var25 = var5.stripTrailingZeros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var6 = var2.add(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var13 = var9.add(var12);
    java.math.BigDecimal var14 = var9.ulp();
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var20 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var21 = var17.add(var20);
    java.math.BigDecimal var22 = var17.ulp();
    java.math.BigDecimal var23 = var14.divideToIntegralValue(var17);
    java.math.BigDecimal var24 = var6.add(var14);
    java.math.BigDecimal var27 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var30 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var31 = var27.add(var30);
    java.math.BigDecimal var32 = var27.ulp();
    java.math.BigDecimal var34 = var32.movePointLeft(100);
    java.math.BigDecimal var36 = var6.divide(var32, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.security.Provider[] var0 = new java.security.Provider[] { };
    sun.security.jca.ProviderList var1 = sun.security.jca.ProviderList.newList(var0);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[]"+ "'", var2.equals("[]"));

  }

}
