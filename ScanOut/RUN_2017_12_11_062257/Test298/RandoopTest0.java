
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = sun.net.www.ParseUtil.decode("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.Object var4 = var1.put((java.lang.Object)var2, (java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("hi!");
    byte[] var4 = new byte[] { };
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var4, var5);
    int var7 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("hi!");
    byte[] var4 = new byte[] { };
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var4, var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = new java.lang.String(var4, "true");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.misc.Launcher var0 = new sun.misc.Launcher();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.String.valueOf(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("true", "true", "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var2 = new byte[] { (byte)100, (byte)10};
    java.lang.String var3 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "d\n"+ "'", var3.equals("d\n"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.File var1 = new java.io.File("hi!");
    java.lang.String var2 = var1.getCanonicalPath();
    boolean var5 = var1.setReadable(true, true);
    var1.deleteOnExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!"+ "'", var2.equals("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("hi!");
    var0.engineDeleteEntry("");
    int var5 = var0.engineSize();
    java.security.cert.Certificate[] var7 = var0.engineGetCertificateChain("d\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("", "", (java.lang.Object)' ');
    var0.exiting("d\n", "/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.File var1 = new java.io.File("hi!");
    boolean var2 = var1.exists();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.File var1 = new java.io.File("hi!");
    long var2 = var1.getFreeSpace();
    long var3 = var1.getFreeSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    var0.entering("hi!", "#");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.File var2 = new java.io.File("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!", "/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.File var1 = new java.io.File("hi!");
    java.lang.String var2 = var1.getCanonicalPath();
    boolean var5 = var1.setReadable(true, true);
    java.lang.String var6 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var8 = new java.util.Formatter(var1, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!"+ "'", var2.equals("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("", "", (java.lang.Object)' ');
    java.util.ResourceBundle var5 = var0.getResourceBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    java.util.Hashtable var5 = new java.util.Hashtable(10);
    boolean var7 = var5.contains((java.lang.Object)'4');
    boolean var9 = var5.equals((java.lang.Object)0L);
    var1.putAll((java.util.Map)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("d\n", "{}");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    char[] var1 = new char[] { '#'};
    java.lang.String var2 = java.lang.String.copyValueOf(var1);
    java.lang.String var3 = java.lang.String.valueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "#"+ "'", var2.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "#"+ "'", var3.equals("#"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String var2 = sun.net.www.ParseUtil.encodePath("{}", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "%7b%7d"+ "'", var2.equals("%7b%7d"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.io.File var1 = new java.io.File("hi!");
    java.io.File var3 = new java.io.File("hi!");
    java.lang.String var4 = var3.getCanonicalPath();
    boolean var5 = var3.isDirectory();
    java.lang.String var6 = var3.getName();
    java.net.URL var7 = var3.toURL();
    boolean var8 = var1.renameTo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!"+ "'", var4.equals("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test298/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

}
