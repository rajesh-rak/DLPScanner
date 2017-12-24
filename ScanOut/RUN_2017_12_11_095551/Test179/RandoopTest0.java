
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var4 = var1.getRoleInfo("", "");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var2.addAll((java.util.Collection)var4);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    javax.management.relation.RelationService var4 = new javax.management.relation.RelationService(true);
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
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.removeAll((java.util.Collection)var4);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var1 = var0.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    var3.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    boolean var7 = var3.isSerializing();
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var10 = var9.getBeanContextPeer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var3.retainAll((java.util.Collection)var9);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    var1.postRegister((java.lang.Boolean)false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var7 = var1.getRoleInfo("", "hi!");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    boolean var4 = var0.isSerializing();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var7 = var6.getBeanContextPeer();
    var0.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    var10.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var12);
    boolean var14 = var10.isSerializing();
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var17 = var16.getBeanContextPeer();
    var10.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var16);
    java.lang.reflect.AccessibleObject[] var19 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var19, false);
    java.lang.Object[] var22 = var16.toArray((java.lang.Object[])var19);
    var0.removeVetoableChangeListener("", (java.beans.VetoableChangeListener)var16);
    boolean var25 = var0.containsKey((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    var1.postRegister((java.lang.Boolean)false);
    javax.management.MBeanNotificationInfo[] var5 = var1.getNotificationInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    boolean var4 = var0.isSerializing();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var7 = var6.getBeanContextPeer();
    var0.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    java.lang.reflect.AccessibleObject[] var9 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var9, false);
    java.lang.Object[] var12 = var6.toArray((java.lang.Object[])var9);
    java.lang.reflect.AccessibleObject.setAccessible(var9, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    var1.postRegister((java.lang.Boolean)false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var1.getRole("", "");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


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

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    boolean var4 = var0.isSerializing();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var5 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    var1.postRegister((java.lang.Boolean)false);
    var1.setPurgeFlag(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    boolean var4 = var0.isSerializing();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var7 = var6.getBeanContextPeer();
    var0.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    boolean var9 = var6.needsGui();
    java.util.Iterator var10 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    var1.preDeregister();
    javax.management.relation.RelationService var5 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var7 = var5.hasRelation("");
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
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var1 = var0.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    var3.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    boolean var7 = var3.isSerializing();
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var3);
    boolean var9 = var3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    java.util.Locale var4 = var0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var1 = var0.getBeanContextPeer();
    java.beans.beancontext.BeanContextChild var2 = var0.getBeanContextChildPeer();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    var0.removeVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var4);
    boolean var6 = var0.isDesignTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("");
    var1.preDeregister();
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

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    var1.preDeregister();
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

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    boolean var4 = var0.isSerializing();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var7 = var6.getBeanContextPeer();
    var0.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    boolean var9 = var6.needsGui();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    var10.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var12);
    boolean var14 = var10.isSerializing();
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var17 = var16.getBeanContextPeer();
    var10.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var16);
    java.lang.reflect.AccessibleObject[] var19 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var19, false);
    java.lang.Object[] var22 = var16.toArray((java.lang.Object[])var19);
    java.lang.Object[] var23 = var6.toArray((java.lang.Object[])var19);
    java.beans.beancontext.BeanContextChild var24 = var6.getBeanContextChildPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    boolean var4 = var0.isSerializing();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var7 = var6.getBeanContextPeer();
    var0.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    boolean var9 = var6.isDelegated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var1 = var0.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    var3.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    boolean var7 = var3.isSerializing();
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var3);
    boolean var10 = var0.contains((java.lang.Object)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clear();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}
