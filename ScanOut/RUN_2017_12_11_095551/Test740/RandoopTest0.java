
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var3 = new byte[] { (byte)(-1), (byte)1, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var3, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var3 = new byte[] { (byte)10, (byte)0, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var3, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var0 = sun.misc.VMSupport.serializeAgentPropertiesToByteArray();
    java.lang.String var3 = new java.lang.String(var0, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var0 = sun.misc.VMSupport.getVMTemporaryDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"+ "'", var0.equals("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Locale[] var1 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    java.lang.String var2 = java.lang.String.format("", (java.lang.Object[])var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    var2.clear();
    boolean var5 = var2.containsKey((java.lang.Object)(short)10);
    boolean var6 = var2.isEmpty();
    java.util.Set var7 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.lang.String.valueOf((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = new java.lang.String(var0);
    java.lang.String var2 = java.lang.String.copyValueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.lang.String.valueOf((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    var2.clear();
    boolean var5 = var2.containsKey((java.lang.Object)(short)10);
    boolean var6 = var2.isEmpty();
    java.util.Locale[] var7 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    boolean var8 = var2.contains((java.lang.Object)var7);
    java.util.Hashtable var11 = new java.util.Hashtable(10, 1.0f);
    boolean var13 = var11.equals((java.lang.Object)(short)0);
    var2.putAll((java.util.Map)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    byte[] var0 = sun.misc.VMSupport.serializeAgentPropertiesToByteArray();
    java.lang.String var2 = new java.lang.String(var0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var0, 10, (-1), "hi!");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "#Mon Dec 11 15:38:56 IST 2017\nsun.jvm.args=-Xms2048m -Xmx4096m\nsun.jvm.flags=\nsun.java.command=randoop.main.Main gentests --classlist\\=classlist.txt --timelimit\\=30 --inputlimit\\=50 --outputlimit\\=40\n"+ "'", var2.equals("#Mon Dec 11 15:38:56 IST 2017\nsun.jvm.args=-Xms2048m -Xmx4096m\nsun.jvm.flags=\nsun.java.command=randoop.main.Main gentests --classlist\\=classlist.txt --timelimit\\=30 --inputlimit\\=50 --outputlimit\\=40\n"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = sun.misc.VMSupport.getAgentProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)(short)0);
    java.util.Set var5 = var2.keySet();
    java.util.Collection var6 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("#Mon Dec 11 15:38:55 IST 2017\nsun.jvm.args=-Xms2048m -Xmx4096m\nsun.jvm.flags=\nsun.java.command=randoop.main.Main gentests --classlist\\=classlist.txt --timelimit\\=30 --inputlimit\\=50 --outputlimit\\=40\n");
    boolean var4 = var0.engineContainsAlias("");
    java.util.Hashtable var8 = new java.util.Hashtable(10, 1.0f);
    var8.clear();
    boolean var11 = var8.containsKey((java.lang.Object)(short)10);
    char[] var12 = new char[] { };
    java.lang.String var13 = new java.lang.String(var12);
    boolean var14 = var8.contains((java.lang.Object)var12);
    java.security.Key var15 = var0.engineGetKey("10.0", var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var18 = java.lang.String.copyValueOf(var12, 0, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    var1.fine("-1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("10.0");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("hi!");
    java.util.Enumeration var3 = var0.engineAliases();
    java.util.Date var5 = var0.engineGetCreationDate("-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)(short)0);
    java.util.Set var5 = var2.keySet();
    int var6 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(10, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.util.Enumeration var8 = var5.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var1 = new java.lang.String("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"+ "'", var1.equals("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    java.util.logging.Level var2 = var1.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    java.util.Locale[] var4 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    var1.entering("#Mon Dec 11 15:38:55 IST 2017\nsun.jvm.args=-Xms2048m -Xmx4096m\nsun.jvm.flags=\nsun.java.command=randoop.main.Main gentests --classlist\\=classlist.txt --timelimit\\=30 --inputlimit\\=50 --outputlimit\\=40\n", "-1.0", (java.lang.Object[])var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("#Mon Dec 11 15:38:55 IST 2017\nsun.jvm.args=-Xms2048m -Xmx4096m\nsun.jvm.flags=\nsun.java.command=randoop.main.Main gentests --classlist\\=classlist.txt --timelimit\\=30 --inputlimit\\=50 --outputlimit\\=40\n");
    boolean var4 = var0.engineContainsAlias("");
    com.sun.crypto.provider.JceKeyStore var6 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var8 = var6.engineGetCertificate("#Mon Dec 11 15:38:55 IST 2017\nsun.jvm.args=-Xms2048m -Xmx4096m\nsun.jvm.flags=\nsun.java.command=randoop.main.Main gentests --classlist\\=classlist.txt --timelimit\\=30 --inputlimit\\=50 --outputlimit\\=40\n");
    boolean var10 = var6.engineContainsAlias("");
    java.util.Hashtable var14 = new java.util.Hashtable(10, 1.0f);
    var14.clear();
    boolean var17 = var14.containsKey((java.lang.Object)(short)10);
    char[] var18 = new char[] { };
    java.lang.String var19 = new java.lang.String(var18);
    boolean var20 = var14.contains((java.lang.Object)var18);
    java.security.Key var21 = var6.engineGetKey("10.0", var18);
    java.security.Key var22 = var0.engineGetKey("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/", var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

}
