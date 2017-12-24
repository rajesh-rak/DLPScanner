
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    char[] var3 = new char[] { '#', ' ', ' '};
    java.lang.String var4 = java.lang.String.copyValueOf(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "#  "+ "'", var4.equals("#  "));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var2 = java.lang.System.getProperty("#  ", "-1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1.0"+ "'", var2.equals("-1.0"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.System.runFinalizersOnExit(true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkExec("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("", 10, (java.lang.Object)1L);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.Security.setProperty("-1.0", "-1.0");

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 0, 10, "");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getEncAlgFromSigAlg("-1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.font.FontFamily var1 = sun.font.FontFamily.getLocaleFamily("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23519427);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPropertiesAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var3 = new byte[] { (byte)100, (byte)(-1), (byte)(-1)};
    java.lang.String var5 = new java.lang.String(var3, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, "{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237, __CF_USER_TEXT_ENCODING=0x1F5:0x0:0x0, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, JAVA_MAIN_CLASS_3097=randoop.main.Main, XPC_FLAGS=0x0, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "d\u00FF\u00FF"+ "'", var5.equals("d\u00FF\u00FF"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders("#  ");
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.System.runFinalization();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 75324971);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var1 = new byte[] { (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, 23519427, 1, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("", "d\u00FF\u00FF");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    var0.checkPackageDefinition("d\u00FF\u00FF");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = java.lang.System.getProperty("", "#  ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, 10, 100, "{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237, __CF_USER_TEXT_ENCODING=0x1F5:0x0:0x0, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, JAVA_MAIN_CLASS_3097=randoop.main.Main, XPC_FLAGS=0x0, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    char[] var3 = new char[] { ' ', '#', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.valueOf(var3, 0, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


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

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Collection var2 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237, __CF_USER_TEXT_ENCODING=0x1F5:0x0:0x0, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, JAVA_MAIN_CLASS_3097=randoop.main.Main, XPC_FLAGS=0x0, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}", "1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.String var1 = java.lang.System.getenv("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Map var0 = java.lang.System.getenv();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    java.lang.String var2 = var1.toString();
    java.util.Set var3 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237, __CF_USER_TEXT_ENCODING=0x1F5:0var2:0var2, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, JAVA_MAIN_CLASS_3097=randoop.main.Main, XPC_FLAGS=0var2, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}"+ "'", var2.equals("{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237, __CF_USER_TEXT_ENCODING=0x1F5:0var2:0var2, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, JAVA_MAIN_CLASS_3097=randoop.main.Main, XPC_FLAGS=0var2, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.AlgorithmId var1 = sun.security.x509.AlgorithmId.get("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.System.runFinalizersOnExit(false);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.util.Map var0 = java.lang.System.getenv();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    java.lang.String var2 = var1.toString();
    java.util.Enumeration var3 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237, __CF_USER_TEXT_ENCODING=0x1F5:0var2:0var2, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, JAVA_MAIN_CLASS_3097=randoop.main.Main, XPC_FLAGS=0var2, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}"+ "'", var2.equals("{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test237, __CF_USER_TEXT_ENCODING=0x1F5:0var2:0var2, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, JAVA_MAIN_CLASS_3097=randoop.main.Main, XPC_FLAGS=0var2, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
