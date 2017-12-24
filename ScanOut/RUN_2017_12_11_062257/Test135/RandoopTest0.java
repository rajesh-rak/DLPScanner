
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var1.findRelationsOfType("hi!");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode((-1), "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.isActive();
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var5 = var1.getRoleInfo("", "");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var1.getRelationTypeName("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var1.getRelationTypeName("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    int var5 = var2.indexOf((java.lang.Object)10.0d, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add((-1), (java.lang.Object)(short)0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRelation("");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var1 = new java.util.Vector(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeElementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRelationType("");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElementAt((java.lang.Object)0.0f, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    int var5 = var2.indexOf((java.lang.Object)10.0d, 0);
    java.util.Vector var8 = new java.util.Vector(0);
    int var10 = var8.indexOf((java.lang.Object)10.0f);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var2.addAll(1, (java.util.Collection)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    javax.management.relation.RelationService var4 = new javax.management.relation.RelationService(false);
    var4.preDeregister();
    var4.setPurgeFlag(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeNotificationListener((javax.management.NotificationListener)var4);
      fail("Expected exception of type javax.management.ListenerNotFoundException");
    } catch (javax.management.ListenerNotFoundException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)10.0f);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.add((-1), (java.lang.Object)1L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    var1.preDeregister();
    javax.management.relation.RoleInfo[] var4 = new javax.management.relation.RoleInfo[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.createRelationType("hi!", var4);
      fail("Expected exception of type javax.management.relation.InvalidRelationTypeException");
    } catch (javax.management.relation.InvalidRelationTypeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    int var5 = var2.indexOf((java.lang.Object)10.0d, 0);
    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    var2.copyInto(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.relation.MBeanServerNotificationFilter var0 = new javax.management.relation.MBeanServerNotificationFilter();
    var0.disableAllTypes();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.util.Vector var5 = new java.util.Vector(0);
    int var7 = var5.indexOf((java.lang.Object)10.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var2.addAll(100, (java.util.Collection)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var2 = java.net.URLClassLoader.newInstance(var0, var1);
    java.net.URL var4 = var1.getResource("");
    java.net.URL var6 = var1.getResource("hi!");
    java.util.Enumeration var8 = var1.getResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)10.0f);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    var4.removeAllElements();
    java.util.Vector var7 = new java.util.Vector(0);
    int var9 = var7.indexOf((java.lang.Object)10.0f);
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var7);
    java.lang.Object[] var11 = new java.lang.Object[] { var10};
    java.lang.Object[] var12 = var4.toArray(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)10.0f);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    var4.insertElementAt((java.lang.Object)' ', 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var1 = new java.util.Vector(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.elementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.remove((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var4 = new java.util.Vector(10, 1);
    int var7 = var4.indexOf((java.lang.Object)10.0d, 0);
    int var9 = var1.indexOf((java.lang.Object)var4, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    int var5 = var2.indexOf((java.lang.Object)10.0d, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.elementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    javax.management.relation.RelationService var3 = new javax.management.relation.RelationService(false);
    javax.management.relation.MBeanServerNotificationFilter var4 = new javax.management.relation.MBeanServerNotificationFilter();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeNotificationListener((javax.management.NotificationListener)var3, (javax.management.NotificationFilter)var4, (java.lang.Object)10.0f);
      fail("Expected exception of type javax.management.ListenerNotFoundException");
    } catch (javax.management.ListenerNotFoundException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.Vector var4 = new java.util.Vector(0);
    int var6 = var4.indexOf((java.lang.Object)10.0f);
    boolean var8 = var4.removeElement((java.lang.Object)'#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationRemovalNotification("hi!", (java.util.List)var4);
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)10.0f);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    var4.removeAllElements();
    var4.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var2 = java.net.URLClassLoader.newInstance(var0, var1);
    java.net.URL[] var3 = new java.net.URL[] { };
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = java.net.URLClassLoader.newInstance(var3, var4);
    java.net.URL var7 = var5.findResource("hi!");
    java.net.URL[] var8 = var5.getURLs();
    java.net.URLClassLoader var9 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var5);
    java.net.URL[] var10 = new java.net.URL[] { };
    java.lang.ClassLoader var11 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var12 = java.net.URLClassLoader.newInstance(var10, var11);
    java.net.URL[] var13 = new java.net.URL[] { };
    java.lang.ClassLoader var14 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var15 = java.net.URLClassLoader.newInstance(var13, var14);
    java.net.URL var17 = var15.findResource("hi!");
    java.net.URL[] var18 = var15.getURLs();
    java.net.URLClassLoader var19 = java.net.URLClassLoader.newInstance(var10, (java.lang.ClassLoader)var15);
    java.net.URLClassLoader var20 = new java.net.URLClassLoader(var0, (java.lang.ClassLoader)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

}
