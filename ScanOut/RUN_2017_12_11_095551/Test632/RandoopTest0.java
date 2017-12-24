
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Vector var4 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.addAll(10, (java.util.Collection)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.File var1 = new java.io.File("");
    boolean var4 = var1.setExecutable(true, true);
    long var5 = var1.getFreeSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var6 = new java.util.Formatter(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Vector var3 = new java.util.Vector(10);
    boolean var4 = var1.addAll((java.util.Collection)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setElementAt((java.lang.Object)1L, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Vector var3 = new java.util.Vector(10);
    boolean var4 = var1.addAll((java.util.Collection)var3);
    int var5 = var1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Thread var1 = new java.lang.Thread("");
    java.lang.Thread var2 = new java.lang.Thread((java.lang.Runnable)var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.File var1 = new java.io.File("");
    long var2 = var1.length();
    java.lang.String var3 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.File var3 = new java.io.File("");
    boolean var6 = var3.setExecutable(true, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.File var7 = java.io.File.createTempFile("INR", "INR", var3);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Throwable var0 = new java.lang.Throwable();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.text.DecimalFormatSymbols var2 = new java.text.DecimalFormatSymbols();
    boolean var3 = var1.equals((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.File var1 = new java.io.File("hi!");
    boolean var2 = var1.delete();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.File var1 = new java.io.File("");
    long var2 = var1.length();
    boolean var3 = var1.isAbsolute();
    boolean var4 = var1.canWrite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.io.File var1 = new java.io.File("");
    java.io.File[] var2 = var1.listFiles();
    boolean var5 = var1.setExecutable(true, false);
    var1.deleteOnExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.File var1 = new java.io.File("");
    boolean var4 = var1.setExecutable(true, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var5 = new java.io.PrintStream(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.File var1 = new java.io.File("");
    boolean var4 = var1.setExecutable(true, true);
    boolean var5 = var1.isDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.createNewFile();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.File var1 = new java.io.File("");
    boolean var4 = var1.setExecutable(true, true);
    java.io.File var6 = new java.io.File(var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.io.File var1 = new java.io.File("");
    long var2 = var1.length();
    boolean var3 = var1.isAbsolute();
    java.lang.String var4 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.lang.Thread var3 = new java.lang.Thread("");
    boolean var4 = var1.remove((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Vector var3 = new java.util.Vector(10);
    boolean var4 = var1.addAll((java.util.Collection)var3);
    boolean var6 = var3.removeElement((java.lang.Object)"hi!");
    java.util.Formatter var7 = new java.util.Formatter();
    java.util.Locale var8 = var7.locale();
    int var9 = var3.indexOf((java.lang.Object)var8);
    java.util.Enumeration var10 = var3.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.io.File var3 = new java.io.File("");
    boolean var6 = var3.setExecutable(true, true);
    boolean var7 = var1.contains((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.io.File var3 = new java.io.File("");
    long var4 = var3.length();
    boolean var5 = var3.isAbsolute();
    java.lang.Object[] var6 = new java.lang.Object[] { var5};
    java.util.Formatter var7 = var0.format("INR", var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.remove(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInternationalCurrencySymbol();
    var0.setMonetaryDecimalSeparator('4');
    java.lang.Object var4 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "INR"+ "'", var1.equals("INR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.io.File var1 = new java.io.File("");
    long var2 = var1.getTotalSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

}
