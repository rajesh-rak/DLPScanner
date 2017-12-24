
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.event.UndoableEditListener[] var1 = var0.getUndoableEditListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("", "", "hi!");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("hi!");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Set var2 = var1.keySet();
    boolean var4 = var1.containsKey((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    var1.setID("");
    java.lang.String var4 = var1.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    var1.clear();
    boolean var4 = var1.equals((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl();
    var0.engineSetCertificateEntry("hi!", (java.security.cert.Certificate)var3);
    boolean[] var5 = var3.getKeyUsage();
    java.util.Enumeration var6 = var3.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    java.lang.String var3 = var2.toString();
    int var4 = var2.getDSTSavings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    byte[] var1 = var0.getSubjectKeyIdentifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var1 = javax.swing.JEditorPane.getEditorKitClassNameForContentType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var1 = var0.getAuthorityInfoAccessExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl();
    var0.engineSetCertificateEntry("hi!", (java.security.cert.Certificate)var3);
    java.math.BigInteger var5 = var3.getSerialNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.delete("");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    boolean var3 = var0.engineIsKeyEntry("sun.util.calendar.ZoneInfo[id=\"\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var2 = var0.getParagraphElement((-1));
    javax.swing.text.Element var4 = var0.getParagraphElement(0);
    int var5 = var0.getAsynchronousLoadPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Set var2 = var1.keySet();
    java.util.Set var3 = var1.keySet();
    java.util.Enumeration var4 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    java.lang.String var3 = var2.toString();
    java.util.SimpleTimeZone var4 = var2.getLastRuleInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    java.lang.String var3 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var2.getOffset(1, 0, 10, 100, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var3 = new java.util.Date(100, (-1), 1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var5 = new byte[] { (byte)0, (byte)10};
    sun.security.x509.X509CertImpl var6 = new sun.security.x509.X509CertImpl();
    java.security.cert.Certificate[] var7 = new java.security.cert.Certificate[] { var6};
    var0.engineSetKeyEntry("", var5, var7);
    com.sun.crypto.provider.JceKeyStore var9 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var10 = var9.engineAliases();
    sun.security.x509.X509CertImpl var12 = new sun.security.x509.X509CertImpl();
    var9.engineSetCertificateEntry("hi!", (java.security.cert.Certificate)var12);
    java.lang.String var14 = var0.engineGetCertificateAlias((java.security.cert.Certificate)var12);
    sun.security.x509.PrivateKeyUsageExtension var15 = var12.getPrivateKeyUsageExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    var1.clear();
    var1.clear();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "x509"+ "'", var1.equals("x509"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    boolean var4 = var2.equals((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    java.util.TimeZone var4 = java.util.TimeZone.getTimeZone("hi!");
    boolean var5 = var2.hasSameRules(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JEditorPane.registerEditorKitForContentType("hi!", "sun.util.calendar.ZoneInfo[id=\"\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var1 = new java.util.Date(10L);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Date var1 = var0.getNotBefore();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

}
