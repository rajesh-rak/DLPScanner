
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var3 = new sun.font.Type1Font("hi!", (java.lang.Object)10.0f, false);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Font var1 = java.awt.Font.getFont("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var2 = new sun.font.Type1Font("", (java.lang.Object)1.0d);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Font var2 = java.awt.Font.decode("");
    java.lang.String var3 = var2.getFontName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.TrueTypeFont var6 = new sun.font.TrueTypeFont("", (java.lang.Object)var2, (-1), false);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Dialog"+ "'", var3.equals("Dialog"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Font var1 = java.awt.Font.getFont("Dialog");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Font var1 = java.awt.Font.getFont("java.awt.Font[family=Dialog,name=,style=plain,size=12]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.util.Map var2 = var1.getAttributes();
    char[] var4 = new char[] { ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var1.canDisplayUpTo(var4, (-1), 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.lang.String var2 = var1.getFontName();
    int var3 = var1.getNumGlyphs();
    boolean var5 = var1.canDisplay(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.lang.String var2 = var1.getFontName();
    int var3 = var1.getNumGlyphs();
    char[] var4 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var1.canDisplayUpTo(var4, (-1), 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var3 = new sun.font.Type1Font("Dialog", (java.lang.Object)'4', true);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.util.Map var2 = var1.getAttributes();
    boolean var3 = var1.hasUniformLineMetrics();
    java.awt.Font var6 = var1.deriveFont(10, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var2 = new sun.font.Type1Font("Dialog", (java.lang.Object)'a');
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Font var2 = java.awt.Font.decode("");
    java.util.Map var3 = var2.getAttributes();
    java.lang.String var4 = var2.toString();
    java.awt.Font var5 = java.awt.Font.getFont("Dialog", var2);
    boolean var6 = var2.isTransformed();
    java.lang.String var7 = var2.getFontName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Font[family=Dialog,name=,style=plain,size=12]"+ "'", var4.equals("java.awt.Font[family=Dialog,name=,style=plain,size=12]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Dialog"+ "'", var7.equals("Dialog"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.util.Map var2 = var1.getAttributes();
    java.awt.Font var3 = java.awt.Font.getFont(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.util.Map var2 = var1.getAttributes();
    boolean var3 = var1.hasUniformLineMetrics();
    boolean var4 = var1.hasLayoutAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.util.Map var2 = var1.getAttributes();
    boolean var3 = var1.hasUniformLineMetrics();
    java.lang.String var4 = var1.getFamily();
    boolean var5 = var1.isTransformed();
    char[] var9 = new char[] { ' ', '#', 'a'};
    int var12 = var1.canDisplayUpTo(var9, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Dialog"+ "'", var4.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.util.Map var2 = var1.getAttributes();
    boolean var3 = var1.hasUniformLineMetrics();
    java.lang.String var4 = var1.getFamily();
    boolean var5 = var1.isTransformed();
    boolean var6 = var1.hasUniformLineMetrics();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Dialog"+ "'", var4.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Font var2 = java.awt.Font.decode("");
    java.util.Map var3 = var2.getAttributes();
    java.lang.String var4 = var2.toString();
    java.awt.Font var5 = java.awt.Font.getFont("Dialog", var2);
    boolean var6 = var2.isTransformed();
    java.awt.Font var8 = var2.deriveFont(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Font[family=Dialog,name=,style=plain,size=12]"+ "'", var4.equals("java.awt.Font[family=Dialog,name=,style=plain,size=12]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.lang.String var2 = var1.getFontName();
    float var3 = var1.getItalicAngle();
    byte var5 = var1.getBaselineFor('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (byte)0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.lang.String var2 = var1.getFontName();
    float var3 = var1.getItalicAngle();
    float var4 = var1.getSize2D();
    boolean var5 = var1.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.util.Map var2 = var1.getAttributes();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getMissingGlyphCode();
    boolean var5 = var1.isItalic();
    java.awt.Font var8 = var1.deriveFont(0, 12.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.awt.Font[family=Dialog,name=,style=plain,size=12]"+ "'", var3.equals("java.awt.Font[family=Dialog,name=,style=plain,size=12]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.lang.String var2 = var1.getFontName();
    int var3 = var1.getNumGlyphs();
    boolean var4 = var1.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Font var3 = java.awt.Font.decode("");
    java.util.Map var4 = var3.getAttributes();
    java.lang.String var5 = var3.toString();
    java.awt.Font var6 = java.awt.Font.getFont("Dialog", var3);
    boolean var7 = var3.isTransformed();
    boolean var9 = var3.canDisplay(0);
    java.awt.Font var10 = java.awt.Font.getFont("java.awt.Font[family=Dialog,name=,style=plain,size=12]", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.awt.Font[family=Dialog,name=,style=plain,size=12]"+ "'", var5.equals("java.awt.Font[family=Dialog,name=,style=plain,size=12]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.util.Map var2 = var1.getAttributes();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getMissingGlyphCode();
    boolean var5 = var1.isItalic();
    boolean var6 = var1.hasLayoutAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.awt.Font[family=Dialog,name=,style=plain,size=12]"+ "'", var3.equals("java.awt.Font[family=Dialog,name=,style=plain,size=12]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.lang.String var2 = var1.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Object var1 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var3 = new sun.font.Type1Font("java.awt.Font[family=Dialog,name=,style=plain,size=12]", var1, true);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Font var2 = java.awt.Font.decode("");
    java.util.Map var3 = var2.getAttributes();
    java.lang.String var4 = var2.toString();
    java.awt.Font var5 = java.awt.Font.getFont("Dialog", var2);
    boolean var6 = var5.isBold();
    boolean var8 = var5.canDisplay(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Font[family=Dialog,name=,style=plain,size=12]"+ "'", var4.equals("java.awt.Font[family=Dialog,name=,style=plain,size=12]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Font var2 = java.awt.Font.decode("");
    java.util.Map var3 = var2.getAttributes();
    java.lang.String var4 = var2.toString();
    java.awt.Font var5 = java.awt.Font.getFont("Dialog", var2);
    boolean var6 = var2.isTransformed();
    java.awt.Font var8 = var2.deriveFont(100);
    java.awt.Font var10 = var2.deriveFont(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Font[family=Dialog,name=,style=plain,size=12]"+ "'", var4.equals("java.awt.Font[family=Dialog,name=,style=plain,size=12]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Font var2 = java.awt.Font.decode("");
    java.util.Map var3 = var2.getAttributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.TrueTypeFont var6 = new sun.font.TrueTypeFont("hi!", (java.lang.Object)var2, 100, true);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.awt.Font var1 = java.awt.Font.decode("");
    java.lang.String var2 = var1.getFontName();
    boolean var3 = var1.hasLayoutAttributes();
    java.lang.String var4 = var1.getPSName();
    float var5 = var1.getItalicAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Dialog"+ "'", var4.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0f);

  }

}
