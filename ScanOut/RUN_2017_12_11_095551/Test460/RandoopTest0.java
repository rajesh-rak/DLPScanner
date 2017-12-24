
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Thread var1 = new java.lang.Thread("hi!");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var2 = var0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var3 = new java.math.BigDecimal(var0, 0, (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(1, 1, 10);
    int var4 = var3.getMinutes();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.clear(1);
    boolean var4 = var0.after((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.HashMap var1 = new java.util.HashMap(0);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var4 = var2.setScale((-1));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    long var1 = var0.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512983253910L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.lang.Exception"+ "'", var1.equals("java.lang.Exception"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    java.util.Date var1 = var0.getTime();
    int var2 = var0.getFirstDayOfWeek();
    boolean var4 = var0.isSet(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.HashMap var1 = new java.util.HashMap(0);
    boolean var3 = var1.containsValue((java.lang.Object)10.0f);
    java.lang.Object var6 = var1.put((java.lang.Object)(byte)(-1), (java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var6 = var2.equals((java.lang.Object)10);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var13 = var9.equals((java.lang.Object)10);
    java.math.BigDecimal var14 = var2.divideToIntegralValue(var9);
    java.math.BigDecimal var16 = var9.scaleByPowerOfTen(10);
    java.lang.String var17 = var9.toPlainString();
    java.lang.String var18 = var9.toEngineeringString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "0.0000000001"+ "'", var17.equals("0.0000000001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100E-12"+ "'", var18.equals("100E-12"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 1, 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var8 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var9 = var5.equals((java.lang.Object)10);
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var15 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var16 = var12.equals((java.lang.Object)10);
    java.math.BigDecimal var17 = var5.divideToIntegralValue(var12);
    java.math.BigDecimal var18 = var2.multiply(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("java.lang.Exception");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Appendable var1 = var0.out();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var1 = new byte[] { (byte)(-1)};
    java.lang.String var2 = sun.security.util.Debug.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ff"+ "'", var2.equals("ff"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    java.util.Date var1 = var0.getTime();
    java.util.Date var5 = new java.util.Date(1, 1, 10);
    java.util.Calendar var6 = java.util.Calendar.getInstance();
    java.util.Date var7 = var6.getTime();
    boolean var8 = var5.after(var7);
    boolean var9 = var1.after(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Exception var1 = new java.lang.Exception();
    java.lang.Exception var2 = new java.lang.Exception("ff", (java.lang.Throwable)var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.HashMap var1 = new java.util.HashMap(0);
    boolean var3 = var1.containsValue((java.lang.Object)10.0f);
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.HashMap var1 = new java.util.HashMap(0);
    java.util.Collection var2 = var1.values();
    java.math.BigDecimal var6 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var10 = var6.equals((java.lang.Object)10);
    java.math.BigDecimal var13 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var16 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var17 = var13.equals((java.lang.Object)10);
    java.math.BigDecimal var18 = var6.divideToIntegralValue(var13);
    java.lang.Object var19 = var1.put((java.lang.Object)"100E-12", (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var6 = var2.equals((java.lang.Object)10);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var13 = var9.equals((java.lang.Object)10);
    java.math.BigDecimal var14 = var2.divideToIntegralValue(var9);
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var20 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var21 = var17.equals((java.lang.Object)10);
    java.math.BigDecimal var24 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var27 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var28 = var24.equals((java.lang.Object)10);
    java.math.BigDecimal var29 = var17.divideToIntegralValue(var24);
    java.math.BigDecimal var30 = var9.min(var24);
    java.math.BigDecimal var33 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var36 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var37 = var33.equals((java.lang.Object)10);
    java.math.BigDecimal var40 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var43 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var44 = var40.equals((java.lang.Object)10);
    java.math.BigDecimal var45 = var33.divideToIntegralValue(var40);
    java.math.BigDecimal var47 = var40.scaleByPowerOfTen(10);
    java.lang.String var48 = var40.toPlainString();
    java.math.BigDecimal var50 = var24.divide(var40, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "0.0000000001"+ "'", var48.equals("0.0000000001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var3 = new java.util.Date(1, 1, 10);
    java.util.Calendar var4 = java.util.Calendar.getInstance();
    java.util.Date var5 = var4.getTime();
    boolean var6 = var3.after(var5);
    var3.setMonth(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var8 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var9 = var5.equals((java.lang.Object)10);
    java.math.BigDecimal var10 = var2.add(var5);
    java.math.BigDecimal var13 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var16 = java.math.BigDecimal.valueOf(1L, 10);
    java.math.BigDecimal var19 = java.math.BigDecimal.valueOf(1L, 10);
    boolean var20 = var16.equals((java.lang.Object)10);
    java.math.BigDecimal var21 = var13.add(var16);
    java.lang.String var22 = var13.toEngineeringString();
    java.math.BigDecimal var23 = var10.max(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "100E-12"+ "'", var22.equals("100E-12"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.Exception var1 = new java.lang.Exception();
    java.lang.Exception var2 = new java.lang.Exception("{}", (java.lang.Throwable)var1);

  }

}
