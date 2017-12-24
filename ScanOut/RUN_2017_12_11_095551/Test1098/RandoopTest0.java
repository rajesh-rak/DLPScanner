
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.util.Locale var3 = new java.util.Locale("hi!");
    java.lang.String var4 = var1.getDisplayCountry(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var3.getUnicodeLocaleType("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.util.Locale var3 = new java.util.Locale("hi!");
    java.lang.String var4 = var1.getDisplayCountry(var3);
    java.lang.String var5 = var1.getDisplayCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.util.Locale var3 = new java.util.Locale("hi!");
    java.lang.String var4 = var1.getDisplayCountry(var3);
    java.util.Locale var6 = new java.util.Locale("hi!");
    java.util.Locale var8 = new java.util.Locale("hi!");
    java.lang.String var9 = var6.getDisplayCountry(var8);
    java.lang.String var10 = var1.getDisplayName(var8);
    java.lang.String var11 = var1.toLanguageTag();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "und"+ "'", var11.equals("und"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.util.Enumeration var2 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("{}");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("USA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Locale var1 = java.util.Locale.forLanguageTag("English (United States)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Locale var0 = java.util.Locale.getDefault();
    java.util.Locale var2 = new java.util.Locale("hi!");
    java.util.Locale var4 = new java.util.Locale("hi!");
    java.lang.String var5 = var2.getDisplayCountry(var4);
    java.util.Locale var7 = new java.util.Locale("hi!");
    java.util.Locale var9 = new java.util.Locale("hi!");
    java.lang.String var10 = var7.getDisplayCountry(var9);
    java.lang.String var11 = var2.getDisplayName(var9);
    java.lang.String var12 = var0.getDisplayName(var2);
    java.lang.String var13 = var2.getDisplayVariant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "English (United States)"+ "'", var12.equals("English (United States)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Locale var4 = new java.util.Locale("", "hi!", "hi!");
    java.lang.String[] var5 = sun.util.TimeZoneNameUtility.retrieveDisplayNames("USA", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.lang.String var2 = var0.toString();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Locale var0 = java.util.Locale.getDefault();
    java.lang.String var1 = var0.getISO3Country();
    java.util.Set var2 = var0.getExtensionKeys();
    java.lang.String var3 = var0.getScript();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "USA"+ "'", var1.equals("USA"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Locale var3 = new java.util.Locale("und", "", "{}");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    long var6 = java.util.Date.UTC((-1), 100, 1, (-1), 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1977779900000L));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Locale var0 = java.util.Locale.getDefault();
    java.lang.String var1 = var0.getISO3Country();
    java.lang.String var2 = var0.getLanguage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "USA"+ "'", var1.equals("USA"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "en"+ "'", var2.equals("en"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(1);
    boolean var4 = var1.containsKey((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.util.Locale.setDefault(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Locale var3 = new java.util.Locale("", "hi!", "hi!");
    java.lang.String var4 = var3.getDisplayVariant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.lang.String var2 = var0.toString();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Locale var5 = new java.util.Locale("hi!");
    java.util.Locale var7 = new java.util.Locale("hi!");
    java.lang.String var8 = var5.getDisplayCountry(var7);
    java.lang.String var9 = var5.toString();
    boolean var10 = var3.contains((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finest("");
    var0.exiting("{}", "", (java.lang.Object)(byte)0);
    boolean var7 = var0.getUseParentHandlers();
    java.lang.Object[] var11 = new java.lang.Object[] { (byte)(-1)};
    var0.entering("und", "en", var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.lang.String var2 = var1.getDisplayLanguage();
    java.util.Locale var4 = new java.util.Locale("hi!");
    java.util.Locale var6 = new java.util.Locale("hi!");
    java.lang.String var7 = var4.getDisplayCountry(var6);
    java.util.Locale var9 = new java.util.Locale("hi!");
    java.util.Locale var11 = new java.util.Locale("hi!");
    java.lang.String var12 = var9.getDisplayCountry(var11);
    java.lang.String var13 = var4.getDisplayName(var11);
    java.lang.Object var14 = var11.clone();
    java.lang.String var15 = var1.getDisplayVariant(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.lang.String var1 = var0.getName();
    var0.config("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "global"+ "'", var1.equals("global"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.TimeZoneNameUtility var0 = new sun.util.TimeZoneNameUtility();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finest("");
    var0.exiting("{}", "", (java.lang.Object)(byte)0);
    var0.info("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
