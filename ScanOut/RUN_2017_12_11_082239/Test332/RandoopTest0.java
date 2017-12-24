
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var2 = new sun.font.Type1Font("hi!", (java.lang.Object)10L);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var3 = new sun.font.Type1Font("", (java.lang.Object)true, true);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.NativeFont var2 = new sun.font.NativeFont("hi!", false);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var3 = new sun.font.Type1Font("hi!", (java.lang.Object)(short)10, false);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Font var1 = java.awt.Font.decode("Dialog");
    boolean var2 = var1.isPlain();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Font var1 = java.awt.Font.getFont("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    java.lang.String var2 = var1.getFamily();
    byte var4 = var1.getBaselineFor('a');
    java.awt.Font var7 = var1.deriveFont((-1), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Font var1 = java.awt.Font.decode("Dialog");
    int var3 = var1.canDisplayUpTo("Dialog");
    boolean var4 = var1.isBold();
    java.awt.Font var7 = var1.deriveFont(2826, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.NativeFont var2 = new sun.font.NativeFont("Dialog", true);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Font var3 = new java.awt.Font("hi!", (-1), (-1));
    float var4 = var3.getItalicAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0f);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    boolean var2 = var1.isPlain();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Font var1 = java.awt.Font.decode("Dialog");
    int var3 = var1.canDisplayUpTo("Dialog");
    java.awt.peer.FontPeer var4 = var1.getPeer();
    java.awt.peer.FontPeer var5 = var1.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    int var2 = var1.getNumGlyphs();
    java.lang.String var3 = var1.getFamily();
    boolean var4 = var1.isBold();
    boolean var5 = var1.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Dialog"+ "'", var3.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    java.lang.String var2 = var1.getFamily();
    java.awt.Font var4 = var1.deriveFont(1.0f);
    java.awt.Font var6 = java.awt.Font.decode("hi!");
    java.lang.String var7 = var6.getFamily();
    boolean var8 = var1.equals((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Dialog"+ "'", var7.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    int var2 = var1.getNumGlyphs();
    java.lang.String var3 = var1.getFamily();
    boolean var4 = var1.hasLayoutAttributes();
    boolean var5 = var1.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Dialog"+ "'", var3.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    int var2 = var1.getNumGlyphs();
    java.lang.String var3 = var1.getFamily();
    boolean var4 = var1.isBold();
    float var5 = var1.getItalicAngle();
    java.lang.String var6 = var1.getName();
    float var7 = var1.getItalicAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Dialog"+ "'", var3.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0f);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Font var1 = java.awt.Font.decode("Dialog");
    int var3 = var1.canDisplayUpTo("Dialog");
    boolean var4 = var1.isBold();
    java.awt.Font var6 = var1.deriveFont((-1));
    java.lang.String var7 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "java.awt.Font[family=Dialog,name=Dialog,style=plain,size=12]"+ "'", var7.equals("java.awt.Font[family=Dialog,name=Dialog,style=plain,size=12]"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Font var3 = new java.awt.Font("hi!", 2826, 2826);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    java.lang.String var2 = var1.getFamily();
    java.awt.Font var4 = var1.deriveFont(1.0f);
    java.lang.String var5 = var1.getName();
    java.awt.Font var7 = java.awt.Font.decode("Dialog");
    char[] var10 = new char[] { 'a', '#'};
    int var13 = var7.canDisplayUpTo(var10, 0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var16 = var1.canDisplayUpTo(var10, (-1), 2826);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Font var1 = java.awt.Font.decode("Dialog");
    char[] var4 = new char[] { 'a', '#'};
    int var7 = var1.canDisplayUpTo(var4, 0, (-1));
    boolean var8 = var1.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    java.lang.String var2 = var1.getFamily();
    java.awt.Font var4 = var1.deriveFont(1.0f);
    boolean var5 = var1.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Font var2 = java.awt.Font.decode("Dialog");
    int var4 = var2.canDisplayUpTo("Dialog");
    boolean var5 = var2.isBold();
    java.awt.Font var7 = var2.deriveFont((-1));
    boolean var8 = var7.isTransformed();
    java.awt.Font var9 = java.awt.Font.getFont("hi!", var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Font var1 = java.awt.Font.getFont("java.awt.Font[family=Dialog,name=Dialog,style=plain,size=12]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Font var1 = java.awt.Font.decode("Dialog");
    int var3 = var1.canDisplayUpTo("Dialog");
    boolean var4 = var1.isBold();
    java.awt.Font var6 = var1.deriveFont((-1));
    boolean var8 = var6.equals((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    java.lang.String var2 = var1.getFamily();
    java.awt.Font var4 = var1.deriveFont(1.0f);
    boolean var5 = var4.isTransformed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Font var2 = java.awt.Font.decode("Dialog");
    int var4 = var2.canDisplayUpTo("Dialog");
    java.awt.peer.FontPeer var5 = var2.getPeer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.font.Type1Font var7 = new sun.font.Type1Font("hi!", (java.lang.Object)var2, true);
      fail("Expected exception of type java.awt.FontFormatException");
    } catch (java.awt.FontFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Font var1 = java.awt.Font.decode("Dialog");
    char[] var4 = new char[] { 'a', '#'};
    int var7 = var1.canDisplayUpTo(var4, 0, (-1));
    java.awt.Font var9 = var1.deriveFont(2826);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    java.lang.String var2 = var1.getFamily();
    java.awt.Font var4 = var1.deriveFont(1.0f);
    java.text.AttributedCharacterIterator.Attribute[] var5 = var4.getAvailableAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Font var3 = new java.awt.Font("hi!", (-1), (-1));
    boolean var5 = var3.equals((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.awt.Font var1 = java.awt.Font.decode("hi!");
    java.lang.String var2 = var1.getFamily();
    java.awt.Font var4 = var1.deriveFont(1.0f);
    java.lang.String var5 = var1.getName();
    int var6 = var1.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Dialog"+ "'", var2.equals("Dialog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 12);

  }

}
