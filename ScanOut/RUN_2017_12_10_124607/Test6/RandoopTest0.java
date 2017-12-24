
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var1.lastIndexOf((java.lang.Object)100, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.lang.Object[] var2 = var1.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object[] var5 = var1.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jmx.snmp.SnmpVarBindList var0 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addVarBind(var2);
      fail("Expected exception of type com.sun.jmx.snmp.SnmpStatusException");
    } catch (com.sun.jmx.snmp.SnmpStatusException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    var4.trimToSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var4.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList(0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    int var5 = var1.capacity();
    var1.addElement((java.lang.Object)true);
    boolean var9 = var1.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    var4.trimToSize();
    java.util.Vector var7 = new java.util.Vector(10);
    int var9 = var7.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var11 = new java.util.Vector(10);
    int var13 = var11.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var14 = new java.util.Vector((java.util.Collection)var11);
    boolean var15 = var7.retainAll((java.util.Collection)var14);
    boolean var16 = var4.retainAll((java.util.Collection)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jmx.snmp.SnmpVarBindList var0 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var1 = var0.toArray();
    var0.addInstance("hi!");
    com.sun.jmx.snmp.Timestamp var4 = var0.getTimestamp();
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var6 = var5.toArray();
    var5.addInstance("hi!");
    boolean var9 = var0.removeAll((java.util.Collection)var5);
    com.sun.jmx.snmp.SnmpVarBindList var10 = var0.cloneWithValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.snmp.SnmpVarBindList var0 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var1 = var0.toArray();
    var0.addInstance("hi!");
    com.sun.jmx.snmp.Timestamp var4 = var0.getTimestamp();
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var6 = var5.toArray();
    var5.addInstance("hi!");
    boolean var9 = var0.removeAll((java.util.Collection)var5);
    java.lang.String[] var11 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.addVarBind(var11, "");
      fail("Expected exception of type com.sun.jmx.snmp.SnmpStatusException");
    } catch (com.sun.jmx.snmp.SnmpStatusException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jmx.snmp.SnmpVarBind var3 = var1.getVarBindAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.jmx.snmp.SnmpVarBindList var0 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var1 = var0.toArray();
    var0.addInstance("hi!");
    com.sun.jmx.snmp.Timestamp var4 = var0.getTimestamp();
    java.util.Vector var6 = new java.util.Vector(10);
    int var8 = var6.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var9 = new java.util.Vector((java.util.Collection)var6);
    int var10 = var6.capacity();
    var0.concat(var6);
    java.lang.String var12 = var0.varBindListToString();
    var0.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var5 = new java.util.Vector(10);
    int var7 = var5.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var5);
    boolean var9 = var1.retainAll((java.util.Collection)var8);
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jmx.snmp.SnmpVarBindList var0 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var1 = var0.toArray();
    var0.addInstance("hi!");
    com.sun.jmx.snmp.Timestamp var4 = var0.getTimestamp();
    java.util.Vector var6 = new java.util.Vector(10);
    int var8 = var6.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var9 = new java.util.Vector((java.util.Collection)var6);
    int var10 = var6.capacity();
    var0.concat(var6);
    java.lang.String[] var13 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addVarBind(var13);
      fail("Expected exception of type com.sun.jmx.snmp.SnmpStatusException");
    } catch (com.sun.jmx.snmp.SnmpStatusException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var5 = new java.util.Vector(10);
    int var7 = var5.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var5);
    boolean var9 = var1.retainAll((java.util.Collection)var8);
    java.util.Enumeration var10 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Iterator var2 = var1.iterator();
    var1.removeAllElements();
    com.sun.jmx.snmp.SnmpVarBindList var4 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var5 = var4.toArray();
    var4.addInstance("hi!");
    com.sun.jmx.snmp.Timestamp var8 = var4.getTimestamp();
    java.util.Vector var10 = new java.util.Vector(10);
    int var12 = var10.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var10);
    int var14 = var10.capacity();
    var4.concat(var10);
    com.sun.jmx.snmp.SnmpVarBindList var16 = new com.sun.jmx.snmp.SnmpVarBindList((java.util.Vector)var4);
    boolean var17 = var1.addAll((java.util.Collection)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var5 = new java.util.Vector(10);
    int var7 = var5.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var5);
    boolean var9 = var1.retainAll((java.util.Collection)var8);
    com.sun.jmx.snmp.SnmpVarBindList var10 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var11 = var10.toArray();
    boolean var12 = var1.remove((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.elementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.jmx.snmp.SnmpVarBindList var0 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var1 = var0.toArray();
    var0.addInstance("hi!");
    com.sun.jmx.snmp.Timestamp var4 = var0.getTimestamp();
    com.sun.jmx.snmp.SnmpVarBindList var5 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var6 = var5.toArray();
    var5.addInstance("hi!");
    boolean var9 = var0.removeAll((java.util.Collection)var5);
    java.lang.Object var10 = var5.clone();
    com.sun.jmx.snmp.SnmpVarBindList var11 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var12 = var11.toArray();
    var11.addInstance("hi!");
    com.sun.jmx.snmp.Timestamp var15 = var11.getTimestamp();
    com.sun.jmx.snmp.SnmpVarBindList var16 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var17 = var16.toArray();
    var16.addInstance("hi!");
    boolean var20 = var11.removeAll((java.util.Collection)var16);
    com.sun.jmx.snmp.SnmpVarBindList var22 = new com.sun.jmx.snmp.SnmpVarBindList(10);
    var16.concat((java.util.Vector)var22);
    var5.addVarBindList(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.setElementAt((java.lang.Object)0.0d, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    int var5 = var4.size();
    java.util.Vector var7 = new java.util.Vector(10);
    int var9 = var7.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var7);
    int var11 = var7.capacity();
    var7.addElement((java.lang.Object)true);
    java.lang.Object var14 = var7.firstElement();
    int var15 = var4.lastIndexOf(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + true+ "'", var14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jmx.snmp.SnmpVarBindList var0 = new com.sun.jmx.snmp.SnmpVarBindList();
    var0.removeAllElements();
    com.sun.jmx.snmp.SnmpVarBindList var2 = new com.sun.jmx.snmp.SnmpVarBindList();
    java.lang.Object[] var3 = var2.toArray();
    var0.setVarBindList((java.util.Vector)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var3 = var1.lastIndexOf((java.lang.Object)100.0d);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object[] var5 = var4.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.jmx.snmp.SnmpVarBindList var1 = new com.sun.jmx.snmp.SnmpVarBindList("hi!");

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

}
