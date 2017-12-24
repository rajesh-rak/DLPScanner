
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var1 = new java.util.Vector((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("[]");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    int var4 = var2.lastIndexOf((java.lang.Object)10.0d);
    int var5 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    int var4 = var2.lastIndexOf((java.lang.Object)10.0d);
    int var6 = var2.indexOf((java.lang.Object)(-1.0d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    int var4 = var2.lastIndexOf((java.lang.Object)10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add(100, (java.lang.Object)(-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    int var7 = var2.lastIndexOf((java.lang.Object)100.0d, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)1.0d, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    int var4 = var2.lastIndexOf((java.lang.Object)10.0d);
    java.util.Vector var8 = new java.util.Vector(0, 0);
    java.lang.Object[] var9 = var8.toArray();
    java.lang.String var10 = var8.toString();
    int var13 = var8.lastIndexOf((java.lang.Object)100.0d, (-1));
    java.util.Vector var16 = new java.util.Vector(0, 0);
    java.lang.Object[] var17 = var16.toArray();
    java.lang.String var18 = var16.toString();
    int var21 = var16.lastIndexOf((java.lang.Object)100.0d, (-1));
    var8.addElement((java.lang.Object)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var23 = var2.addAll((-1), (java.util.Collection)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.util.Vector var5 = new java.util.Vector(0, 0);
    int var7 = var5.lastIndexOf((java.lang.Object)10.0d);
    int var9 = var5.indexOf((java.lang.Object)(-1.0d));
    int var10 = var2.indexOf((java.lang.Object)var9);
    int var12 = var2.indexOf((java.lang.Object)(short)10);
    var2.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(100, 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("{}");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    java.util.Vector var7 = new java.util.Vector(0, 0);
    boolean var8 = var2.containsAll((java.util.Collection)var7);
    java.util.Vector var11 = new java.util.Vector(0, 0);
    java.lang.Object[] var12 = var11.toArray();
    java.lang.String var13 = var11.toString();
    java.util.Vector var16 = new java.util.Vector(0, 0);
    boolean var17 = var11.containsAll((java.util.Collection)var16);
    boolean var18 = var2.add((java.lang.Object)var11);
    java.util.Vector var22 = new java.util.Vector(0, 0);
    java.util.Vector var25 = new java.util.Vector(0, 0);
    int var27 = var25.lastIndexOf((java.lang.Object)10.0d);
    int var29 = var25.indexOf((java.lang.Object)(-1.0d));
    int var30 = var22.indexOf((java.lang.Object)var29);
    var22.trimToSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var32 = var11.set(10, (java.lang.Object)var22);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    java.util.Vector var7 = new java.util.Vector(0, 0);
    boolean var8 = var2.containsAll((java.util.Collection)var7);
    java.util.List var11 = var2.subList(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.util.Vector var5 = new java.util.Vector(0, 0);
    java.lang.Object[] var6 = var5.toArray();
    java.util.Vector var9 = new java.util.Vector(0, 0);
    java.lang.Object[] var10 = var9.toArray();
    java.lang.Object[] var11 = var5.toArray(var10);
    java.lang.Object[] var12 = var2.toArray(var10);
    boolean var13 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    java.util.Vector var7 = new java.util.Vector(0, 0);
    boolean var8 = var2.containsAll((java.util.Collection)var7);
    java.util.Vector var11 = new java.util.Vector(0, 0);
    java.lang.Object[] var12 = var11.toArray();
    java.lang.String var13 = var11.toString();
    java.util.Vector var16 = new java.util.Vector(0, 0);
    boolean var17 = var11.containsAll((java.util.Collection)var16);
    boolean var18 = var2.add((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var2.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.util.Vector var5 = new java.util.Vector(0, 0);
    int var7 = var5.lastIndexOf((java.lang.Object)10.0d);
    int var9 = var5.indexOf((java.lang.Object)(-1.0d));
    int var10 = var2.indexOf((java.lang.Object)var9);
    int var12 = var2.indexOf((java.lang.Object)(short)10);
    java.util.Vector var16 = new java.util.Vector(0, 0);
    java.lang.Object[] var17 = var16.toArray();
    java.lang.String var18 = var16.toString();
    java.util.Vector var21 = new java.util.Vector(0, 0);
    boolean var22 = var16.containsAll((java.util.Collection)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var23 = var2.addAll(100, (java.util.Collection)var21);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.lang.Object var3 = var1.clone();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    int var7 = var2.lastIndexOf((java.lang.Object)100.0d, (-1));
    java.util.Vector var10 = new java.util.Vector(0, 0);
    java.lang.Object[] var11 = var10.toArray();
    var2.copyInto(var11);
    boolean var14 = var2.equals((java.lang.Object)100.0f);
    java.util.Vector var17 = new java.util.Vector(0, 0);
    java.lang.Object[] var18 = var17.toArray();
    java.lang.String var19 = var17.toString();
    int var22 = var17.lastIndexOf((java.lang.Object)100.0d, (-1));
    java.util.Vector var25 = new java.util.Vector(0, 0);
    java.lang.Object[] var26 = var25.toArray();
    var17.copyInto(var26);
    int var29 = var2.indexOf((java.lang.Object)var26, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("hi!");
    boolean var4 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector(0, 0);
    java.lang.Object[] var4 = var3.toArray();
    java.lang.String var5 = var3.toString();
    java.util.Vector var8 = new java.util.Vector(0, 0);
    boolean var9 = var3.containsAll((java.util.Collection)var8);
    boolean var10 = var0.retainAll((java.util.Collection)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.removeElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    java.util.Vector var7 = new java.util.Vector(0, 0);
    boolean var8 = var2.containsAll((java.util.Collection)var7);
    java.util.Vector var11 = new java.util.Vector(0, 0);
    java.lang.Object[] var12 = var11.toArray();
    java.lang.String var13 = var11.toString();
    java.util.Vector var16 = new java.util.Vector(0, 0);
    boolean var17 = var11.containsAll((java.util.Collection)var16);
    boolean var18 = var2.add((java.lang.Object)var11);
    java.util.Hashtable var20 = new java.util.Hashtable(0);
    java.lang.String var21 = var20.toString();
    var2.insertElementAt((java.lang.Object)var20, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "{}"+ "'", var21.equals("{}"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    int var4 = var2.lastIndexOf((java.lang.Object)10.0d);
    java.util.Enumeration var5 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

}
