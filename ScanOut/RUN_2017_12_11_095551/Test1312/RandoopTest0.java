
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.System.gc();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 1, 100, 0, 1, 10, 10, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era[] var1 = var0.getEras();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.util.Debug.println("", "");

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "libhi!.dylib"+ "'", var1.equals("libhi!.dylib"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setDigit('4');
    java.lang.String var3 = var0.getCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Rs."+ "'", var3.equals("Rs."));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.URL[] var2 = new java.net.URL[] { };
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = java.lang.Class.forName("hi!", false, (java.lang.ClassLoader)var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var1 = new char[] { ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var2 = new java.math.BigDecimal(var1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "Rs.", (-1), 10, 0, 10, 10, 1, 100, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Map var0 = java.lang.System.getenv();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    java.util.Set var2 = var1.entrySet();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, JAVA_MAIN_CLASS_71565=randoop.main.Main, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1312:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1312, __CF_USER_TEXT_ENCODING=0x1F5:0var3:0var3, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, XPC_FLAGS=0var3, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}"+ "'", var3.equals("{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, JAVA_MAIN_CLASS_71565=randoop.main.Main, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1312:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1312, __CF_USER_TEXT_ENCODING=0x1F5:0var3:0var3, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, XPC_FLAGS=0var3, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    long var0 = java.lang.System.nanoTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512970709627131000L);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getMinusSign();
    java.lang.String var2 = var0.getInfinity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '-');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\u221E"+ "'", var2.equals("\u221E"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("Rs.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Map var0 = java.lang.System.getenv();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    java.lang.Object var4 = var1.put((java.lang.Object)'4', (java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.io.InputStream var3 = var1.getResourceAsStream("{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, JAVA_MAIN_CLASS_71565=randoop.main.Main, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1312:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1312, __CF_USER_TEXT_ENCODING=0x1F5:0x0:0x0, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, XPC_FLAGS=0x0, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}");
    var1.setPackageAssertionStatus("\u221E", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Exception var1 = new java.lang.Exception("libhi!.dylib");

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getInfinity();
    var0.setPatternSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u221E"+ "'", var1.equals("\u221E"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getExponentSeparator();
    var0.setMinusSign('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "E"+ "'", var1.equals("E"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.util.Debug.println("", "{LSCOLORS=GxFxCxDxBxegedabagaced, Apple_PubSub_Socket_Render=/private/tmp/com.apple.launchd.fws82WIOF0/Render, com.apple.java.jvmTask=CommandLine, JAVA_MAIN_CLASS_71565=randoop.main.Main, SHLVL=4, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.szUfgGoQ8s/Listeners, _=/usr/bin/java, CLASSPATH=/Users/rajesh/code/DLPScanner:/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1312:/Users/rajesh/code/DLPScanner/lib/sootall-2.3.0.jar:/Users/rajesh/code/DLPScanner/lib/omen.jar:/Users/rajesh/code/DLPScanner/lib/concurrent.jar:/Users/rajesh/code/DLPScanner/lib/randoop.jar:/Users/rajesh/code/DLPScanner/lib/tools.jar:/Users/rajesh/code/DLPScanner/lib/junit-4.11.jar:/Users/rajesh/code/DLPScanner/lib/jaxws-rt-2.2.10.jar:/Users/rajesh/code/DLPScanner/lib/colt-1.2.0.jar:/Users/rajesh/code/DLPScanner/lib/colt-hep.jar:/Users/rajesh/code/DLPScanner/lib/Account.jar, CLICOLOR=1, PWD=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test1312, __CF_USER_TEXT_ENCODING=0x1F5:0x0:0x0, SHELL=/bin/bash, TERM=xterm-256color, USER=rajesh, XPC_SERVICE_NAME=0, JAVA_ARCH=x86_64, HOME=/Users/rajesh, XPC_FLAGS=0x0, LOGNAME=rajesh, TERM_SESSION_ID=B3F22EA4-7618-4F4F-B0CD-4AB2F4075ACC, TMPDIR=/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/, OLDPWD=/Users/rajesh/code/DLPScanner, TERM_PROGRAM_VERSION=400, LC_CTYPE=UTF-8, TERM_PROGRAM=Apple_Terminal, PATH=/Users/rajesh/Apps/sbt/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin}");

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.lang.ClassLoader var2 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    java.math.BigDecimal var3 = var1.movePointRight(0);
    java.math.BigDecimal var5 = new java.math.BigDecimal(0);
    java.math.BigDecimal var7 = var5.movePointRight(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var8 = var3.divideToIntegralValue(var7);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    int var3 = var2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(100, "Rs.", 100, 0, 1, (-1), 0, 0, (-1), (-1), 1, 10, 1);
    java.util.TimeZone var14 = java.util.TimeZone.getDefault();
    boolean var15 = var13.hasSameRules(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getExponentSeparator();
    var0.setDigit('-');
    var0.setExponentSeparator("libhi!.dylib");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "E"+ "'", var1.equals("E"));

  }

}
