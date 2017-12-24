
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    char[] var3 = new char[] { '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var4 = var0.insert(1, var3);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var3 = new java.util.Date((-1), 10, 1);
    var3.setSeconds(1);
    java.util.Date var9 = new java.util.Date((-1), 10, 1);
    boolean var10 = var3.after(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var3 = var0.insert((-1), 0.0d);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append('4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var5 = var0.insert((-1), 'a');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "100");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var3 = new java.util.Date((-1), 10, 1);
    var3.setSeconds(1);
    var3.setMonth(0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var2 = new byte[] { (byte)1, (byte)(-1)};
    java.lang.String var6 = new java.lang.String(var2, (-1), 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\uFF01"+ "'", var6.equals("\uFF01"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var1 = new java.util.Properties();
    javax.naming.Context var2 = javax.naming.spi.NamingManager.getURLContext("", (java.util.Hashtable)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var3 = javax.naming.spi.NamingManager.getInitialContext((java.util.Hashtable)var1);
      fail("Expected exception of type javax.naming.NoInitialContextException");
    } catch (javax.naming.NoInitialContextException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var3 = new java.util.Date((-1), 10, 1);
    java.lang.String var4 = var3.toGMTString();
    var3.setYear((-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var1 = new java.util.Properties();
    javax.naming.Context var2 = javax.naming.spi.NamingManager.getURLContext("", (java.util.Hashtable)var1);
    java.util.Hashtable var3 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append('4');
    java.lang.StringBuilder var4 = var2.append("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append('4');
    java.lang.StringBuilder var4 = var2.append(' ');
    java.lang.StringBuilder var6 = var2.append(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    boolean var3 = var0.containsKey((java.lang.Object)true);
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var0);
    var4.clear();
    java.lang.Exception var7 = new java.lang.Exception("4");
    boolean var8 = var4.containsValue((java.lang.Object)"4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var2 = new byte[] { (byte)100, (byte)(-1)};
    java.lang.String var6 = new java.lang.String(var2, 0, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\u00FF"+ "'", var6.equals("\u00FF"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var3 = new java.util.Date(10, 1, 10);
    var3.setYear(10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append('4');
    java.lang.StringBuilder var4 = var0.append(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Exception var2 = new java.lang.Exception("4");
    java.lang.Exception var3 = new java.lang.Exception((java.lang.Throwable)var2);
    java.lang.Exception var4 = new java.lang.Exception("\uFF01", (java.lang.Throwable)var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append('4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var5 = var0.delete(100, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    boolean var3 = var1.equals((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Exception var1 = new java.lang.Exception("4");
    java.lang.Exception var2 = new java.lang.Exception((java.lang.Throwable)var1);
    java.lang.Exception var5 = new java.lang.Exception("4");
    java.lang.RuntimeException var6 = new java.lang.RuntimeException("hi!", (java.lang.Throwable)var5);
    var2.addSuppressed((java.lang.Throwable)var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    boolean var3 = var0.containsKey((java.lang.Object)true);
    java.util.Set var4 = var0.stringPropertyNames();
    java.util.Properties var5 = new java.util.Properties();
    java.util.Properties var6 = new java.util.Properties(var5);
    boolean var8 = var5.containsKey((java.lang.Object)true);
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var5);
    var0.putAll((java.util.Map)var5);
    int var11 = var5.size();
    java.util.Properties var12 = new java.util.Properties();
    java.util.Properties var13 = new java.util.Properties(var12);
    boolean var15 = var12.containsKey((java.lang.Object)true);
    java.util.Set var16 = var12.stringPropertyNames();
    var5.putAll((java.util.Map)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = java.lang.String.copyValueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append('4');
    java.lang.StringBuilder var4 = var2.append(' ');
    java.lang.StringBuilder var5 = new java.lang.StringBuilder();
    java.lang.StringBuilder var7 = var5.append('4');
    java.lang.StringBuilder var9 = var7.append(' ');
    java.lang.StringBuilder var10 = new java.lang.StringBuilder((java.lang.CharSequence)var7);
    char[] var12 = new char[] { ' '};
    java.lang.StringBuilder var13 = var10.append(var12);
    java.lang.StringBuilder var14 = var2.append((java.lang.CharSequence)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

}
