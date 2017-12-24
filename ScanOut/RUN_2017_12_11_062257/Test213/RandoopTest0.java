
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Package[] var0 = java.lang.Package.getPackages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationCreationNotification("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRelationType("");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var7 = var1.getRoleCardinality("", "");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.isActive();
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    var1.preDeregister();
    javax.management.ObjectName var8 = new javax.management.ObjectName("", "hi!", "hi!");
    javax.management.ObjectName var9 = javax.management.ObjectName.getInstance(var8);
    java.lang.String var10 = var1.isRelation(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var13 = var1.getRoleInfo("", "");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(10, "", 0, 0, 1, 100, 100, 1, (-1), 10, 10, 4, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(4, "hi!", 1, 1, 0, (-1), (-1), 10, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    var1.setPurgeFlag(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var1.getRoleInfos("");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    java.util.Hashtable var4 = var3.getKeyPropertyList();
    java.util.Collection var5 = var4.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    boolean var4 = var1.before(var3);
    java.lang.ClassLoader var5 = java.lang.ClassLoader.getSystemClassLoader();
    boolean var6 = var1.equals((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    boolean var2 = var1.getPurgeFlag();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("hi!");
    int var3 = var0.engineSize();
    java.security.cert.Certificate var5 = var0.engineGetCertificate("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.IssuerAlternativeNameExtension var1 = var0.getIssuerAlternativeNameExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    javax.management.relation.RoleInfo[] var3 = new javax.management.relation.RoleInfo[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.createRelationType("", var3);
      fail("Expected exception of type javax.management.relation.InvalidRelationTypeException");
    } catch (javax.management.relation.InvalidRelationTypeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    java.util.Hashtable var4 = var3.getKeyPropertyList();
    java.util.Enumeration var5 = var4.keys();
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    var0.setClassAssertionStatus("", true);
    var0.setPackageAssertionStatus("hi!", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var6 = var1.getRoleCardinality("", "");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    boolean var4 = var1.before(var3);
    java.lang.String var5 = var1.toGMTString();
    int var6 = var1.getDay();
    var1.setYear(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(0L, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = var0.getIssuerAlternativeNames();
    java.util.Collection var2 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

}
