
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.IPAddressName var1 = new sun.security.x509.IPAddressName("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore((-1L), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-7L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var2 = new byte[] { (byte)1, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.pkcs.PKCS7 var3 = new sun.security.pkcs.PKCS7(var2);
      fail("Expected exception of type sun.security.pkcs.ParsingException");
    } catch (sun.security.pkcs.ParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var1.findRelationsOfType("");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", (-1));
    int[] var4 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var2.getOffsetsByWall(10L, var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", (-1));
    java.lang.String var3 = var2.toString();
    java.util.SimpleTimeZone var4 = var2.getLastRuleInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("hi!");
    java.lang.String var2 = var1.getDefaultDomain();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMulticastAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("GMT+00:00", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var5 = var1.getRoleCardinality("", "");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(100, "hi!", 100, 10, (-1), 10, 100, 1, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", (-1));
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getDisplayName();
    int var5 = var2.getRawOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "GMT+00:00"+ "'", var4.equals("GMT+00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]", "");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var1 = java.net.InetAddress.getByName("sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.pkcs.PKCS9Attribute[] var0 = new sun.security.pkcs.PKCS9Attribute[] { };
    sun.security.pkcs.PKCS9Attributes var1 = new sun.security.pkcs.PKCS9Attributes(var0);
    byte[] var2 = var1.getDerEncoding();
    sun.security.pkcs.PKCS9Attribute[] var3 = var1.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Package var1 = java.lang.Package.getPackage("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.JarIndex var2 = new sun.misc.JarIndex(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    long var6 = java.util.Date.UTC(1, 100, 0, 1, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1914706740000L));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationTypeNames();
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

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationCreationNotification("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCSiteLocal();
    boolean var2 = var0.isSiteLocalAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    byte[] var4 = new byte[] { (byte)10, (byte)1, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var5 = java.net.InetAddress.getByAddress("", var4);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]", "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]", "hi!");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.findRelationsOfType("sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", (-1));
    boolean var3 = var2.isDirty();
    java.lang.Object var4 = var2.clone();
    var2.setRawOffset(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.isReachable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("hi!");
    java.lang.String[] var2 = var1.getDomains();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    java.util.List var3 = var1.getAllRelationTypeNames();
    var1.setPurgeFlag(true);
    java.lang.Boolean var7 = var1.hasRelation("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    byte[] var3 = new byte[] { (byte)0, (byte)(-1), (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.pkcs.PKCS7 var4 = new sun.security.pkcs.PKCS7(var3);
      fail("Expected exception of type sun.security.pkcs.ParsingException");
    } catch (sun.security.pkcs.ParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", (-1));
    boolean var3 = var2.isDirty();
    java.lang.Object var4 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var2.getDisplayName(true, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationTypeNames();
    boolean var3 = var1.getPurgeFlag();
    javax.management.relation.RelationService var6 = new javax.management.relation.RelationService(false);
    java.util.List var7 = var6.getAllRelationTypeNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationRemovalNotification("GMT+00:00", var7);
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
