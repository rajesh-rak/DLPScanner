
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var4 = var1.checkRoleReading("", "");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var4 = var1.getRoleCardinality("hi!", "hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var1.getRelationTypeName("");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


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

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    java.util.Vector var5 = new java.util.Vector(10, 0);
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    var5.addElement((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    boolean var4 = var2.removeElement((java.lang.Object)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)(short)(-1), 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    int var3 = var2.capacity();
    int var4 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.setPurgeFlag(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var5 = var1.getReferencedMBeans("hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


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

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.setPurgeFlag(false);
    javax.management.MBeanNotificationInfo[] var4 = var1.getNotificationInfo();
    var1.setPurgeFlag(false);
    javax.management.relation.RelationService var8 = new javax.management.relation.RelationService(true);
    var8.setPurgeFlag(false);
    javax.management.MBeanNotificationInfo[] var11 = var8.getNotificationInfo();
    var8.setPurgeFlag(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeNotificationListener((javax.management.NotificationListener)var8);
      fail("Expected exception of type javax.management.ListenerNotFoundException");
    } catch (javax.management.ListenerNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    java.util.Vector var5 = new java.util.Vector(10, 0);
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    var2.ensureCapacity((-1));
    boolean var10 = var2.remove((java.lang.Object)0);
    int var12 = var2.indexOf((java.lang.Object)1.0f);
    var2.ensureCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    int var3 = var2.capacity();
    java.util.Vector var6 = new java.util.Vector(10, 0);
    java.util.Vector var9 = new java.util.Vector(10, 0);
    boolean var10 = var6.removeAll((java.util.Collection)var9);
    var6.ensureCapacity((-1));
    boolean var14 = var6.remove((java.lang.Object)(short)0);
    boolean var15 = var2.remove((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    boolean var4 = var2.removeElement((java.lang.Object)1L);
    java.util.Vector var8 = new java.util.Vector(10, 0);
    java.util.Vector var11 = new java.util.Vector(10, 0);
    boolean var12 = var8.removeAll((java.util.Collection)var11);
    var8.ensureCapacity((-1));
    boolean var16 = var8.remove((java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = var2.addAll(1, (java.util.Collection)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    java.util.Vector var5 = new java.util.Vector(10, 0);
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    var2.ensureCapacity((-1));
    java.util.Enumeration var9 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.setPurgeFlag(false);
    javax.management.MBeanNotificationInfo[] var4 = var1.getNotificationInfo();
    java.lang.String[] var7 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleResult var8 = var1.getRoles("", var7);
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    boolean var4 = var2.removeElement((java.lang.Object)1L);
    java.util.Vector var7 = new java.util.Vector(10, 0);
    boolean var9 = var7.removeElement((java.lang.Object)1L);
    boolean var10 = var7.isEmpty();
    java.lang.String var11 = var7.toString();
    boolean var12 = var2.retainAll((java.util.Collection)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.setPurgeFlag(false);
    javax.management.MBeanNotificationInfo[] var4 = var1.getNotificationInfo();
    var1.setPurgeFlag(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRelation("");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    boolean var4 = var2.removeElement((java.lang.Object)1L);
    boolean var5 = var2.isEmpty();
    java.lang.String var6 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.lastIndexOf((java.lang.Object)(-1.0f), 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    boolean var4 = var2.removeElement((java.lang.Object)1L);
    boolean var5 = var2.isEmpty();
    java.lang.String var6 = var2.toString();
    java.lang.Object[] var7 = var2.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.setPurgeFlag(false);
    java.lang.String[] var6 = new java.lang.String[] { "[]"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleResult var7 = var1.getRoles("[]", var6);
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.event.UndoableEditListener[] var1 = var0.getUndoableEditListeners();
    java.util.Dictionary var2 = var0.getDocumentProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    java.util.Vector var5 = new java.util.Vector(10, 0);
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    int var9 = var2.lastIndexOf((java.lang.Object)0.0f, (-1));
    java.util.Vector var12 = new java.util.Vector(10, 0);
    boolean var14 = var12.removeElement((java.lang.Object)1L);
    int var15 = var2.indexOf((java.lang.Object)1L);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var2 = var0.getCharacterElement(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.event.UndoableEditListener[] var1 = var0.getUndoableEditListeners();
    java.lang.String var4 = var0.getText(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n"+ "'", var4.equals("\n"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.setPurgeFlag(false);
    javax.management.MBeanNotificationInfo[] var4 = var1.getNotificationInfo();
    var1.setPurgeFlag(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var1.getRelationTypeName("hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Rectangle[] var0 = new java.awt.Rectangle[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.awt.X11.XEmbedServerTester var2 = sun.awt.X11.XEmbedServerTester.getTester(var0, 1L);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.event.UndoableEditListener[] var1 = var0.getUndoableEditListeners();
    javax.management.relation.RelationService var3 = new javax.management.relation.RelationService(true);
    var3.setPurgeFlag(false);
    javax.management.MBeanNotificationInfo[] var6 = var3.getNotificationInfo();
    javax.management.MBeanNotificationInfo[] var7 = var3.getNotificationInfo();
    java.util.Vector var10 = new java.util.Vector(10, 0);
    java.util.Vector var13 = new java.util.Vector(10, 0);
    boolean var14 = var10.removeAll((java.util.Collection)var13);
    var10.ensureCapacity((-1));
    boolean var18 = var10.remove((java.lang.Object)0);
    int var20 = var10.indexOf((java.lang.Object)1.0f);
    var0.putProperty((java.lang.Object)var7, (java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.setPurgeFlag(false);
    javax.management.MBeanNotificationInfo[] var4 = var1.getNotificationInfo();
    javax.management.MBeanNotificationInfo[] var5 = var1.getNotificationInfo();
    var1.preDeregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.event.UndoableEditListener[] var1 = var0.getUndoableEditListeners();
    javax.swing.text.Style var3 = var0.getStyle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

}
