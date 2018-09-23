
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    boolean var8 = var5.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var5.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(0, "[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    boolean var9 = var5.remove((java.lang.Object)10);
    boolean var10 = var5.isEmpty();
    java.util.Vector var14 = new java.util.Vector(100, (-1));
    java.util.Vector var17 = new java.util.Vector(100, (-1));
    boolean var18 = var14.removeAll((java.util.Collection)var17);
    java.lang.String var19 = var17.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var5.addAll((-1), (java.util.Collection)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    boolean var8 = var5.add((java.lang.Object)'4');
    var5.insertElementAt((java.lang.Object)(byte)1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var5.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    boolean var9 = var5.remove((java.lang.Object)10);
    int var11 = var5.indexOf((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    int var4 = var2.indexOf((java.lang.Object)100);
    boolean var6 = var2.contains((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    boolean var9 = var5.remove((java.lang.Object)10);
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var5);
    java.util.Vector var13 = new java.util.Vector(100, (-1));
    java.util.Vector var16 = new java.util.Vector(100, (-1));
    boolean var17 = var13.removeAll((java.util.Collection)var16);
    java.util.Vector var20 = new java.util.Vector(100, (-1));
    int var22 = var20.indexOf((java.lang.Object)100);
    boolean var23 = var16.addAll((java.util.Collection)var20);
    boolean var24 = var10.contains((java.lang.Object)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var10.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add(10, (java.lang.Object)10.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    java.lang.Object var8 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(100, (-1));
    int var11 = var9.indexOf((java.lang.Object)100);
    boolean var12 = var5.addAll((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var5);
    java.lang.Object var14 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    boolean var9 = var5.remove((java.lang.Object)10);
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var5);
    java.util.Vector var13 = new java.util.Vector(100, (-1));
    java.util.Vector var16 = new java.util.Vector(100, (-1));
    boolean var17 = var13.removeAll((java.util.Collection)var16);
    java.util.Vector var20 = new java.util.Vector(100, (-1));
    int var22 = var20.indexOf((java.lang.Object)100);
    boolean var23 = var16.addAll((java.util.Collection)var20);
    java.util.Vector var24 = new java.util.Vector((java.util.Collection)var16);
    java.lang.Object[] var26 = new java.lang.Object[] { 100.0f};
    var16.copyInto(var26);
    var5.copyInto(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setElementAt((java.lang.Object)"[]", 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    boolean var8 = var5.add((java.lang.Object)'4');
    var5.insertElementAt((java.lang.Object)(byte)1, 1);
    int var13 = var5.indexOf((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(100, (-1));
    int var11 = var9.indexOf((java.lang.Object)100);
    boolean var12 = var5.addAll((java.util.Collection)var9);
    java.util.Vector var15 = new java.util.Vector(100, (-1));
    java.util.Vector var18 = new java.util.Vector(100, (-1));
    boolean var19 = var15.removeAll((java.util.Collection)var18);
    java.lang.String var20 = var18.toString();
    boolean var21 = var18.isEmpty();
    boolean var22 = var5.containsAll((java.util.Collection)var18);
    boolean var23 = var18.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(100, (-1));
    int var11 = var9.indexOf((java.lang.Object)100);
    boolean var12 = var5.addAll((java.util.Collection)var9);
    java.util.Vector var15 = new java.util.Vector(100, (-1));
    java.util.Vector var18 = new java.util.Vector(100, (-1));
    boolean var19 = var15.removeAll((java.util.Collection)var18);
    java.util.Vector var22 = new java.util.Vector(100, (-1));
    int var24 = var22.indexOf((java.lang.Object)100);
    boolean var25 = var18.addAll((java.util.Collection)var22);
    boolean var26 = var9.retainAll((java.util.Collection)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.ListIterator var3 = var2.listIterator();
    java.lang.Object var4 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    boolean var9 = var5.remove((java.lang.Object)10);
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var5);
    java.util.Vector var13 = new java.util.Vector(100, (-1));
    java.util.Vector var16 = new java.util.Vector(100, (-1));
    boolean var17 = var13.removeAll((java.util.Collection)var16);
    java.util.Vector var20 = new java.util.Vector(100, (-1));
    int var22 = var20.indexOf((java.lang.Object)100);
    boolean var23 = var16.addAll((java.util.Collection)var20);
    boolean var24 = var5.contains((java.lang.Object)var23);
    int var27 = var5.indexOf((java.lang.Object)(short)(-1), 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var30 = var5.subList(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(100, (-1));
    int var11 = var9.indexOf((java.lang.Object)100);
    boolean var12 = var5.addAll((java.util.Collection)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var9.elementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(100, (-1));
    int var11 = var9.indexOf((java.lang.Object)100);
    boolean var12 = var5.addAll((java.util.Collection)var9);
    java.util.Vector var15 = new java.util.Vector(100, (-1));
    java.util.Vector var18 = new java.util.Vector(100, (-1));
    boolean var19 = var15.removeAll((java.util.Collection)var18);
    java.lang.String var20 = var18.toString();
    boolean var21 = var18.isEmpty();
    boolean var22 = var5.containsAll((java.util.Collection)var18);
    java.util.Vector var25 = new java.util.Vector(100, (-1));
    java.util.Vector var28 = new java.util.Vector(100, (-1));
    boolean var29 = var25.removeAll((java.util.Collection)var28);
    java.util.Vector var32 = new java.util.Vector(100, (-1));
    int var34 = var32.indexOf((java.lang.Object)100);
    boolean var35 = var28.addAll((java.util.Collection)var32);
    java.util.Vector var38 = new java.util.Vector(100, (-1));
    java.util.Vector var41 = new java.util.Vector(100, (-1));
    boolean var42 = var38.removeAll((java.util.Collection)var41);
    java.lang.String var43 = var41.toString();
    boolean var44 = var41.isEmpty();
    int var46 = var41.indexOf((java.lang.Object)0.0d);
    boolean var47 = var28.containsAll((java.util.Collection)var41);
    boolean var48 = var5.removeAll((java.util.Collection)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[]"+ "'", var43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    boolean var8 = var5.add((java.lang.Object)'4');
    var5.addElement((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(100, 100);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    boolean var8 = var5.isEmpty();
    java.util.ListIterator var9 = var5.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(100, (-1));
    int var11 = var9.indexOf((java.lang.Object)100);
    boolean var12 = var5.addAll((java.util.Collection)var9);
    var9.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.util.Vector var5 = new java.util.Vector(100, (-1));
    boolean var6 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var7 = var5.toString();
    boolean var9 = var5.remove((java.lang.Object)10);
    java.util.Enumeration var10 = var5.elements();
    java.util.Vector var13 = new java.util.Vector(100, (-1));
    java.util.Vector var16 = new java.util.Vector(100, (-1));
    boolean var17 = var13.removeAll((java.util.Collection)var16);
    java.util.Vector var20 = new java.util.Vector(100, (-1));
    int var22 = var20.indexOf((java.lang.Object)100);
    boolean var23 = var16.addAll((java.util.Collection)var20);
    java.util.Vector var26 = new java.util.Vector(100, (-1));
    java.util.Vector var29 = new java.util.Vector(100, (-1));
    boolean var30 = var26.removeAll((java.util.Collection)var29);
    java.lang.String var31 = var29.toString();
    boolean var32 = var29.isEmpty();
    boolean var33 = var16.containsAll((java.util.Collection)var29);
    boolean var34 = var5.addAll((java.util.Collection)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[]"+ "'", var31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

}
