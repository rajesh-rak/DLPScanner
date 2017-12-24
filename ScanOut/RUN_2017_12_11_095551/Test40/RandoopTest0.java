
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 1, 100, 0, 1, 10, 10, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 1, (-1), 10);
    java.lang.String var7 = var6.toGMTString();
    boolean var9 = var6.equals((java.lang.Object)10);
    var6.setMinutes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var6 = var1.getRoleInfo("hi!", "30 Nov 1900 19:05:50 GMT");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(0, "hi!", 0, (-1), 0, 10, 10, 0, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setEndRule(10, 1, 10, (-1), true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    var13.setRawOffset((-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 1, (-1), 10);
    java.lang.String var7 = var6.toString();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    javax.management.relation.RelationService var5 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var7 = var5.hasRelation("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeNotificationListener((javax.management.NotificationListener)var5);
      fail("Expected exception of type javax.management.ListenerNotFoundException");
    } catch (javax.management.ListenerNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "Sat Dec 01 00:59:10 IST 1900", 0, 100, 1, 100, (-1), (-1), 0, 0, 100, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    var1.postRegister((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.util.SimpleTimeZone var27 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.lang.Object var28 = var27.clone();
    boolean var29 = var13.equals((java.lang.Object)var27);
    java.lang.String var30 = var13.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "30 Nov 1900 19:05:50 GMT"+ "'", var30.equals("30 Nov 1900 19:05:50 GMT"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var6 = java.util.Date.UTC(0, 100, (-1), 0, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1946326801000L));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var3 = new java.util.Date(0, 10, 1);
    var3.setMonth((-1));
    var3.setYear(1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    java.util.List var4 = var1.getAllRelationIds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.util.SimpleTimeZone var27 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.lang.Object var28 = var27.clone();
    boolean var29 = var13.equals((java.lang.Object)var27);
    var13.setRawOffset((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setStartRule(100, 1, 10, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationCreationNotification("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.util.SimpleTimeZone var27 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.lang.Object var28 = var27.clone();
    boolean var29 = var13.equals((java.lang.Object)var27);
    var13.setRawOffset((-1));
    var13.setStartYear(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.util.SimpleTimeZone var27 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.lang.Object var28 = var27.clone();
    boolean var29 = var13.equals((java.lang.Object)var27);
    java.lang.String var30 = var27.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "30 Nov 1900 19:05:50 GMT"+ "'", var30.equals("30 Nov 1900 19:05:50 GMT"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var3 = new java.util.Date(11, 10, 1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 1, (-1), 10);
    java.lang.String var7 = var6.toGMTString();
    var6.setHours(10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Date var4 = new java.util.Date(0, 10, 1);
    var4.setHours(10);
    java.lang.Object var7 = var0.remove((java.lang.Object)var4);
    java.util.Date var11 = new java.util.Date(0, 10, 1);
    var11.setMonth((-1));
    int var14 = var11.getMonth();
    int var15 = var4.compareTo(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.util.SimpleTimeZone var27 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    java.lang.Object var28 = var27.clone();
    boolean var29 = var13.equals((java.lang.Object)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setEndRule((-1), 10, 100, 11, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 1, (-1), 10);
    java.lang.String var7 = var6.toGMTString();
    java.lang.String var8 = var6.toString();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var3 = new java.util.Date(0, 10, 1);
    var3.setMonth((-1));
    int var6 = var3.getMonth();
    var3.setHours(0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "30 Nov 1900 19:05:50 GMT", 1, (-1), 1, 1, (-1), 100, 0, 10, 10, 0, 1);
    int var14 = var13.getDSTSavings();
    var13.setEndRule(1, 11, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Date var6 = new java.util.Date(1, 0, 10, 1, (-1), 0);
    var6.setHours(11);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
