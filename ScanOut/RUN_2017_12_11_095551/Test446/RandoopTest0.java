
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(100, "Tue Apr 30 11:40:00 IST 1907", 0, 10, (-1), 10, 1, 0, (-1), 0, (-1), 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "hi!", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    java.lang.String var14 = var13.getDisplayName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = var13.getDisplayName(false, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "GMT+00:00"+ "'", var14.equals("GMT+00:00"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "hi!", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var13.setEndRule(1, 1, 10);
    var13.setRawOffset((-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationCreationNotification("hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "", 0, 1, 1, 0, 0, 1, 1, 10);
    java.util.SimpleTimeZone var24 = new java.util.SimpleTimeZone(0, "hi!", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    boolean var25 = var24.useDaylightTime();
    boolean var26 = var10.hasSameRules((java.util.TimeZone)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var3 = new java.util.Date(1, 10, (-1));
    java.lang.String var4 = var3.toLocaleString();
    java.util.Date var10 = new java.util.Date((-1), 100, 0, 10, 100);
    java.lang.String var11 = var10.toLocaleString();
    int var12 = var10.getSeconds();
    boolean var13 = var3.after(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(1, 10, (-1));
    java.lang.String var4 = var3.toLocaleString();
    int var5 = var3.getDate();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    javax.management.relation.RoleInfo[] var3 = new javax.management.relation.RoleInfo[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.createRelationType("hi!", var3);
      fail("Expected exception of type javax.management.relation.InvalidRelationTypeException");
    } catch (javax.management.relation.InvalidRelationTypeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "", 0, 1, 1, 0, 0, 1, 1, 10);
    boolean var11 = var10.observesDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRelationType("Tue Apr 30 11:40:00 IST 1907");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    javax.management.relation.RelationService var5 = new javax.management.relation.RelationService(false);
    java.util.List var6 = var5.getAllRelationTypeNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationRemovalNotification("30 Apr, 1907 11:40:00 AM", var6);
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "hi!", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    int var14 = var13.getDSTSavings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var5 = new java.util.Date((-1), 100, 0, 10, 100);
    java.lang.String var6 = var5.toLocaleString();
    var5.setMinutes(100);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("30 Oct, 1901 12:00:00 AM", (-1));
    int var3 = var2.getDSTSavings();
    boolean var4 = var2.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "hi!", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    java.lang.String var14 = var13.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var3 = new java.util.Date(1, 10, (-1));
    long var4 = var3.getTime();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    javax.management.relation.RelationService var4 = new javax.management.relation.RelationService(false);
    java.util.List var5 = var4.getAllRelationTypeNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationRemovalNotification("", var5);
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("GMT+00:00", 100);
    int var3 = var2.getDSTSavings();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var4.equals("sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("GMT+00:00", 100);
    int var3 = var2.getDSTSavings();
    int var4 = var2.getDSTSavings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("GMT+00:00", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var2.getDisplayName(false, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.findRelationsOfType("30 Oct, 1901 12:00:00 AM");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("GMT+00:00", 100);
    int var3 = var2.getDSTSavings();
    java.util.SimpleTimeZone var4 = var2.getLastRuleInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var6 = new java.util.Date(10, (-1), 0, (-1), 0, 30);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "GMT+00:00");

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "", 0, 1, 1, 0, 0, 1, 1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setEndRule(10, 100, 0, 30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    var1.setPurgeFlag(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var1.getRole("GMT+00:00", "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Date var5 = new java.util.Date((-1), 100, 0, 10, 100);
    java.lang.String var6 = var5.toString();
    var5.setYear(30);

  }

}
