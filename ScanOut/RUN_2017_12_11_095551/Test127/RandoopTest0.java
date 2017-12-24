
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var2 = new byte[] { (byte)10, (byte)1};
    java.lang.String var3 = sun.security.util.Debug.toString(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0a:01"+ "'", var3.equals("0a:01"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    var0.readConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    int[] var1 = new int[] { 0};
    java.lang.String var4 = new java.lang.String(var1, 1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var1, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Formatter var1 = new java.util.Formatter("0a:01");

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.print(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var5 = new java.util.Formatter((java.io.OutputStream)var1, "false");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("0a:01");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Q0a:01\\E"+ "'", var1.equals("\\Q0a:01\\E"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append((java.lang.CharSequence)"hi!");
    var3.print(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append((java.lang.CharSequence)"hi!");
    var3.println(100.0f);
    java.io.PrintStream var7 = new java.io.PrintStream("hi!");
    java.io.PrintStream var9 = var7.append((java.lang.CharSequence)"hi!");
    java.io.PrintStream var11 = new java.io.PrintStream("hi!");
    java.io.PrintStream var13 = var11.append((java.lang.CharSequence)"hi!");
    java.util.Formatter var14 = new java.util.Formatter(var11);
    java.util.Locale var15 = var14.locale();
    java.util.Formatter var16 = new java.util.Formatter((java.lang.Appendable)var7, var15);
    java.lang.Object[] var19 = new java.lang.Object[] { 10L};
    java.io.PrintStream var20 = var3.format(var15, "", var19);
    java.io.PrintStream var22 = var20.append('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var1 = new java.lang.String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append((java.lang.CharSequence)"hi!");
    java.util.Formatter var4 = new java.util.Formatter(var1);
    java.io.IOException var5 = var4.ioException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    char[] var2 = new char[] { '4', '4'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "44"+ "'", var3.equals("44"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    boolean var2 = java.util.regex.Pattern.matches("false", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("0a:01", "0a:01");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append((java.lang.CharSequence)"hi!");
    var1.println("0a:01");
    java.io.PrintStream var7 = new java.io.PrintStream("hi!");
    java.io.PrintStream var9 = var7.append((java.lang.CharSequence)"hi!");
    var9.println(100.0f);
    java.io.PrintStream var13 = new java.io.PrintStream("hi!");
    java.io.PrintStream var15 = var13.append((java.lang.CharSequence)"hi!");
    java.io.PrintStream var17 = new java.io.PrintStream("hi!");
    java.io.PrintStream var19 = var17.append((java.lang.CharSequence)"hi!");
    java.util.Formatter var20 = new java.util.Formatter(var17);
    java.util.Locale var21 = var20.locale();
    java.util.Formatter var22 = new java.util.Formatter((java.lang.Appendable)var13, var21);
    java.lang.Object[] var25 = new java.lang.Object[] { 10L};
    java.io.PrintStream var26 = var9.format(var21, "", var25);
    java.lang.Object[] var29 = new java.lang.Object[] { ""};
    java.io.PrintStream var30 = var1.printf(var21, "false", var29);
    var30.print('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append((java.lang.CharSequence)"hi!");
    java.util.Formatter var4 = new java.util.Formatter((java.io.OutputStream)var3);
    var4.close();
    java.io.IOException var6 = var4.ioException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    char[] var2 = new char[] { '#', ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = java.lang.String.copyValueOf(var2, 0, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append((java.lang.CharSequence)"hi!");
    java.io.PrintStream var5 = var3.append((java.lang.CharSequence)"44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var1 = new java.util.Formatter("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var1 = java.lang.String.valueOf((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append((java.lang.CharSequence)"hi!");
    boolean var4 = var3.checkError();
    java.io.PrintStream var6 = var3.append((java.lang.CharSequence)"false");
    var6.write(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    var0.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.print(100);
    var1.print((-1L));
    java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var1 = java.lang.String.valueOf('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append((java.lang.CharSequence)"hi!");
    java.util.Formatter var4 = new java.util.Formatter(var1);
    var1.println(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Package var1 = java.lang.Package.getPackage("0a:01");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Formatter var0 = new java.util.Formatter();

  }

}
