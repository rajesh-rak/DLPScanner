
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
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var6 = java.util.Date.UTC(0, 10, 0, 7, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2182784400000L));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);
    java.util.Hashtable var3 = new java.util.Hashtable();
    java.util.Hashtable var4 = new java.util.Hashtable();
    var3.putAll((java.util.Map)var4);
    java.lang.Object var6 = var1.remove((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var5 = var1.getReferencedMBeans("hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), 7, 100, 7, 1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 1, 1, 0, 0);
    boolean var7 = var5.before((java.lang.Object)(-1));
    var5.setFirstDayOfWeek(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    javax.management.relation.RelationService var4 = new javax.management.relation.RelationService(false);
    java.lang.Boolean var6 = var4.hasRelation("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeNotificationListener((javax.management.NotificationListener)var4);
      fail("Expected exception of type javax.management.ListenerNotFoundException");
    } catch (javax.management.ListenerNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 1, 1, 0, 0);
    var5.roll(0, 1);
    var5.set((-1), 0, 10, (-1), 1, 7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 1, 1, 0, 0);
    boolean var7 = var5.before((java.lang.Object)(-1));
    var5.add(0, 0);
    java.lang.String var11 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var11.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-2182784400000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleResult var4 = var1.getAllRoles("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.lang.Boolean var3 = var1.hasRelation("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationCreationNotification("hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 1, 1, 0, 0);
    boolean var7 = var5.before((java.lang.Object)(-1));
    var5.set(100, 0, (-1), 100, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 1, 1, 0, 0);
    long var6 = var5.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-62164733400000L));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var5 = new java.util.Date((-1), 10, 0, 7, 100);
    var5.setMinutes(10);
    java.util.Date var13 = new java.util.Date((-1), 10, 0, 7, 100);
    boolean var14 = var5.before(var13);
    var13.setYear(0);
    var13.setMinutes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var5 = new java.util.Date((-1), 10, 0, 7, 100);
    var5.setMinutes(10);
    java.util.Date var13 = new java.util.Date((-1), 10, 0, 7, 100);
    boolean var14 = var5.before(var13);
    int var15 = var5.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var1.findRelationsOfType("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    javax.management.MBeanNotificationInfo[] var3 = var1.getNotificationInfo();
    var1.preDeregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    javax.management.relation.RoleInfo[] var5 = new javax.management.relation.RoleInfo[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.createRelationType("31 Oct, 1899 8:10:00 AM", var5);
      fail("Expected exception of type javax.management.relation.InvalidRelationTypeException");
    } catch (javax.management.relation.InvalidRelationTypeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.elements();
    javax.management.relation.RelationService var3 = new javax.management.relation.RelationService(false);
    var3.preDeregister();
    javax.management.MBeanNotificationInfo[] var5 = var3.getNotificationInfo();
    java.lang.Object var6 = var0.remove((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar(0, 1, 1, 0, 0);
    java.lang.Object var9 = var0.get((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var5 = new java.util.Date((-1), 10, 0, 7, 100);
    var5.setMinutes(10);
    var5.setTime((-2182784400000L));
    java.util.Date var15 = new java.util.Date((-1), 10, 0, 7, 100);
    var15.setMinutes(10);
    java.lang.String var18 = var15.toLocaleString();
    boolean var19 = var5.before(var15);
    int var20 = var5.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 1, 1, 0, 0);
    int var6 = var5.getFirstDayOfWeek();
    var5.set(7, 7, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.roll(100, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 1, 1, 0, 0);
    boolean var7 = var5.before((java.lang.Object)(-1));
    boolean var9 = var5.equals((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

}
