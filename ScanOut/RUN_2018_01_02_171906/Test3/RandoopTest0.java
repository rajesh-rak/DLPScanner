
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

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
    assertTrue(var0 == 1514897813000L);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.AWTEvent var2 = var0.peekEvent(10);
    java.awt.EventQueue var3 = new java.awt.EventQueue();
    java.awt.AWTEvent var5 = var3.peekEvent(10);
    var0.push(var3);
    java.awt.EventQueue var7 = new java.awt.EventQueue();
    java.awt.AWTEvent var9 = var7.peekEvent(10);
    java.awt.EventQueue var10 = new java.awt.EventQueue();
    java.awt.AWTEvent var12 = var10.peekEvent(10);
    var7.push(var10);
    var3.push(var7);
    java.awt.EventQueue var15 = new java.awt.EventQueue();
    java.awt.AWTEvent var17 = var15.peekEvent(10);
    java.awt.EventQueue var18 = new java.awt.EventQueue();
    java.awt.AWTEvent var20 = var18.peekEvent(10);
    var15.push(var18);
    java.awt.EventQueue var22 = new java.awt.EventQueue();
    java.awt.AWTEvent var24 = var22.peekEvent(10);
    java.awt.EventQueue var25 = new java.awt.EventQueue();
    java.awt.AWTEvent var27 = var25.peekEvent(10);
    var22.push(var25);
    var18.push(var22);
    var3.push(var18);
    java.awt.AWTEvent var31 = var3.peekEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.SecondaryLoop var1 = var0.createSecondaryLoop();
    java.awt.AWTEvent var2 = var0.peekEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.AWTEvent var2 = var0.peekEvent(10);
    java.awt.AWTEvent var3 = var0.peekEvent();
    java.awt.SecondaryLoop var4 = var0.createSecondaryLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
