
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.Permissions var0 = new java.security.Permissions();
    var0.setReadOnly();
    java.util.Enumeration var2 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.security.Permissions@1b9ce804 (\n)\n"+ "'", var1.equals("java.security.Permissions@1b9ce804 (\n)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.security.Permissions@1b9ce804 (\n)\n"+ "'", var2.equals("java.security.Permissions@1b9ce804 (\n)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.security.Permissions@1b9ce804 (\n)\n"+ "'", var3.equals("java.security.Permissions@1b9ce804 (\n)\n"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var1 = new java.util.Date(100L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "hi!", (-1), 0, 1, 100, 10, 1, 10, (-1), 0, 1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setEndRule(0, (-1), 100, 1, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    long var6 = java.util.Date.UTC((-1), 0, 100, 100, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2231610599000L));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 10, 0, 1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var3 = new java.util.Date(10, 100, 1);
    java.util.Date var9 = new java.util.Date(1, 0, (-1), 10, 1);
    boolean var10 = var3.before(var9);
    java.util.Date var16 = new java.util.Date(1, 0, (-1), 10, 1);
    boolean var17 = var9.before(var16);
    java.util.Date var24 = new java.util.Date(100, 1, (-1), 10, (-1), (-1));
    var24.setHours(10);
    boolean var27 = var16.before(var24);
    int var28 = var16.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)false);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var5 = new java.util.Date(10, 10, 10, 10, (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var3 = new java.util.Date(10, 100, 1);
    java.util.Date var9 = new java.util.Date(1, 0, (-1), 10, 1);
    boolean var10 = var3.before(var9);
    java.util.Date var16 = new java.util.Date(1, 0, (-1), 10, 1);
    boolean var17 = var9.before(var16);
    java.util.Date var24 = new java.util.Date(100, 1, (-1), 10, (-1), (-1));
    var24.setHours(10);
    boolean var27 = var16.before(var24);
    java.util.Date var31 = new java.util.Date(10, 100, 1);
    boolean var32 = var24.before(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("java.security.Permissions@2684c71b (\n)\n", (-1));
    java.util.SimpleTimeZone var3 = var2.getLastRuleInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var4 = var1.getRoleInfo("{}", "java.security.Permissions@3412605d (\n)\n");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.preDeregister();
    var1.postRegister((java.lang.Boolean)false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var3 = new java.util.Date(10, 100, 1);
    long var4 = var3.getTime();
    java.lang.Object var5 = var3.clone();
    int var6 = var3.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "hi!", (-1), 0, 1, 100, 10, 1, 10, (-1), 0, 1, 100);
    int var15 = var13.getOffset(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setStartRule(0, 1, 100, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var3 = new java.util.Date(10, 100, 1);
    long var4 = var3.getTime();
    var3.setDate(0);
    int var7 = var3.getTimezoneOffset();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var2 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)"");
    java.util.Enumeration var3 = var0.keys();
    java.util.Set var4 = var0.entrySet();
    java.security.Permissions var5 = new java.security.Permissions();
    var5.setReadOnly();
    java.lang.String var7 = var5.toString();
    boolean var8 = var0.contains((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "java.security.Permissions@6cf5b81a (\n)\n"+ "'", var7.equals("java.security.Permissions@6cf5b81a (\n)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

}
