
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.convertColumnIndexToModel(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.awt.event.InputMethodListener[] var1 = var0.getInputMethodListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    java.awt.event.MouseMotionListener[] var7 = var0.getMouseMotionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.lang.Object var1 = var0.getTreeLock();
    int var2 = var0.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.lang.Object var1 = var0.getTreeLock();
    var0.revalidate();
    var0.setCellSelectionEnabled(true);
    boolean var5 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    int var1 = var0.getRowMargin();
    int var2 = var0.getEditingColumn();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.lang.Object var1 = var0.getTreeLock();
    javax.swing.ListSelectionModel var2 = var0.getSelectionModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    java.awt.event.HierarchyBoundsListener[] var7 = var0.getHierarchyBoundsListeners();
    javax.swing.DropMode var8 = var0.getDropMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    boolean var7 = var0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.removeNotify();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    java.awt.event.HierarchyBoundsListener[] var7 = var0.getHierarchyBoundsListeners();
    javax.swing.JPopupMenu var8 = var0.getComponentPopupMenu();
    boolean var9 = var0.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    java.awt.event.HierarchyBoundsListener[] var7 = var0.getHierarchyBoundsListeners();
    boolean var8 = var0.getScrollableTracksViewportWidth();
    javax.swing.JTable var9 = new javax.swing.JTable();
    java.awt.Color var10 = var9.getSelectionForeground();
    var0.setBackground(var10);
    int[] var12 = var0.getSelectedRows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    boolean var1 = var0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    java.awt.event.HierarchyBoundsListener[] var7 = var0.getHierarchyBoundsListeners();
    boolean var8 = var0.getScrollableTracksViewportWidth();
    java.awt.Rectangle var9 = var0.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.invalidate();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.setAutoscrolls(true);
    boolean var5 = var0.isOptimizedDrawingEnabled();
    java.awt.Component.BaselineResizeBehavior var6 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.lang.Object var1 = var0.getTreeLock();
    var0.revalidate();
    var0.setAlignmentX(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    javax.accessibility.AccessibleContext var7 = var0.getAccessibleContext();
    var0.firePropertyChange("", (byte)10, (byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.invalidate();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    boolean var3 = var0.getCellSelectionEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.invalidate();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var3 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    java.awt.event.HierarchyBoundsListener[] var7 = var0.getHierarchyBoundsListeners();
    javax.swing.JPopupMenu var8 = var0.getComponentPopupMenu();
    boolean var9 = var0.isFocusOwner();
    javax.swing.ListSelectionModel var10 = var0.getSelectionModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    java.awt.event.HierarchyBoundsListener[] var7 = var0.getHierarchyBoundsListeners();
    javax.swing.JPopupMenu var8 = var0.getComponentPopupMenu();
    boolean var9 = var0.isFocusOwner();
    java.awt.Graphics var10 = var0.getGraphics();
    int var11 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    javax.swing.JTable var1 = new javax.swing.JTable();
    boolean var2 = var0.isFocusCycleRoot((java.awt.Container)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.lang.Object var1 = var0.getTreeLock();
    var0.setAutoCreateColumnsFromModel(false);
    boolean var4 = var0.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    var0.firePropertyChange("hi!", 10L, 100L);
    var0.setRequestFocusEnabled(true);
    javax.accessibility.AccessibleContext var7 = var0.getAccessibleContext();
    boolean var8 = var0.isRequestFocusEnabled();
    var0.setColumnSelectionAllowed(false);
    javax.swing.JTable.DropLocation var11 = var0.getDropLocation();
    java.awt.image.VolatileImage var14 = var0.createVolatileImage(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.lang.Object var1 = var0.getTreeLock();
    java.lang.String var2 = var0.toString();
    var0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "javax.swing.JTable[,0,0,0var2,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=255,g=255,b=255],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=9,g=80,b=208],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],showHorizontalLines=true,showVerticalLines=true]"+ "'", var2.equals("javax.swing.JTable[,0,0,0var2,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=255,g=255,b=255],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=9,g=80,b=208],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],showHorizontalLines=true,showVerticalLines=true]"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.lang.Object var1 = var0.getTreeLock();
    java.lang.String var2 = var0.toString();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "javax.swing.JTable[,0,0,0var2,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=255,g=255,b=255],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=9,g=80,b=208],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],showHorizontalLines=true,showVerticalLines=true]"+ "'", var2.equals("javax.swing.JTable[,0,0,0var2,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=255,g=255,b=255],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=9,g=80,b=208],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],showHorizontalLines=true,showVerticalLines=true]"));

  }

}
