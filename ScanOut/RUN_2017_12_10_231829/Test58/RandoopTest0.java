
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var1 = new java.lang.StringBuilder((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 10, 10, 1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setWeekDate(0, 1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = new java.lang.String(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    char[] var4 = new char[] { ' '};
    java.lang.StringBuilder var5 = var1.insert(1, var4);
    java.lang.StringBuilder var10 = var1.insert(0, (java.lang.CharSequence)"hi!", 1, 1);
    java.lang.StringBuilder var13 = var1.insert(1, (-1.0d));
    java.lang.StringBuilder var16 = new java.lang.StringBuilder("hi!");
    char[] var19 = new char[] { ' '};
    java.lang.StringBuilder var20 = var16.insert(1, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var23 = var1.insert(10, var19, 10, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    long var6 = java.util.Date.UTC(0, 10, 10, 1, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2181935999000L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.rmi.server.UnicastServerRef var0 = new sun.rmi.server.UnicastServerRef();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = var0.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 10, 10, 1, 0);
    boolean var8 = var6.before((java.lang.Object)0L);
    var6.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = new java.lang.String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var6 = new java.util.Date(10, 1, 0, (-1), 10, 1);
    java.lang.String var7 = var6.toGMTString();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    char[] var4 = new char[] { ' '};
    java.lang.StringBuilder var5 = var1.insert(1, var4);
    char[] var9 = new char[] { ' ', '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var10 = var1.insert(100, var9);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 10, 10, 1, 0);
    boolean var8 = var6.before((java.lang.Object)0L);
    var6.setFirstDayOfWeek((-1));
    long var11 = var6.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-61850978940000L));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 10, 10, 1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var6.getMinimum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.GregorianCalendar var7 = new java.util.GregorianCalendar(10, 0, 10, 10, 1, 0);
    java.lang.Object var8 = var0.remove((java.lang.Object)0);
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var0);
    var0.clear();
    java.lang.String var13 = var0.getProperty("", "100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100"+ "'", var13.equals("100"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date(10, 1, 0, (-1), 10, 1);
    java.util.Date var10 = new java.util.Date(10, 1, 100);
    int var11 = var6.compareTo(var10);
    java.lang.Object var12 = var10.clone();
    var10.setMinutes(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    char[] var4 = new char[] { ' '};
    java.lang.StringBuilder var5 = var1.insert(1, var4);
    java.lang.StringBuilder var10 = var1.insert(0, (java.lang.CharSequence)"hi!", 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var13 = var10.insert((-1), 100.0f);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    java.lang.StringBuilder var3 = var1.append((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.String.valueOf(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityException var0 = new java.lang.SecurityException();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 10, 10, 1, 0);
    boolean var8 = var6.before((java.lang.Object)0L);
    int var9 = var6.getFirstDayOfWeek();
    int var11 = var6.getActualMinimum(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Exception var1 = new java.lang.Exception("hi!");
    java.lang.RuntimeException var2 = new java.lang.RuntimeException((java.lang.Throwable)var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.rmi.server.UnicastServerRef var0 = new sun.rmi.server.UnicastServerRef();
    sun.rmi.server.UnicastServerRef var1 = new sun.rmi.server.UnicastServerRef();
    boolean var2 = var0.remoteEquals((java.rmi.server.RemoteRef)var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar(10, 0, 10, 10, 1, 0);
    java.lang.Object var9 = var1.remove((java.lang.Object)0);
    boolean var11 = var1.equals((java.lang.Object)10.0d);
    var0.putAll((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    char[] var4 = new char[] { ' '};
    java.lang.StringBuilder var5 = var1.insert(1, var4);
    java.lang.StringBuilder var7 = var1.append(10);
    java.lang.StringBuilder var10 = var7.delete(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    char[] var4 = new char[] { ' '};
    java.lang.StringBuilder var5 = var1.insert(1, var4);
    java.lang.StringBuilder var7 = var1.append(10);
    java.lang.StringBuilder var10 = var7.insert(1, "0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 10, 10, 1, 0);
    boolean var8 = var6.before((java.lang.Object)0L);
    int var9 = var6.getFirstDayOfWeek();
    java.util.Date var10 = var6.getGregorianChange();
    var6.roll(10, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

}
