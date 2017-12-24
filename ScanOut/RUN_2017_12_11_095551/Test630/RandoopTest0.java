
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var1 = sun.security.util.Debug.isOn("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var1.getDisplayName(true, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    java.util.TimeZone.setDefault(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var1 = new byte[] { (byte)100};
    java.lang.String var2 = sun.security.util.Debug.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "64"+ "'", var2.equals("64"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    java.lang.String var2 = var1.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "GMT"+ "'", var2.equals("GMT"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var1 = new java.util.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "64");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartRule(10, 1, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.ClassLoader var2 = java.lang.ClassLoader.getSystemClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var3 = java.lang.Class.forName("", true, var2);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var1 = new java.util.Date((-1L));
    var1.setMinutes(10);
    var1.setSeconds(100);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("GMT");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.WeakHashMap var1 = new java.util.WeakHashMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.lang.String var2 = var1.toLocaleString();
    int var3 = var1.getMonth();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Formatter var1 = new java.util.Formatter("64");
    java.lang.String[] var3 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    java.util.Formatter var4 = var1.format("", (java.lang.Object[])var3);
    java.lang.String[] var7 = java.util.TimeZone.getAvailableIDs(0);
    java.util.Formatter var8 = var4.format("hi!", (java.lang.Object[])var7);
    var4.flush();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.String var1 = var0.toGMTString();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.lang.ClassLoader var3 = java.lang.ClassLoader.getSystemClassLoader();
    var3.setClassAssertionStatus("31 Dec, 1969 11:59:59 PM", true);
    java.net.URLClassLoader var7 = java.net.URLClassLoader.newInstance(var2, var3);
    java.net.URL var9 = var7.findResource("");
    java.lang.ClassLoader var10 = var7.getParent();
    var7.setClassAssertionStatus("64", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Formatter var1 = new java.util.Formatter("64");
    java.lang.Appendable var2 = var1.out();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "64");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.getOffset(100, 1, 1, (-1), (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "64");
    var2.setStartYear(0);
    var2.setEndRule(100, 0, 100, 11);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Package var1 = java.lang.Package.getPackage("31 Dec, 1969 11:59:59 PM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 0);
    int[] var7 = new int[] { 0, 100, 10};
    int var8 = var2.getOffsets(0L, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "64");
    var2.setStartYear(0);
    var2.setRawOffset(11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setEndRule(11, (-1), 10, 100, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var0 = new java.util.Date();
    var0.setTime(1L);

  }

}
