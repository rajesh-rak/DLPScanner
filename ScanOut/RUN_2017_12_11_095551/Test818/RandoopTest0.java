
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
    boolean var11 = var7.isDomainPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jmx.mbeanserver.Repository var3 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var4 = var3.getCount();
    javax.management.ObjectName var6 = new javax.management.ObjectName("");
    javax.management.ObjectName var8 = new javax.management.ObjectName("");
    java.util.Set var9 = var3.query(var6, (javax.management.QueryExp)var8);
    java.util.Hashtable var10 = var6.getKeyPropertyList();
    com.sun.jmx.mbeanserver.Repository var13 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var14 = var13.getCount();
    javax.management.ObjectName var16 = new javax.management.ObjectName("");
    javax.management.ObjectName var18 = new javax.management.ObjectName("");
    java.util.Set var19 = var13.query(var16, (javax.management.QueryExp)var18);
    java.util.Hashtable var20 = var16.getKeyPropertyList();
    var10.putAll((java.util.Map)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var22 = javax.management.ObjectName.getInstance("hi!", var20);
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

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


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var1 = var0.getStartPosition();
    javax.swing.text.Position var2 = var0.getEndPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.lang.String var9 = var7.getKeyPropertyListString();
    boolean var10 = var7.isPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("", false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    boolean var9 = var7.isPropertyListPattern();
    java.util.Hashtable var10 = var7.getKeyPropertyList();
    java.util.Enumeration var11 = var10.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    double var3 = var0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.7d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var3 = var2.getCount();
    javax.management.ObjectName var5 = new javax.management.ObjectName("");
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    java.util.Set var8 = var2.query(var5, (javax.management.QueryExp)var7);
    java.util.Hashtable var9 = var5.getKeyPropertyList();
    java.lang.String var11 = var5.getKeyProperty("hi!");
    boolean var12 = var5.isPropertyValuePattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    java.util.Enumeration var3 = var0.elements();
    java.lang.Object var6 = var0.setProperty("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var1 = var0.getDocumentFilter();
    javax.swing.text.Position var3 = var0.createPosition(10);
    int var4 = var0.getAsynchronousLoadPriority();
    javax.swing.text.Element var5 = var0.getDefaultRootElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    java.util.Enumeration var3 = var0.elements();
    java.util.Collection var4 = var0.values();
    java.util.Set var5 = var0.getServices();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var1 = var0.getDocumentFilter();
    javax.swing.text.Position var3 = var0.createPosition(10);
    int var4 = var0.getAsynchronousLoadPriority();
    int var5 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.SunJCE var1 = new com.sun.crypto.provider.SunJCE();
    com.sun.jmx.mbeanserver.Repository var4 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var5 = var4.getCount();
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    javax.management.ObjectName var9 = new javax.management.ObjectName("");
    java.util.Set var10 = var4.query(var7, (javax.management.QueryExp)var9);
    java.util.Hashtable var11 = var7.getKeyPropertyList();
    javax.management.ObjectName var13 = new javax.management.ObjectName("");
    java.lang.Object var15 = var11.put((java.lang.Object)var13, (java.lang.Object)(-1.0d));
    var1.putAll((java.util.Map)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var17 = new javax.management.ObjectName("", var11);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    com.sun.jmx.mbeanserver.Repository var4 = new com.sun.jmx.mbeanserver.Repository("hi!", true);
    java.lang.Integer var5 = var4.getCount();
    javax.management.ObjectName var7 = new javax.management.ObjectName("");
    javax.management.ObjectName var9 = new javax.management.ObjectName("");
    java.util.Set var10 = var4.query(var7, (javax.management.QueryExp)var9);
    java.lang.String var11 = var9.getKeyPropertyListString();
    boolean var12 = var9.isDomainPattern();
    boolean var13 = var0.remove((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    java.util.Set var3 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    boolean var2 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

}
