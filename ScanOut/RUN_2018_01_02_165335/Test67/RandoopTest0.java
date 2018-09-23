
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = javax.management.ObjectName.unquote("");
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
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("hi!");
    java.lang.Integer var2 = var1.getCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.ObjectName var1 = new javax.management.ObjectName("");
    java.lang.String var3 = var1.getKeyProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.lang.String var9 = var7.getKeyPropertyListString();
    boolean var10 = var7.isDomainPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.util.Hashtable var9 = var5.getKeyPropertyList();
    com.sun.jmx.mbeanserver.Repository var12 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var13 = var12.getCount();
    javax.management.ObjectName var15 = new javax.management.ObjectName("");
    javax.management.ObjectName var17 = new javax.management.ObjectName("");
    java.util.Set var18 = var12.query(var15, (javax.management.QueryExp)var17);
    boolean var19 = var9.contains((java.lang.Object)var17);
    com.sun.jmx.mbeanserver.Repository var22 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var23 = var22.getCount();
    javax.management.ObjectName var25 = new javax.management.ObjectName("");
    javax.management.ObjectName var27 = new javax.management.ObjectName("");
    java.util.Set var28 = var22.query(var25, (javax.management.QueryExp)var27);
    java.util.Hashtable var29 = var25.getKeyPropertyList();
    com.sun.jmx.mbeanserver.Repository var32 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var33 = var32.getCount();
    javax.management.ObjectName var35 = new javax.management.ObjectName("");
    javax.management.ObjectName var37 = new javax.management.ObjectName("");
    java.util.Set var38 = var32.query(var35, (javax.management.QueryExp)var37);
    boolean var39 = var29.contains((java.lang.Object)var37);
    int var40 = var17.compareTo(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 0+ "'", var13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 0+ "'", var23.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 0+ "'", var33.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = javax.management.ObjectName.getInstance("hi!");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    boolean var9 = var7.isPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("", false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.lang.String var9 = var7.getKeyPropertyListString();
    java.util.Hashtable var10 = var7.getKeyPropertyList();
    java.lang.Object var13 = var10.put((java.lang.Object)10, (java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.util.Hashtable var9 = var5.getKeyPropertyList();
    com.sun.jmx.mbeanserver.Repository var12 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var13 = var12.getCount();
    javax.management.ObjectName var15 = new javax.management.ObjectName("");
    javax.management.ObjectName var17 = new javax.management.ObjectName("");
    java.util.Set var18 = var12.query(var15, (javax.management.QueryExp)var17);
    boolean var19 = var9.contains((java.lang.Object)var17);
    java.util.Enumeration var20 = var9.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 0+ "'", var13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.util.Hashtable var9 = var5.getKeyPropertyList();
    com.sun.crypto.provider.SunJCE var10 = new com.sun.crypto.provider.SunJCE();
    var9.putAll((java.util.Map)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    java.util.Enumeration var3 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    double var3 = var0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.7d);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.ObjectName var1 = new javax.management.ObjectName("");
    boolean var2 = var1.isPropertyValuePattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    com.sun.jmx.mbeanserver.Repository var5 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var6 = var5.getCount();
    javax.management.ObjectName var8 = new javax.management.ObjectName("");
    javax.management.ObjectName var10 = new javax.management.ObjectName("");
    java.util.Set var11 = var5.query(var8, (javax.management.QueryExp)var10);
    javax.management.DynamicMBean var12 = var2.retrieve(var10);
    boolean var13 = var10.isPropertyPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0+ "'", var6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    boolean var3 = var1.add((java.lang.Object)1.7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    com.sun.jmx.mbeanserver.Repository var5 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var6 = var5.getCount();
    javax.management.ObjectName var8 = new javax.management.ObjectName("");
    javax.management.ObjectName var10 = new javax.management.ObjectName("");
    java.util.Set var11 = var5.query(var8, (javax.management.QueryExp)var10);
    javax.management.DynamicMBean var12 = var2.retrieve(var10);
    com.sun.jmx.mbeanserver.Repository var15 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var16 = var15.getCount();
    javax.management.ObjectName var18 = new javax.management.ObjectName("");
    javax.management.ObjectName var20 = new javax.management.ObjectName("");
    java.util.Set var21 = var15.query(var18, (javax.management.QueryExp)var20);
    java.util.Hashtable var22 = var18.getKeyPropertyList();
    com.sun.jmx.mbeanserver.Repository var25 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var26 = var25.getCount();
    javax.management.ObjectName var28 = new javax.management.ObjectName("");
    javax.management.ObjectName var30 = new javax.management.ObjectName("");
    java.util.Set var31 = var25.query(var28, (javax.management.QueryExp)var30);
    boolean var32 = var22.contains((java.lang.Object)var30);
    boolean var33 = var10.equals((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0+ "'", var6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 0+ "'", var16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 0+ "'", var26.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.lang.String var9 = var7.getKeyPropertyListString();
    java.util.Hashtable var10 = var7.getKeyPropertyList();
    boolean var12 = var10.equals((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "SunJCE version 1.7"+ "'", var1.equals("SunJCE version 1.7"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.util.Hashtable var9 = var5.getKeyPropertyList();
    com.sun.jmx.mbeanserver.Repository var12 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var13 = var12.getCount();
    javax.management.ObjectName var15 = new javax.management.ObjectName("");
    javax.management.ObjectName var17 = new javax.management.ObjectName("");
    java.util.Set var18 = var12.query(var15, (javax.management.QueryExp)var17);
    boolean var19 = var9.contains((java.lang.Object)var17);
    boolean var20 = var17.isPropertyValuePattern();
    java.util.Hashtable var21 = var17.getKeyPropertyList();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 0+ "'", var13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    java.util.Set var3 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    java.util.Set var3 = var0.getServices();
    java.lang.Object var4 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    var1.clear();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    boolean var2 = var1.isEmpty();
    com.sun.jmx.mbeanserver.Repository var5 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    com.sun.jmx.mbeanserver.Repository var8 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var9 = var8.getCount();
    javax.management.ObjectName var11 = new javax.management.ObjectName("");
    javax.management.ObjectName var13 = new javax.management.ObjectName("");
    java.util.Set var14 = var8.query(var11, (javax.management.QueryExp)var13);
    javax.management.DynamicMBean var15 = var5.retrieve(var13);
    boolean var16 = var13.isPropertyPattern();
    java.lang.Object[] var17 = new java.lang.Object[] { var16};
    java.lang.Object[] var18 = var1.toArray(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0+ "'", var9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    com.sun.jmx.mbeanserver.Repository var4 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var5 = var4.getCount();
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    javax.management.ObjectName var9 = new javax.management.ObjectName("");
    java.util.Set var10 = var4.query(var7, (javax.management.QueryExp)var9);
    boolean var11 = var0.remove((java.lang.Object)var10);
    var0.setSize(10);
    java.util.Iterator var14 = var0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

}
