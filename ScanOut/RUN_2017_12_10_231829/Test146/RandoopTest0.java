
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.org.apache.xml.internal.security.transforms.implementations.TransformXSLT var0 = new com.sun.org.apache.xml.internal.security.transforms.implementations.TransformXSLT();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = java.lang.String.copyValueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var5 = var1.replace((-1), 10, "hi!");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var4 = var1.insert((-1), "hi!");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(1, 0, 0);
    java.util.Date var7 = new java.util.Date(1, 0, 0);
    boolean var8 = var3.before(var7);
    java.util.Date var12 = new java.util.Date(1, 0, 0);
    java.util.Date var16 = new java.util.Date(1, 0, 0);
    boolean var17 = var12.before(var16);
    boolean var18 = var7.after(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getMonth();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.SecurityException var2 = new java.lang.SecurityException("");
    java.lang.Throwable var3 = new java.lang.Throwable("1.0", (java.lang.Throwable)var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)10};
    java.lang.String var3 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD\n"+ "'", var3.equals("\uFFFD\n"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"1.0");
    java.lang.StringBuilder var5 = var3.append(100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var8 = var5.insert(10, 11);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var6 = new java.util.Date(11, 10, 100, 1, 100, 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.RuntimeException var1 = new java.lang.RuntimeException("");

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    var1.severe("");
    var1.info("1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.SecurityException var1 = new java.lang.SecurityException("hi!");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"1.0");
    java.lang.StringBuilder var5 = var3.append(100.0d);
    java.lang.StringBuilder var7 = var5.append('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"1.0");
    java.lang.StringBuilder var5 = var3.append(100.0d);
    java.lang.StringBuilder var8 = var5.insert(1, 11);
    char[] var10 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var11 = var8.insert(100, var10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var5 = new java.lang.String(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u0001\n\u0000"+ "'", var4.equals("\u0001\n\u0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u0001\n\u0000"+ "'", var5.equals("\u0001\n\u0000"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Throwable var2 = new java.lang.Throwable("");
    java.lang.Throwable var3 = new java.lang.Throwable("\uFFFD\n", var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("\u0001\n\u0000", "\uFFFD\n");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"1.0");
    java.lang.StringBuilder var5 = var3.append(100.0d);
    java.lang.StringBuilder var8 = var5.insert(1, 11);
    java.lang.StringBuilder var10 = var8.append(0);
    java.lang.StringBuilder var12 = var10.append(1.0d);
    int var14 = var10.lastIndexOf("\uFFFD\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"1.0");
    java.lang.StringBuilder var5 = var3.append(100.0d);
    java.lang.StringBuilder var7 = var3.append("\uFFFD\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"1.0");
    java.lang.StringBuilder var5 = var3.append(100.0d);
    java.lang.StringBuilder var8 = var5.insert(1, 11);
    java.lang.StringBuilder var11 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var13 = var11.append((java.lang.CharSequence)"1.0");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var16 = var8.insert(10, (java.lang.CharSequence)var11, 10, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var3 = new java.util.Date(1, 0, 0);
    java.util.Date var7 = new java.util.Date(1, 0, 0);
    boolean var8 = var3.before(var7);
    var3.setMonth(1);
    var3.setMonth(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var4 = new java.lang.String(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, (-1), 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u0001\n\u0000"+ "'", var4.equals("\u0001\n\u0000"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    var1.severe("");
    java.lang.String var4 = var1.getName();
    var1.setUseParentHandlers(false);
    java.util.ResourceBundle var7 = var1.getResourceBundle();
    java.lang.SecurityException var12 = new java.lang.SecurityException("");
    java.lang.SecurityException var13 = new java.lang.SecurityException((java.lang.Throwable)var12);
    java.lang.Throwable var14 = new java.lang.Throwable("hi!", (java.lang.Throwable)var12);
    var1.throwing("\u0001\n\u0000", "1.0", (java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    var1.severe("");
    var1.info("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
