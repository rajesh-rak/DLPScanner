
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


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.System.runFinalizersOnExit(true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int[] var1 = new int[] { 1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var1, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Enumeration var3 = var2.elements();
    sun.reflect.annotation.AnnotationParser var4 = new sun.reflect.annotation.AnnotationParser();
    java.lang.Object var5 = var2.remove((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.lang.String var1 = var0.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Asia/Kolkata"+ "'", var1.equals("Asia/Kolkata"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.System.getenv("\u0A0A\u0A01\u0A0A");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 7);
    int var3 = var2.getRawOffset();
    sun.util.calendar.ZoneInfo var6 = new sun.util.calendar.ZoneInfo("hi!", 7);
    int var7 = var6.getRawOffset();
    boolean var8 = var2.hasSameRules((java.util.TimeZone)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(100L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.font.FontFamily var1 = sun.font.FontFamily.getFamily("Asia/Kolkata");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 100, 100, 1, (-1), 10, 10, 7, 100, 7, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.HashMap var1 = new java.util.HashMap(1);
    java.lang.Object var3 = var1.get((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Enumeration var3 = var2.elements();
    java.util.Enumeration var4 = var2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 7);
    int var3 = var2.getRawOffset();
    int[] var8 = new int[] { (-1), 0, 0};
    int var9 = var2.getOffsetsByStandard((-1L), var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.lang.String.valueOf(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String[] var0 = sun.font.FontFamily.getAllFamilyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.font.FontFamily var3 = new sun.font.FontFamily("", false, 0);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Font family:  plain=null bold=null italic=null bolditalic=null"+ "'", var4.equals("Font family:  plain=null bold=null italic=null bolditalic=null"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var5 = new byte[] { (byte)10, (byte)1, (byte)10};
    java.lang.String var7 = new java.lang.String(var5, 10);
    java.security.cert.Certificate[] var8 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var5, var8);
    char[] var11 = new char[] { };
    java.lang.String var12 = java.lang.String.copyValueOf(var11);
    java.security.Key var13 = var0.engineGetKey("true", var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "\u0A0A\u0A01\u0A0A"+ "'", var7.equals("\u0A0A\u0A01\u0A0A"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 7);
    int var3 = var2.getRawOffset();
    java.util.Map var4 = sun.util.calendar.ZoneInfo.getAliasTable();
    boolean var5 = var2.equals((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 7);
    boolean var3 = var2.observesDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("Asia/Kolkata");
    java.util.Enumeration var3 = var0.engineAliases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var4 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    boolean var3 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var5 = new byte[] { (byte)10, (byte)1, (byte)10};
    java.lang.String var7 = new java.lang.String(var5, 10);
    java.security.cert.Certificate[] var8 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var5, var8);
    int var10 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "\u0A0A\u0A01\u0A0A"+ "'", var7.equals("\u0A0A\u0A01\u0A0A"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "hi!");

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    sun.reflect.annotation.AnnotationParser var3 = new sun.reflect.annotation.AnnotationParser();
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.Class[] var5 = new java.lang.Class[] { };
    java.lang.Class var6 = java.lang.reflect.Proxy.getProxyClass(var4, var5);
    java.lang.Object var7 = var2.put((java.lang.Object)var3, (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.font.FontFamily var3 = new sun.font.FontFamily("", false, 0);
    sun.font.Font2D var5 = var3.getFontWithExactStyleMatch((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
