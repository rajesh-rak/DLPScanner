
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    char[] var1 = new char[] { '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = java.lang.String.valueOf(var1, 100, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Level var1 = var0.getLevel();
    java.util.logging.Level var2 = var0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[] var2 = new java.lang.Object[] { "1"};
    java.lang.String var3 = java.lang.String.format(" 4", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " 4"+ "'", var3.equals(" 4"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var3 = new byte[] { (byte)100, (byte)(-1), (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getResourceBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    var5.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var8 = new com.sun.corba.se.impl.logging.IORSystemException(var5);
    org.omg.CORBA.INTERNAL var9 = var8.stringifyWriteError();
    var0.throwing("", "d", (java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("1");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var2 = new char[] { ' ', '4'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    java.lang.String var4 = java.lang.String.valueOf(var2);
    java.lang.String var5 = java.lang.String.valueOf(var2);
    java.lang.String var6 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " 4"+ "'", var3.equals(" 4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " 4"+ "'", var4.equals(" 4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " 4"+ "'", var5.equals(" 4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " 4"+ "'", var6.equals(" 4"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    var5.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var8 = new com.sun.corba.se.impl.logging.IORSystemException(var5);
    org.omg.CORBA.INTERNAL var9 = var8.stringifyWriteError();
    var0.throwing("1", "1", (java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var3, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var1 = new byte[] { (byte)100};
    java.lang.String var2 = new java.lang.String(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var1, 1, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "d"+ "'", var2.equals("d"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var3 = new com.sun.corba.se.impl.logging.IORSystemException(var0);
    org.omg.CORBA.INTERNAL var4 = var3.stringifyWriteError();
    org.omg.CORBA.INTERNAL var5 = var3.nullPoa();
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    var6.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var9 = new com.sun.corba.se.impl.logging.IORSystemException(var6);
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    var10.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var13 = new com.sun.corba.se.impl.logging.IORSystemException(var10);
    org.omg.CORBA.INTERNAL var14 = var13.stringifyWriteError();
    org.omg.CORBA.INV_OBJREF var15 = var13.iorMustHaveIiopProfile();
    org.omg.CORBA.INTERNAL var17 = var9.badMagic((java.lang.Throwable)var15, (java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var19 = var3.taggedProfileTemplateFactoryNotFound((java.lang.Throwable)var15, (java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger();
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.lang.Object var3 = var0.put((java.lang.Object)var1, (java.lang.Object)var2);
    boolean var4 = var1.getUseParentHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var2 = var1.isEmpty();
    char[] var6 = new char[] { '#', '#', ' '};
    java.lang.String var7 = java.lang.String.valueOf(var6);
    java.lang.String var8 = new java.lang.String(var6);
    boolean var9 = var1.contains((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "## "+ "'", var7.equals("## "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "## "+ "'", var8.equals("## "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("d", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var3 = new com.sun.corba.se.impl.logging.IORSystemException(var0);
    java.util.logging.Logger var4 = java.util.logging.Logger.getAnonymousLogger();
    var4.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var7 = new com.sun.corba.se.impl.logging.IORSystemException(var4);
    org.omg.CORBA.INTERNAL var8 = var7.stringifyWriteError();
    org.omg.CORBA.INV_OBJREF var9 = var7.iorMustHaveIiopProfile();
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    var10.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var13 = new com.sun.corba.se.impl.logging.IORSystemException(var10);
    org.omg.CORBA.INTERNAL var14 = var13.stringifyWriteError();
    org.omg.CORBA.INV_OBJREF var15 = var13.iorMustHaveIiopProfile();
    org.omg.CORBA.INTERNAL var16 = var7.nullPoa((java.lang.Throwable)var15);
    org.omg.CORBA.BAD_OPERATION var17 = var3.objectAdapterIdNotAvailable((java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.logging.Logger var2 = java.util.logging.Logger.getGlobal();
    var2.finest(" 4");
    boolean var5 = var1.containsValue((java.lang.Object)" 4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var3 = new com.sun.corba.se.impl.logging.IORSystemException(var0);
    org.omg.CORBA.INTERNAL var4 = var3.stringifyWriteError();
    org.omg.CORBA.INV_OBJREF var5 = var3.iorMustHaveIiopProfile();
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    var6.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var9 = new com.sun.corba.se.impl.logging.IORSystemException(var6);
    org.omg.CORBA.INTERNAL var10 = var9.stringifyWriteError();
    org.omg.CORBA.INV_OBJREF var11 = var9.iorMustHaveIiopProfile();
    org.omg.CORBA.INTERNAL var12 = var3.nullPoa((java.lang.Throwable)var11);
    java.util.logging.Logger var13 = java.util.logging.Logger.getAnonymousLogger();
    var13.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var16 = new com.sun.corba.se.impl.logging.IORSystemException(var13);
    org.omg.CORBA.INTERNAL var17 = var16.stringifyWriteError();
    org.omg.CORBA.INV_OBJREF var18 = var16.iorMustHaveIiopProfile();
    org.omg.CORBA.BAD_PARAM var20 = var16.badIiopAddressPort((java.lang.Object)10.0f);
    org.omg.CORBA.BAD_PARAM var21 = var3.invalidTaggedProfile((java.lang.Throwable)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Level var1 = var0.getLevel();
    var0.entering(" ", "10.0");
    var0.info("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var3 = new com.sun.corba.se.impl.logging.IORSystemException(var0);
    java.util.logging.Logger var4 = java.util.logging.Logger.getAnonymousLogger();
    var4.severe("hi!");
    com.sun.corba.se.impl.logging.IORSystemException var7 = new com.sun.corba.se.impl.logging.IORSystemException(var4);
    org.omg.CORBA.INTERNAL var8 = var7.stringifyWriteError();
    org.omg.CORBA.INV_OBJREF var9 = var7.iorMustHaveIiopProfile();
    org.omg.CORBA.INTERNAL var11 = var3.badMagic((java.lang.Throwable)var9, (java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var13 = var3.invalidJdk131PatchLevel((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

}
