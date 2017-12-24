
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var6 = java.util.Date.UTC(10, 1, (-1), 10, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1890914390000L));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var1 = new sun.security.x509.X509CertInfo(var0);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var1 = java.text.DateFormat.getDateInstance(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    java.lang.String var3 = java.text.MessageFormat.format("hi!", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 100);
    sun.util.calendar.ZoneInfo var5 = new sun.util.calendar.ZoneInfo("", 100);
    boolean var6 = var2.hasSameRules((java.util.TimeZone)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var3 = new byte[] { (byte)100, (byte)10, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var4 = new sun.security.x509.X509CertImpl(var3);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.capitalize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!"+ "'", var1.equals("Hi!"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 100);
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.util.calendar.ZoneInfo var3 = new sun.util.calendar.ZoneInfo("", 100);
    com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg var5 = new com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg("hi!", (java.lang.Object)"", (java.lang.Object)(-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var2 = java.text.DateFormat.getDateTimeInstance(1, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.Object var3 = var1.remove((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 100);
    boolean var3 = var2.observesDaylightTime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var2.getOffset(0, 1, 7, (-330), 7, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getTimezoneOffset();
    java.util.Date var2 = new java.util.Date();
    int var3 = var2.getTimezoneOffset();
    boolean var4 = var0.before(var2);
    int var5 = var0.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.text.DateFormat var0 = java.text.DateFormat.getTimeInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.parseObject("Hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    boolean var3 = var1.contains((java.lang.Object)(short)1);
    java.util.Set var4 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.String var1 = var0.toLocaleString();
    int var2 = var0.getDay();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var1 = new java.util.Date((-1L));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 100);
    boolean var3 = var2.observesDaylightTime();
    boolean var4 = var2.observesDaylightTime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var2.getOffset(1, 1, 10, (-1), 10, (-330));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 100);
    sun.util.calendar.ZoneInfo var5 = new sun.util.calendar.ZoneInfo("", 100);
    boolean var6 = var5.observesDaylightTime();
    boolean var7 = var2.hasSameRules((java.util.TimeZone)var5);
    java.util.Date var8 = new java.util.Date();
    int var9 = var8.getTimezoneOffset();
    boolean var10 = var5.inDaylightTime(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg var2 = new com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg("11 Dec, 2017 1:21:37 PM", (java.lang.Object)(short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.toString((java.lang.Object)(-1L));
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.org.apache.xalan.internal.xsltc.compiler.Stylesheet var0 = new com.sun.org.apache.xalan.internal.xsltc.compiler.Stylesheet();
    int var1 = var0.getOutputMethod();
    var0.setHasIdCall(true);
    var0.translate();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.lang.String[] var2 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    boolean var3 = var1.containsValue((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

}
