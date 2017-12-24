
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    byte[] var4 = var3.getValue();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.get("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.lang.Appendable var2 = var1.out();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var3 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var3);
    byte[] var5 = var4.getValue();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Exception var2 = new java.lang.Exception();
    java.lang.Throwable var3 = new java.lang.Throwable("hi!", (java.lang.Throwable)var2);
    java.lang.Throwable var4 = new java.lang.Throwable("hi!", var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    java.util.Vector var7 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var8 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var2.set(10, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    var1.flush();
    java.lang.String var3 = var1.toString();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.util.zip.ZipException");
    } catch (java.util.zip.ZipException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var5);
    java.util.Vector var9 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var10 = new sun.security.x509.ExtendedKeyUsageExtension(var9);
    java.lang.Object var11 = var5.remove((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    boolean var4 = var2.contains((java.lang.Object)100.0f);
    int var6 = var2.lastIndexOf((java.lang.Object)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)"", 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var5);
    java.util.Formatter var8 = new java.util.Formatter("hi!");
    var8.flush();
    java.lang.Object var10 = var5.get((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    int var6 = var2.indexOf((java.lang.Object)(byte)100, 0);
    boolean var8 = var2.remove((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.set("hi!", (java.lang.Object)100);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    boolean var4 = var3.isCritical();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    java.util.ListIterator var4 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setGroupingSeparator('#');
    java.lang.String var3 = var0.getCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Rs."+ "'", var3.equals("Rs."));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Exception var1 = new java.lang.Exception();
    java.lang.Throwable var2 = new java.lang.Throwable("hi!", (java.lang.Throwable)var1);
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    var1.flush();
    var1.flush();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("Rs.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    java.util.Vector var5 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var6 = new sun.security.x509.ExtendedKeyUsageExtension(var5);
    int var9 = var5.indexOf((java.lang.Object)(byte)100, 0);
    java.lang.Object[] var10 = new java.lang.Object[] { var9};
    var2.copyInto(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);
    java.util.Iterator var3 = var2.iterator();
    java.lang.Exception var5 = new java.lang.Exception();
    java.lang.Throwable var6 = new java.lang.Throwable("hi!", (java.lang.Throwable)var5);
    boolean var7 = var2.add((java.lang.Object)var6);
    var2.ensureCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setExponentSeparator("hi!");

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var3 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var3);
    var3.addElement((java.lang.Object)10L);
    int var7 = var3.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var3.subList(0, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var3 = new java.util.Vector(100, 0);
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, var3);
    var3.addElement((java.lang.Object)10L);
    var3.ensureCapacity(100);
    int var9 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    var1.flush();
    var1.close();

  }

}
