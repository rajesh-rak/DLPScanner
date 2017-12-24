
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var4 = new java.util.Vector(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.addAll((-1), (java.util.Collection)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object[] var5 = new java.lang.Object[] { 1L};
    var1.copyInto(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object[] var5 = new java.lang.Object[] { 1L};
    var1.copyInto(var5);
    java.lang.Object[] var8 = new java.lang.Object[] { "hi!"};
    var1.copyInto(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var5 = new java.util.Vector(1);
    int var6 = var5.size();
    boolean var7 = var1.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(1);
    int var10 = var9.size();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector(1);
    int var14 = var13.size();
    boolean var15 = var9.containsAll((java.util.Collection)var13);
    boolean var16 = var5.addAll((java.util.Collection)var9);
    java.util.Vector var19 = new java.util.Vector(1);
    int var20 = var19.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var9.addAll(1, (java.util.Collection)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    var1.insertElementAt((java.lang.Object)10.0f, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElementAt((java.lang.Object)"", 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var1.subList(10, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.getRole("[10.0]", "[10.0]");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


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

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.getRole("hi!", "hi!");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var5 = var1.listIterator(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var5 = new java.util.Vector(1);
    int var6 = var5.size();
    boolean var7 = var1.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(1);
    int var10 = var9.size();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector(1);
    int var14 = var13.size();
    boolean var15 = var9.containsAll((java.util.Collection)var13);
    boolean var16 = var5.addAll((java.util.Collection)var9);
    int var17 = var9.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.removeElementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.relation.MBeanServerNotificationFilter var0 = new javax.management.relation.MBeanServerNotificationFilter();
    java.util.Vector var1 = var0.getDisabledObjectNames();
    java.util.Vector var2 = var0.getEnabledObjectNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.relation.MBeanServerNotificationFilter var0 = new javax.management.relation.MBeanServerNotificationFilter();
    java.util.Vector var1 = var0.getDisabledObjectNames();
    var0.disableType("hi!");
    var0.enableType("[10.0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    var1.removeAllElements();
    boolean var5 = var1.add((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    javax.management.relation.RelationService var4 = new javax.management.relation.RelationService(true);
    javax.management.relation.MBeanServerNotificationFilter var5 = new javax.management.relation.MBeanServerNotificationFilter();
    java.util.Vector var6 = var5.getDisabledObjectNames();
    var1.addNotificationListener((javax.management.NotificationListener)var4, (javax.management.NotificationFilter)var5, (java.lang.Object)true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.relation.RoleInfo var11 = var1.getRoleInfo("hi!", "[10.0]");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    var1.insertElementAt((java.lang.Object)10.0f, 0);
    java.lang.String var7 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[10.0]"+ "'", var7.equals("[10.0]"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.isActive();
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    var1.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var5 = new java.util.Vector(1);
    int var6 = var5.size();
    boolean var7 = var1.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(1);
    int var10 = var9.size();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector(1);
    int var14 = var13.size();
    boolean var15 = var9.containsAll((java.util.Collection)var13);
    boolean var16 = var5.addAll((java.util.Collection)var9);
    int var17 = var9.size();
    java.util.Vector var19 = new java.util.Vector(1);
    int var20 = var19.size();
    java.util.Vector var21 = new java.util.Vector((java.util.Collection)var19);
    java.util.Vector var23 = new java.util.Vector(1);
    int var24 = var23.size();
    boolean var25 = var19.containsAll((java.util.Collection)var23);
    java.util.Vector var27 = new java.util.Vector(1);
    int var28 = var27.size();
    java.util.Vector var29 = new java.util.Vector((java.util.Collection)var27);
    java.util.Vector var31 = new java.util.Vector(1);
    int var32 = var31.size();
    boolean var33 = var27.containsAll((java.util.Collection)var31);
    boolean var34 = var23.addAll((java.util.Collection)var27);
    boolean var35 = var9.removeElement((java.lang.Object)var34);
    java.util.Vector var37 = new java.util.Vector(1);
    int var38 = var37.size();
    java.util.Vector var39 = new java.util.Vector((java.util.Collection)var37);
    java.util.Vector var41 = new java.util.Vector(1);
    int var42 = var41.size();
    boolean var43 = var37.containsAll((java.util.Collection)var41);
    java.util.Vector var45 = new java.util.Vector(1);
    int var46 = var45.size();
    java.util.Vector var47 = new java.util.Vector((java.util.Collection)var45);
    java.util.Vector var49 = new java.util.Vector(1);
    int var50 = var49.size();
    boolean var51 = var45.containsAll((java.util.Collection)var49);
    boolean var52 = var41.addAll((java.util.Collection)var45);
    boolean var53 = var9.containsAll((java.util.Collection)var45);
    java.util.Iterator var54 = var45.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.relation.MBeanServerNotificationFilter var0 = new javax.management.relation.MBeanServerNotificationFilter();
    var0.disableAllObjectNames();
    java.util.Vector var2 = var0.getEnabledObjectNames();
    java.util.Vector var3 = var0.getEnabledObjectNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var5 = new java.util.Vector(1);
    int var6 = var5.size();
    boolean var7 = var1.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(1);
    int var10 = var9.size();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector(1);
    int var14 = var13.size();
    boolean var15 = var9.containsAll((java.util.Collection)var13);
    boolean var16 = var5.addAll((java.util.Collection)var9);
    int var17 = var9.size();
    java.util.Vector var19 = new java.util.Vector(1);
    int var20 = var19.size();
    java.util.Vector var21 = new java.util.Vector((java.util.Collection)var19);
    java.util.Vector var23 = new java.util.Vector(1);
    int var24 = var23.size();
    boolean var25 = var19.containsAll((java.util.Collection)var23);
    java.util.Vector var27 = new java.util.Vector(1);
    int var28 = var27.size();
    java.util.Vector var29 = new java.util.Vector((java.util.Collection)var27);
    java.util.Vector var31 = new java.util.Vector(1);
    int var32 = var31.size();
    boolean var33 = var27.containsAll((java.util.Collection)var31);
    boolean var34 = var23.addAll((java.util.Collection)var27);
    boolean var35 = var9.removeElement((java.lang.Object)var34);
    java.util.Vector var37 = new java.util.Vector(1);
    int var38 = var37.size();
    java.util.Vector var39 = new java.util.Vector((java.util.Collection)var37);
    java.util.Vector var41 = new java.util.Vector(1);
    int var42 = var41.size();
    boolean var43 = var37.containsAll((java.util.Collection)var41);
    java.util.Vector var45 = new java.util.Vector(1);
    int var46 = var45.size();
    java.util.Vector var47 = new java.util.Vector((java.util.Collection)var45);
    java.util.Vector var49 = new java.util.Vector(1);
    int var50 = var49.size();
    boolean var51 = var45.containsAll((java.util.Collection)var49);
    boolean var52 = var41.addAll((java.util.Collection)var45);
    boolean var53 = var9.containsAll((java.util.Collection)var45);
    javax.management.relation.MBeanServerNotificationFilter var54 = new javax.management.relation.MBeanServerNotificationFilter();
    var54.disableAllObjectNames();
    java.util.Vector var56 = var54.getEnabledObjectNames();
    boolean var57 = var45.containsAll((java.util.Collection)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var1.getRoleInfos("[10.0]");
      fail("Expected exception of type javax.management.relation.RelationTypeNotFoundException");
    } catch (javax.management.relation.RelationTypeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var5 = new java.util.Vector(1);
    int var6 = var5.size();
    boolean var7 = var1.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(1);
    int var10 = var9.size();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector(1);
    int var14 = var13.size();
    boolean var15 = var9.containsAll((java.util.Collection)var13);
    boolean var16 = var5.addAll((java.util.Collection)var9);
    int var17 = var9.size();
    java.util.Vector var19 = new java.util.Vector(1);
    int var20 = var19.size();
    java.util.Vector var21 = new java.util.Vector((java.util.Collection)var19);
    java.util.Vector var23 = new java.util.Vector(1);
    int var24 = var23.size();
    boolean var25 = var19.containsAll((java.util.Collection)var23);
    java.util.Vector var27 = new java.util.Vector(1);
    int var28 = var27.size();
    java.util.Vector var29 = new java.util.Vector((java.util.Collection)var27);
    java.util.Vector var31 = new java.util.Vector(1);
    int var32 = var31.size();
    boolean var33 = var27.containsAll((java.util.Collection)var31);
    boolean var34 = var23.addAll((java.util.Collection)var27);
    boolean var35 = var9.removeElement((java.lang.Object)var34);
    java.util.Vector var37 = new java.util.Vector(1);
    int var38 = var37.size();
    java.util.Vector var39 = new java.util.Vector((java.util.Collection)var37);
    java.util.Vector var41 = new java.util.Vector(1);
    int var42 = var41.size();
    boolean var43 = var37.containsAll((java.util.Collection)var41);
    java.util.Vector var45 = new java.util.Vector(1);
    int var46 = var45.size();
    java.util.Vector var47 = new java.util.Vector((java.util.Collection)var45);
    java.util.Vector var49 = new java.util.Vector(1);
    int var50 = var49.size();
    boolean var51 = var45.containsAll((java.util.Collection)var49);
    boolean var52 = var41.addAll((java.util.Collection)var45);
    boolean var53 = var9.containsAll((java.util.Collection)var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var56 = var45.subList(10, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    var1.insertElementAt((java.lang.Object)10.0f, 0);
    boolean var8 = var1.removeElement((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.management.relation.MBeanServerNotificationFilter var0 = new javax.management.relation.MBeanServerNotificationFilter();
    var0.disableAllObjectNames();
    java.util.Vector var2 = var0.getEnabledObjectNames();
    var0.disableAllObjectNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var1 = new java.util.Vector(1);
    int var2 = var1.size();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    boolean var5 = var1.contains((java.lang.Object)(short)10);
    java.lang.String var6 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));

  }

}
