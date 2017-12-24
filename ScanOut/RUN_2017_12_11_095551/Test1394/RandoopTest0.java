
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    int var4 = var3.getTimezoneOffset();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("Tue Feb 01 00:00:00 IST 2000");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getDay();
    var3.setMinutes(2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    boolean var2 = var0.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    long var6 = java.util.Date.UTC(10, 2, 1, 100, (-1), (-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1887998790000L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.sql.Date var3 = new java.sql.Date(1, 0, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setMinutes(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.sql.Date var3 = new java.sql.Date(1, 0, 2);
    var3.setMonth(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var3.getHours();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)1.0f);
    boolean var4 = var0.containsValue((java.lang.Object)(short)0);
    java.util.Hashtable var5 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.util.Hashtable var3 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.lang.Object var5 = var1.put((java.lang.Object)var3, (java.lang.Object)(short)0);
    java.util.Hashtable var6 = new java.util.Hashtable();
    java.lang.Object var8 = var6.remove((java.lang.Object)1.0f);
    var1.putAll((java.util.Map)var6);
    boolean var11 = var1.containsKey((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.sql.Date var3 = new java.sql.Date(1, 0, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var3.getSeconds();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)1.0f);
    boolean var4 = var0.containsValue((java.lang.Object)(short)0);
    java.util.Set var5 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    var3.setYear((-330));
    java.util.Date var9 = new java.util.Date(100, 1, 1);
    int var10 = var3.compareTo(var9);
    var9.setMinutes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    long var6 = java.util.Date.UTC(100, 0, 2, 0, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 946777300000L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Hashtable var3 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Hashtable var3 = new java.util.Hashtable();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var3);
    java.util.Hashtable var5 = new java.util.Hashtable();
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var5);
    java.lang.Object var8 = var4.put((java.lang.Object)var6, (java.lang.Object)(short)0);
    var0.putAll((java.util.Map)var4);
    boolean var11 = var4.containsValue((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)1.0f);
    java.util.Collection var3 = var0.values();
    boolean var5 = var0.containsKey((java.lang.Object)(short)100);
    boolean var7 = var0.containsKey((java.lang.Object)'4');
    java.util.Enumeration var8 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var1 = new java.util.Date(1L);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.sql.Date var3 = new java.sql.Date(1, 0, 2);
    var3.setMonth(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setSeconds(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    var3.setYear((-330));
    java.util.Date var9 = new java.util.Date(100, 1, 1);
    int var10 = var3.compareTo(var9);
    int var11 = var9.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    var3.setYear((-330));
    java.util.Date var9 = new java.util.Date(100, 1, 1);
    int var10 = var3.compareTo(var9);
    int var11 = var3.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    int var4 = var3.getHours();
    java.lang.String var5 = var3.toGMTString();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Enumeration var2 = var1.keys();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.sql.Date var3 = new java.sql.Date(1, 0, 2);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1901-01-02"+ "'", var4.equals("1901-01-02"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var1 = new java.util.Date(10L);

  }

}
