
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


    java.lang.String var1 = new java.lang.String("100.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100.0"+ "'", var1.equals("100.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.util.Debug.println("", "hi!");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.rmi.server.RMISocketFactory var0 = java.rmi.server.RMISocketFactory.getDefaultSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.File[] var0 = java.io.File.listRoots();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.io.File var1 = new java.io.File("hi!");
    java.net.URL var2 = var1.toURL();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var4 = new java.util.Formatter(var1, "100.0");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.lastIndexOf((java.lang.Object)10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.PrintStream var1 = new java.io.PrintStream("100.0");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    java.util.Locale var3 = var2.locale();
    javax.swing.JComponent.setDefaultLocale(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.PrintStream var1 = new java.io.PrintStream("100.0");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    java.util.Locale var3 = var2.locale();
    var2.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.io.PrintStream var1 = new java.io.PrintStream("100.0");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    var1.print("");
    java.util.Formatter var5 = new java.util.Formatter((java.lang.Appendable)var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var2 = new char[] { 'a', 'a'};
    java.lang.String var3 = java.lang.String.valueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aa"+ "'", var3.equals("aa"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.io.PrintStream var1 = new java.io.PrintStream("100.0");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    java.util.Locale var3 = var2.locale();
    java.security.ProtectionDomain[] var5 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var6 = new java.security.AccessControlContext(var5);
    java.lang.String var7 = java.lang.String.format(var3, "10.0", (java.lang.Object[])var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10.0"+ "'", var7.equals("10.0"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.File var1 = new java.io.File("hi!");
    java.io.File var2 = var1.getCanonicalFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var1 = new java.io.PrintStream("100.0");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    java.io.PrintStream var4 = var1.append(' ');
    var1.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)(short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.krb5.KrbException var2 = new sun.security.krb5.KrbException(10, "");

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    byte[] var3 = new byte[] { (byte)(-1), (byte)(-1)};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var5 = new java.lang.String(var3);
    boolean var6 = var0.add((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.indexOf((java.lang.Object)false, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\uFFFD\uFFFD"+ "'", var4.equals("\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\uFFFD\uFFFD"+ "'", var5.equals("\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getMinusSign();
    char var2 = var0.getPerMill();
    var0.setDigit('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '-');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '\u2030');

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    java.lang.String var3 = new java.lang.String(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var2, (-1), 0, "\uFFFD\uFFFD");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD\uFFFD"+ "'", var3.equals("\uFFFD\uFFFD"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.File var1 = new java.io.File("hi!");
    java.io.File var3 = new java.io.File("hi!");
    java.net.URL var4 = var3.toURL();
    int var5 = var1.compareTo(var3);
    boolean var6 = var1.isFile();
    boolean var9 = var1.setExecutable(false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    byte[] var3 = new byte[] { (byte)(-1), (byte)(-1)};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var5 = new java.lang.String(var3);
    boolean var6 = var0.add((java.lang.Object)var3);
    var0.clear();
    int var8 = var0.capacity();
    java.util.Vector var9 = new java.util.Vector();
    boolean var11 = var9.removeElement((java.lang.Object)(short)0);
    java.lang.Object var12 = var9.clone();
    boolean var13 = var0.addAll((java.util.Collection)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\uFFFD\uFFFD"+ "'", var4.equals("\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\uFFFD\uFFFD"+ "'", var5.equals("\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.io.PrintStream var1 = new java.io.PrintStream("100.0");
    var1.println(true);
    var1.println();
    var1.write(100);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setGroupingSeparator('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
