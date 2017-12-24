
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


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    javax.swing.plaf.ComponentUI var5 = javax.swing.plaf.basic.BasicListUI.createUI((javax.swing.JComponent)var0);
    javax.swing.JRootPane var6 = javax.swing.SwingUtilities.getRootPane((java.awt.Component)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    javax.swing.plaf.ComponentUI var5 = javax.swing.plaf.basic.BasicListUI.createUI((javax.swing.JComponent)var0);
    var0.grabFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    java.awt.event.InputMethodListener[] var5 = var0.getInputMethodListeners();
    int var6 = var0.getFixedCellWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    javax.swing.JList var3 = new javax.swing.JList();
    var3.setDragEnabled(true);
    java.awt.LayoutManager var6 = var3.getLayout();
    var3.hide();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var3, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JList var0 = new javax.swing.JList();
    int var3 = var0.getBaseline(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 13);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    javax.swing.ListModel var5 = var0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    var0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    var0.requestFocus();
    var0.setLayoutOrientation(0);
    int var6 = var0.getFixedCellWidth();
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.firePropertyChange("", (short)(-1), (short)1);
    var0.move(1, 10);
    int[] var8 = var0.getSelectedIndices();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.setDragEnabled(true);
    boolean var3 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    java.awt.event.InputMethodListener[] var5 = var0.getInputMethodListeners();
    int var6 = var0.getDebugGraphicsOptions();
    var0.setLayoutOrientation(1);
    var0.repaint(100L, 100, 10, 13, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    var0.requestFocus();
    int var4 = var0.getFixedCellHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JList var1 = new javax.swing.JList();
    java.awt.Point var3 = var1.getMousePosition(true);
    boolean var5 = var1.requestFocus(false);
    java.awt.event.InputMethodListener[] var6 = var1.getInputMethodListeners();
    int var7 = var1.getDebugGraphicsOptions();
    java.awt.Graphics var8 = var1.getGraphics();
    java.awt.Container var9 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var1);
    var1.setAlignmentY(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.setDragEnabled(true);
    java.awt.LayoutManager var3 = var0.getLayout();
    var0.hide();
    java.awt.Image var7 = var0.createImage((-1), 1);
    boolean var9 = var0.isSelectedIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    var0.requestFocus();
    java.awt.Dimension var4 = var0.getMaximumSize();
    var0.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    java.awt.event.InputMethodListener[] var5 = var0.getInputMethodListeners();
    boolean var6 = var0.isSelectionEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    var0.requestFocus();
    var0.setLayoutOrientation(0);
    java.lang.Object var6 = var0.getPrototypeCellValue();
    java.awt.Component var7 = javax.swing.SwingUtilities.findFocusOwner((java.awt.Component)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.firePropertyChange("", (short)(-1), (short)1);
    boolean var5 = var0.isPaintingTile();
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.swing.JList[,0,0,0var6,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=9,g=80,b=208],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"+ "'", var6.equals("javax.swing.JList[,0,0,0var6,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=9,g=80,b=208],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    var0.requestFocus();
    var0.setLayoutOrientation(0);
    int var6 = var0.getFixedCellWidth();
    javax.swing.JRootPane var7 = var0.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    java.awt.event.InputMethodListener[] var5 = var0.getInputMethodListeners();
    int var6 = var0.getDebugGraphicsOptions();
    float var7 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5f);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    java.awt.event.InputMethodListener[] var5 = var0.getInputMethodListeners();
    int var6 = var0.getDebugGraphicsOptions();
    javax.swing.JRootPane var7 = var0.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.firePropertyChange("", (short)(-1), (short)1);
    boolean var5 = var0.isPaintingTile();
    java.awt.event.ComponentListener[] var6 = var0.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    java.awt.event.InputMethodListener[] var5 = var0.getInputMethodListeners();
    int var6 = var0.getDebugGraphicsOptions();
    var0.setLayoutOrientation(1);
    var0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.accessibility.AccessibleStateSet var1 = javax.swing.SwingUtilities.getAccessibleStateSet((java.awt.Component)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JList var0 = new javax.swing.JList();
    java.awt.Point var2 = var0.getMousePosition(true);
    boolean var4 = var0.requestFocus(false);
    java.awt.event.InputMethodListener[] var5 = var0.getInputMethodListeners();
    int var6 = var0.getDebugGraphicsOptions();
    javax.swing.JList var7 = new javax.swing.JList();
    var7.setDragEnabled(true);
    javax.swing.ActionMap var10 = javax.swing.SwingUtilities.getUIActionMap((javax.swing.JComponent)var7);
    var0.setActionMap(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

}
