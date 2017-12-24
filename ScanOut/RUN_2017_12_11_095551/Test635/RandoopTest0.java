
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 155768696);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var1 = var0.clone();
    java.util.Enumeration var2 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "", (-1), 10, 10, 155768696, 0, 10, 0, 155768696, 0, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var5 = new java.lang.String(var3, 155768696);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u7801\u780A\u7800"+ "'", var5.equals("\u7801\u780A\u7800"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var0 = java.lang.System.lineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "\n"+ "'", var0.equals("\n"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.font.FontFamily var3 = new sun.font.FontFamily("hi!", false, (-1));
    int var4 = var3.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "", 10, (-1), 155768696, 100, 100, 0, 1, (-1), 0, 0, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.SecurityException var1 = new java.lang.SecurityException();
    var0.addSuppressed((java.lang.Throwable)var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.HashMap var3 = new java.util.HashMap((java.util.Map)var0);
    java.util.Set var4 = var3.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.SecurityException var1 = new java.lang.SecurityException("\n");

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    int var1 = var0.getWeekLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    char[] var2 = new char[] { ' ', '4'};
    java.lang.String var3 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " 4"+ "'", var3.equals(" 4"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.RuntimeException var2 = new java.lang.RuntimeException("hi!");
    java.lang.Throwable var3 = new java.lang.Throwable("", (java.lang.Throwable)var2);
    java.lang.SecurityException var4 = new java.lang.SecurityException((java.lang.Throwable)var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.HashMap var2 = new java.util.HashMap(155768696, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.font.FontFamily var3 = new sun.font.FontFamily("hi!", false, (-1));
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Font family: hi! plain=null bold=null italic=null bolditalic=null"+ "'", var4.equals("Font family: hi! plain=null bold=null italic=null bolditalic=null"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.HashMap var3 = new java.util.HashMap((java.util.Map)var0);
    boolean var5 = var3.containsValue((java.lang.Object)(short)10);
    java.lang.Object var7 = var3.get((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.HashMap var3 = new java.util.HashMap((java.util.Map)var0);
    java.lang.Object var4 = var3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    char[] var2 = new char[] { 'a', '#'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a#"+ "'", var3.equals("a#"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var0 = new java.util.Date();
    var0.setHours((-1));
    var0.setHours(155768696);
    var0.setTime(1L);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("\u7801\u780A\u7800", 0);
    boolean var3 = var2.isDirty();
    boolean var4 = var2.isDirty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "");
    var2.setStartYear((-1));
    java.util.SimpleTimeZone var7 = new java.util.SimpleTimeZone((-1), "");
    boolean var8 = var7.useDaylightTime();
    boolean var9 = var2.hasSameRules((java.util.TimeZone)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartRule(0, 155768696, 1, 100, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Enumeration var3 = var2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.HashMap var3 = new java.util.HashMap((java.util.Map)var0);
    boolean var5 = var3.containsValue((java.lang.Object)(short)10);
    int var6 = var3.size();
    java.util.Hashtable var7 = new java.util.Hashtable();
    java.lang.Object var8 = var7.clone();
    var3.putAll((java.util.Map)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var2 = java.lang.System.getProperty("Font family: hi! plain=null bold=null italic=null bolditalic=null", "a#");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "a#"+ "'", var2.equals("a#"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.loadLibrary(" 4");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

}
