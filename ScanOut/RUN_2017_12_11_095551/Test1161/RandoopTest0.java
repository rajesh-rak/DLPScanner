
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getNaN();
    char var2 = var0.getGroupingSeparator();
    char var3 = var0.getDecimalSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFFFD"+ "'", var1.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ',');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '.');

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var1 = sun.misc.VMSupport.isClassPathAttributePresent("\uFFFD");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getResourceBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var2 = new byte[] { (byte)1, (byte)1};
    java.lang.String var3 = new java.lang.String(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 100, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u0001\u0001"+ "'", var3.equals("\u0001\u0001"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getNaN();
    char var2 = var0.getGroupingSeparator();
    char var3 = var0.getZeroDigit();
    char var4 = var0.getMinusSign();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFFFD"+ "'", var1.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ',');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '0');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '-');

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var3 = new byte[] { (byte)10, (byte)10, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var3, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var0 = sun.misc.VMSupport.getVMTemporaryDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"+ "'", var0.equals("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    byte[] var2 = new byte[] { (byte)1, (byte)1};
    java.lang.String var3 = new java.lang.String(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var2, 10, 1, "HI!");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u0001\u0001"+ "'", var3.equals("\u0001\u0001"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Locale var3 = new java.util.Locale("", "hi!", "");
    java.lang.String var4 = var3.getDisplayName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var3.getUnicodeLocaleType("HI!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "HI!"+ "'", var4.equals("HI!"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.Enumeration var1 = var0.getLoggerNames();
    java.util.logging.Logger var3 = var0.getLogger("\u0001\u0001");
    java.util.Enumeration var4 = var0.getLoggerNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.Enumeration var1 = var0.getLoggerNames();
    java.util.logging.Logger var3 = var0.getLogger("\u0001\u0001");
    var0.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getNaN();
    char var2 = var0.getGroupingSeparator();
    java.lang.Object var3 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFFFD"+ "'", var1.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ',');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = java.lang.String.valueOf((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Locale var3 = new java.util.Locale("", "hi!", "");
    java.lang.String var4 = var3.getDisplayName();
    java.lang.String var5 = var3.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "HI!"+ "'", var4.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "HI!"+ "'", var5.equals("HI!"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Locale var3 = new java.util.Locale("", "hi!", "");
    java.lang.String var4 = var3.getDisplayName();
    java.util.Locale var8 = new java.util.Locale("", "hi!", "");
    java.lang.String var9 = var3.getDisplayCountry(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var3.getUnicodeLocaleType("\u0001\u0001");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "HI!"+ "'", var4.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "HI!"+ "'", var9.equals("HI!"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("\u0001\u0001");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Locale var3 = new java.util.Locale("", "hi!", "");
    java.lang.String var4 = var3.getDisplayName();
    java.util.Locale var8 = new java.util.Locale("", "hi!", "");
    java.lang.String var9 = var8.getDisplayName();
    java.util.Locale var13 = new java.util.Locale("", "hi!", "");
    java.lang.String var14 = var8.getDisplayCountry(var13);
    java.lang.String var15 = var3.getDisplayLanguage(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "HI!"+ "'", var4.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "HI!"+ "'", var9.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "HI!"+ "'", var14.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Locale var3 = new java.util.Locale("", "hi!", "");
    java.lang.String var4 = var3.getDisplayName();
    java.util.Locale var8 = new java.util.Locale("", "hi!", "");
    java.lang.String var9 = var3.getDisplayCountry(var8);
    java.util.Locale var13 = new java.util.Locale("", "hi!", "");
    java.lang.String var14 = var13.getDisplayName();
    java.util.Locale var18 = new java.util.Locale("", "hi!", "");
    java.lang.String var19 = var13.getDisplayCountry(var18);
    java.lang.String[] var21 = java.util.Locale.getISOLanguages();
    java.lang.String var22 = java.lang.String.format(var18, "", (java.lang.Object[])var21);
    java.lang.String var23 = var3.getDisplayScript(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "HI!"+ "'", var4.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "HI!"+ "'", var9.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "HI!"+ "'", var14.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "HI!"+ "'", var19.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Locale var3 = new java.util.Locale("", "hi!", "");
    java.lang.String var4 = var3.getDisplayName();
    java.util.Locale var8 = new java.util.Locale("", "hi!", "");
    java.lang.String var9 = var3.getDisplayCountry(var8);
    java.lang.String[] var11 = java.util.Locale.getISOLanguages();
    java.lang.String var12 = java.lang.String.format(var8, "", (java.lang.Object[])var11);
    java.util.Set var13 = var8.getExtensionKeys();
    java.lang.String var14 = var8.getLanguage();
    java.lang.String var15 = var8.getDisplayVariant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "HI!"+ "'", var4.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "HI!"+ "'", var9.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var1 = java.lang.String.valueOf(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Locale var3 = new java.util.Locale("", "hi!", "");
    java.lang.String var4 = var3.getDisplayName();
    java.util.Locale var8 = new java.util.Locale("", "hi!", "");
    java.lang.String var9 = var3.getDisplayCountry(var8);
    java.lang.String var10 = var8.getDisplayLanguage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "HI!"+ "'", var4.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "HI!"+ "'", var9.equals("HI!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Filter var1 = var0.getFilter();
    java.util.logging.Logger var2 = var0.getParent();
    var2.exiting("\uFFFD", "-1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    byte[] var0 = sun.misc.VMSupport.serializePropertiesToByteArray();
    java.lang.String var1 = new java.lang.String(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#Mon Dec 11 10:29:06 IST 2017\njava.runtime.name=Java(TM) SE Runtime Environment\nsun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib\njava.vm.version=24.79-b02\nuser.country.format=IN\ngopherProxySet=false\njava.vm.vendor=Oracle Corporation\njava.vendor.url=http\\://java.oracle.com/\npath.separator=\\:\njava.vm.name=Java HotSpot(TM) 64-Bit Server VM\nfile.encoding.pkg=sun.io\nuser.country=US\nsun.java.launcher=SUN_STANDARD\nsun.os.patch.level=unknown\njava.vm.specification.name=Java Virtual Machine Specification\nuser.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1161\njava.runtime.version=1.7.0_79-b15\njava.awt.graphicsenv=sun.awt.CGraphicsEnvironment\njava.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed\nos.arch=x86_64\njava.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/\nline.separator=\\n\njava.vm.specification.vendor=Oracle Corporation\nos.name=Mac OS X\nsun.jnu.encoding=UTF-8\njava.library.path=/Users/rajesh/Library/Java/Extensions\\:/Library/Java/Extensions\\:/Network/Library/Java/Extensions\\:/System/Library/Java/Extensions\\:/usr/lib/java\\:.\njava.specification.name=Java Platform API Specification\njava.class.version=51.0\nsun.management.compiler=HotSpot 64-Bit Tiered Compilers\nos.version=10.13.1\nhttp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16\nuser.home=/Users/rajesh\nuser.timezone=Asia/Kolkata\njava.awt.printerjob=sun.lwawt.macosx.CPrinterJob\nfile.encoding=UTF-8\njava.specification.version=1.7\njava.class.path=/Users/rajesh/code/DLPScanner\\:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1161\\:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar\\:/Users/rajesh/code/DLPScanner/lib/omen.jar\\:/Users/rajesh/code/DLPScanner/lib/concurrent.jar\\:/Users/rajesh/code/DLPScanner/lib/randoop.jar\\:/Users/rajesh/code/DLPScanner/lib/tools.jar\\:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar\\:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar\\:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar\\:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar\\:/Users/rajesh/code/DLPScanner/lib/Account.jar\nuser.name=rajesh\njava.vm.specification.version=1.7\nsun.java.command=randoop.main.Main gentests --classlist\\=classlist.txt --timelimit\\=30 --inputlimit\\=50 --outputlimit\\=40\njava.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre\nsun.arch.data.model=64\nuser.language=en\njava.specification.vendor=Oracle Corporation\nawt.toolkit=sun.lwawt.macosx.LWCToolkit\njava.vm.info=mixed mode\njava.version=1.7.0_79\njava.ext.dirs=/Users/rajesh/Library/Java/Extensions\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext\\:/Library/Java/Extensions\\:/Network/Library/Java/Extensions\\:/System/Library/Java/Extensions\\:/usr/lib/java\nsun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes\njava.vendor=Oracle Corporation\nfile.separator=/\njava.vendor.url.bug=http\\://bugreport.sun.com/bugreport/\nsun.io.unicode.encoding=UnicodeBig\nsun.cpu.endian=little\nsocksNonProxyHosts=local|*.local|169.254/16|*.169.254/16\nftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16\nsun.cpu.isalist=\n"+ "'", var1.equals("#Mon Dec 11 10:29:06 IST 2017\njava.runtime.name=Java(TM) SE Runtime Environment\nsun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib\njava.vm.version=24.79-b02\nuser.country.format=IN\ngopherProxySet=false\njava.vm.vendor=Oracle Corporation\njava.vendor.url=http\\://java.oracle.com/\npath.separator=\\:\njava.vm.name=Java HotSpot(TM) 64-Bit Server VM\nfile.encoding.pkg=sun.io\nuser.country=US\nsun.java.launcher=SUN_STANDARD\nsun.os.patch.level=unknown\njava.vm.specification.name=Java Virtual Machine Specification\nuser.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1161\njava.runtime.version=1.7.0_79-b15\njava.awt.graphicsenv=sun.awt.CGraphicsEnvironment\njava.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed\nos.arch=x86_64\njava.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/\nline.separator=\\n\njava.vm.specification.vendor=Oracle Corporation\nos.name=Mac OS X\nsun.jnu.encoding=UTF-8\njava.library.path=/Users/rajesh/Library/Java/Extensions\\:/Library/Java/Extensions\\:/Network/Library/Java/Extensions\\:/System/Library/Java/Extensions\\:/usr/lib/java\\:.\njava.specification.name=Java Platform API Specification\njava.class.version=51.0\nsun.management.compiler=HotSpot 64-Bit Tiered Compilers\nos.version=10.13.1\nhttp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16\nuser.home=/Users/rajesh\nuser.timezone=Asia/Kolkata\njava.awt.printerjob=sun.lwawt.macosx.CPrinterJob\nfile.encoding=UTF-8\njava.specification.version=1.7\njava.class.path=/Users/rajesh/code/DLPScanner\\:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1161\\:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar\\:/Users/rajesh/code/DLPScanner/lib/omen.jar\\:/Users/rajesh/code/DLPScanner/lib/concurrent.jar\\:/Users/rajesh/code/DLPScanner/lib/randoop.jar\\:/Users/rajesh/code/DLPScanner/lib/tools.jar\\:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar\\:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar\\:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar\\:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar\\:/Users/rajesh/code/DLPScanner/lib/Account.jar\nuser.name=rajesh\njava.vm.specification.version=1.7\nsun.java.command=randoop.main.Main gentests --classlist\\=classlist.txt --timelimit\\=30 --inputlimit\\=50 --outputlimit\\=40\njava.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre\nsun.arch.data.model=64\nuser.language=en\njava.specification.vendor=Oracle Corporation\nawt.toolkit=sun.lwawt.macosx.LWCToolkit\njava.vm.info=mixed mode\njava.version=1.7.0_79\njava.ext.dirs=/Users/rajesh/Library/Java/Extensions\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext\\:/Library/Java/Extensions\\:/Network/Library/Java/Extensions\\:/System/Library/Java/Extensions\\:/usr/lib/java\nsun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar\\:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes\njava.vendor=Oracle Corporation\nfile.separator=/\njava.vendor.url.bug=http\\://bugreport.sun.com/bugreport/\nsun.io.unicode.encoding=UnicodeBig\nsun.cpu.endian=little\nsocksNonProxyHosts=local|*.local|169.254/16|*.169.254/16\nftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16\nsun.cpu.isalist=\n"));

  }

}
