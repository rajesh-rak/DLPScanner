
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.System.getenv("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.misc.VM.asChange_otherthread(0, 1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Thread.State var1 = sun.misc.VM.toThreadState(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    java.security.SecureRandom var3 = new java.security.SecureRandom(var2);
    float var4 = var3.nextFloat();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.8555356f);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getEncAlgFromSigAlg("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test34, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test34:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"+ "'", var1.equals("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test34, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test34:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var1 = java.security.cert.CertificateFactory.getInstance("{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib, java.vm.version=24.79-b02, user.country.format=IN, gopherProxySet=false, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=:, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=unknown, java.vm.specification.name=Java Virtual Machine Specification, user.dir=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test34, java.runtime.version=1.7.0_79-b15, java.awt.graphicsenv=sun.awt.CGraphicsEnvironment, java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/endorsed, os.arch=x86_64, java.io.tmpdir=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, line.separator=\n, java.vm.specification.vendor=Oracle Corporation, os.name=Mac OS X, sun.jnu.encoding=UTF-8, java.library.path=/Users/rajesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.specification.name=Java Platform API Specification, java.class.version=51.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.13.1, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, user.home=/Users/rajesh, user.timezone=Asia/Kolkata, java.awt.printerjob=sun.lwawt.macosx.CPrinterJob, file.encoding=UTF-8, java.specification.version=1.7, java.class.path=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_10_223721/Test34:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, user.name=rajesh, java.vm.specification.version=1.7, sun.java.command=randoop.main.Main gentests --classlist=classlist.txt --timelimit=30 --inputlimit=50 --outputlimit=40, java.home=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.7.0_79, java.ext.dirs=/Users/rajesh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes, java.vendor=Oracle Corporation, file.separator=/, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeBig, sun.cpu.endian=little, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16, sun.cpu.isalist=}");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.System.runFinalization();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    java.security.SecureRandom var3 = new java.security.SecureRandom(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var2, 0, 100, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getDigAlgFromSigAlg("a4a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    java.security.SecureRandom var3 = new java.security.SecureRandom(var2);
    java.security.Provider var4 = var3.getProvider();
    boolean var5 = var3.nextBoolean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.Security.setProperty("a4a", "a4a");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getEncAlgFromSigAlg("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.misc.VM var0 = new sun.misc.VM();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    int var0 = sun.misc.VM.getFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders("a4a");
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.security.Security.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var1 = java.lang.String.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    char[] var3 = new char[] { 'a', '4', 'a'};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var7 = java.lang.String.valueOf(var3, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "a4a"+ "'", var4.equals("a4a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "4"+ "'", var7.equals("4"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Level var1 = java.util.logging.Level.parse("10.0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    java.security.SecureRandom var3 = new java.security.SecureRandom(var2);
    java.security.Provider var4 = var3.getProvider();
    int var5 = java.security.Security.addProvider(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    java.security.SecureRandom var3 = new java.security.SecureRandom(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 0.8555356f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var5 = new java.util.Date(10, 1, (-1), 1, 1);
    int var6 = var5.getMinutes();
    int var7 = var5.getSeconds();
    var5.setYear(100);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.String var1 = java.lang.String.valueOf('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Thread.State var1 = sun.misc.VM.toThreadState((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var3 = var0.getProperty("a4a", "a4a");
    java.util.Enumeration var4 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4a"+ "'", var3.equals("a4a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    byte[] var2 = new byte[] { (byte)1, (byte)(-1)};
    java.lang.String var3 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u0001\uFFFD"+ "'", var3.equals("\u0001\uFFFD"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.String var3 = var0.getProperty("a4a", "a4a");
    int var4 = var0.size();
    java.util.Enumeration var5 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4a"+ "'", var3.equals("a4a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    byte[] var4 = new byte[] { (byte)0, (byte)1};
    java.security.SecureRandom var5 = new java.security.SecureRandom(var4);
    java.security.Provider var6 = var5.getProvider();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.arraycopy((java.lang.Object)'a', (-1), (java.lang.Object)var5, 56, 0);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    java.security.SecureRandom var3 = new java.security.SecureRandom(var2);
    java.security.Provider var4 = var3.getProvider();
    var3.setSeed(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.util.Date var5 = new java.util.Date(10, 1, (-1), 1, 1);
    int var6 = var5.getMinutes();
    int var7 = var5.getSeconds();
    var5.setDate(56);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.lang.String var1 = new java.lang.String("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

}
