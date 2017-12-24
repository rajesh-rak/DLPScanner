
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    var2.addElement((java.lang.Object)(-1.0f));
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var2);
    var7.setElementAt((java.lang.Object)(-1.0f), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.rmi.transport.proxy.RMIMasterSocketFactory var0 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    java.rmi.server.RMISocketFactory.setSocketFactory((java.rmi.server.RMISocketFactory)var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Vector var3 = new java.util.Vector(10, 1);
    boolean var5 = var3.add((java.lang.Object)10L);
    java.lang.Object var6 = var3.firstElement();
    java.lang.Object[] var7 = var3.toArray();
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)0);
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10L+ "'", var6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.util.Vector var6 = new java.util.Vector(10, 1);
    boolean var8 = var6.add((java.lang.Object)10L);
    var6.addElement((java.lang.Object)(-1.0f));
    var6.removeAllElements();
    java.util.Vector var14 = new java.util.Vector(10, 1);
    boolean var16 = var14.add((java.lang.Object)10L);
    java.lang.Object var17 = var14.firstElement();
    java.util.Enumeration var18 = var14.elements();
    int var19 = var6.indexOf((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var2.addAll((-1), (java.util.Collection)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10L+ "'", var17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var3 = var2.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var3 = var2.isEmpty();
    java.lang.Object var4 = new java.lang.Object();
    java.lang.Object[] var5 = new java.lang.Object[] { var4};
    var2.copyInto(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    var2.addElement((java.lang.Object)(-1.0f));
    var2.removeAllElements();
    java.util.Vector var10 = new java.util.Vector(10, 1);
    boolean var12 = var10.add((java.lang.Object)10L);
    java.lang.Object var13 = var10.firstElement();
    java.util.Enumeration var14 = var10.elements();
    int var15 = var2.indexOf((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var2.elementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10L+ "'", var13.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.util.Enumeration var2 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    java.lang.Object var5 = var2.firstElement();
    java.util.Enumeration var6 = var2.elements();
    boolean var8 = var2.contains((java.lang.Object)true);
    java.lang.String var9 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10L+ "'", var5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[10]"+ "'", var9.equals("[10]"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    java.lang.Object var5 = var2.firstElement();
    java.util.Vector var9 = new java.util.Vector(10, 1);
    boolean var11 = var9.add((java.lang.Object)10L);
    var9.addElement((java.lang.Object)(-1.0f));
    java.util.Vector var14 = new java.util.Vector((java.util.Collection)var9);
    java.util.ListIterator var15 = var9.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var2.addAll(100, (java.util.Collection)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10L+ "'", var5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Vector var3 = new java.util.Vector(10, 1);
    boolean var5 = var3.add((java.lang.Object)10L);
    java.lang.Object var6 = var3.firstElement();
    java.lang.Object[] var7 = var3.toArray();
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)0);
    var0.clear();
    java.util.Hashtable var11 = new java.util.Hashtable();
    int var12 = var11.size();
    java.lang.Object var13 = var11.clone();
    java.lang.Object var14 = var0.remove(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10L+ "'", var6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    var2.addElement((java.lang.Object)(-1.0f));
    var2.removeAllElements();
    int var9 = var2.indexOf((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    int var2 = var1.size();
    boolean var3 = var0.equals((java.lang.Object)var1);
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    java.lang.Object var5 = var2.firstElement();
    java.util.Enumeration var6 = var2.elements();
    boolean var8 = var2.contains((java.lang.Object)true);
    java.lang.Object var9 = var2.lastElement();
    java.util.Vector var12 = new java.util.Vector(10, 1);
    boolean var14 = var12.add((java.lang.Object)10L);
    java.lang.Object var15 = var12.firstElement();
    java.lang.Object[] var16 = var12.toArray();
    var2.copyInto(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10L+ "'", var5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10L+ "'", var9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 10L+ "'", var15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    int var2 = var1.size();
    boolean var3 = var0.equals((java.lang.Object)var1);
    java.util.Set var4 = var0.entrySet();
    java.lang.Object var6 = var0.get((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Vector var3 = new java.util.Vector(10, 1);
    boolean var5 = var3.add((java.lang.Object)10L);
    java.lang.Object var6 = var3.firstElement();
    java.lang.Object[] var7 = var3.toArray();
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insertElementAt((java.lang.Object)(-1), 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10L+ "'", var6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Vector var3 = new java.util.Vector(10, 1);
    boolean var5 = var3.add((java.lang.Object)10L);
    java.lang.Object var6 = var3.firstElement();
    java.lang.Object[] var7 = var3.toArray();
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)0);
    var0.clear();
    boolean var12 = var0.containsValue((java.lang.Object)100.0d);
    java.util.Set var13 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10L+ "'", var6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode((-1), "[10]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    var2.addElement((java.lang.Object)(-1.0f));
    var2.removeAllElements();
    java.util.Vector var10 = new java.util.Vector(10, 1);
    boolean var12 = var10.add((java.lang.Object)10L);
    java.lang.Object var13 = var10.firstElement();
    java.util.Enumeration var14 = var10.elements();
    int var15 = var2.indexOf((java.lang.Object)var10);
    java.util.Vector var16 = new java.util.Vector((java.util.Collection)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10L+ "'", var13.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.rmi.server.RMISocketFactory var0 = java.rmi.server.RMISocketFactory.getDefaultSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    java.lang.Object var5 = var2.firstElement();
    java.util.Enumeration var6 = var2.elements();
    java.lang.Object var7 = var2.firstElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10L+ "'", var5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 10L+ "'", var7.equals(10L));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Vector var3 = new java.util.Vector(10, 1);
    boolean var5 = var3.add((java.lang.Object)10L);
    java.lang.Object var6 = var3.firstElement();
    java.lang.Object[] var7 = var3.toArray();
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)0);
    var0.clear();
    java.util.Enumeration var11 = var0.elements();
    java.lang.Object var14 = var0.put((java.lang.Object)100, (java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10L+ "'", var6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    boolean var4 = var2.add((java.lang.Object)10L);
    var2.addElement((java.lang.Object)(-1.0f));
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var2);
    java.util.Hashtable var8 = new java.util.Hashtable();
    java.util.Hashtable var9 = new java.util.Hashtable();
    int var10 = var9.size();
    boolean var11 = var8.equals((java.lang.Object)var9);
    java.util.Set var12 = var8.entrySet();
    boolean var13 = var7.containsAll((java.util.Collection)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Vector var3 = new java.util.Vector(10, 1);
    boolean var5 = var3.add((java.lang.Object)10L);
    java.lang.Object var6 = var3.firstElement();
    java.lang.Object[] var7 = var3.toArray();
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)0);
    var0.clear();
    java.util.Enumeration var11 = var0.elements();
    java.lang.Object var13 = var0.remove((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10L+ "'", var6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

}
