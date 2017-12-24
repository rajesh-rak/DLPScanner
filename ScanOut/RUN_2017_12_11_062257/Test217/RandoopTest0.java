
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var1 = new java.util.Vector(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(1, "", 0, 0, 1, 1, 10, 10, 1, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var3 = new char[] { 'a', '4', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRelation("hi!");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = java.lang.String.valueOf(var0, 0, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var3 = new byte[] { (byte)1, (byte)100, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var3, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var1 = new java.util.Vector(100);
    int var2 = var1.size();
    java.util.Vector var4 = new java.util.Vector(100);
    boolean var5 = var1.removeAll((java.util.Collection)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.ComponentOrientation var1 = var0.getComponentOrientation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.lang.Object var2 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JEditorPane var1 = new javax.swing.JEditorPane("hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    char[] var2 = new char[] { '#', ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "hi!");
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    var1.setIgnoreRepaint(true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    java.util.List var2 = var1.getAllRelationIds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(100);
    int var2 = var1.size();
    sun.util.calendar.ZoneInfo var4 = new sun.util.calendar.ZoneInfo();
    var4.setRawOffset(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.add(1, (java.lang.Object)0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    var0.setInheritsPopupMenu(true);
    var0.transferFocus();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    var0.setInheritsPopupMenu(true);
    var0.setToolTipText("");
    boolean var7 = var0.isLightweight();
    var0.setText("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    int[] var5 = new int[] { 10, 1, 1};
    int var6 = var0.getOffsetsByWall(0L, var5);
    int[] var8 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.getOffsetsByStandard(10L, var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", false);
    java.lang.String var3 = var2.getDefaultDomain();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    var0.setInheritsPopupMenu(true);
    var0.setToolTipText("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = var0.getText(1, 10);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(100);
    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var3 = new javax.swing.JEditorPane();
    var2.remove((java.awt.Component)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insertElementAt((java.lang.Object)var3, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    java.awt.dnd.DropTarget var3 = var1.getDropTarget();
    boolean var4 = var1.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    var0.setAutoscrolls(true);
    java.awt.Container var5 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.getInheritsPopupMenu();
    java.lang.Object var2 = var0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    java.awt.dnd.DropTarget var3 = var1.getDropTarget();
    var1.selectAll();
    java.awt.event.HierarchyBoundsListener[] var5 = var1.getHierarchyBoundsListeners();
    var1.paintImmediately(1, 100, (-1), 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var12 = var1.getComponent(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    var1.setCaretPosition(0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.JEditorPane var1 = new javax.swing.JEditorPane();
    var0.remove((java.awt.Component)var1);
    java.awt.Component var5 = var0.locate(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.getKeymap("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

}
