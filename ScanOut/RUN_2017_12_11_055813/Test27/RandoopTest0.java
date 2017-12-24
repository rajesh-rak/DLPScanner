
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.isActive();
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var1 = new java.util.Date(1L);
    int var2 = var1.getMonth();
    int var3 = var1.getDay();
    java.lang.String var4 = var1.toLocaleString();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.getRole("1 Jan, 1970 5:30:00 AM", "");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    long var6 = java.util.Date.UTC((-1), 10, (-1), 100, 4, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2214071760000L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.containsKey((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(0L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationIds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationCreationNotification("{}");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var1 = new java.util.Date(1L);
    int var2 = var1.getMonth();
    int var3 = var1.getDay();
    int var4 = var1.getDay();
    int var5 = var1.getMinutes();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var1 = new java.util.Date(1L);
    var1.setYear(100);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationIds();
    javax.management.relation.RelationService var5 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeNotificationListener((javax.management.NotificationListener)var5);
      fail("Expected exception of type javax.management.ListenerNotFoundException");
    } catch (javax.management.ListenerNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var5 = new java.util.Date(30, 10, 0, 100, 0);
    java.lang.String var6 = var5.toGMTString();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(100L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99L);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(99L, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 93L);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.util.Enumeration var2 = var1.propertyNames();
    java.lang.String var5 = var1.getProperty("{}", "{}");
    java.util.Enumeration var6 = var1.keys();
    boolean var7 = var0.containsKey((java.lang.Object)var1);
    java.util.Enumeration var8 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "{}"+ "'", var5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationIds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var1.getRelationTypeName("1 Jan, 1970 5:30:00 AM");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationIds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.purgeRelations();
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Enumeration var1 = var0.propertyNames();
    java.util.Properties var2 = new java.util.Properties();
    java.util.Enumeration var3 = var2.propertyNames();
    java.lang.String var6 = var2.getProperty("{}", "{}");
    boolean var7 = var0.containsKey((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var1 = new java.util.Date(1L);
    int var2 = var1.getMonth();
    java.lang.String var3 = var1.toLocaleString();
    java.lang.String var4 = var1.toLocaleString();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationIds();
    boolean var4 = var1.getPurgeFlag();
    java.lang.Boolean var6 = var1.hasRelation("1 Jan, 1970 5:30:00 AM");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationCreationNotification("{}");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var1 = new java.util.Date(1L);
    int var2 = var1.getMonth();
    int var3 = var1.getDay();
    int var4 = var1.getDay();
    var1.setYear((-1));
    int var7 = var1.getHours();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsKey((java.lang.Object)'a');
    java.util.Collection var3 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    var1.postRegister((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationIds();
    boolean var4 = var1.getPurgeFlag();
    java.lang.Boolean var6 = var1.hasRelation("1 Jan, 1970 5:30:00 AM");
    var1.preDeregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var6 = new java.util.Date(4, 10, 100, 5, 100, 0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationIds();
    boolean var4 = var1.getPurgeFlag();
    java.lang.Boolean var6 = var1.hasRelation("1 Jan, 1970 5:30:00 AM");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var1.getRoleInfos("{}");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));

  }

}
