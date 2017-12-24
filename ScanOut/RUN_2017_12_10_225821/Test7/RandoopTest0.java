
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    java.awt.Container var5 = var2.getFocusCycleRootAncestor();
    java.awt.event.MouseWheelListener[] var6 = var2.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    var2.removeSelectionRow(10);
    javax.swing.DropMode var7 = var2.getDropMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    boolean var6 = var2.isCollapsed(10);
    var2.setSelectionInterval(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    boolean var6 = var2.isCollapsed(10);
    java.awt.event.FocusListener[] var7 = var2.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    java.awt.event.ContainerListener[] var7 = var6.getContainerListeners();
    java.lang.String var13 = var2.convertValueToText((java.lang.Object)var6, false, true, true, 100, true);
    int[] var17 = new int[] { 100, (-1), (-1)};
    var2.addSelectionRows(var17);
    javax.swing.JToolTip var19 = var2.createToolTip();
    java.awt.event.MouseWheelListener[] var20 = var19.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var13.equals("javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    boolean var6 = var2.isCollapsed(10);
    javax.swing.event.TreeExpansionListener[] var7 = var2.getTreeExpansionListeners();
    java.awt.ComponentOrientation var8 = var2.getComponentOrientation();
    var2.setRequestFocusEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    java.awt.Rectangle var5 = var2.getVisibleRect();
    java.awt.Component var8 = var2.locate((-1), (-1));
    java.awt.im.InputMethodRequests var9 = var2.getInputMethodRequests();
    var2.setVisible(false);
    java.awt.Cursor var12 = var2.getCursor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    java.awt.event.ContainerListener[] var7 = var6.getContainerListeners();
    java.lang.String var13 = var2.convertValueToText((java.lang.Object)var6, false, true, true, 100, true);
    int[] var17 = new int[] { 100, (-1), (-1)};
    var2.addSelectionRows(var17);
    javax.swing.JToolTip var19 = var2.createToolTip();
    var19.firePropertyChange("hi!", 'a', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var13.equals("javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.enableInputMethods(false);
    boolean var6 = var2.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    int var4 = var2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    java.awt.Rectangle var5 = var2.getVisibleRect();
    java.awt.Component var8 = var2.locate((-1), (-1));
    javax.swing.DropMode var9 = var2.getDropMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    java.awt.event.ContainerListener[] var7 = var6.getContainerListeners();
    java.lang.String var13 = var2.convertValueToText((java.lang.Object)var6, false, true, true, 100, true);
    boolean var14 = var6.isOpaque();
    boolean var15 = var6.getShowsRootHandles();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var13.equals("javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    java.awt.event.ContainerListener[] var7 = var6.getContainerListeners();
    java.lang.String var13 = var2.convertValueToText((java.lang.Object)var6, false, true, true, 100, true);
    boolean var14 = var2.stopEditing();
    java.awt.Dimension var15 = var2.getPreferredScrollableViewportSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var13.equals("javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    java.awt.Dimension var5 = var2.minimumSize();
    java.awt.Color var6 = var2.getForeground();
    boolean var7 = var2.getInvokesStopCellEditing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    java.awt.event.ContainerListener[] var7 = var6.getContainerListeners();
    java.lang.String var13 = var2.convertValueToText((java.lang.Object)var6, false, true, true, 100, true);
    boolean var14 = var6.isRootVisible();
    java.lang.Object[] var16 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var17 = new javax.swing.JTree(var16);
    java.awt.event.ContainerListener[] var18 = var17.getContainerListeners();
    java.lang.Object[] var20 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var21 = new javax.swing.JTree(var20);
    java.awt.event.ContainerListener[] var22 = var21.getContainerListeners();
    java.lang.String var28 = var17.convertValueToText((java.lang.Object)var21, false, true, true, 100, true);
    boolean var29 = var21.getScrollsOnExpand();
    boolean var30 = var6.isAncestorOf((java.awt.Component)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var13.equals("javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "javax.swing.JTree[,0,0,0var28,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var28.equals("javax.swing.JTree[,0,0,0var28,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    java.awt.Dimension var5 = var2.minimumSize();
    boolean var6 = var2.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    javax.swing.event.TreeExpansionListener[] var3 = var2.getTreeExpansionListeners();
    java.awt.event.MouseWheelListener[] var4 = var2.getMouseWheelListeners();
    javax.swing.plaf.TreeUI var5 = var2.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    java.awt.event.ContainerListener[] var7 = var6.getContainerListeners();
    java.lang.String var13 = var2.convertValueToText((java.lang.Object)var6, false, true, true, 100, true);
    int[] var17 = new int[] { 100, (-1), (-1)};
    var2.addSelectionRows(var17);
    javax.swing.JToolTip var19 = var2.createToolTip();
    int var20 = var2.getRowHeight();
    int var23 = var2.getRowForLocation(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var13.equals("javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    java.awt.event.ContainerListener[] var7 = var6.getContainerListeners();
    java.lang.String var13 = var2.convertValueToText((java.lang.Object)var6, false, true, true, 100, true);
    int[] var17 = new int[] { 100, (-1), (-1)};
    var2.addSelectionRows(var17);
    java.lang.Object[] var20 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var21 = new javax.swing.JTree(var20);
    java.awt.event.ContainerListener[] var22 = var21.getContainerListeners();
    java.lang.Object[] var24 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var25 = new javax.swing.JTree(var24);
    java.awt.event.ContainerListener[] var26 = var25.getContainerListeners();
    java.lang.String var32 = var21.convertValueToText((java.lang.Object)var25, false, true, true, 100, true);
    int[] var36 = new int[] { 100, (-1), (-1)};
    var21.addSelectionRows(var36);
    var2.addSelectionRows(var36);
    boolean var39 = var2.stopEditing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var13.equals("javax.swing.JTree[,0,0,0var13,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "javax.swing.JTree[,0,0,0var32,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"+ "'", var32.equals("javax.swing.JTree[,0,0,0var32,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=false,rowHeight=19,scrollsOnExpand=false,showsRootHandles=true,toggleClickCount=2,visibleRowCount=20]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var5 = var2.getFocusTraversalKeys(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    javax.swing.event.TreeExpansionListener[] var3 = var2.getTreeExpansionListeners();
    java.awt.event.MouseWheelListener[] var4 = var2.getMouseWheelListeners();
    boolean var5 = var2.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    java.awt.Dimension var5 = var2.minimumSize();
    java.awt.Color var6 = var2.getForeground();
    java.awt.Rectangle var7 = var2.bounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.event.ContainerListener[] var3 = var2.getContainerListeners();
    var2.cancelEditing();
    java.awt.Rectangle var5 = var2.getVisibleRect();
    java.lang.Object[] var7 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var8 = new javax.swing.JTree(var7);
    java.awt.event.ContainerListener[] var9 = var8.getContainerListeners();
    var8.cancelEditing();
    boolean var12 = var8.isCollapsed(10);
    javax.swing.event.TreeExpansionListener[] var13 = var8.getTreeExpansionListeners();
    java.awt.ComponentOrientation var14 = var8.getComponentOrientation();
    var2.applyComponentOrientation(var14);
    java.awt.Rectangle var17 = var2.getRowBounds((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

}
