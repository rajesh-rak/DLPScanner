
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Properties var1 = new java.util.Properties();
    boolean var3 = var1.equals((java.lang.Object)(byte)0);
    javax.naming.Context var4 = javax.naming.spi.NamingManager.getURLContext("", (java.util.Hashtable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.equals((java.lang.Object)(byte)0);
    java.util.Properties var3 = new java.util.Properties();
    boolean var5 = var3.equals((java.lang.Object)(byte)0);
    var0.putAll((java.util.Map)var3);
    boolean var8 = var3.containsKey((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Properties var0 = new java.util.Properties();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var1 = javax.naming.spi.NamingManager.getInitialContext((java.util.Hashtable)var0);
      fail("Expected exception of type javax.naming.NoInitialContextException");
    } catch (javax.naming.NoInitialContextException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.lang.String var2 = var0.getContentTypeFor("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.equals((java.lang.Object)(byte)0);
    boolean var4 = var0.containsKey((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 1, (-1));
    int var6 = var5.getHours();
    int var7 = var5.getDay();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 1, (-1));
    int var6 = var5.getDate();
    int var7 = var5.getYear();
    java.util.Date var13 = new java.util.Date(100, 1, 10, 1, (-1));
    int var14 = var13.getDate();
    int var15 = var13.getYear();
    boolean var16 = var5.after(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    boolean var3 = var1.equals((java.lang.Object)(byte)0);
    java.util.Properties var4 = new java.util.Properties();
    boolean var6 = var4.equals((java.lang.Object)(byte)0);
    var1.putAll((java.util.Map)var4);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var4);
    java.lang.Object var11 = var4.setProperty("hi!", "");
    boolean var12 = var0.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var2 = new java.util.Properties();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.rmi.registry.RegistryContext var3 = new com.sun.jndi.rmi.registry.RegistryContext("", 4, (java.util.Hashtable)var2);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByExt("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.equals((java.lang.Object)(byte)0);
    java.util.Properties var3 = new java.util.Properties();
    boolean var5 = var3.equals((java.lang.Object)(byte)0);
    var0.putAll((java.util.Map)var3);
    java.lang.Object var7 = var3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.equals((java.lang.Object)(byte)0);
    java.util.Properties var3 = new java.util.Properties();
    boolean var5 = var3.equals((java.lang.Object)(byte)0);
    var0.putAll((java.util.Map)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var7 = javax.naming.spi.NamingManager.getInitialContext((java.util.Hashtable)var3);
      fail("Expected exception of type javax.naming.NoInitialContextException");
    } catch (javax.naming.NoInitialContextException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.find("hi!");
    sun.net.www.MimeEntry var4 = var0.remove("");

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 1, (-1));
    int var6 = var5.getHours();
    var5.setSeconds(0);
    int var9 = var5.getYear();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 1, (-1));
    int var6 = var5.getHours();
    var5.setSeconds(0);
    java.util.Date var14 = new java.util.Date(100, 1, 10, 1, (-1));
    int var15 = var14.getHours();
    var14.setSeconds(0);
    int var18 = var14.getMonth();
    int var19 = var5.compareTo(var14);
    int var20 = var5.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 1, (-1));
    java.lang.String var6 = var5.toLocaleString();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 1, (-1));
    int var6 = var5.getHours();
    var5.setSeconds(0);
    java.util.Date var14 = new java.util.Date(100, 1, 10, 1, (-1));
    int var15 = var14.getHours();
    var14.setSeconds(0);
    int var18 = var14.getMonth();
    int var19 = var5.compareTo(var14);
    java.util.Date var25 = new java.util.Date(100, 1, 10, 1, (-1));
    boolean var26 = var5.before(var25);
    java.lang.String var27 = var25.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Enumeration var1 = var0.propertyNames();
    java.util.Set var2 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var1 = new java.util.Date(0L);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.equals((java.lang.Object)(byte)0);
    java.util.Properties var3 = new java.util.Properties();
    boolean var5 = var3.equals((java.lang.Object)(byte)0);
    var0.putAll((java.util.Map)var3);
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var3);
    java.lang.Object var10 = var3.setProperty("hi!", "");
    java.lang.Object var12 = var3.get((java.lang.Object)(byte)100);
    java.util.Properties var13 = new java.util.Properties();
    boolean var15 = var13.equals((java.lang.Object)(byte)0);
    java.util.Enumeration var16 = var13.keys();
    boolean var17 = var3.contains((java.lang.Object)var16);
    java.util.Date var23 = new java.util.Date(100, 1, 10, 1, (-1));
    int var24 = var23.getHours();
    var23.setSeconds(0);
    java.util.Date var32 = new java.util.Date(100, 1, 10, 1, (-1));
    int var33 = var32.getHours();
    var32.setSeconds(0);
    int var36 = var32.getMonth();
    int var37 = var23.compareTo(var32);
    boolean var38 = var3.containsKey((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.util.Properties var1 = new java.util.Properties();
    boolean var3 = var1.equals((java.lang.Object)(byte)0);
    java.util.Properties var4 = new java.util.Properties();
    boolean var6 = var4.equals((java.lang.Object)(byte)0);
    var1.putAll((java.util.Map)var4);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var4);
    java.lang.Object var11 = var4.setProperty("hi!", "");
    java.lang.Object var13 = var4.get((java.lang.Object)(byte)100);
    java.util.Properties var14 = new java.util.Properties();
    boolean var16 = var14.equals((java.lang.Object)(byte)0);
    java.util.Enumeration var17 = var14.keys();
    boolean var18 = var4.contains((java.lang.Object)var17);
    boolean var19 = var0.equals((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

}
