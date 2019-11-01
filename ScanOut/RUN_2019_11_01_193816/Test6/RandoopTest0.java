
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var1.removeVarBind("hi!");
      fail("Expected exception of type com.sun.jmx.snmp.SnmpStatusException");
    } catch (com.sun.jmx.snmp.SnmpStatusException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addVarBind("hi!");
      fail("Expected exception of type com.sun.jmx.snmp.SnmpStatusException");
    } catch (com.sun.jmx.snmp.SnmpStatusException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var5.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var4 = var1.elements();
    var1.trimToSize();
    var1.addInstance("hi!");
    com.sun.jmx.snmp.SnmpVarBindList var9 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var11 = var9.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var12 = var9.elements();
    java.lang.Object[] var13 = new java.lang.Object[] { var12};
    java.lang.Object[] var14 = var1.toArray(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    com.sun.jmx.snmp.SnmpVarBindList var13 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var15 = var13.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var16 = var13.elements();
    var13.trimToSize();
    boolean var18 = var5.addAll((java.util.Collection)var13);
    java.lang.String[] var20 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = var5.removeVarBind(var20, "");
      fail("Expected exception of type com.sun.jmx.snmp.SnmpStatusException");
    } catch (com.sun.jmx.snmp.SnmpStatusException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    java.lang.String var12 = var5.oidListToString();
    java.util.Iterator var13 = var5.iterator();
    com.sun.jmx.snmp.SnmpVarBindList var15 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var17 = var15.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var18 = var15.elements();
    var15.trimToSize();
    java.lang.String var20 = var15.varBindListToString();
    boolean var21 = var5.contains((java.lang.Object)var15);
    java.util.Vector var22 = new java.util.Vector((java.util.Collection)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var24 = var15.listIterator(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    java.lang.String var2 = var1.varBindListToString();
    com.sun.jmx.snmp.SnmpVarBindList var4 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    java.lang.String var5 = var4.varBindListToString();
    boolean var6 = var1.removeVarBindList(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    com.sun.jmx.snmp.SnmpVarBindList var13 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var15 = var13.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var17 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var19 = var17.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var20 = var17.elements();
    var17.trimToSize();
    boolean var22 = var13.add((java.lang.Object)var17);
    com.sun.jmx.snmp.SnmpVarBindList var24 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var26 = var24.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var28 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var30 = var28.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var31 = var28.elements();
    var28.trimToSize();
    boolean var33 = var24.add((java.lang.Object)var28);
    com.sun.jmx.snmp.Timestamp var34 = var28.getTimestamp();
    java.lang.String var35 = var28.oidListToString();
    java.util.Iterator var36 = var28.iterator();
    com.sun.jmx.snmp.SnmpVarBindList var38 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var40 = var38.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var41 = var38.elements();
    var38.trimToSize();
    java.lang.String var43 = var38.varBindListToString();
    boolean var44 = var28.contains((java.lang.Object)var38);
    boolean var45 = var17.addAll((java.util.Collection)var28);
    var5.addVarBindList(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var12 = var1.toVector(true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.jmx.snmp.SnmpVarBindList var0 = new com.sun.jmx.snmp.SnmpVarBindList();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var4 = var1.elements();
    var1.trimToSize();
    var1.addInstance("hi!");
    com.sun.jmx.snmp.Timestamp var8 = var1.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    java.lang.String var12 = var5.oidListToString();
    java.util.Iterator var13 = var5.iterator();
    com.sun.jmx.snmp.SnmpVarBindList var16 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var18 = var16.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var20 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var22 = var20.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var23 = var20.elements();
    var20.trimToSize();
    boolean var25 = var16.add((java.lang.Object)var20);
    com.sun.jmx.snmp.SnmpVarBindList var27 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    boolean var28 = var20.removeAll((java.util.Collection)var27);
    java.lang.Object[] var29 = var20.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var30 = var5.addAll((-1), (java.util.Collection)var20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var4 = var1.elements();
    com.sun.jmx.snmp.Timestamp var5 = var1.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    java.lang.String var12 = var5.oidListToString();
    java.util.Iterator var13 = var5.iterator();
    com.sun.jmx.snmp.SnmpVarBindList var15 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var17 = var15.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var18 = var15.elements();
    var15.trimToSize();
    java.lang.String var20 = var15.varBindListToString();
    boolean var21 = var5.contains((java.lang.Object)var15);
    com.sun.jmx.snmp.SnmpVarBindList var23 = var15.splitAt(0);
    java.lang.String var24 = var23.varBindListToString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    java.lang.String var12 = var5.oidListToString();
    com.sun.jmx.snmp.SnmpVarBindList var13 = new com.sun.jmx.snmp.SnmpVarBindList((java.util.Vector)var5);
    int var14 = var13.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.jmx.snmp.SnmpVarBindList var2 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var4 = var2.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var6 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var8 = var6.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var9 = var6.elements();
    var6.trimToSize();
    boolean var11 = var2.add((java.lang.Object)var6);
    com.sun.jmx.snmp.SnmpVarBindList var13 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    boolean var14 = var6.removeAll((java.util.Collection)var13);
    java.lang.Object[] var15 = var6.toArray();
    com.sun.jmx.snmp.SnmpVarBindList var16 = new com.sun.jmx.snmp.SnmpVarBindList("", (java.util.Vector)var6);
    com.sun.jmx.snmp.SnmpVarBindList var18 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var20 = var18.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var22 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var24 = var22.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var25 = var22.elements();
    var22.trimToSize();
    boolean var27 = var18.add((java.lang.Object)var22);
    com.sun.jmx.snmp.Timestamp var28 = var22.getTimestamp();
    java.lang.String var29 = var22.oidListToString();
    com.sun.jmx.snmp.SnmpVarBindList var30 = new com.sun.jmx.snmp.SnmpVarBindList((java.util.Vector)var22);
    var16.concat((java.util.Vector)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var4 = var1.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.elementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    java.lang.String var12 = var5.oidListToString();
    boolean var13 = var5.checkForValidValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    java.lang.String var12 = var5.oidListToString();
    java.lang.String var13 = var5.varBindListToString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.Timestamp var11 = var5.getTimestamp();
    java.lang.String var12 = var5.oidListToString();
    com.sun.jmx.snmp.SnmpVarBindList var13 = new com.sun.jmx.snmp.SnmpVarBindList((java.util.Vector)var5);
    com.sun.jmx.snmp.SnmpVarBindList var14 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.SnmpVarBindList var12 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    boolean var13 = var5.removeAll((java.util.Collection)var12);
    com.sun.jmx.snmp.SnmpVarBindList var15 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var17 = var15.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var18 = var15.elements();
    var15.trimToSize();
    boolean var20 = var5.removeAll((java.util.Collection)var15);
    var5.addInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var3 = var1.indexOf((java.lang.Object)(short)10);
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    int var7 = var5.indexOf((java.lang.Object)(short)10);
    java.util.Enumeration var8 = var5.elements();
    var5.trimToSize();
    boolean var10 = var1.add((java.lang.Object)var5);
    com.sun.jmx.snmp.SnmpVarBindList var12 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");
    boolean var13 = var5.removeAll((java.util.Collection)var12);
    java.lang.String[] var15 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.addVarBind(var15);
      fail("Expected exception of type com.sun.jmx.snmp.SnmpStatusException");
    } catch (com.sun.jmx.snmp.SnmpStatusException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

}
