
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    var5.setTime(0L);
    java.util.Date var13 = new java.util.Date(0, 1, 0, 0, 100);
    var13.setTime(0L);
    boolean var16 = var5.after(var13);
    var13.setTime(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    var5.setTime(0L);
    int var8 = var5.getMinutes();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(30);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.event.UndoableEditListener[] var1 = var0.getUndoableEditListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.lang.Object var2 = var0.getProperty((java.lang.Object)(byte)(-1));
    javax.swing.event.UndoableEditListener[] var3 = var0.getUndoableEditListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    var5.setTime(0L);
    java.util.Date var13 = new java.util.Date(0, 1, 0, 0, 100);
    var13.setTime(0L);
    boolean var16 = var5.after(var13);
    var13.setDate(10);
    var13.setMinutes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(30);
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    boolean var5 = var1.containsValue((java.lang.Object)0L);
    java.util.Set var6 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var1 = new java.util.Hashtable(30);
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    java.util.Collection var4 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    long var6 = java.util.Date.UTC(100, 30, 30, 1, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1027990741000L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    var5.setTime(0L);
    java.util.Date var13 = new java.util.Date(0, 1, 0, 0, 100);
    var13.setTime(0L);
    boolean var16 = var5.after(var13);
    var13.setDate(10);
    int var19 = var13.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    var5.setTime(0L);
    java.util.Date var13 = new java.util.Date(0, 1, 0, 0, 100);
    var13.setTime(0L);
    boolean var16 = var5.after(var13);
    var13.setDate(10);
    java.lang.String var19 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getHours();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    var5.setHours(18);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var4 = new java.util.Date(10, 100, 0);
    int var5 = var0.compareTo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.lang.Object var2 = var0.getProperty((java.lang.Object)(byte)(-1));
    javax.swing.text.Position var4 = var0.createPosition(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var3 = new java.util.Date(10, 100, 0);
    int var4 = var3.getYear();
    java.util.Date var8 = new java.util.Date(10, 100, 0);
    int var9 = var8.getYear();
    boolean var10 = var3.after(var8);
    java.lang.String var11 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("Tue Apr 30 00:00:00 IST 1918");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var2 = var0.getStyle("");
    int var3 = var0.getLength();
    javax.swing.text.Style var5 = var0.getStyle("Tue Apr 30 00:00:00 IST 1918");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.util.Enumeration var1 = var0.getStyleNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var1 = new java.util.Hashtable(30);
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    boolean var5 = var1.containsValue((java.lang.Object)0L);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    java.util.Calendar var1 = java.util.Calendar.getInstance(var0);
    var1.set(6, 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Enumeration var1 = var0.elements();
    java.lang.Object var4 = var0.setProperty("{}", "Sat Jan 10 05:30:00 IST 1970");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("Sat Jan 10 05:30:00 IST 1970");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

}
