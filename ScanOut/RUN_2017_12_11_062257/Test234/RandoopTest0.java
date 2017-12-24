
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(1, 10.0f);
    boolean var7 = var5.containsValue((java.lang.Object)true);
    boolean var8 = var2.contains((java.lang.Object)var5);
    java.lang.Object var9 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = new java.util.Date((-1L));
    int var2 = var1.getSeconds();
    var1.setTime(0L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(1, 10.0f);
    boolean var7 = var5.containsValue((java.lang.Object)true);
    boolean var8 = var2.contains((java.lang.Object)var5);
    java.lang.Object var10 = var5.get((java.lang.Object)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var11 = javax.naming.spi.NamingManager.getInitialContext(var5);
      fail("Expected exception of type javax.naming.NoInitialContextException");
    } catch (javax.naming.NoInitialContextException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartRule(10, 59, 59, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var1 = new java.util.Date((-1L));
    int var2 = var1.getSeconds();
    var1.setYear(59);
    java.util.Date var11 = new java.util.Date(59, 100, 0, 59, 0, (-1));
    boolean var12 = var1.before(var11);
    long var13 = var11.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "");
    var2.setID("");
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.util.SimpleTimeZone[id=,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]"+ "'", var5.equals("java.util.SimpleTimeZone[id=,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "");
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("");
    char[] var6 = new char[] { ' ', '4'};
    java.security.Key var7 = var0.engineGetKey("", var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(1, 10.0f);
    boolean var7 = var5.containsValue((java.lang.Object)true);
    boolean var8 = var2.contains((java.lang.Object)var5);
    java.util.Set var9 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "");
    var2.setRawOffset(100);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "");
    java.lang.String var3 = var2.getID();
    java.lang.String var4 = var2.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "GMT+00:00"+ "'", var4.equals("GMT+00:00"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(1, "hi!", (-1), 10, (-1), 59, 59, 59, (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    java.util.Date var4 = var0.engineGetCreationDate("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(1, 10.0f);
    boolean var7 = var5.containsValue((java.lang.Object)true);
    boolean var8 = var2.contains((java.lang.Object)var5);
    int var9 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    boolean var4 = var2.containsValue((java.lang.Object)true);
    java.util.Set var5 = var2.keySet();
    java.util.Hashtable var9 = new java.util.Hashtable(1, 10.0f);
    java.util.Collection var10 = var9.values();
    java.lang.Object var11 = var2.put((java.lang.Object)0.0f, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    boolean var4 = var2.containsValue((java.lang.Object)true);
    boolean var5 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Collection var3 = var2.values();
    boolean var4 = var2.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var5 = javax.naming.spi.NamingManager.getInitialContext(var2);
      fail("Expected exception of type javax.naming.NoInitialContextException");
    } catch (javax.naming.NoInitialContextException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.util.Date var3 = new java.util.Date((-1L));
    int var4 = var3.getSeconds();
    var3.setYear(59);
    java.util.Date var13 = new java.util.Date(59, 100, 0, 59, 0, (-1));
    boolean var14 = var3.before(var13);
    boolean var15 = var1.before(var3);
    java.util.Date var17 = new java.util.Date((-1L));
    java.util.Date var19 = new java.util.Date((-1L));
    int var20 = var19.getSeconds();
    var19.setYear(59);
    java.util.Date var29 = new java.util.Date(59, 100, 0, 59, 0, (-1));
    boolean var30 = var19.before(var29);
    boolean var31 = var17.before(var19);
    int var32 = var3.compareTo(var17);
    java.lang.String var33 = var3.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = var1.isRelationMBean("GMT+00:00");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.setPurgeFlag(false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "");
    var2.setID("");
    var2.setDSTSavings(100);

  }

}
