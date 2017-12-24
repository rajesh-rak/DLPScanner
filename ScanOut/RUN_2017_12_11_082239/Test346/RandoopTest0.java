
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setDefaultActions((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    int var2 = var1.getDefaultActions();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTargetContext var4 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    int var2 = var1.getDefaultActions();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    int var6 = var5.getDefaultActions();
    var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    var1.removeDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    boolean var9 = var1.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    int var2 = var1.getDefaultActions();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    int var6 = var5.getDefaultActions();
    var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    var1.removeDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.Component var9 = var4.getComponent();
    var4.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.plaf.basic.BasicListUI var0 = new javax.swing.plaf.basic.BasicListUI();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    int var2 = var1.getDefaultActions();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    int var4 = var0.getDefaultActions();
    int var5 = var0.getDefaultActions();
    var0.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    int var2 = var1.getDefaultActions();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    int var6 = var5.getDefaultActions();
    var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    var1.removeDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.dnd.DropTargetContext var9 = var1.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Cursor var3 = var2.getCursor();
    int var4 = var2.getLeadSelectionIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    int var2 = var1.getDefaultActions();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    int var4 = var0.getDefaultActions();
    var0.setActive(false);
    boolean var7 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Cursor var3 = var2.getCursor();
    java.awt.Point var4 = var2.getLocation();
    java.awt.peer.ComponentPeer var5 = var2.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    float var13 = var2.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    java.awt.Dimension var13 = var12.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Cursor var3 = var2.getCursor();
    boolean var4 = var2.requestDefaultFocus();
    var2.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    java.beans.VetoableChangeListener[] var13 = var2.getVetoableChangeListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var14 = var2.getMousePosition();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    var2.setValueIsAdjusting(false);
    var2.paintImmediately(10, 10, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    var8.firePropertyChange("hi!", (short)100, (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    boolean var6 = var2.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    var2.setValueIsAdjusting(false);
    var2.setDebugGraphicsOptions(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    var2.firePropertyChange("", (short)1, (short)(-1));
    var2.setAlignmentY(100.0f);
    java.awt.image.VolatileImage var14 = var2.createVolatileImage(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    var2.setSelectedIndex(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    var2.firePropertyChange("", (short)1, (short)(-1));
    javax.swing.JRootPane var10 = var2.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    boolean var13 = var12.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    java.beans.VetoableChangeListener[] var13 = var2.getVetoableChangeListeners();
    java.lang.String var14 = var2.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "ListUI"+ "'", var14.equals("ListUI"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    java.beans.VetoableChangeListener[] var13 = var2.getVetoableChangeListeners();
    var2.firePropertyChange("", 1L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ""};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.awt.Image var5 = var2.createImage(1, 10);
    java.lang.Object[] var7 = new java.lang.Object[] { ""};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    java.awt.Cursor var9 = var8.getCursor();
    java.awt.Point var10 = var8.getLocation();
    java.awt.Component var12 = var2.add((java.awt.Component)var8, (-1));
    var2.setVerifyInputWhenFocusTarget(true);
    var2.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
