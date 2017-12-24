
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.load("hi!");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.misc.VM.unsuspendThreads();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.misc.VM.awaitBooted();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.misc.VM.addFinalRefCount(10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.System.runFinalizersOnExit(false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    int var0 = sun.misc.VM.getPeakFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    int var3 = java.lang.System.identityHashCode((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1744980003);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("", "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = java.lang.System.getProperty("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.security.Security.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.System.runFinalization();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.security.Security.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.SecurityManager var0 = java.lang.System.getSecurityManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.System.gc();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Properties var1 = new java.util.Properties(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.arraycopy((java.lang.Object)var1, (-1), (java.lang.Object)(short)(-1), 1744980003, 100);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var1 = var0.toString();
    java.util.Enumeration var2 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var1.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.misc.VM.initializeOSEnvironment();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 189087894);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    byte[] var0 = sun.misc.VMSupport.serializePropertiesToByteArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Map var0 = java.lang.System.getenv();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.Object var3 = var0.setProperty("hi!", "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
    java.lang.String var6 = var0.getProperty("", "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var6.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.ClassLoader var0 = sun.misc.VM.latestUserDefinedLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.Object var3 = var0.setProperty("hi!", "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.VM.saveAndRemoveProperties(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var3.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}", "", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.misc.VMSupport var0 = new sun.misc.VMSupport();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var1 = java.security.cert.CertificateFactory.getInstance("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.org.apache.xalan.internal.xsltc.cmdline.Transform var5 = new com.sun.org.apache.xalan.internal.xsltc.cmdline.Transform("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}", "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}", true, false, 0);
    java.lang.String var6 = var5.getClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var6.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Properties var1 = java.lang.System.getProperties();
    java.security.ProtectionDomain[] var2 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var3 = new java.security.AccessControlContext(var2);
    java.security.AccessControlContext var4 = new java.security.AccessControlContext(var2);
    java.lang.Object var5 = var0.put((java.lang.Object)var1, (java.lang.Object)var4);
    java.util.Set var6 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Properties var1 = java.lang.System.getProperties();
    java.security.ProtectionDomain[] var2 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var3 = new java.security.AccessControlContext(var2);
    java.security.AccessControlContext var4 = new java.security.AccessControlContext(var2);
    java.lang.Object var5 = var0.put((java.lang.Object)var1, (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Enumeration var6 = var1.propertyNames();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.security.Security.setProperty("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}", "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.Object var3 = var0.setProperty("hi!", "");
    java.util.Properties var4 = new java.util.Properties(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var3.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1358:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var3 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var4 = var3.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    boolean var0 = sun.misc.VM.suspendThreads();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Properties var1 = new java.util.Properties(var0);
    java.util.Properties var2 = java.lang.System.getProperties();
    java.util.Enumeration var3 = var2.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putAll((java.util.Map)var2);
      fail("Expected exception of type java.util.ConcurrentModificationException");
    } catch (java.util.ConcurrentModificationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
