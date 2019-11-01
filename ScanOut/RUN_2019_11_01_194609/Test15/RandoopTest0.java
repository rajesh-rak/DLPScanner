
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var0 = java.awt.EventQueue.isDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var0 = java.awt.EventQueue.getMostRecentEventTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1572617923107L);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.EventQueue var1 = new java.awt.EventQueue();
    var0.push(var1);
    java.awt.AWTEvent var4 = var0.peekEvent(0);
    java.awt.SecondaryLoop var5 = var0.createSecondaryLoop();
    java.awt.AWTEvent var7 = var0.peekEvent(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.EventQueue var1 = new java.awt.EventQueue();
    var0.push(var1);
    java.awt.SecondaryLoop var3 = var1.createSecondaryLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.EventQueue var1 = new java.awt.EventQueue();
    var0.push(var1);
    java.awt.AWTEvent var4 = var0.peekEvent(0);
    java.awt.AWTEvent var5 = var0.peekEvent();
    java.awt.AWTEvent var6 = var0.peekEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.EventQueue var1 = new java.awt.EventQueue();
    var0.push(var1);
    java.awt.SecondaryLoop var3 = var0.createSecondaryLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.EventQueue var1 = new java.awt.EventQueue();
    var0.push(var1);
    java.awt.AWTEvent var4 = var0.peekEvent(0);
    java.awt.SecondaryLoop var5 = var0.createSecondaryLoop();
    java.awt.AWTEvent var6 = var0.peekEvent();
    java.awt.SecondaryLoop var7 = var0.createSecondaryLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
