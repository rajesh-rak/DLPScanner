
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Package var1 = java.lang.Package.getPackage("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.lang.ClassLoader var3 = java.lang.ClassLoader.getSystemClassLoader();
    var3.setPackageAssertionStatus("hi!", false);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, var3);
    java.net.URL var9 = var7.getResource("");
    var7.setDefaultAssertionStatus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var2);
    java.net.URL[] var5 = var4.getURLs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    var3.setPackageAssertionStatus("hi!", true);
    java.net.URL[] var7 = var3.getURLs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.lang.ClassLoader var3 = java.lang.ClassLoader.getSystemClassLoader();
    var3.setPackageAssertionStatus("hi!", false);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, var3);
    java.net.URL var9 = var7.getResource("");
    java.io.InputStream var11 = var7.getResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var2);
    var4.setDefaultAssertionStatus(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.net.URL[] var4 = var3.getURLs();
    java.net.URLClassLoader var5 = java.net.URLClassLoader.newInstance(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.net.URL[] var4 = var3.getURLs();
    java.lang.ClassLoader var5 = var3.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.lang.ClassLoader var3 = java.lang.ClassLoader.getSystemClassLoader();
    var3.setPackageAssertionStatus("hi!", false);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, var3);
    java.net.URLClassLoader var8 = java.net.URLClassLoader.newInstance(var2);
    java.net.URL var10 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var11 = new java.net.URL[] { var10};
    java.lang.ClassLoader var12 = java.lang.ClassLoader.getSystemClassLoader();
    var12.setPackageAssertionStatus("hi!", false);
    java.net.URLClassLoader var16 = new java.net.URLClassLoader(var11, var12);
    java.lang.ClassLoader var17 = java.lang.ClassLoader.getSystemClassLoader();
    var17.setPackageAssertionStatus("hi!", true);
    java.net.URL var22 = var17.getResource("");
    java.net.URLClassLoader var23 = java.net.URLClassLoader.newInstance(var11, var17);
    var23.close();
    java.net.URLClassLoader var25 = java.net.URLClassLoader.newInstance(var2, (java.lang.ClassLoader)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    var0.setDefaultAssertionStatus(true);
    var0.setClassAssertionStatus("hi!", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.lang.ClassLoader var3 = java.lang.ClassLoader.getSystemClassLoader();
    var3.setPackageAssertionStatus("hi!", false);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, var3);
    var7.close();
    java.util.Enumeration var10 = var7.getResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    var0.setPackageAssertionStatus("hi!", false);
    var0.setClassAssertionStatus("", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var2);
    var4.close();
    var4.setDefaultAssertionStatus(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.lang.ClassLoader var3 = java.lang.ClassLoader.getSystemClassLoader();
    var3.setPackageAssertionStatus("hi!", false);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, var3);
    var7.close();
    var7.setClassAssertionStatus("hi!", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.lang.ClassLoader var3 = java.lang.ClassLoader.getSystemClassLoader();
    var3.setPackageAssertionStatus("hi!", false);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, var3);
    java.lang.ClassLoader var8 = java.lang.ClassLoader.getSystemClassLoader();
    var8.setPackageAssertionStatus("hi!", true);
    java.net.URL var13 = var8.getResource("");
    java.net.URLClassLoader var14 = java.net.URLClassLoader.newInstance(var2, var8);
    java.net.URL var16 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var17 = new java.net.URL[] { var16};
    java.net.URLClassLoader var18 = java.net.URLClassLoader.newInstance(var17);
    java.net.URLClassLoader var19 = new java.net.URLClassLoader(var17);
    java.lang.ClassLoader var20 = var19.getParent();
    java.net.URLClassLoader var21 = java.net.URLClassLoader.newInstance(var2, (java.lang.ClassLoader)var19);
    var21.setPackageAssertionStatus("hi!", false);
    var21.clearAssertionStatus();
    java.util.Enumeration var27 = var21.getResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

}
