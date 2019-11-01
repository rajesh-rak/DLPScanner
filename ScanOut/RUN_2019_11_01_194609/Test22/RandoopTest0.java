
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.Component var2 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    boolean var1 = var0.isActive();
    java.awt.Component var2 = var0.getComponent();
    boolean var3 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    boolean var3 = var2.isActive();
    var2.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var6 = var2.getFlavorMap();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    var0.setDefaultActions(0);
    java.awt.dnd.DropTargetContext var4 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    int[] var6 = new int[] { 100};
    var4.setSelectedIndices(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    java.lang.Object[] var5 = var4.getSelectedValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    int[] var6 = new int[] { 100};
    var4.setSelectedIndices(var6);
    java.awt.Dimension var8 = var4.getPreferredScrollableViewportSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    int[] var6 = new int[] { 100};
    var4.setSelectedIndices(var6);
    java.lang.String var8 = var4.toString();
    javax.swing.event.ListSelectionListener[] var9 = var4.getListSelectionListeners();
    java.awt.Dimension var10 = var4.preferredSize();
    java.awt.dnd.DropTarget var12 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var13 = var12.getDropTargetContext();
    var12.setDefaultActions(0);
    java.awt.dnd.DropTargetContext var16 = var12.getDropTargetContext();
    java.awt.dnd.DropTarget var18 = new java.awt.dnd.DropTarget((java.awt.Component)var4, 100, (java.awt.dnd.DropTargetListener)var12, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"+ "'", var8.equals("javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    int[] var6 = new int[] { 100};
    var4.setSelectedIndices(var6);
    java.lang.String var8 = var4.toString();
    var4.firePropertyChange("javax.swing.JList[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]", (-1L), 100L);
    java.beans.PropertyChangeListener[] var13 = var4.getPropertyChangeListeners();
    var4.firePropertyChange("javax.swing.JList[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]", 100.0d, (-1.0d));
    var4.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"+ "'", var8.equals("javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.plaf.basic.BasicListUI var0 = new javax.swing.plaf.basic.BasicListUI();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    boolean var2 = var1.isActive();
    var1.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var5 = var1.getFlavorMap();
    boolean var6 = var1.isActive();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    boolean var8 = var7.isActive();
    var7.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var11 = var7.getFlavorMap();
    var1.setFlavorMap(var11);
    java.awt.datatransfer.FlavorMap var13 = var1.getFlavorMap();
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var15 = var14.getDropTargetContext();
    java.awt.dnd.DropTargetContext var16 = var14.getDropTargetContext();
    java.lang.Object[] var17 = new java.lang.Object[] { var14};
    javax.swing.JList var18 = new javax.swing.JList(var17);
    int[] var20 = new int[] { 100};
    var18.setSelectedIndices(var20);
    var1.setComponent((java.awt.Component)var18);
    boolean var25 = var0.contains((javax.swing.JComponent)var18, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    int[] var6 = new int[] { 100};
    var4.setSelectedIndices(var6);
    java.lang.String var8 = var4.toString();
    var4.setValueIsAdjusting(false);
    java.awt.Dimension var11 = var4.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"+ "'", var8.equals("javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    boolean var1 = var0.isActive();
    var0.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    boolean var5 = var0.isActive();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    boolean var7 = var6.isActive();
    var6.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var10 = var6.getFlavorMap();
    var0.setFlavorMap(var10);
    java.awt.datatransfer.FlavorMap var12 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var14 = var13.getDropTargetContext();
    java.awt.dnd.DropTargetContext var15 = var13.getDropTargetContext();
    java.lang.Object[] var16 = new java.lang.Object[] { var13};
    javax.swing.JList var17 = new javax.swing.JList(var16);
    int[] var19 = new int[] { 100};
    var17.setSelectedIndices(var19);
    var0.setComponent((java.awt.Component)var17);
    java.awt.Component[] var22 = var17.getComponents();
    java.awt.Font var23 = var17.getFont();
    var17.setSelectedIndex((-1));
    boolean var26 = var17.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    boolean var6 = var4.areFocusTraversalKeysSet(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    var0.setDefaultActions(0);
    int var4 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    boolean var1 = var0.isActive();
    var0.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    boolean var5 = var0.isActive();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    boolean var7 = var6.isActive();
    var6.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var10 = var6.getFlavorMap();
    var0.setFlavorMap(var10);
    java.awt.datatransfer.FlavorMap var12 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var14 = var13.getDropTargetContext();
    java.awt.dnd.DropTargetContext var15 = var13.getDropTargetContext();
    java.lang.Object[] var16 = new java.lang.Object[] { var13};
    javax.swing.JList var17 = new javax.swing.JList(var16);
    int[] var19 = new int[] { 100};
    var17.setSelectedIndices(var19);
    var0.setComponent((java.awt.Component)var17);
    int var22 = var17.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    int[] var6 = new int[] { 100};
    var4.setSelectedIndices(var6);
    java.lang.String var8 = var4.toString();
    var4.firePropertyChange("javax.swing.JList[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]", (-1L), 100L);
    java.awt.event.MouseMotionListener[] var13 = var4.getMouseMotionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"+ "'", var8.equals("javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    boolean var1 = var0.isActive();
    var0.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    boolean var5 = var0.isActive();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    boolean var7 = var6.isActive();
    var6.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var10 = var6.getFlavorMap();
    var0.setFlavorMap(var10);
    java.awt.datatransfer.FlavorMap var12 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var14 = var13.getDropTargetContext();
    java.awt.dnd.DropTargetContext var15 = var13.getDropTargetContext();
    java.lang.Object[] var16 = new java.lang.Object[] { var13};
    javax.swing.JList var17 = new javax.swing.JList(var16);
    int[] var19 = new int[] { 100};
    var17.setSelectedIndices(var19);
    var0.setComponent((java.awt.Component)var17);
    java.awt.Component[] var22 = var17.getComponents();
    java.awt.Font var23 = var17.getFont();
    var17.setSelectedIndex((-1));
    java.awt.Dimension var26 = var17.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    var4.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    int[] var6 = new int[] { 100};
    var4.setSelectedIndices(var6);
    java.lang.String var8 = var4.toString();
    var4.setValueIsAdjusting(false);
    boolean var11 = var4.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"+ "'", var8.equals("javax.swing.JList[,0,0,0var8,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=-1,fixedCellWidth=-1,horizontalScrollIncrement=-1,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],visibleRowCount=8,layoutOrientation=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JList var4 = new javax.swing.JList(var3);
    var4.setIgnoreRepaint(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
