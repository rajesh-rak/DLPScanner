
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.UIManager.installLookAndFeel("hi!", "hi!");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    var0.invalidate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var3 = var0.getComponent(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object var2 = javax.swing.UIManager.put((java.lang.Object)1.0d, (java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    int var1 = var0.getX();
    var0.setOpaque(true);
    boolean var4 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JFrame var0 = new javax.swing.JFrame();
    int var1 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 38);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.border.Border var1 = javax.swing.UIManager.getBorder((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.Icon var1 = javax.swing.UIManager.getIcon((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    var0.setEnabled(false);
    java.beans.PropertyChangeListener[] var4 = var0.getPropertyChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    var0.invalidate();
    java.lang.String var2 = var0.toString();
    float var3 = var0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "javax.swing.JRootPane[,0,0,0var2,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=449,maximumSize=,minimumSize=,preferredSize=]"+ "'", var2.equals("javax.swing.JRootPane[,0,0,0var2,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=449,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0f);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    int var1 = var0.getX();
    var0.firePropertyChange("javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=449,maximumSize=,minimumSize=,preferredSize=]", ' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    int var1 = var0.getWindowDecorationStyle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    int var1 = var0.countComponents();
    boolean var2 = var0.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JFrame var0 = new javax.swing.JFrame();
    boolean var1 = var0.isFocusCycleRoot();
    var0.setTitle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    int var1 = var0.countComponents();
    var0.setFocusTraversalKeysEnabled(true);
    var0.setDoubleBuffered(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    java.awt.Dimension var1 = var0.preferredSize();
    var0.removeNotify();
    var0.setDebugGraphicsOptions((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    var0.invalidate();
    java.lang.String var2 = var0.toString();
    var0.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "javax.swing.JRootPane[,0,0,0var2,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=449,maximumSize=,minimumSize=,preferredSize=]"+ "'", var2.equals("javax.swing.JRootPane[,0,0,0var2,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=449,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    var0.setEnabled(false);
    javax.swing.JRootPane var3 = new javax.swing.JRootPane();
    var3.setName("hi!");
    int var6 = var3.getDebugGraphicsOptions();
    javax.swing.JRootPane var7 = new javax.swing.JRootPane();
    java.awt.Dimension var8 = var7.preferredSize();
    java.awt.Dimension var9 = var3.getSize(var8);
    java.awt.Dimension var10 = var0.getSize(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    var0.setName("hi!");
    int var3 = var0.getDebugGraphicsOptions();
    javax.swing.JRootPane var4 = new javax.swing.JRootPane();
    java.awt.Dimension var5 = var4.preferredSize();
    java.awt.Dimension var6 = var0.getSize(var5);
    var0.setVerifyInputWhenFocusTarget(true);
    var0.transferFocusDownCycle();
    boolean var10 = var0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JFrame var0 = new javax.swing.JFrame();
    boolean var1 = var0.isFocusCycleRoot();
    boolean var2 = var0.isResizable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JFrame var0 = new javax.swing.JFrame();
    boolean var1 = var0.isFocusCycleRoot();
    java.util.Set var3 = var0.getFocusTraversalKeys(0);
    var0.setFocusCycleRoot(false);
    java.awt.Rectangle var6 = var0.getMaximizedBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    var0.setEnabled(false);
    boolean var3 = var0.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    int var1 = var0.getX();
    var0.setOpaque(true);
    javax.swing.JRootPane var5 = new javax.swing.JRootPane();
    var5.setName("hi!");
    int var8 = var5.getDebugGraphicsOptions();
    javax.swing.JRootPane var9 = new javax.swing.JRootPane();
    java.awt.Dimension var10 = var9.preferredSize();
    java.awt.Dimension var11 = var5.getSize(var10);
    var0.putClientProperty((java.lang.Object)(short)(-1), (java.lang.Object)var11);
    boolean var13 = var0.isDoubleBuffered();
    javax.swing.InputVerifier var14 = var0.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JFrame var0 = new javax.swing.JFrame();
    boolean var1 = var0.isAutoRequestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

}
