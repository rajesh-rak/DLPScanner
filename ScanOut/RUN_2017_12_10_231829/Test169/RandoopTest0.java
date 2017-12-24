
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.security.krb5.internal.rcache.CacheTable var0 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var1 = var0.isEmpty();
    java.lang.Object var3 = var0.get((java.lang.Object)100L);
    int var4 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.add(10, (java.lang.Object)10L);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.krb5.internal.rcache.CacheTable var0 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var1 = var0.isEmpty();
    java.lang.Object var3 = var0.get((java.lang.Object)100L);
    java.util.Enumeration var4 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    java.lang.Object var12 = var6.getLast();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var6.subList(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var12 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var13 = var12.isEmpty();
    java.lang.Object var15 = var12.get((java.lang.Object)100L);
    boolean var16 = var12.isEmpty();
    java.util.Enumeration var17 = var12.elements();
    boolean var18 = var6.remove((java.lang.Object)var12);
    sun.security.krb5.internal.rcache.CacheTable var19 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var20 = var19.isEmpty();
    java.lang.Object var22 = var19.get((java.lang.Object)100L);
    boolean var23 = var19.isEmpty();
    var6.addFirst((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.krb5.internal.rcache.CacheTable var0 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var1 = var0.isEmpty();
    java.lang.Object var3 = var0.get((java.lang.Object)100L);
    java.lang.Object var6 = var0.put((java.lang.Object)(-1), (java.lang.Object)' ');
    java.util.Set var7 = var0.entrySet();
    sun.security.krb5.internal.rcache.CacheTable var9 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var10 = var9.isEmpty();
    java.lang.Object var12 = var9.get((java.lang.Object)100L);
    boolean var13 = var9.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var14 = new sun.security.krb5.internal.rcache.ReplayCache("", var9);
    boolean var16 = var14.add((java.lang.Object)100L);
    boolean var17 = var0.containsKey((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    java.lang.Object var12 = var6.getLast();
    java.lang.Object var13 = var6.peekFirst();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "{}"+ "'", var13.equals("{}"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var12 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var13 = var12.isEmpty();
    java.lang.Object var15 = var12.get((java.lang.Object)100L);
    boolean var16 = var12.isEmpty();
    java.util.Enumeration var17 = var12.elements();
    boolean var18 = var6.remove((java.lang.Object)var12);
    sun.security.krb5.internal.rcache.CacheTable var19 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var20 = var19.isEmpty();
    java.lang.Object var22 = var19.get((java.lang.Object)100L);
    java.util.Enumeration var23 = var19.elements();
    boolean var24 = var6.add((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var26 = var6.get(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var12 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var13 = var12.isEmpty();
    java.lang.Object var15 = var12.get((java.lang.Object)100L);
    boolean var16 = var12.isEmpty();
    java.util.Enumeration var17 = var12.elements();
    boolean var18 = var6.remove((java.lang.Object)var12);
    java.lang.Object var19 = var6.element();
    java.lang.Object var20 = var6.clone();
    boolean var22 = var6.removeFirstOccurrence((java.lang.Object)(short)100);
    int var24 = var6.lastIndexOf((java.lang.Object)"{}");
    sun.security.krb5.internal.rcache.CacheTable var26 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var27 = var26.isEmpty();
    java.lang.Object var29 = var26.get((java.lang.Object)100L);
    boolean var30 = var26.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var31 = new sun.security.krb5.internal.rcache.ReplayCache("", var26);
    sun.security.krb5.internal.rcache.CacheTable var32 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var34 = var32.remove((java.lang.Object)(short)0);
    java.lang.String var35 = var32.toString();
    var31.addLast((java.lang.Object)var35);
    sun.security.krb5.internal.rcache.CacheTable var37 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var38 = var37.isEmpty();
    java.lang.Object var40 = var37.get((java.lang.Object)100L);
    boolean var41 = var37.isEmpty();
    java.util.Enumeration var42 = var37.elements();
    boolean var43 = var31.remove((java.lang.Object)var37);
    var31.clear();
    boolean var45 = var6.removeAll((java.util.Collection)var31);
    sun.security.krb5.internal.rcache.CacheTable var47 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var48 = var47.isEmpty();
    java.lang.Object var50 = var47.get((java.lang.Object)100L);
    boolean var51 = var47.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var52 = new sun.security.krb5.internal.rcache.ReplayCache("", var47);
    sun.security.krb5.internal.rcache.CacheTable var53 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var55 = var53.remove((java.lang.Object)(short)0);
    java.lang.String var56 = var53.toString();
    var52.addLast((java.lang.Object)var56);
    java.lang.Object var58 = var52.getLast();
    boolean var59 = var6.addAll((java.util.Collection)var52);
    var6.addLast((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "{}"+ "'", var19.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "{}"+ "'", var35.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "{}"+ "'", var56.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "{}"+ "'", var58.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.krb5.internal.rcache.CacheTable var0 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var2 = var0.remove((java.lang.Object)(short)0);
    java.lang.String var3 = var0.toString();
    java.util.Collection var4 = var0.values();
    sun.security.krb5.internal.rcache.CacheTable var5 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var6 = var5.isEmpty();
    java.lang.Object var8 = var5.get((java.lang.Object)100L);
    boolean var9 = var5.isEmpty();
    java.util.Enumeration var10 = var5.elements();
    boolean var11 = var0.containsKey((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var13 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var14 = var13.isEmpty();
    java.lang.Object var16 = var13.get((java.lang.Object)100L);
    boolean var17 = var13.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var18 = new sun.security.krb5.internal.rcache.ReplayCache("", var13);
    sun.security.krb5.internal.rcache.CacheTable var19 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var21 = var19.remove((java.lang.Object)(short)0);
    java.lang.String var22 = var19.toString();
    var18.addLast((java.lang.Object)var22);
    sun.security.krb5.internal.rcache.CacheTable var24 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var25 = var24.isEmpty();
    java.lang.Object var27 = var24.get((java.lang.Object)100L);
    boolean var28 = var24.isEmpty();
    java.util.Enumeration var29 = var24.elements();
    boolean var30 = var18.remove((java.lang.Object)var24);
    java.lang.Object var31 = var18.element();
    java.lang.Object var32 = var18.clone();
    java.lang.Object var33 = var18.clone();
    java.lang.Object var34 = var0.remove(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "{}"+ "'", var22.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "{}"+ "'", var31.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var12 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var13 = var12.isEmpty();
    java.lang.Object var15 = var12.get((java.lang.Object)100L);
    boolean var16 = var12.isEmpty();
    java.util.Enumeration var17 = var12.elements();
    boolean var18 = var6.remove((java.lang.Object)var12);
    sun.security.krb5.internal.rcache.CacheTable var19 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var20 = var19.isEmpty();
    java.lang.Object var22 = var19.get((java.lang.Object)100L);
    java.util.Enumeration var23 = var19.elements();
    boolean var24 = var6.add((java.lang.Object)var23);
    var6.push((java.lang.Object)10.0f);
    int var28 = var6.indexOf((java.lang.Object)true);
    boolean var30 = var6.offerLast((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var12 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var13 = var12.isEmpty();
    java.lang.Object var15 = var12.get((java.lang.Object)100L);
    boolean var16 = var12.isEmpty();
    java.util.Enumeration var17 = var12.elements();
    boolean var18 = var6.remove((java.lang.Object)var12);
    int var20 = var6.indexOf((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.security.krb5.internal.rcache.CacheTable var0 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.String var1 = var0.toString();
    int var2 = var0.size();
    java.lang.Object var3 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var12 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var13 = var12.isEmpty();
    java.lang.Object var15 = var12.get((java.lang.Object)100L);
    java.util.Enumeration var16 = var12.elements();
    sun.security.krb5.internal.rcache.CacheTable var18 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var19 = var18.isEmpty();
    java.lang.Object var21 = var18.get((java.lang.Object)100L);
    boolean var22 = var18.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var23 = new sun.security.krb5.internal.rcache.ReplayCache("", var18);
    sun.security.krb5.internal.rcache.CacheTable var24 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var26 = var24.remove((java.lang.Object)(short)0);
    java.lang.String var27 = var24.toString();
    var23.addLast((java.lang.Object)var27);
    sun.security.krb5.internal.rcache.CacheTable var29 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var30 = var29.isEmpty();
    java.lang.Object var32 = var29.get((java.lang.Object)100L);
    boolean var33 = var29.isEmpty();
    java.util.Enumeration var34 = var29.elements();
    boolean var35 = var23.remove((java.lang.Object)var29);
    boolean var36 = var12.equals((java.lang.Object)var23);
    boolean var37 = var6.addAll((java.util.Collection)var23);
    int var38 = var23.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "{}"+ "'", var27.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    java.lang.Object var12 = var6.peekLast();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var12 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var13 = var12.isEmpty();
    java.lang.Object var15 = var12.get((java.lang.Object)100L);
    boolean var16 = var12.isEmpty();
    java.util.Enumeration var17 = var12.elements();
    boolean var18 = var6.remove((java.lang.Object)var12);
    sun.security.krb5.internal.rcache.CacheTable var19 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var20 = var19.isEmpty();
    java.lang.Object var22 = var19.get((java.lang.Object)100L);
    java.util.Enumeration var23 = var19.elements();
    boolean var24 = var6.add((java.lang.Object)var23);
    var6.push((java.lang.Object)10.0f);
    boolean var28 = var6.offer((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.krb5.internal.rcache.CacheTable var1 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var2 = var1.isEmpty();
    java.lang.Object var4 = var1.get((java.lang.Object)100L);
    boolean var5 = var1.isEmpty();
    sun.security.krb5.internal.rcache.ReplayCache var6 = new sun.security.krb5.internal.rcache.ReplayCache("", var1);
    sun.security.krb5.internal.rcache.CacheTable var7 = new sun.security.krb5.internal.rcache.CacheTable();
    java.lang.Object var9 = var7.remove((java.lang.Object)(short)0);
    java.lang.String var10 = var7.toString();
    var6.addLast((java.lang.Object)var10);
    sun.security.krb5.internal.rcache.CacheTable var12 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var13 = var12.isEmpty();
    java.lang.Object var15 = var12.get((java.lang.Object)100L);
    boolean var16 = var12.isEmpty();
    java.util.Enumeration var17 = var12.elements();
    boolean var18 = var6.remove((java.lang.Object)var12);
    sun.security.krb5.internal.rcache.CacheTable var19 = new sun.security.krb5.internal.rcache.CacheTable();
    boolean var20 = var19.isEmpty();
    java.lang.Object var22 = var19.get((java.lang.Object)100L);
    java.util.Enumeration var23 = var19.elements();
    boolean var24 = var6.add((java.lang.Object)var23);
    var6.push((java.lang.Object)10.0f);
    int var28 = var6.indexOf((java.lang.Object)true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var31 = var6.subList(1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

}
