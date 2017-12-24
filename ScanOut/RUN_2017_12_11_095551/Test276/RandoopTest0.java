
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = sun.misc.VM.allowArraySyntax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, false);
    javax.xml.soap.MimeHeaders var3 = var2.getMimeHeaders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Thread.State var1 = sun.misc.VM.toThreadState((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.krb5.KrbException var2 = new sun.security.krb5.KrbException((-1));
    java.lang.Throwable[] var3 = var2.getSuppressed();
    java.lang.Exception var4 = new java.lang.Exception("10.0", (java.lang.Throwable)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Exception var1 = new java.lang.Exception("a");

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.security.krb5.KrbException var1 = new sun.security.krb5.KrbException((-1));
    boolean var3 = var1.equals((java.lang.Object)10.0d);
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.krbErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "KrbException: null (-1)"+ "'", var4.equals("KrbException: null (-1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "krb_error -1 null (-1)"+ "'", var5.equals("krb_error -1 null (-1)"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    int var2 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    long var0 = sun.misc.VM.maxDirectMemory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3817865216L);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, false);
    var2.setProperty("", (java.lang.Object)100.0d);
    java.lang.Object var7 = var2.getProperty("hi!");
    var2.setBaseType("");
    var2.setBaseType("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, false);
    java.lang.Object var4 = var2.getProperty("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var2.getCharset();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 100.0f);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "lib.dylib"+ "'", var1.equals("lib.dylib"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, false);
    java.lang.Object var4 = var2.getProperty("hi!");
    java.io.PrintStream var6 = new java.io.PrintStream("krb_error -1 null (-1)");
    var2.writeTo((java.io.OutputStream)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, false);
    var2.setProperty("", (java.lang.Object)100.0d);
    boolean var6 = var2.acceptFastInfoset();
    boolean var7 = var2.saveRequired();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Thread var1 = new java.lang.Thread("a");
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1, "a");

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.krb5.KrbException var1 = new sun.security.krb5.KrbException((-1));
    java.lang.String var2 = var1.returnCodeSymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "not yet implemented"+ "'", var2.equals("not yet implemented"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.io.PrintStream var1 = new java.io.PrintStream("krb_error -1 null (-1)");
    var1.println(1.0d);
    var1.println(1L);
    var1.print(100L);
    var1.print(100.0d);
    java.io.PrintStream var11 = var1.append((java.lang.CharSequence)"krb_error -1 null (-1)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Formatter var1 = new java.util.Formatter("KrbException: null (-1)");
    var1.flush();
    var1.flush();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    char[] var1 = new char[] { 'a'};
    java.lang.String var2 = java.lang.String.valueOf(var1);
    java.lang.String var3 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "a"+ "'", var2.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a"+ "'", var3.equals("a"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var2 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl(true, false);
    var2.setProperty("", (java.lang.Object)100.0d);
    javax.xml.soap.SOAPBody var6 = var2.getSOAPBody();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
