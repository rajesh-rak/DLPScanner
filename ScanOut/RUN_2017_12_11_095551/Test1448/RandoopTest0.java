
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Thread.State var1 = sun.misc.VM.toThreadState(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.System.getenv("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.misc.VM.asChange(0, 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    boolean var0 = sun.misc.VM.isDirectMemoryPageAligned();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var2 = java.security.cert.CertificateFactory.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.System.runFinalization();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = java.lang.System.getProperty("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.misc.VM.unsuspendSomeThreads();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Set var1 = java.security.Security.getAlgorithms("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.SecurityManager var0 = java.lang.System.getSecurityManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.Object var4 = var1.put((java.lang.Object)(byte)0, (java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.System.gc();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Map var0 = java.lang.System.getenv();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    boolean var2 = var1.isEmpty();
    java.util.Set var3 = var1.keySet();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.version=24.79-b02, user.language=en, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448, path.separator=:, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, java.runtime.version=1.7.0_79-b15, file.encoding=UTF-8, sun.jnu.encoding=UTF-8, java.specification.vendor=Oracle Corporation, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, java.specification.name=Java Platform API Specification, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.cpu.isalist=, java.version=1.7.0_79, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.io.unicode.encoding=UnicodeBig, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, sun.cpu.endian=little, user.home=/Users/rajesh, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.specification.version=1.7, java.vm.specification.name=Java Virtual Machine Specification, os.arch=x86_64, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, java.runtime.name=Java(TM) SE Runtime Environment, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, file.encoding.pkg=sun.io, java.vm.vendor=Oracle Corporation, gopherProxySet=false, user.name=rajesh, os.version=10.13.1, java.vm.specification.vendor=Oracle Corporation, user.timezone=Asia/Kolkata, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, java.vm.info=mixed mode, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, os.name=Mac OS X, java.vendor.url=http://java.oracle.com/, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.specification.version=1.7, user.country.format=IN, sun.arch.data.model=64, line.separator=\n, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.class.version=51.0, java.vendor=Oracle Corporation, file.separator=/, user.country=US}"+ "'", var4.equals("{awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.version=24.79-b02, user.language=en, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448, path.separator=:, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, java.runtime.version=1.7.0_79-b15, file.encoding=UTF-8, sun.jnu.encoding=UTF-8, java.specification.vendor=Oracle Corporation, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, java.specification.name=Java Platform API Specification, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.cpu.isalist=, java.version=1.7.0_79, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.io.unicode.encoding=UnicodeBig, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, sun.cpu.endian=little, user.home=/Users/rajesh, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.specification.version=1.7, java.vm.specification.name=Java Virtual Machine Specification, os.arch=x86_64, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, java.runtime.name=Java(TM) SE Runtime Environment, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, file.encoding.pkg=sun.io, java.vm.vendor=Oracle Corporation, gopherProxySet=false, user.name=rajesh, os.version=10.13.1, java.vm.specification.vendor=Oracle Corporation, user.timezone=Asia/Kolkata, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, java.vm.info=mixed mode, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, os.name=Mac OS X, java.vendor.url=http://java.oracle.com/, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.specification.version=1.7, user.country.format=IN, sun.arch.data.model=64, line.separator=\n, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.class.version=51.0, java.vendor=Oracle Corporation, file.separator=/, user.country=US}"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var2 = java.lang.System.getProperty("{awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.version=24.79-b02, user.language=en, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448, path.separator=:, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, java.runtime.version=1.7.0_79-b15, file.encoding=UTF-8, sun.jnu.encoding=UTF-8, java.specification.vendor=Oracle Corporation, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, java.specification.name=Java Platform API Specification, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.cpu.isalist=, java.version=1.7.0_79, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.io.unicode.encoding=UnicodeBig, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, sun.cpu.endian=little, user.home=/Users/rajesh, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.specification.version=1.7, java.vm.specification.name=Java Virtual Machine Specification, os.arch=x86_64, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, java.runtime.name=Java(TM) SE Runtime Environment, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, file.encoding.pkg=sun.io, java.vm.vendor=Oracle Corporation, gopherProxySet=false, user.name=rajesh, os.version=10.13.1, java.vm.specification.vendor=Oracle Corporation, user.timezone=Asia/Kolkata, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, java.vm.info=mixed mode, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, os.name=Mac OS X, java.vendor.url=http://java.oracle.com/, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.specification.version=1.7, user.country.format=IN, sun.arch.data.model=64, line.separator=\n, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.class.version=51.0, java.vendor=Oracle Corporation, file.separator=/, user.country=US}", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.misc.VM.booted();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    boolean var0 = sun.misc.VM.threadsSuspended();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.misc.VM.asChange_otherthread(1, 100);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.nio.channels.Channel var0 = java.lang.System.inheritedChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String var1 = java.lang.System.getenv("{awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.version=24.79-b02, user.language=en, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448, path.separator=:, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, java.runtime.version=1.7.0_79-b15, file.encoding=UTF-8, sun.jnu.encoding=UTF-8, java.specification.vendor=Oracle Corporation, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, java.specification.name=Java Platform API Specification, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.cpu.isalist=, java.version=1.7.0_79, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.io.unicode.encoding=UnicodeBig, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, sun.cpu.endian=little, user.home=/Users/rajesh, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.specification.version=1.7, java.vm.specification.name=Java Virtual Machine Specification, os.arch=x86_64, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, java.runtime.name=Java(TM) SE Runtime Environment, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, file.encoding.pkg=sun.io, java.vm.vendor=Oracle Corporation, gopherProxySet=false, user.name=rajesh, os.version=10.13.1, java.vm.specification.vendor=Oracle Corporation, user.timezone=Asia/Kolkata, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, java.vm.info=mixed mode, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, os.name=Mac OS X, java.vendor.url=http://java.oracle.com/, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.specification.version=1.7, user.country.format=IN, sun.arch.data.model=64, line.separator=\n, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.class.version=51.0, java.vendor=Oracle Corporation, file.separator=/, user.country=US}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var0 = java.lang.System.lineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "\n"+ "'", var0.equals("\n"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.load("hi!");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var1 = java.lang.System.clearProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Properties var1 = java.lang.System.getProperties();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    boolean var3 = var2.isEmpty();
    boolean var5 = var2.containsKey((java.lang.Object)10.0f);
    boolean var6 = var0.contains((java.lang.Object)10.0f);
    java.util.Set var7 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = java.lang.System.mapLibraryName("{awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.version=24.79-b02, user.language=en, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448, path.separator=:, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, java.runtime.version=1.7.0_79-b15, file.encoding=UTF-8, sun.jnu.encoding=UTF-8, java.specification.vendor=Oracle Corporation, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, java.specification.name=Java Platform API Specification, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.cpu.isalist=, java.version=1.7.0_79, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.io.unicode.encoding=UnicodeBig, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, sun.cpu.endian=little, user.home=/Users/rajesh, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.specification.version=1.7, java.vm.specification.name=Java Virtual Machine Specification, os.arch=x86_64, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, java.runtime.name=Java(TM) SE Runtime Environment, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, file.encoding.pkg=sun.io, java.vm.vendor=Oracle Corporation, gopherProxySet=false, user.name=rajesh, os.version=10.13.1, java.vm.specification.vendor=Oracle Corporation, user.timezone=Asia/Kolkata, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, java.vm.info=mixed mode, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, os.name=Mac OS X, java.vendor.url=http://java.oracle.com/, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.specification.version=1.7, user.country.format=IN, sun.arch.data.model=64, line.separator=\n, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.class.version=51.0, java.vendor=Oracle Corporation, file.separator=/, user.country=US}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.security.Provider var1 = java.security.Security.getProvider("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    boolean var0 = sun.misc.VM.allowArraySyntax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    sun.misc.VM.asChange(1, 100);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Set var1 = var0.keySet();
    java.util.Enumeration var2 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    boolean var2 = var1.isEmpty();
    java.util.Set var3 = var1.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.util.Set var5 = var4.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    boolean var2 = var1.isEmpty();
    boolean var4 = var1.containsKey((java.lang.Object)10.0f);
    java.util.Properties var5 = java.lang.System.getProperties();
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var5);
    var1.putAll((java.util.Map)var6);
    boolean var9 = var1.containsValue((java.lang.Object)(byte)10);
    java.lang.Object var12 = var1.put((java.lang.Object)(short)100, (java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.security.Security.setProperty("{awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.version=24.79-b02, user.language=en, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448, path.separator=:, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, java.runtime.version=1.7.0_79-b15, file.encoding=UTF-8, sun.jnu.encoding=UTF-8, java.specification.vendor=Oracle Corporation, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, java.specification.name=Java Platform API Specification, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.cpu.isalist=, java.version=1.7.0_79, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.io.unicode.encoding=UnicodeBig, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, sun.cpu.endian=little, user.home=/Users/rajesh, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.specification.version=1.7, java.vm.specification.name=Java Virtual Machine Specification, os.arch=x86_64, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, java.runtime.name=Java(TM) SE Runtime Environment, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, file.encoding.pkg=sun.io, java.vm.vendor=Oracle Corporation, gopherProxySet=false, user.name=rajesh, os.version=10.13.1, java.vm.specification.vendor=Oracle Corporation, user.timezone=Asia/Kolkata, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, java.vm.info=mixed mode, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, os.name=Mac OS X, java.vendor.url=http://java.oracle.com/, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.specification.version=1.7, user.country.format=IN, sun.arch.data.model=64, line.separator=\n, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.class.version=51.0, java.vendor=Oracle Corporation, file.separator=/, user.country=US}", "{awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.version=24.79-b02, user.language=en, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448, path.separator=:, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, java.runtime.version=1.7.0_79-b15, file.encoding=UTF-8, sun.jnu.encoding=UTF-8, java.specification.vendor=Oracle Corporation, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1448:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, java.specification.name=Java Platform API Specification, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.cpu.isalist=, java.version=1.7.0_79, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.io.unicode.encoding=UnicodeBig, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, sun.cpu.endian=little, user.home=/Users/rajesh, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.specification.version=1.7, java.vm.specification.name=Java Virtual Machine Specification, os.arch=x86_64, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, java.runtime.name=Java(TM) SE Runtime Environment, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, file.encoding.pkg=sun.io, java.vm.vendor=Oracle Corporation, gopherProxySet=false, user.name=rajesh, os.version=10.13.1, java.vm.specification.vendor=Oracle Corporation, user.timezone=Asia/Kolkata, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, java.vm.info=mixed mode, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, os.name=Mac OS X, java.vendor.url=http://java.oracle.com/, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.specification.version=1.7, user.country.format=IN, sun.arch.data.model=64, line.separator=\n, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.class.version=51.0, java.vendor=Oracle Corporation, file.separator=/, user.country=US}");

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    int var0 = sun.misc.VM.getPeakFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 284);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    long var0 = java.lang.System.currentTimeMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512972898668L);

  }

}
