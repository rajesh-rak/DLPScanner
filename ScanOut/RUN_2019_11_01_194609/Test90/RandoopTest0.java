
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.plaf.synth.SynthListUI var0 = new javax.swing.plaf.synth.SynthListUI();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.plaf.basic.BasicListUI var0 = new javax.swing.plaf.basic.BasicListUI();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    java.awt.LayoutManager var1 = var0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isOpaque();
    var0.setSize(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var3 = var2.getTransferHandler();
    java.awt.event.HierarchyListener[] var4 = var2.getHierarchyListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var6 = var0.add((java.awt.Component)var2, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isOpaque();
    boolean var3 = var0.isFocusCycleRoot();
    java.awt.Dimension var4 = var0.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isOpaque();
    var0.approveSelection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    boolean var3 = var0.getControlButtonsAreShown();
    java.awt.event.FocusListener[] var4 = var0.getFocusListeners();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var7 = var6.getTransferHandler();
    java.awt.event.HierarchyListener[] var8 = var6.getHierarchyListeners();
    var0.putClientProperty((java.lang.Object)(short)0, (java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.event.HierarchyListener[] var2 = var0.getHierarchyListeners();
    var0.setDragEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    boolean var3 = var0.getControlButtonsAreShown();
    java.lang.String var4 = var0.getApproveButtonToolTipText();
    var0.setToolTipText("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    boolean var3 = var0.getControlButtonsAreShown();
    java.lang.String var4 = var0.getApproveButtonToolTipText();
    var0.cancelSelection();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var7 = var6.getTransferHandler();
    boolean var8 = var6.isForegroundSet();
    boolean var9 = var6.hasFocus();
    int var10 = var0.getComponentZOrder((java.awt.Component)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    boolean var3 = var0.getControlButtonsAreShown();
    var0.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    java.awt.Dimension var3 = var0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isOpaque();
    boolean var3 = var0.isFocusCycleRoot();
    var0.setName("");
    java.awt.Color var6 = var0.getBackground();
    javax.swing.JRootPane var7 = var0.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isOpaque();
    boolean var3 = var0.isFocusCycleRoot();
    var0.setName("");
    java.awt.Color var6 = var0.getBackground();
    var0.firePropertyChange("hi!", (-1L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isForegroundSet();
    boolean var3 = var0.hasFocus();
    java.lang.String var4 = var0.getApproveButtonText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    javax.swing.JFileChooser var3 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var4 = var3.getTransferHandler();
    boolean var5 = var3.isForegroundSet();
    boolean var6 = var3.hasFocus();
    int var7 = var0.showSaveDialog((java.awt.Component)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isForegroundSet();
    boolean var3 = var0.hasFocus();
    javax.swing.InputMap var5 = var0.getInputMap(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isForegroundSet();
    boolean var3 = var0.getVerifyInputWhenFocusTarget();
    java.awt.event.HierarchyListener[] var4 = var0.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    boolean var3 = var0.getControlButtonsAreShown();
    java.awt.event.FocusListener[] var4 = var0.getFocusListeners();
    java.lang.String var5 = var0.toString();
    var0.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "javax.swing.JFileChooser[,0,0,0var5,invalid,layout=javax.swing.BoxLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=320,maximumSize=,minimumSize=,preferredSize=,approveButtonText=,currentDirectory=/Users/rajesh,dialogTitle=,dialogType=OPEN_DIALOG,fileSelectionMode=FILES_ONLY,returnValue=ERROR_OPTION,selectedFile=,useFileHiding=true]"+ "'", var5.equals("javax.swing.JFileChooser[,0,0,0var5,invalid,layout=javax.swing.BoxLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=320,maximumSize=,minimumSize=,preferredSize=,approveButtonText=,currentDirectory=/Users/rajesh,dialogTitle=,dialogType=OPEN_DIALOG,fileSelectionMode=FILES_ONLY,returnValue=ERROR_OPTION,selectedFile=,useFileHiding=true]"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    boolean var3 = var0.getControlButtonsAreShown();
    java.awt.event.FocusListener[] var4 = var0.getFocusListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDialogType(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    boolean var2 = var0.isRequestFocusEnabled();
    javax.swing.JFileChooser var3 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var4 = var3.getTransferHandler();
    java.awt.event.HierarchyListener[] var5 = var3.getHierarchyListeners();
    java.awt.Rectangle var6 = javax.swing.SwingUtilities.getLocalBounds((java.awt.Component)var3);
    var0.setBounds(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    java.awt.Point var1 = var0.getLocation();
    boolean var2 = var0.isFileHidingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.Color var2 = var0.getBackground();
    java.awt.Container var3 = var0.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.awt.event.HierarchyListener[] var2 = var0.getHierarchyListeners();
    java.awt.Rectangle var3 = javax.swing.SwingUtilities.getLocalBounds((java.awt.Component)var0);
    java.awt.im.InputContext var4 = var0.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    int var1 = javax.swing.SwingUtilities.getAccessibleIndexInParent((java.awt.Component)var0);
    var0.approveSelection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

}
