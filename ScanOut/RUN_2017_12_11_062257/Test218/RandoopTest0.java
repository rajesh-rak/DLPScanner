
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "", "hi!");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var6 = java.util.Date.UTC((-1), 10, 100, 1, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2205696000000L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    var2.replaceSelection("hi!");

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    javax.swing.Action[] var4 = var2.getActions();
    javax.swing.text.JTextComponent.DropLocation var5 = var2.getDropLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    int var4 = var2.getSelectionEnd();
    javax.swing.JEditorPane var7 = new javax.swing.JEditorPane("", "");
    char var8 = var7.getFocusAccelerator();
    boolean var9 = var7.isDisplayable();
    var2.add((java.awt.Component)var7, (java.lang.Object)"hi!", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era[] var1 = var0.getEras();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.readLock();
    javax.swing.text.Style var3 = var0.getLogicalStyle(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    javax.swing.InputVerifier var4 = var2.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.readLock();
    int var2 = var0.getAsynchronousLoadPriority();
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    var3.readLock();
    java.util.Dictionary var5 = var3.getDocumentProperties();
    var0.setDocumentProperties(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    var2.setSelectionStart(100);
    var2.firePropertyChange("hi!", (byte)10, (byte)10);
    java.awt.Cursor var10 = var2.getCursor();
    javax.swing.event.AncestorListener[] var11 = var2.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    var2.transferFocusUpCycle();
    var2.grabFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = new javax.management.ObjectName("", "", "");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    int var3 = var2.getWidth();
    java.lang.String var4 = var2.getToolTipText();
    var2.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    var2.firePropertyChange("", 1, 10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    int var4 = var2.getSelectionEnd();
    java.awt.Dimension var5 = var2.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    int var4 = var2.getSelectionEnd();
    javax.swing.InputMap var5 = var2.getInputMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(10, 10);
    java.lang.Object[] var3 = var2.toArray();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane("", "");
    char var7 = var6.getFocusAccelerator();
    javax.swing.Action[] var8 = var6.getActions();
    var2.copyInto((java.lang.Object[])var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    int var4 = var2.getSelectionEnd();
    java.awt.Component var7 = var2.locate(1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    int var3 = var2.getWidth();
    java.lang.String var4 = var2.getToolTipText();
    var2.copy();
    java.beans.VetoableChangeListener[] var6 = var2.getVetoableChangeListeners();
    var2.setEditable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    int var4 = var2.lastIndexOf((java.lang.Object)(short)1);
    java.util.Vector var8 = new java.util.Vector(10, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var2.set(0, (java.lang.Object)10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    var3.readLock();
    int var5 = var2.indexOf((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "");
    char var3 = var2.getFocusAccelerator();
    boolean var4 = var2.isDisplayable();
    java.awt.Dimension var5 = var2.size();
    javax.swing.JToolTip var6 = var2.createToolTip();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
