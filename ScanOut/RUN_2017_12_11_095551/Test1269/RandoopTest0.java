
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var6 = java.util.Date.UTC(1, 1, 10, 10, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2173960730000L));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)(short)0);
    boolean var6 = var2.containsKey((java.lang.Object)"hi!");
    java.util.Hashtable var9 = new java.util.Hashtable(100, 1.0f);
    java.util.Enumeration var10 = var9.keys();
    boolean var11 = var2.containsValue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var1 = new java.util.Date((-1L));
    var1.setHours(1);
    int var4 = var1.getTimezoneOffset();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 0);
    int var4 = var3.getSeconds();
    java.lang.Object var5 = var3.clone();
    int var6 = var3.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var1 = new java.util.Date((-1L));
    int var2 = var1.getDate();
    java.lang.String var3 = var1.toString();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 0);
    int var4 = var3.getMinutes();
    java.lang.Object var5 = var3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    long var6 = java.util.Date.UTC(0, (-330), 1, 100, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-3076510799000L));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)(short)0);
    boolean var6 = var2.containsKey((java.lang.Object)"hi!");
    boolean var8 = var2.containsValue((java.lang.Object)100L);
    java.util.Date var12 = new java.util.Date((-1), (-1), 0);
    int var13 = var12.getSeconds();
    java.lang.Object var14 = var2.remove((java.lang.Object)var12);
    var12.setMonth((-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Date var5 = new java.util.Date((-1L));
    int var6 = var5.getDate();
    boolean var7 = var2.containsValue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var1 = new java.util.Date((-1L));
    int var2 = var1.getDate();
    java.lang.Object var3 = var1.clone();
    java.lang.String var4 = var1.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Enumeration var3 = var2.keys();
    java.util.Set var4 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)(short)0);
    boolean var6 = var2.containsKey((java.lang.Object)"hi!");
    boolean var8 = var2.containsValue((java.lang.Object)100L);
    java.util.Hashtable var11 = new java.util.Hashtable(100, 1.0f);
    boolean var13 = var11.equals((java.lang.Object)(short)0);
    boolean var15 = var11.containsKey((java.lang.Object)"hi!");
    boolean var17 = var11.containsValue((java.lang.Object)100L);
    java.lang.Object var18 = var2.get((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var1 = new java.util.Date((-1L));
    var1.setHours(1);
    var1.setDate(10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)(short)0);
    java.lang.Object var5 = var2.clone();
    java.util.Enumeration var6 = var2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var1 = new java.util.Date((-1L));
    var1.setHours(1);
    int var4 = var1.getSeconds();
    var1.setYear(10);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 0);
    int var4 = var3.getSeconds();
    java.lang.Object var5 = var3.clone();
    java.util.Date var9 = new java.util.Date((-1), (-1), 0);
    int var10 = var9.getSeconds();
    boolean var11 = var3.after(var9);
    java.lang.String var12 = var3.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)(short)0);
    boolean var6 = var2.containsKey((java.lang.Object)"hi!");
    boolean var8 = var2.containsValue((java.lang.Object)100L);
    java.util.Date var12 = new java.util.Date((-1), (-1), 0);
    int var13 = var12.getSeconds();
    java.lang.Object var14 = var2.remove((java.lang.Object)var12);
    java.util.Set var15 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Enumeration var3 = var2.keys();
    java.util.Hashtable var6 = new java.util.Hashtable(100, 1.0f);
    boolean var8 = var6.equals((java.lang.Object)(short)0);
    boolean var10 = var6.containsKey((java.lang.Object)"hi!");
    boolean var12 = var6.containsValue((java.lang.Object)100L);
    java.util.Hashtable var13 = new java.util.Hashtable((java.util.Map)var6);
    int var14 = var13.size();
    java.util.Date var16 = new java.util.Date((-1L));
    int var17 = var16.getDate();
    java.lang.Object var18 = var2.put((java.lang.Object)var13, (java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var1 = new java.util.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-330), "");

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)(short)0);
    boolean var5 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

}
