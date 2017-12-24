
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.security.KeyStore var0 = sun.security.tools.KeyTool.getCacertsKeyStore();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)1.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setTimeInMillis(0L);
    var0.setTimeInMillis(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var1.findRelationsOfType("hi!");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.String[] var4 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleResult var5 = var1.getRoles("hi!", var4);
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var3 = var1.getReferencedMBeans("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var4 = var1.getRoleInfo("", "hi!");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    boolean var2 = var0.after((java.lang.Object)10.0d);
    var0.clear(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(0, 1, 100);
    var0.set(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), 100, 100, 100, 10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.isActive();
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRelationType("hi!");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
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

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setTimeInMillis(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clear(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collection var1 = sun.security.tools.KeyTool.loadCRLs("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 0, 1, 1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.add((-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var5 = var1.getRoleCardinality("hi!", "hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(0, 1, 100);
    var0.set(1, 1, 0, 0, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.getRoleInfos("");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var6 = var1.getRoleCardinality("hi!", "hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setTimeInMillis(0L);
    java.lang.String var3 = var0.toString();
    var0.clear(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=30,SECOND=0,MILLISECOND=0,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=30,SECOND=0,MILLISECOND=0,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationTypeNames();
    var1.postDeregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(1, 10.0f);
    var2.putAll((java.util.Map)var5);
    java.lang.Object var7 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.security.Permissions@4dfbbcea (\n)\n"+ "'", var1.equals("java.security.Permissions@4dfbbcea (\n)\n"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var1 = new java.util.Date((-1L));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), 0, (-1), 100, 1, (-1));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 0, 1, 1, 0);
    var5.roll(1, false);
    int var10 = var5.getMaximum(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    boolean var2 = var0.after((java.lang.Object)10.0d);
    var0.setTimeInMillis(10L);
    var0.set(10, 100);
    var0.setTimeInMillis(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
