
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    java.awt.dnd.DropTargetContext var3 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.datatransfer.FlavorMap var3 = var1.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    var0.setActive(true);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    boolean var3 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    var0.setActive(true);
    var0.setDefaultActions(10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    var0.setActive(true);
    java.awt.Component var5 = var0.getComponent();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.Component var7 = var6.getComponent();
    boolean var8 = var6.isActive();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    java.awt.datatransfer.FlavorMap var10 = var0.getFlavorMap();
    var0.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.Component var6 = var3.getComponent();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var10 = var7.getFlavorMap();
    var3.setFlavorMap(var10);
    var0.setFlavorMap(var10);
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    var13.setDefaultActions((-1));
    java.awt.dnd.DropTarget var16 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    var16.addDropTargetListener((java.awt.dnd.DropTargetListener)var17);
    java.awt.Component var19 = var16.getComponent();
    java.awt.dnd.DropTarget var20 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var21 = new java.awt.dnd.DropTarget();
    var20.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    java.awt.datatransfer.FlavorMap var23 = var20.getFlavorMap();
    var16.setFlavorMap(var23);
    var13.setFlavorMap(var23);
    var0.setFlavorMap(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Insets var2 = var1.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getTopLevelAncestor();
    int var3 = var1.getHeight();
    java.awt.Dimension var4 = var1.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    javax.swing.TransferHandler var2 = var1.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    boolean var3 = var1.isRequestFocusEnabled();
    java.awt.Component.BaselineResizeBehavior var4 = var1.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    boolean var3 = var1.hasFocus();
    java.awt.Rectangle var4 = var1.bounds();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser("hi!");
    boolean var7 = var6.isForegroundSet();
    boolean var8 = var6.hasFocus();
    java.awt.Rectangle var9 = var6.bounds();
    boolean var10 = javax.swing.SwingUtilities.isRectangleContainingRectangle(var4, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    boolean var3 = var1.hasFocus();
    javax.accessibility.AccessibleContext var4 = var1.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    boolean var3 = var1.isMultiSelectionEnabled();
    java.awt.Rectangle var4 = var1.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    java.awt.Insets var3 = var1.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    java.awt.dnd.DropTarget var3 = var1.getDropTarget();
    var1.reshape(1, 1, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    boolean var3 = var1.hasFocus();
    var1.setMultiSelectionEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    java.awt.dnd.DropTarget var3 = var1.getDropTarget();
    java.beans.PropertyChangeListener[] var5 = var1.getPropertyChangeListeners("hi!");
    java.beans.PropertyChangeListener[] var7 = var1.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    boolean var3 = var1.isMultiSelectionEnabled();
    javax.swing.JFileChooser var5 = new javax.swing.JFileChooser("hi!");
    boolean var6 = var5.isForegroundSet();
    java.awt.dnd.DropTarget var7 = var5.getDropTarget();
    boolean var8 = var1.isFocusCycleRoot((java.awt.Container)var5);
    var5.firePropertyChange("", 0.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    boolean var3 = var1.isMultiSelectionEnabled();
    java.lang.Object var4 = var1.getTreeLock();
    var1.setDragEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isForegroundSet();
    boolean var3 = var1.hasFocus();
    java.awt.GraphicsConfiguration var4 = var1.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

}
