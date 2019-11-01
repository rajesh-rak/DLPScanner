
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    var1.setEnabled(true);
    javax.swing.text.Highlighter var5 = var1.getHighlighter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.lang.String var2 = var1.toString();
    javax.swing.text.JTextComponent.DropLocation var3 = var1.getDropLocation();
    java.awt.Rectangle var4 = var1.getVisibleRect();
    boolean var5 = var1.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    java.awt.im.InputMethodRequests var3 = var1.getInputMethodRequests();
    boolean var4 = var1.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var4 = var1.getInputMap(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    javax.swing.JToolTip var2 = var1.createToolTip();
    int var3 = var2.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    javax.swing.JTextField var4 = new javax.swing.JTextField(1);
    var4.paste();
    var4.setSelectionStart(1);
    boolean var8 = var1.isFocusCycleRoot((java.awt.Container)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    var1.setEnabled(true);
    java.awt.Toolkit var5 = var1.getToolkit();
    int var6 = var1.getColumns();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    var1.paste();
    var1.firePropertyChange("", (byte)10, (byte)(-1));
    java.awt.Container var7 = var1.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    java.awt.im.InputMethodRequests var3 = var1.getInputMethodRequests();
    javax.swing.plaf.TextUI var4 = var1.getUI();
    var1.cut();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.lang.String var2 = var1.toString();
    javax.swing.text.JTextComponent.DropLocation var3 = var1.getDropLocation();
    java.awt.Rectangle var4 = var1.getVisibleRect();
    javax.swing.KeyStroke[] var5 = var1.getRegisteredKeyStrokes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    var1.paste();
    java.awt.Window var3 = javax.swing.SwingUtilities.windowForComponent((java.awt.Component)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    var1.paste();
    var1.firePropertyChange("", (byte)10, (byte)(-1));
    java.awt.Insets var7 = var1.insets();
    var1.firePropertyChange("", 10L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JTextField var5 = new javax.swing.JTextField(1);
    var5.paste();
    javax.swing.JTextField var8 = new javax.swing.JTextField(1);
    java.lang.String var9 = var8.toString();
    javax.swing.text.JTextComponent.DropLocation var10 = var8.getDropLocation();
    java.awt.Rectangle var11 = var8.getVisibleRect();
    var5.repaint(var11);
    java.awt.Rectangle var13 = javax.swing.SwingUtilities.computeIntersection((-1), (-1), 0, 100, var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    java.awt.Dimension var3 = var1.getSize();
    java.awt.event.ComponentListener[] var4 = var1.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    javax.swing.JTextField var4 = new javax.swing.JTextField(1);
    java.awt.Cursor var5 = var4.getCursor();
    var4.setEnabled(true);
    java.awt.Component var9 = var1.add((java.awt.Component)var4, 0);
    javax.swing.InputMap var11 = javax.swing.SwingUtilities.getUIInputMap((javax.swing.JComponent)var4, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    javax.swing.text.JTextComponent.DropLocation var2 = var1.getDropLocation();
    var1.cut();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    javax.swing.JTextField var4 = new javax.swing.JTextField(1);
    java.awt.Cursor var5 = var4.getCursor();
    var4.setEnabled(true);
    java.awt.Component var9 = var1.add((java.awt.Component)var4, 0);
    javax.swing.JTextField var11 = new javax.swing.JTextField(1);
    java.lang.String var12 = var11.toString();
    javax.swing.text.JTextComponent.DropLocation var13 = var11.getDropLocation();
    java.awt.Rectangle var14 = var11.getVisibleRect();
    var1.setBounds(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    var1.paste();
    var1.setSelectionStart(1);
    javax.swing.JTextField var6 = new javax.swing.JTextField(1);
    var6.paste();
    java.awt.Color var8 = var6.getSelectedTextColor();
    var1.setDisabledTextColor(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    var1.setEnabled(true);
    var1.copy();
    javax.swing.JTextField var7 = new javax.swing.JTextField(1);
    java.awt.Cursor var8 = var7.getCursor();
    java.awt.Dimension var9 = var7.getSize();
    javax.swing.JTextField var11 = new javax.swing.JTextField(1);
    java.awt.Cursor var12 = var11.getCursor();
    java.awt.Dimension var13 = var11.getSize();
    var7.setSize(var13);
    var1.setSize(var13);
    boolean var16 = var1.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    java.awt.Dimension var3 = var1.getSize();
    java.awt.dnd.DropTarget var4 = var1.getDropTarget();
    java.awt.event.ContainerListener[] var5 = var1.getContainerListeners();
    int var6 = var1.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(1);
    java.awt.Cursor var2 = var1.getCursor();
    javax.swing.JTextField var4 = new javax.swing.JTextField(1);
    java.awt.Cursor var5 = var4.getCursor();
    var4.setEnabled(true);
    java.awt.Component var9 = var1.add((java.awt.Component)var4, 0);
    var1.repaint(0L);
    java.awt.event.ActionListener[] var12 = var1.getActionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
