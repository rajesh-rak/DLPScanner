
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    byte var5 = var3.getBaselineFor(' ');
    float var6 = var3.getItalicAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0f);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 10, 10);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var5 = new java.awt.Font(var4);
    boolean var6 = var5.hasUniformLineMetrics();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 10, 10);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var5 = java.awt.Font.getFont(var4);
    boolean var7 = var5.canDisplay(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 10, 10);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var5 = java.awt.Font.getFont(var4);
    boolean var6 = var5.isPlain();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var5 = new java.awt.Font(var4);
    int var6 = var5.getSize();
    byte var8 = var5.getBaselineFor('a');
    boolean var9 = var5.isTransformed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    boolean var5 = var3.isPlain();
    java.awt.Font var8 = var3.deriveFont((-1), 0.0f);
    boolean var9 = var8.isTransformed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 10, 10);
    java.awt.Font var6 = var3.deriveFont(1, 10.0f);
    char[] var9 = new char[] { 'a', '#'};
    int var12 = var3.canDisplayUpTo(var9, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    byte var5 = var3.getBaselineFor(' ');
    java.awt.Font var9 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var10 = var9.getAttributes();
    java.awt.Font var11 = var3.deriveFont(var10);
    boolean var12 = var3.hasUniformLineMetrics();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var5 = new java.awt.Font(var4);
    int var6 = var5.getSize();
    byte var8 = var5.getBaselineFor('a');
    java.awt.Font var12 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var13 = var12.getAttributes();
    java.awt.Font var14 = new java.awt.Font(var13);
    boolean var15 = var14.isItalic();
    boolean var16 = var5.equals((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var5 = new java.awt.Font(var4);
    int var6 = var5.getSize();
    float var7 = var5.getSize2D();
    boolean var8 = var5.hasUniformLineMetrics();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    boolean var5 = var3.isPlain();
    java.awt.Font var8 = var3.deriveFont((-1), 0.0f);
    java.awt.Font var10 = var3.deriveFont(1);
    int var11 = var10.getMissingGlyphCode();
    boolean var13 = var10.canDisplay(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Font var4 = new java.awt.Font("hi!", 10, 10);
    java.awt.Font var7 = var4.deriveFont(1, 10.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Font var8 = java.awt.Font.getFont("", var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    boolean var5 = var3.isPlain();
    java.awt.Font var8 = var3.deriveFont((-1), 0.0f);
    java.awt.Font var10 = var3.deriveFont(1);
    boolean var11 = var10.hasLayoutAttributes();
    float var12 = var10.getSize2D();
    float var13 = var10.getItalicAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0f);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    boolean var5 = var3.isPlain();
    java.awt.Font var8 = var3.deriveFont((-1), 0.0f);
    float var9 = var8.getSize2D();
    java.lang.String var10 = var8.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Dialog"+ "'", var10.equals("Dialog"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    boolean var5 = var3.isPlain();
    java.awt.Font var8 = var3.deriveFont((-1), 0.0f);
    java.awt.Font var10 = var3.deriveFont(1);
    boolean var11 = var10.hasLayoutAttributes();
    float var12 = var10.getSize2D();
    boolean var13 = var10.isPlain();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Font var3 = new java.awt.Font("", 10, 1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    boolean var5 = var3.isPlain();
    java.awt.Font var8 = var3.deriveFont((-1), 0.0f);
    boolean var10 = var3.canDisplay('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var5 = new java.awt.Font(var4);
    int var6 = var5.getSize();
    byte var8 = var5.getBaselineFor('a');
    float var9 = var5.getSize2D();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0f);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var4 = var3.getAttributes();
    java.awt.Font var5 = new java.awt.Font(var4);
    int var6 = var5.getSize();
    int var7 = var5.getStyle();
    java.awt.peer.FontPeer var8 = var5.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Font var1 = java.awt.Font.getFont("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    byte var5 = var3.getBaselineFor(' ');
    java.text.AttributedCharacterIterator.Attribute[] var6 = var3.getAvailableAttributes();
    boolean var7 = var3.isPlain();
    java.awt.peer.FontPeer var8 = var3.getPeer();
    boolean var9 = var3.hasUniformLineMetrics();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 100, 1);
    byte var5 = var3.getBaselineFor(' ');
    java.awt.Font var9 = new java.awt.Font("hi!", 100, 1);
    java.util.Map var10 = var9.getAttributes();
    java.awt.Font var11 = var3.deriveFont(var10);
    java.awt.geom.AffineTransform var12 = var11.getTransform();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 10, 10);
    java.util.Map var4 = var3.getAttributes();
    int var5 = var3.getMissingGlyphCode();
    java.text.AttributedCharacterIterator.Attribute[] var6 = var3.getAvailableAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
