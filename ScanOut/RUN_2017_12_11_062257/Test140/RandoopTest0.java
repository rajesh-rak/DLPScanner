
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.text.DateFormat var0 = java.text.DateFormat.getDateInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.put((java.lang.Object)true, (java.lang.Object)10L);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.corba.se.impl.encoding.BufferManagerFactory var0 = new com.sun.corba.se.impl.encoding.BufferManagerFactory();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    var0.exiting("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.text.DateFormat var0 = java.text.DateFormat.getDateTimeInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.util.jar.Attributes var1 = new java.util.jar.Attributes();
    java.lang.Object var3 = var1.remove((java.lang.Object)(-1L));
    var0.putAll((java.util.Map)var1);
    int var5 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var0.getValue("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.SimpleDateFormat var1 = new java.text.SimpleDateFormat("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var1 = java.text.DateFormat.getDateInstance((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DateFormat var0 = java.text.DateFormat.getTimeInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var2 = var0.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.lang.Object var2 = var0.remove((java.lang.Object)(-1L));
    java.lang.Object var3 = var0.clone();
    java.util.Collection var4 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.lang.Object var1 = var0.clone();
    java.util.jar.Attributes var2 = new java.util.jar.Attributes(var0);
    java.util.jar.Attributes var3 = new java.util.jar.Attributes(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.util.jar.Attributes var1 = new java.util.jar.Attributes();
    java.lang.Object var3 = var1.remove((java.lang.Object)(-1L));
    var0.putAll((java.util.Map)var1);
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.jar.Manifest var0 = new java.util.jar.Manifest();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    var0.finest("hi!");
    var0.warning("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.SimpleDateFormat var1 = new java.text.SimpleDateFormat("");
    java.text.DateFormat var2 = java.text.DateFormat.getInstance();
    boolean var3 = var1.equals((java.lang.Object)var2);
    var1.setLenient(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.lang.Object var1 = var0.clone();
    java.util.jar.Attributes var2 = new java.util.jar.Attributes(var0);
    boolean var4 = var2.containsValue((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.text.SimpleDateFormat var1 = new java.text.SimpleDateFormat("");
    java.text.DateFormat var2 = java.text.DateFormat.getInstance();
    boolean var3 = var1.equals((java.lang.Object)var2);
    java.text.DateFormatSymbols var4 = var1.getDateFormatSymbols();
    java.text.SimpleDateFormat var6 = new java.text.SimpleDateFormat("");
    java.text.DateFormat var7 = java.text.DateFormat.getInstance();
    boolean var8 = var6.equals((java.lang.Object)var7);
    java.text.DateFormatSymbols var9 = var6.getDateFormatSymbols();
    var1.setDateFormatSymbols(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    var0.info("");
    var0.config("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.text.DateFormat var0 = java.text.DateFormat.getInstance();
    boolean var1 = var0.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    var0.info("");
    java.lang.String var4 = var0.getResourceBundleName();
    java.util.logging.Filter var5 = var0.getFilter();
    var0.exiting("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
