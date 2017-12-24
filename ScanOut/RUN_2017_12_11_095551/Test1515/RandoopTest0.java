
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv6LiteralAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var1 = new char[] { ' '};
    java.lang.String var2 = java.lang.String.copyValueOf(var1);
    java.lang.String var3 = new java.lang.String(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var1, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " "+ "'", var2.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " "+ "'", var3.equals(" "));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var3 = new byte[] { (byte)(-1), (byte)1, (byte)10};
    byte[] var4 = sun.net.util.IPAddressUtil.convertFromIPv4MappedAddress(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.CoreResourceBundleControl var1 = sun.util.CoreResourceBundleControl.getRBControlInstance("10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    java.lang.String var3 = new java.lang.String(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var2, 10, (-1), "4  ");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD\uFFFD"+ "'", var3.equals("\uFFFD\uFFFD"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = java.lang.String.valueOf(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("hi!", "");
    java.util.logging.Filter var4 = var0.getFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    boolean var2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence)" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("\uFF64");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("hi!", "");
    java.lang.String var4 = var0.getResourceBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.util.Enumeration var4 = var1.getResources(" ", true);
    sun.misc.Resource var7 = var1.getResource("hi!", true);
    sun.misc.Resource var10 = var1.getResource("", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.net.util.IPAddressUtil var0 = new sun.net.util.IPAddressUtil();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var2 = new java.lang.Object[] { 0L};
    java.lang.String var3 = java.lang.String.format("\uFF64", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFF64"+ "'", var3.equals("\uFF64"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.util.Enumeration var4 = var1.getResources(" ", true);
    java.util.Enumeration var6 = var1.getResources("\uFFFD\uFFFD");
    java.net.URL var9 = var1.findResource("4  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    byte[] var2 = new byte[] { (byte)1, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 0, 0, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = new java.lang.String("\uFF64");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFF64"+ "'", var1.equals("\uFF64"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var1 = java.lang.String.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    char[] var3 = new char[] { '4', ' ', ' '};
    java.lang.String var4 = java.lang.String.valueOf(var3);
    java.lang.String var7 = java.lang.String.copyValueOf(var3, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "4  "+ "'", var4.equals("4  "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "4"+ "'", var7.equals("4"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var1 = new byte[] { (byte)100};
    java.lang.String var3 = new java.lang.String(var1, (-1));
    java.lang.String var4 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFF64"+ "'", var3.equals("\uFF64"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "d"+ "'", var4.equals("d"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    sun.misc.URLClassPath var2 = new sun.misc.URLClassPath(var0);
    sun.misc.Resource var4 = var2.getResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var1 = java.lang.String.valueOf(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    boolean var3 = var0.getUseParentHandlers();
    java.util.logging.Level var4 = var0.getLevel();
    var0.config("\uFFFD\uFFFD");
    var0.setUseParentHandlers(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.regex.Pattern var1 = java.util.regex.Pattern.compile("hi!");
    java.lang.String[] var4 = var1.split((java.lang.CharSequence)"hi!", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    var0.entering(" ", "", (java.lang.Object)'a');
    var0.warning("4  ");
    var0.config("4  ");
    var0.entering("10.0", "10.0", (java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
