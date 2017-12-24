
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = javax.management.ObjectName.unquote("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = javax.management.ObjectName.getInstance("hi!");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    boolean var7 = var3.isPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    boolean var7 = var3.isDomainPattern();
    java.lang.String var8 = var3.getDomain();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    java.util.Set var7 = var6.keySet();
    java.lang.Object var8 = var6.clone();
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    java.lang.String var10 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{hi!=hi!}"+ "'", var10.equals("{hi!=hi!}"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    boolean var4 = var3.isDomainPattern();
    java.lang.String var5 = var3.getDomain();
    boolean var6 = var3.isPropertyValuePattern();
    boolean var7 = var3.isPropertyListPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.Object var3 = var1.remove((java.lang.Object)(byte)0);
    java.util.Enumeration var4 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    boolean var4 = var3.isDomainPattern();
    boolean var5 = var3.isPropertyPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    java.util.Set var7 = var6.keySet();
    java.lang.Object var8 = var6.clone();
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    java.util.Set var10 = var9.entrySet();
    java.util.Enumeration var11 = var9.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    boolean var4 = var3.isDomainPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var5 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    boolean var4 = var3.isDomainPattern();
    java.lang.String var5 = var3.getDomain();
    boolean var6 = var3.isPropertyValuePattern();
    boolean var7 = var3.isDomainPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    boolean var6 = var3.equals((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    java.util.Set var7 = var6.keySet();
    java.lang.Object var8 = var6.clone();
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    javax.management.ObjectName var14 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var15 = var14.isPropertyValuePattern();
    java.lang.String var16 = var14.getKeyPropertyListString();
    java.util.Hashtable var17 = var14.getKeyPropertyList();
    java.util.Set var18 = var17.keySet();
    java.lang.Object var19 = var17.clone();
    java.lang.String var20 = var17.toString();
    java.lang.Object var21 = var9.put((java.lang.Object)(byte)100, (java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!=hi!"+ "'", var16.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "{hi!=hi!}"+ "'", var20.equals("{hi!=hi!}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    java.util.Set var7 = var6.keySet();
    boolean var9 = var6.containsValue((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    java.util.Hashtable var4 = var3.getKeyPropertyList();
    boolean var5 = var3.isPropertyPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    java.util.Set var7 = var6.keySet();
    java.lang.Object var8 = var6.clone();
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    java.util.Enumeration var10 = var9.keys();
    java.lang.String var11 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "{hi!=hi!}"+ "'", var11.equals("{hi!=hi!}"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.ObjectName var4 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    java.util.Hashtable var5 = var4.getKeyPropertyList();
    javax.management.ObjectName var6 = new javax.management.ObjectName("hi!=hi!", var5);
    javax.management.ObjectName var10 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    boolean var11 = var10.isDomainPattern();
    java.lang.String var12 = var10.getDomain();
    boolean var13 = var6.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getDomain();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    java.util.Set var7 = var6.keySet();
    javax.management.ObjectName var12 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var13 = var12.isPropertyValuePattern();
    java.lang.String var14 = var12.getKeyPropertyListString();
    java.util.Hashtable var15 = var12.getKeyPropertyList();
    java.util.Set var16 = var15.keySet();
    java.lang.Object var17 = var15.clone();
    java.lang.Object var18 = var6.put((java.lang.Object)10, (java.lang.Object)var15);
    java.util.Set var19 = var15.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!=hi!"+ "'", var14.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    java.util.Hashtable var4 = var3.getKeyPropertyList();
    java.lang.String var5 = var3.getDomain();
    javax.management.ObjectName var9 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var10 = var9.isPropertyValuePattern();
    boolean var11 = var3.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    java.util.Set var7 = var6.keySet();
    javax.management.ObjectName var12 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var13 = var12.isPropertyValuePattern();
    java.lang.String var14 = var12.getKeyPropertyListString();
    java.util.Hashtable var15 = var12.getKeyPropertyList();
    java.util.Set var16 = var15.keySet();
    java.lang.Object var17 = var15.clone();
    java.lang.Object var18 = var6.put((java.lang.Object)10, (java.lang.Object)var15);
    boolean var19 = var6.isEmpty();
    java.util.Enumeration var20 = var6.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!=hi!"+ "'", var14.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("", "hi!", "hi!");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var5 = var3.getKeyPropertyListString();
    java.util.Hashtable var6 = var3.getKeyPropertyList();
    java.util.Set var7 = var6.keySet();
    java.lang.Object var8 = var6.clone();
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    java.util.Enumeration var10 = var9.keys();
    javax.management.ObjectName var14 = javax.management.ObjectName.getInstance("hi!", "hi!", "");
    java.util.Hashtable var15 = var14.getKeyPropertyList();
    java.lang.Object var16 = var15.clone();
    int var17 = var15.size();
    boolean var19 = var15.contains((java.lang.Object)(-1));
    boolean var20 = var9.containsKey((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!=hi!"+ "'", var5.equals("hi!=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

}
