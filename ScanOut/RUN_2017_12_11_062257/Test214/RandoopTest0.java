
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(10, "hi!", 1, 100, 0, 1, 10, 10, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(0L, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.Object[] var5 = var2.toArray(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var2.subList(1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = javax.management.ObjectName.getInstance("hi!");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.Object[] var5 = var2.toArray(var4);
    boolean var6 = var2.isEmpty();
    java.util.Vector var9 = new java.util.Vector(100, 1);
    boolean var10 = var2.addAll((java.util.Collection)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.Object[] var5 = var2.toArray(var4);
    java.util.Vector var8 = new java.util.Vector(100, 1);
    java.lang.Object[] var10 = new java.lang.Object[] { ' '};
    java.lang.Object[] var11 = var8.toArray(var10);
    boolean var12 = var2.contains((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.set("hi!", (java.lang.Object)(-1));
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.Object[] var5 = var2.toArray(var4);
    java.util.Vector var8 = new java.util.Vector(100, 1);
    java.lang.Object[] var10 = new java.lang.Object[] { ' '};
    java.lang.Object[] var11 = var8.toArray(var10);
    boolean var12 = var2.contains((java.lang.Object)var11);
    java.util.Vector var15 = new java.util.Vector(100, 1);
    int var16 = var2.lastIndexOf((java.lang.Object)var15);
    java.util.TimeZone var17 = java.util.TimeZone.getDefault();
    boolean var18 = var2.add((java.lang.Object)var17);
    java.lang.Object[] var19 = var2.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    boolean var5 = var3.equals((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var2 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.util.Vector var5 = new java.util.Vector(100, 1);
    java.lang.Object[] var7 = new java.lang.Object[] { ' '};
    java.lang.Object[] var8 = var5.toArray(var7);
    java.util.Vector var11 = new java.util.Vector(100, 1);
    java.lang.Object[] var13 = new java.lang.Object[] { ' '};
    java.lang.Object[] var14 = var11.toArray(var13);
    boolean var15 = var5.contains((java.lang.Object)var14);
    boolean var16 = var2.removeAll((java.util.Collection)var5);
    var5.clear();
    java.lang.String var18 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.Object[] var5 = var2.toArray(var4);
    java.util.Vector var8 = new java.util.Vector(100, 1);
    java.lang.Object[] var10 = new java.lang.Object[] { ' '};
    java.lang.Object[] var11 = var8.toArray(var10);
    boolean var12 = var2.contains((java.lang.Object)var11);
    java.util.ListIterator var13 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Vector var4 = new java.util.Vector(100, 1);
    sun.security.x509.ExtendedKeyUsageExtension var5 = new sun.security.x509.ExtendedKeyUsageExtension(var4);
    java.lang.Object var6 = var1.remove((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(1, "Asia/Kolkata", (-1), 1, 10, 100, (-1), 0, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.util.Vector var5 = new java.util.Vector(100, 1);
    java.lang.Object[] var7 = new java.lang.Object[] { ' '};
    java.lang.Object[] var8 = var5.toArray(var7);
    java.util.Vector var11 = new java.util.Vector(100, 1);
    java.lang.Object[] var13 = new java.lang.Object[] { ' '};
    java.lang.Object[] var14 = var11.toArray(var13);
    boolean var15 = var5.contains((java.lang.Object)var14);
    boolean var16 = var2.removeAll((java.util.Collection)var5);
    var5.clear();
    java.util.Vector var20 = new java.util.Vector(100, 1);
    java.lang.Object[] var22 = new java.lang.Object[] { ' '};
    java.lang.Object[] var23 = var20.toArray(var22);
    java.lang.Object[] var24 = var5.toArray(var23);
    var5.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var5 = new java.util.Date(100, 100, (-1), 1, 1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(0L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6L));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.Object[] var5 = var2.toArray(var4);
    java.util.Vector var8 = new java.util.Vector(100, 1);
    java.lang.Object[] var10 = new java.lang.Object[] { ' '};
    java.lang.Object[] var11 = var8.toArray(var10);
    boolean var12 = var2.contains((java.lang.Object)var11);
    java.util.Vector var15 = new java.util.Vector(100, 1);
    int var16 = var2.lastIndexOf((java.lang.Object)var15);
    java.util.TimeZone var17 = java.util.TimeZone.getDefault();
    boolean var18 = var2.add((java.lang.Object)var17);
    java.lang.String var19 = var17.getID();
    java.lang.String var20 = var17.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Asia/Kolkata"+ "'", var19.equals("Asia/Kolkata"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "India Standard Time"+ "'", var20.equals("India Standard Time"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-6L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(100, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.Object[] var5 = var2.toArray(var4);
    java.util.Vector var8 = new java.util.Vector(100, 1);
    java.lang.Object[] var10 = new java.lang.Object[] { ' '};
    java.lang.Object[] var11 = var8.toArray(var10);
    boolean var12 = var2.contains((java.lang.Object)var11);
    java.util.Vector var15 = new java.util.Vector(100, 1);
    int var16 = var2.lastIndexOf((java.lang.Object)var15);
    java.util.TimeZone var17 = java.util.TimeZone.getDefault();
    boolean var18 = var2.add((java.lang.Object)var17);
    java.util.Vector var21 = new java.util.Vector(100, 1);
    java.lang.Object[] var23 = new java.lang.Object[] { ' '};
    java.lang.Object[] var24 = var21.toArray(var23);
    java.util.Vector var27 = new java.util.Vector(100, 1);
    java.lang.Object[] var29 = new java.lang.Object[] { ' '};
    java.lang.Object[] var30 = var27.toArray(var29);
    boolean var31 = var21.contains((java.lang.Object)var30);
    java.util.Vector var34 = new java.util.Vector(100, 1);
    int var35 = var21.lastIndexOf((java.lang.Object)var34);
    boolean var36 = var34.isEmpty();
    boolean var37 = var2.addAll((java.util.Collection)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    long var6 = java.util.Date.UTC(100, 100, 2, 10, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1209723010000L);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10);
    java.util.Enumeration var3 = var2.keys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var4 = new javax.management.ObjectName("", var2);
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var6 = new java.util.Date(0, 0, 1, 10, 1, (-1));
    var6.setDate(100);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.List var2 = var1.getAllRelationIds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

}
