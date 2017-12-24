
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.misc.VM.booted();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(10, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.misc.VM.asChange_otherthread(1, 10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.System.runFinalization();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    boolean var0 = sun.misc.VM.isBooted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.System.setProperties(var0);
    java.lang.String var4 = var0.getProperty("1.0", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "lib.dylib"+ "'", var1.equals("lib.dylib"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.System.setProperties(var0);
    java.util.Set var2 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var0 = java.lang.System.nanoTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512925685043981000L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.misc.VM.awaitBooted();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.entering("", "");
    var1.warning("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var1, 10, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    boolean var0 = sun.misc.VM.allowGetCallerClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    char[] var1 = new char[] { ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var1, 10, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    boolean var0 = sun.misc.VM.suspendThreads();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.System.setProperties(var0);
    java.util.Enumeration var2 = var0.propertyNames();
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test11, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test11:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var3.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test11, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test11:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    boolean var0 = sun.misc.VM.threadsSuspended();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    long var0 = java.lang.System.currentTimeMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512925685063L);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.System.runFinalizersOnExit(true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.load("true");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    int var0 = sun.misc.VM.getFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.ClassLoader var0 = sun.misc.VM.latestUserDefinedLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.System.setProperties(var0);
    java.util.Enumeration var2 = var0.propertyNames();
    int var3 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 56);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.lang.String var2 = var1.getResourceBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    sun.misc.VM.asChange(1, 1);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    sun.font.FontFamily var3 = new sun.font.FontFamily("", true, (-1));
    sun.font.Font2D var5 = var3.getFontWithExactStyleMatch((-1));
    sun.font.Font2D var7 = var3.getFont(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Enumeration var1 = var0.propertyNames();
    java.util.Enumeration var2 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.arraycopy((java.lang.Object)1L, 10, (java.lang.Object)(byte)(-1), 10, 0);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.lang.String[] var0 = sun.font.FontFamily.getAllFamilyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.severe("0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
