
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    int var4 = var1.indexOf("java.lang.Throwable: ", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    java.lang.StringBuffer var6 = var4.deleteCharAt(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var6.codePointAt((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, (-1), (-1), "-1");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Throwable var2 = new java.lang.Throwable("");
    java.lang.String var3 = var2.toString();
    java.lang.Throwable var4 = new java.lang.Throwable("a", var2);
    java.lang.String var5 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable: "+ "'", var3.equals("java.lang.Throwable: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.lang.Throwable: a"+ "'", var5.equals("java.lang.Throwable: a"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var1 = new byte[] { (byte)0};
    java.lang.String var3 = new java.lang.String(var1, 10);
    java.lang.String var4 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u0A00"+ "'", var3.equals("\u0A00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u0000"+ "'", var4.equals("\u0000"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.reflect.AccessibleObject[] var2 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var2, false);
    java.lang.String var5 = java.lang.String.format("-1", (java.lang.Object[])var2);
    java.lang.String var6 = java.lang.String.format(" ", (java.lang.Object[])var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-1"+ "'", var5.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " "+ "'", var6.equals(" "));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.String.valueOf(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100.0"+ "'", var1.equals("100.0"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    java.lang.StringBuffer var6 = var4.deleteCharAt(1);
    java.lang.StringBuffer var8 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var11 = var8.append(var10);
    java.lang.StringBuffer var13 = var11.deleteCharAt(1);
    java.lang.StringBuffer var14 = var6.append(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var17 = var11.insert((-1), true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = var1.append((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    char[] var6 = new char[] { '4'};
    java.lang.String var7 = new java.lang.String(var6);
    java.lang.String var8 = java.lang.String.copyValueOf(var6);
    java.lang.StringBuffer var9 = var1.append(var6);
    java.lang.StringBuffer var11 = var1.append(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "4"+ "'", var7.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "4"+ "'", var8.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Throwable var1 = new java.lang.Throwable("100.0");

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    char[] var6 = new char[] { '4'};
    java.lang.String var7 = new java.lang.String(var6);
    java.lang.String var8 = java.lang.String.copyValueOf(var6);
    java.lang.StringBuffer var9 = var1.append(var6);
    int var10 = var9.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "4"+ "'", var7.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "4"+ "'", var8.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 17);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    java.lang.StringBuffer var6 = var4.deleteCharAt(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var6.codePointAt(3);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    char[] var2 = new char[] { 'a', ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, (-1), 3);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    java.lang.StringBuffer var6 = var4.deleteCharAt(1);
    java.lang.StringBuffer var8 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var11 = var8.append(var10);
    java.lang.StringBuffer var13 = var11.deleteCharAt(1);
    java.lang.StringBuffer var14 = var6.append(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.setCharAt(10, ' ');
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var1 = new byte[] { (byte)0};
    java.lang.String var3 = new java.lang.String(var1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var1, 17, 17, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u0A00"+ "'", var3.equals("\u0A00"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    char[] var6 = new char[] { '4'};
    java.lang.String var7 = new java.lang.String(var6);
    java.lang.String var8 = java.lang.String.copyValueOf(var6);
    java.lang.StringBuffer var9 = var1.append(var6);
    int var10 = var9.length();
    java.lang.String var11 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "4"+ "'", var7.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "4"+ "'", var8.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "444"+ "'", var11.equals("444"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.reflect.ReflectionFactory var0 = sun.reflect.ReflectionFactory.getReflectionFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    java.lang.String var5 = var1.toString();
    java.lang.StringBuffer var7 = var1.append((java.lang.CharSequence)" ");
    char var9 = var1.charAt(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "44"+ "'", var5.equals("44"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '4');

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    java.lang.String var5 = var1.toString();
    java.lang.StringBuffer var7 = var1.append((java.lang.CharSequence)" ");
    char[] var12 = new char[] { ' ', '4', '4'};
    java.lang.StringBuffer var13 = var1.insert(3, var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var16 = new java.lang.String(var12, 10, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "44"+ "'", var5.equals("44"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Throwable var1 = new java.lang.Throwable("");
    java.lang.Throwable var2 = new java.lang.Throwable(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var1 = java.lang.String.valueOf(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "17"+ "'", var1.equals("17"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    int var7 = var4.indexOf("4", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    char[] var6 = new char[] { '4'};
    java.lang.String var7 = new java.lang.String(var6);
    java.lang.String var8 = java.lang.String.copyValueOf(var6);
    java.lang.StringBuffer var9 = var1.append(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char var11 = var9.charAt(17);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "4"+ "'", var7.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "4"+ "'", var8.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    java.lang.String var5 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var1.codePointBefore(10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "44"+ "'", var5.equals("44"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var3 = new java.lang.StringBuffer("4");
    java.lang.StringBuffer var4 = var1.append(var3);
    char[] var6 = new char[] { '4'};
    java.lang.String var7 = new java.lang.String(var6);
    java.lang.String var8 = java.lang.String.copyValueOf(var6);
    java.lang.StringBuffer var9 = var1.append(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var1.codePointBefore(10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "4"+ "'", var7.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "4"+ "'", var8.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
