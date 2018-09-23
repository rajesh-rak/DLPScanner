
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    boolean var8 = var2.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    var10.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.InputStream var14 = var4.getResourceAsStream("hi!", (java.beans.beancontext.BeanContextChild)var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    boolean var8 = var2.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    var11.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var13);
    java.beans.beancontext.BeanContext var15 = var13.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    var16.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var18);
    var13.setBeanContext((java.beans.beancontext.BeanContext)var18);
    var2.fireVetoableChange("hi!", (java.lang.Object)(byte)10, (java.lang.Object)var18);
    java.beans.beancontext.BeanContextSupport var23 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var25 = new java.beans.beancontext.BeanContextSupport();
    var23.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var25);
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var29 = new java.beans.beancontext.BeanContextSupport();
    var27.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var29);
    boolean var31 = var25.containsAll((java.util.Collection)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.InputStream var32 = var2.getResourceAsStream("hi!", (java.beans.beancontext.BeanContextChild)var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRelation("hi!");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var4 = var1.getRoleInfo("hi!", "");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    var2.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var4);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    var6.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var8);
    boolean var10 = var4.containsAll((java.util.Collection)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var11 = var0.getResource("hi!", (java.beans.beancontext.BeanContextChild)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var3 = var1.getReferencedMBeans("hi!");
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
      java.lang.Integer var4 = var1.getRoleCardinality("", "");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.postRegister((java.lang.Boolean)false);
    javax.management.relation.RoleInfo[] var5 = new javax.management.relation.RoleInfo[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.createRelationType("", var5);
      fail("Expected exception of type javax.management.relation.InvalidRelationTypeException");
    } catch (javax.management.relation.InvalidRelationTypeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    java.lang.Object[] var8 = var6.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.retainAll((java.util.Collection)var6);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    boolean var8 = var2.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    var9.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var11);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    var13.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var17 = var11.containsAll((java.util.Collection)var13);
    java.beans.beancontext.BeanContextSupport var20 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var22 = new java.beans.beancontext.BeanContextSupport();
    var20.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var22);
    java.beans.beancontext.BeanContext var24 = var22.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var25 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    var25.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var27);
    var22.setBeanContext((java.beans.beancontext.BeanContext)var27);
    var11.fireVetoableChange("hi!", (java.lang.Object)(byte)10, (java.lang.Object)var27);
    boolean var31 = var4.contains((java.lang.Object)"hi!");
    java.beans.beancontext.BeanContextSupport var33 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var35 = new java.beans.beancontext.BeanContextSupport();
    var33.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var35);
    java.beans.beancontext.BeanContext var37 = var35.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var38 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var40 = new java.beans.beancontext.BeanContextSupport();
    var38.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var40);
    var35.setBeanContext((java.beans.beancontext.BeanContext)var40);
    java.beans.beancontext.BeanContextSupport var44 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var46 = new java.beans.beancontext.BeanContextSupport();
    var44.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var46);
    java.beans.beancontext.BeanContextSupport var48 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var50 = new java.beans.beancontext.BeanContextSupport();
    var48.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var50);
    boolean var52 = var46.containsAll((java.util.Collection)var48);
    var35.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var48);
    boolean var54 = var35.isDelegated();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    javax.management.MBeanNotificationInfo[] var2 = var1.getNotificationInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var4 = var1.isRelationMBean("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.lang.Object[] var4 = var2.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var2.instantiateChild("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    boolean var8 = var2.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    var11.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var13);
    java.beans.beancontext.BeanContext var15 = var13.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    var16.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var18);
    var13.setBeanContext((java.beans.beancontext.BeanContext)var18);
    var2.fireVetoableChange("hi!", (java.lang.Object)(byte)10, (java.lang.Object)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.clear();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    javax.management.MBeanNotificationInfo[] var2 = var1.getNotificationInfo();
    var1.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var5 = var1.isRelationMBean("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    boolean var8 = var2.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    var9.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var11);
    java.lang.Object[] var13 = var11.toArray();
    java.util.Locale var14 = var11.getLocale();
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var2, var14, true, true);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var20 = new java.beans.beancontext.BeanContextSupport();
    var18.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var20);
    java.beans.beancontext.BeanContextSupport var22 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var24 = new java.beans.beancontext.BeanContextSupport();
    var22.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var24);
    boolean var26 = var20.containsAll((java.util.Collection)var22);
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var29 = new java.beans.beancontext.BeanContextSupport();
    var27.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var29);
    java.lang.Object[] var31 = var29.toArray();
    java.util.Locale var32 = var29.getLocale();
    java.beans.beancontext.BeanContextSupport var35 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var20, var32, true, true);
    var2.setLocale(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    var2.dontUseGui();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.postRegister((java.lang.Boolean)false);
    java.util.List var4 = var1.getAllRelationTypeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    var1.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContext var5 = var3.getBeanContextPeer();
    boolean var6 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    var8.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var10);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var14);
    boolean var16 = var10.containsAll((java.util.Collection)var12);
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    var17.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var19);
    java.lang.Object[] var21 = var19.toArray();
    java.util.Locale var22 = var19.getLocale();
    java.beans.beancontext.BeanContextSupport var25 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var10, var22, true, true);
    var0.removeVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    boolean var8 = var2.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    var9.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var11);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    var13.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var17 = var11.containsAll((java.util.Collection)var13);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var20 = new java.beans.beancontext.BeanContextSupport();
    var18.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var20);
    java.lang.Object[] var22 = var20.toArray();
    java.util.Locale var23 = var20.getLocale();
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var11, var23, true, true);
    java.beans.beancontext.BeanContextSupport var28 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var4, var23, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    boolean var3 = var1.getPurgeFlag();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    boolean var8 = var2.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    var9.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var11);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    var13.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var17 = var11.containsAll((java.util.Collection)var13);
    java.beans.beancontext.BeanContextSupport var20 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var22 = new java.beans.beancontext.BeanContextSupport();
    var20.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var22);
    java.beans.beancontext.BeanContext var24 = var22.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var25 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    var25.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var27);
    var22.setBeanContext((java.beans.beancontext.BeanContext)var27);
    var11.fireVetoableChange("hi!", (java.lang.Object)(byte)10, (java.lang.Object)var27);
    boolean var31 = var4.contains((java.lang.Object)"hi!");
    java.beans.beancontext.BeanContextSupport var32 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var34 = new java.beans.beancontext.BeanContextSupport();
    var32.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var34);
    java.beans.beancontext.BeanContextSupport var36 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var38 = new java.beans.beancontext.BeanContextSupport();
    var36.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var38);
    boolean var40 = var34.containsAll((java.util.Collection)var36);
    var4.setBeanContext((java.beans.beancontext.BeanContext)var34);
    java.beans.beancontext.BeanContextSupport var43 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var45 = new java.beans.beancontext.BeanContextSupport();
    var43.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var45);
    java.beans.beancontext.BeanContextSupport var47 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var49 = new java.beans.beancontext.BeanContextSupport();
    var47.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var49);
    boolean var51 = var45.containsAll((java.util.Collection)var47);
    java.beans.beancontext.BeanContextSupport var52 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var54 = new java.beans.beancontext.BeanContextSupport();
    var52.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var54);
    java.lang.Object[] var56 = var54.toArray();
    java.util.Locale var57 = var54.getLocale();
    java.beans.beancontext.BeanContextSupport var60 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var45, var57, true, true);
    var34.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var60);
    boolean var62 = var34.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    javax.management.MBeanNotificationInfo[] var2 = var1.getNotificationInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var1.getRelationTypeName("hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.lang.Boolean var3 = var1.hasRelation("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + false+ "'", var3.equals(false));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    javax.management.MBeanNotificationInfo[] var2 = var1.getNotificationInfo();
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

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    boolean var4 = var0.avoidingGui();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContext var4 = var2.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    var5.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var7);
    var2.setBeanContext((java.beans.beancontext.BeanContext)var7);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    var11.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var13);
    java.lang.Object[] var15 = var13.toArray();
    java.util.Locale var16 = var13.getLocale();
    var2.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContext var4 = var2.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    var5.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var2.addAll((java.util.Collection)var5);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
