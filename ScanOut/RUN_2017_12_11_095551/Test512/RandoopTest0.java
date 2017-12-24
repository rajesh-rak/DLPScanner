
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var5 = var3.getLogicalStyle(100);
    var0.setCharacterAttributes((-1), 1, (javax.swing.text.AttributeSet)var5, true);
    javax.swing.text.DefaultStyledDocument var9 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var11 = var9.getLogicalStyle(100);
    javax.swing.text.Style var12 = var0.addStyle("hi!", var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var0.getText(10, 1);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    int var5 = var3.indexOf((java.lang.Object)"hi!");
    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    java.lang.Object[] var8 = var3.toArray(var7);
    java.lang.Object[] var9 = var1.toArray(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insertElementAt((java.lang.Object)'a', 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var5 = var3.getLogicalStyle(100);
    var0.setCharacterAttributes((-1), 1, (javax.swing.text.AttributeSet)var5, true);
    javax.swing.text.DefaultStyledDocument var9 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var11 = var9.getLogicalStyle(100);
    javax.swing.text.Style var12 = var0.addStyle("hi!", var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.readUnlock();
      fail("Expected exception of type javax.swing.text.StateInvariantError");
    } catch (javax.swing.text.StateInvariantError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    int var5 = var3.indexOf((java.lang.Object)"hi!");
    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    java.lang.Object[] var8 = var3.toArray(var7);
    java.lang.Object[] var9 = var1.toArray(var8);
    javax.swing.text.DefaultStyledDocument var10 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var12 = var10.getLogicalStyle(100);
    var1.addElement((java.lang.Object)var12);
    int var14 = var1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)"hi!");
    java.lang.Object[] var5 = new java.lang.Object[] { (-1L)};
    java.lang.Object[] var6 = var1.toArray(var5);
    var1.addElement((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    int var5 = var3.indexOf((java.lang.Object)"hi!");
    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    java.lang.Object[] var8 = var3.toArray(var7);
    java.lang.Object[] var9 = var1.toArray(var8);
    java.util.Vector var11 = new java.util.Vector(0);
    java.util.Vector var13 = new java.util.Vector(0);
    int var15 = var13.indexOf((java.lang.Object)"hi!");
    java.lang.Object[] var17 = new java.lang.Object[] { (-1L)};
    java.lang.Object[] var18 = var13.toArray(var17);
    java.lang.Object[] var19 = var11.toArray(var18);
    var1.copyInto(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var1.subList((-1), 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    var0.setTokenThreshold((-1));
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var5 = var3.getParagraphElement(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertAfterEnd(var5, "hi!");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    var0.setPreservesUnknownTags(true);
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var4 = var3.getBidiRootElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertAfterStart(var4, "");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var2 = var0.getLogicalStyle(100);
    javax.swing.text.Position var3 = var0.getEndPosition();
    javax.swing.text.Style var5 = var0.getStyle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var5 = var3.getLogicalStyle(100);
    var0.setCharacterAttributes((-1), 1, (javax.swing.text.AttributeSet)var5, true);
    var0.setAsynchronousLoadPriority(1);
    javax.swing.text.Style var11 = var0.getLogicalStyle((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var5 = var3.getLogicalStyle(100);
    var0.setCharacterAttributes((-1), 1, (javax.swing.text.AttributeSet)var5, true);
    javax.swing.text.DefaultStyledDocument var11 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DefaultStyledDocument var14 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var16 = var14.getLogicalStyle(100);
    var11.setCharacterAttributes((-1), 1, (javax.swing.text.AttributeSet)var16, true);
    javax.swing.text.DefaultStyledDocument var20 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Style var22 = var20.getLogicalStyle(100);
    javax.swing.text.Style var23 = var11.addStyle("hi!", var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.replace((-1), 10, "hi!", (javax.swing.text.AttributeSet)var22);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    var0.setPreservesUnknownTags(true);
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var5 = var3.getParagraphElement(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertAfterEnd(var5, "[]");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.Element var2 = var0.getParagraphElement(10);
    java.net.URL var3 = var0.getBase();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)"hi!");
    java.util.Vector var5 = new java.util.Vector(0);
    javax.swing.text.html.HTMLDocument var6 = new javax.swing.text.html.HTMLDocument();
    var6.setTokenThreshold((-1));
    boolean var9 = var6.getPreservesUnknownTags();
    int var10 = var5.indexOf((java.lang.Object)var9);
    boolean var11 = var1.addAll((java.util.Collection)var5);
    java.lang.String var12 = var5.toString();
    java.util.Vector var14 = new java.util.Vector(0);
    int var16 = var14.indexOf((java.lang.Object)"hi!");
    boolean var17 = var5.removeElement((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var2 = var0.getParagraphElement(100);
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var5 = var3.getParagraphElement(100);
    java.util.Dictionary var6 = var3.getDocumentProperties();
    var0.setDocumentProperties(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.readLock();
    java.util.Dictionary var2 = var0.getDocumentProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.html.StyleSheet var1 = var0.getStyleSheet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(1, 100);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var2 = var0.getParagraphElement(100);
    java.util.Dictionary var3 = var0.getDocumentProperties();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(1, 100);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)"hi!");
    java.lang.Object[] var5 = new java.lang.Object[] { (-1L)};
    java.lang.Object[] var6 = var1.toArray(var5);
    var1.ensureCapacity(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var1.subList(0, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var1 = new java.util.Vector(0);
    javax.swing.text.html.HTMLDocument var2 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.html.StyleSheet var3 = var2.getStyleSheet();
    javax.swing.text.DefaultStyledDocument var4 = new javax.swing.text.DefaultStyledDocument((javax.swing.text.StyleContext)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElementAt((java.lang.Object)var4, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)"hi!");
    java.util.Vector var5 = new java.util.Vector(0);
    javax.swing.text.html.HTMLDocument var6 = new javax.swing.text.html.HTMLDocument();
    var6.setTokenThreshold((-1));
    boolean var9 = var6.getPreservesUnknownTags();
    int var10 = var5.indexOf((java.lang.Object)var9);
    boolean var11 = var1.addAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var5.get(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    var0.setTokenThreshold((-1));
    var0.setTokenThreshold(1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(0);
    int var3 = var1.indexOf((java.lang.Object)"hi!");
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

}
