
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100.0"+ "'", var1.equals("100.0"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = java.lang.String.copyValueOf(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var0, 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = new java.lang.String("1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.lang.Exception"+ "'", var1.equals("java.lang.Exception"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "global"+ "'", var1.equals("global"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    var2.clear();
    java.util.Set var5 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    var2.clear();
    java.util.Hashtable var7 = new java.util.Hashtable(10, 100.0f);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var7);
    var7.clear();
    var2.putAll((java.util.Map)var7);
    java.util.Hashtable var11 = new java.util.Hashtable((java.util.Map)var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    var2.clear();
    java.util.Hashtable var7 = new java.util.Hashtable(10, 100.0f);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var7);
    var7.clear();
    var2.putAll((java.util.Map)var7);
    int var11 = var7.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.util.Debug.println("\u0A0A\u0AFF", "java.lang.Exception");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.PrintStream var1 = new java.io.PrintStream("global");
    java.util.Formatter var2 = new java.util.Formatter((java.io.OutputStream)var1);
    boolean var3 = var1.checkError();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.entering("100.0", "hi!", (java.lang.Object)'4');
    java.lang.String var5 = var0.getResourceBundleName();
    var0.entering("global", "100.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.PrintStream var1 = new java.io.PrintStream("global");
    java.util.Formatter var2 = new java.util.Formatter((java.io.OutputStream)var1);
    var1.print("100.0");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    byte[] var1 = new byte[] { (byte)1};
    java.lang.String var2 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\u0001"+ "'", var2.equals("\u0001"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("global");
    var1.println();
    var1.println(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var7 = new java.io.PrintStream((java.io.OutputStream)var1, true, "100.0");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.entering("100.0", "hi!", (java.lang.Object)'4');
    java.lang.String var5 = var0.getResourceBundleName();
    java.lang.String var6 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "global"+ "'", var6.equals("global"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.entering("100.0", "hi!", (java.lang.Object)'4');
    var0.warning("hi!");
    java.util.ResourceBundle var7 = var0.getResourceBundle();
    var0.exiting("\u0A0A\u0AFF", "\u0A0A\u0AFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    byte[] var2 = new byte[] { (byte)10, (byte)(-1)};
    java.lang.String var4 = new java.lang.String(var2, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var2, 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u0A0A\u0AFF"+ "'", var4.equals("\u0A0A\u0AFF"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.entering("100.0", "hi!", (java.lang.Object)'4');
    var0.warning("hi!");
    java.util.ResourceBundle var7 = var0.getResourceBundle();
    java.util.logging.Level var8 = var0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.lang.Throwable var5 = new java.lang.Throwable("global");
    java.io.PrintStream var7 = new java.io.PrintStream("global");
    var7.println();
    var7.println(1L);
    java.lang.Object var11 = var2.put((java.lang.Object)"global", (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);
    java.lang.Object var4 = var2.get((java.lang.Object)100L);
    java.lang.String var5 = java.lang.String.valueOf((java.lang.Object)var2);
    java.util.Enumeration var6 = var2.keys();
    java.util.Set var7 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "{}"+ "'", var5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.io.PrintStream var1 = new java.io.PrintStream("global");
    java.util.Formatter var2 = new java.util.Formatter((java.io.OutputStream)var1);
    var2.close();

  }

}
