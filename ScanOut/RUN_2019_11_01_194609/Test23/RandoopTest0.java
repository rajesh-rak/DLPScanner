
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.plaf.basic.BasicTableUI var0 = new javax.swing.plaf.basic.BasicTableUI();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    java.awt.Component var3 = var2.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.validate();
    java.awt.Rectangle var7 = var2.getCellRect(0, 10, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addRowSelectionInterval(10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.createDefaultColumnsFromModel();
    java.awt.Dimension var4 = var2.size();
    boolean var5 = var2.isBackgroundSet();
    var2.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    javax.swing.plaf.TableUI var3 = var2.getUI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var2.convertColumnIndexToModel(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    boolean var3 = var2.getCellSelectionEnabled();
    javax.swing.JTable var6 = new javax.swing.JTable(1, 1);
    var6.validate();
    java.awt.Rectangle var11 = var6.getCellRect(0, 10, false);
    var2.paintImmediately(var11);
    javax.swing.JTable var15 = new javax.swing.JTable(1, 1);
    var15.validate();
    java.awt.Rectangle var20 = var15.getCellRect(0, 10, false);
    var2.scrollRectToVisible(var20);
    var2.setVerifyInputWhenFocusTarget(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    boolean var3 = var2.getCellSelectionEnabled();
    javax.swing.JTable var6 = new javax.swing.JTable(1, 1);
    var6.validate();
    java.awt.Rectangle var11 = var6.getCellRect(0, 10, false);
    var2.paintImmediately(var11);
    java.awt.event.HierarchyListener[] var13 = var2.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.createDefaultColumnsFromModel();
    java.awt.Dimension var4 = var2.size();
    boolean var5 = var2.isBackgroundSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setColumnSelectionInterval(0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    boolean var3 = var2.getCellSelectionEnabled();
    javax.swing.JTable var6 = new javax.swing.JTable(1, 1);
    var6.validate();
    java.awt.Rectangle var11 = var6.getCellRect(0, 10, false);
    var2.paintImmediately(var11);
    javax.swing.JTable var15 = new javax.swing.JTable(1, 1);
    var15.validate();
    java.awt.Rectangle var20 = var15.getCellRect(0, 10, false);
    var2.scrollRectToVisible(var20);
    var2.resize((-1), 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var25 = var2.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.validate();
    var2.revalidate();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    java.awt.Component var3 = var2.getEditorComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    boolean var3 = var2.getCellSelectionEnabled();
    javax.swing.JTable var6 = new javax.swing.JTable(1, 1);
    var6.validate();
    java.awt.Rectangle var11 = var6.getCellRect(0, 10, false);
    var2.paintImmediately(var11);
    javax.swing.JTable var15 = new javax.swing.JTable(1, 1);
    var15.validate();
    java.awt.Rectangle var20 = var15.getCellRect(0, 10, false);
    var2.scrollRectToVisible(var20);
    var2.resize((-1), 10);
    int var25 = var2.getSelectedRow();
    javax.swing.JPopupMenu var26 = var2.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.validate();
    boolean var5 = var2.requestFocus(false);
    var2.setFocusable(true);
    int var8 = var2.getX();
    java.lang.String var9 = var2.toString();
    var2.paintImmediately(0, 10, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "javax.swing.JTable[,0,0,0var9,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=255,g=255,b=255],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],showHorizontalLines=true,showVerticalLines=true]"+ "'", var9.equals("javax.swing.JTable[,0,0,0var9,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=255,g=255,b=255],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=7,g=73,b=217],selectionForeground=com.apple.laf.AquaImageFactory$SystemColorProxy[r=255,g=255,b=255],showHorizontalLines=true,showVerticalLines=true]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.validate();
    boolean var5 = var2.requestFocus(false);
    var2.setFocusable(true);
    var2.revalidate();
    boolean var9 = var2.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    java.awt.Component[] var3 = var2.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    boolean var3 = var2.getCellSelectionEnabled();
    javax.swing.JTable var6 = new javax.swing.JTable(1, 1);
    var6.validate();
    boolean var9 = var6.requestFocus(false);
    var6.setFocusable(true);
    var6.revalidate();
    java.lang.Object var13 = var2.getClientProperty((java.lang.Object)var6);
    var2.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.validate();
    boolean var5 = var2.requestFocus(false);
    var2.setFocusable(true);
    int var8 = var2.getX();
    javax.swing.JTable var11 = new javax.swing.JTable(1, 1);
    boolean var12 = var11.getCellSelectionEnabled();
    javax.swing.JTable var15 = new javax.swing.JTable(1, 1);
    var15.validate();
    java.awt.Rectangle var20 = var15.getCellRect(0, 10, false);
    var11.paintImmediately(var20);
    var2.computeVisibleRect(var20);
    var2.transferFocusUpCycle();
    javax.swing.JTable var26 = new javax.swing.JTable(1, 1);
    var26.createDefaultColumnsFromModel();
    java.awt.Dimension var28 = var26.size();
    var2.setPreferredScrollableViewportSize(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.createDefaultColumnsFromModel();
    javax.swing.JTable var6 = new javax.swing.JTable(1, 1);
    var6.createDefaultColumnsFromModel();
    java.awt.Dimension var8 = var6.size();
    var2.setIntercellSpacing(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.validate();
    java.awt.Rectangle var7 = var2.getCellRect(0, 10, false);
    boolean var8 = var2.getAutoscrolls();
    var2.list();
    boolean var12 = var2.editCellAt(0, 100);
    javax.swing.JTable var15 = new javax.swing.JTable(1, 1);
    boolean var16 = var15.getCellSelectionEnabled();
    javax.swing.JTable var19 = new javax.swing.JTable(1, 1);
    var19.validate();
    java.awt.Rectangle var24 = var19.getCellRect(0, 10, false);
    var15.paintImmediately(var24);
    javax.swing.JTable var28 = new javax.swing.JTable(1, 1);
    var28.validate();
    java.awt.Rectangle var33 = var28.getCellRect(0, 10, false);
    var15.scrollRectToVisible(var33);
    var2.scrollRectToVisible(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    boolean var3 = var2.getCellSelectionEnabled();
    boolean var4 = var2.isDisplayable();
    javax.swing.JTable var7 = new javax.swing.JTable(1, 1);
    var7.createDefaultColumnsFromModel();
    java.awt.Dimension var9 = var7.size();
    var2.resize(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.validate();
    boolean var5 = var2.requestFocus(false);
    var2.setFocusable(true);
    var2.revalidate();
    java.awt.Rectangle var9 = var2.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JTable var0 = new javax.swing.JTable();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    var2.createDefaultColumnsFromModel();
    int var5 = var2.convertRowIndexToModel(10);
    var2.resize((-1), (-1));
    boolean var9 = var2.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JTable var2 = new javax.swing.JTable(1, 1);
    javax.swing.plaf.TableUI var3 = var2.getUI();
    var2.setAutoCreateRowSorter(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
