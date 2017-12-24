
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var0 = sun.misc.VM.threadsSuspended();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders((java.util.Map)var0);
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.misc.VM var0 = new sun.misc.VM();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.load("");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    boolean var0 = sun.misc.VM.isBooted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    int var0 = sun.misc.VM.getPeakFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.misc.VM.unsuspendSomeThreads();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.misc.VM.asChange_otherthread(10, 10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.security.Provider[] var1 = java.security.Security.getProviders("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var1.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.security.Provider var1 = java.security.Security.getProvider("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    boolean var2 = var0.containsKey((java.lang.Object)0.0d);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var3.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    boolean var2 = var0.containsKey((java.lang.Object)0.0d);
    java.lang.System.setProperties(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Map var0 = java.lang.System.getenv();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders(var0);
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.SecurityManager var0 = java.lang.System.getSecurityManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Enumeration var4 = var0.propertyNames();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    boolean var4 = var1.contains((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "lib.dylib"+ "'", var1.equals("lib.dylib"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var2 = java.lang.System.getProperty("lib.dylib", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.System.gc();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = java.lang.System.mapLibraryName("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    java.lang.String var4 = var0.toString();
    java.lang.Object var7 = var0.setProperty("{}", "{}");
    boolean var9 = var0.containsValue((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var4.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    long var0 = sun.misc.VM.maxDirectMemory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3817865216L);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    var1.clear();
    java.util.Set var4 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var1 = java.security.cert.CertificateFactory.getInstance("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var2 = java.lang.System.setProperty("hi!", "lib.dylib");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    java.lang.String var4 = var0.toString();
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
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=lib.dylib, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var4.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=lib.dylib, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.System.runFinalizersOnExit(false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    boolean var2 = var0.containsKey((java.lang.Object)0.0d);
    java.util.Enumeration var3 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    java.util.Properties var3 = java.lang.System.getProperties();
    java.lang.String var6 = var3.getProperty("", "hi!");
    java.lang.String var7 = var3.toString();
    java.lang.Object var10 = var3.setProperty("{}", "{}");
    var1.putAll((java.util.Map)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=lib.dylib, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var7.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=lib.dylib, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    sun.misc.VM.asChange_otherthread(1, 10);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    sun.misc.VM.unsuspendThreads();

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    long var0 = java.lang.System.currentTimeMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512971741059L);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    java.lang.String var4 = var0.toString();
    java.lang.Object var7 = var0.setProperty("{}", "{}");
    java.util.Properties var8 = new java.util.Properties(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=lib.dylib, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var4.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=lib.dylib, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    java.lang.String var4 = var0.toString();
    java.lang.Object var7 = var0.setProperty("{}", "{}");
    java.util.Set var8 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=lib.dylib, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var4.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, hi!=lib.dylib, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = java.lang.System.mapLibraryName("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, {}={}, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1396:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, false=-1.0, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    java.lang.Object var6 = var0.put((java.lang.Object)false, (java.lang.Object)(-1.0d));
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
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (-1.0d)+ "'", var6.equals((-1.0d)));

  }

}
