
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.LookAndFeel[] var0 = javax.swing.UIManager.getAuxiliaryLookAndFeels();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Font var1 = java.awt.Font.getFont("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.Timer.setLogTimers(true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.UIManager.installLookAndFeel("", "5:30:00 AM IST");

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 0, 1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean var1 = javax.swing.UIManager.getBoolean((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.font.FontFamily var1 = sun.font.FontFamily.getFamily("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    int var0 = javax.swing.DebugGraphics.flashTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 100);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.awt.im.InputMethodContext var0 = new sun.awt.im.InputMethodContext();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("5:30:00 AM IST");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JFrame var1 = new javax.swing.JFrame("5:30:00 AM IST");

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.SimpleDateFormat var0 = new java.text.SimpleDateFormat();
    var0.applyPattern("");

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance(0);
    boolean var2 = var1.isLenient();
    java.lang.String var4 = var1.format((java.lang.Object)1L);
    java.text.DateFormat var6 = java.text.DateFormat.getTimeInstance(0);
    boolean var7 = var6.isLenient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var1.format((java.lang.Object)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "5:30:00 AM IST"+ "'", var4.equals("5:30:00 AM IST"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance(0);
    boolean var2 = var1.isLenient();
    java.util.Calendar var3 = var1.getCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Font var3 = new java.awt.Font("5:30:00 AM IST", 0, 1);
    int var4 = var3.getNumGlyphs();
    java.awt.peer.FontPeer var5 = var3.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.UIManager.LookAndFeelInfo[] var0 = javax.swing.UIManager.getInstalledLookAndFeels();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Font var3 = new java.awt.Font("5:30:00 AM IST", 0, 1);
    java.util.Map var4 = var3.getAttributes();
    boolean var5 = var3.isPlain();
    int var6 = var3.getMissingGlyphCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Font var3 = new java.awt.Font("5:30:00 AM IST", 0, 1);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var6 = var3.deriveFont(0.0f);
    char[] var10 = new char[] { '4', '#', ' '};
    int var13 = var6.canDisplayUpTo(var10, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.DebugGraphics var0 = new javax.swing.DebugGraphics();
    java.awt.Graphics var5 = var0.create((-1), (-1), 10, 10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.DebugGraphics var0 = new javax.swing.DebugGraphics();
    var0.drawRoundRect(10, 1, (-1), 0, 10, 2826);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.DebugGraphics var0 = new javax.swing.DebugGraphics();
    var0.copyArea((-1), 10, 100, 0, 2826, (-1));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    boolean var0 = javax.swing.Timer.getLogTimers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Object var1 = javax.swing.UIManager.get((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.DebugGraphics var0 = new javax.swing.DebugGraphics();
    java.awt.Graphics var1 = var0.create();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    int var0 = javax.swing.DebugGraphics.flashCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.DebugGraphics var0 = new javax.swing.DebugGraphics();
    var0.fillRect(100, 0, 100, 2);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.awt.Font var1 = java.awt.Font.decode("5:30:00 AM IST");
    int var2 = var1.getMissingGlyphCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    javax.swing.DebugGraphics var0 = new javax.swing.DebugGraphics();
    var0.copyArea(0, 10, 100, 10, (-1), 0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.text.DateFormat var0 = java.text.DateFormat.getTimeInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.awt.Font var3 = new java.awt.Font("5:30:00 AM IST", 1, 2826);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    javax.swing.DebugGraphics var0 = new javax.swing.DebugGraphics();
    java.awt.Shape var1 = var0.getClip();

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    javax.swing.JPanel var0 = new javax.swing.JPanel();

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    javax.swing.DebugGraphics var0 = new javax.swing.DebugGraphics();
    var0.dispose();

  }

}
