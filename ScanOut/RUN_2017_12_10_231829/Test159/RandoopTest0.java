
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var1 = new byte[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var1, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.font.AttributeValues var0 = new sun.font.AttributeValues();
    int var1 = var0.getBidiEmbedding();
    boolean var3 = var0.anyNonDefault(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var2 = new char[] { '4', '#'};
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

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.font.AttributeValues var0 = new sun.font.AttributeValues();
    var0.setJustification(10.0f);
    var0.setTracking((-1.0f));
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "{justification=1.0*, tracking=-1.0[btx=null, ctx=null]}"+ "'", var5.equals("{justification=1.0*, tracking=-1.0[btx=null, ctx=null]}"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var3 = new char[] { '#', '#', ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var3, 1, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Font var1 = java.awt.Font.getFont("{justification=1.0*, tracking=-1.0[btx=null, ctx=null]}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.HashMap var1 = new java.util.HashMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)1, "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.font.AttributeValues var0 = new sun.font.AttributeValues();
    var0.setJustification(10.0f);
    var0.unsetDefault();
    boolean var5 = var0.anyNonDefault(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.String.valueOf('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = new java.lang.String("{justification=1.0*, tracking=-1.0[btx=null, ctx=null]}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{justification=1.0*, tracking=-1.0[btx=null, ctx=null]}"+ "'", var1.equals("{justification=1.0*, tracking=-1.0[btx=null, ctx=null]}"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    float var2 = sun.font.AttributeValues.getJustification((java.util.Map)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var3 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = new java.lang.String("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    char[] var1 = new char[] { '4'};
    java.lang.String var2 = java.lang.String.valueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4"+ "'", var2.equals("4"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var5 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var6 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var5);
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("{}", "", var2, "a", (-1), var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.font.AttributeValues var0 = new sun.font.AttributeValues();
    var0.setJustification(10.0f);
    java.util.Hashtable var3 = var0.toSerializableHashtable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.font.AttributeValues var0 = new sun.font.AttributeValues();
    var0.setJustification(10.0f);
    boolean var3 = var0.getStrikethrough();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    float var2 = sun.font.AttributeValues.getJustification((java.util.Map)var0);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var0);
    java.awt.geom.AffineTransform var4 = sun.font.AttributeValues.getCharTransform((java.util.Map)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    float var2 = sun.font.AttributeValues.getJustification((java.util.Map)var0);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Enumeration var4 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.font.AttributeValues var0 = new sun.font.AttributeValues();
    var0.setJustification(10.0f);
    var0.unsetDefault();
    boolean var5 = var0.anyNonDefault(100);
    var0.setLigatures(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    float var2 = sun.font.AttributeValues.getJustification((java.util.Map)var0);
    sun.font.AttributeValues var3 = new sun.font.AttributeValues();
    var3.setJustification(10.0f);
    var3.setTracking((-1.0f));
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)(byte)10);
    boolean var10 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var1 = java.util.logging.Logger.getGlobal();
    var0.setParent(var1);
    java.util.Hashtable var5 = new java.util.Hashtable();
    java.lang.String var6 = var5.toString();
    float var7 = sun.font.AttributeValues.getJustification((java.util.Map)var5);
    sun.font.AttributeValues var8 = new sun.font.AttributeValues();
    var8.setJustification(10.0f);
    var8.setTracking((-1.0f));
    java.lang.Object var14 = var5.put((java.lang.Object)var8, (java.lang.Object)(byte)10);
    float var15 = sun.font.AttributeValues.getJustification((java.util.Map)var5);
    var1.exiting("a", "a", (java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0f);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.font.AttributeValues var0 = new sun.font.AttributeValues();
    var0.setJustification(10.0f);
    var0.unsetDefault();
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{[btx=null, ctx=null]}"+ "'", var4.equals("{[btx=null, ctx=null]}"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    float var2 = sun.font.AttributeValues.getJustification((java.util.Map)var0);
    sun.font.AttributeValues var3 = new sun.font.AttributeValues();
    var3.setJustification(10.0f);
    var3.setTracking((-1.0f));
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)(byte)10);
    var0.clear();
    java.util.Hashtable var11 = new java.util.Hashtable();
    java.lang.String var12 = var11.toString();
    float var13 = sun.font.AttributeValues.getJustification((java.util.Map)var11);
    java.util.Hashtable var14 = new java.util.Hashtable((java.util.Map)var11);
    java.lang.Object var15 = var0.get((java.lang.Object)var14);
    boolean var16 = sun.font.AttributeValues.is16Hashtable(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    float var2 = sun.font.AttributeValues.getJustification((java.util.Map)var0);
    sun.font.AttributeValues var3 = new sun.font.AttributeValues();
    var3.setJustification(10.0f);
    var3.setTracking((-1.0f));
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)(byte)10);
    boolean var10 = var3.getStrikethrough();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    float var2 = sun.font.AttributeValues.getJustification((java.util.Map)var0);
    sun.font.AttributeValues var3 = new sun.font.AttributeValues();
    var3.setJustification(10.0f);
    var3.setTracking((-1.0f));
    java.lang.Object var9 = var0.put((java.lang.Object)var3, (java.lang.Object)(byte)10);
    var0.clear();
    java.util.Hashtable var11 = new java.util.Hashtable();
    java.lang.String var12 = var11.toString();
    float var13 = sun.font.AttributeValues.getJustification((java.util.Map)var11);
    java.util.Hashtable var14 = new java.util.Hashtable((java.util.Map)var11);
    java.lang.Object var15 = var0.get((java.lang.Object)var14);
    java.lang.Object var18 = var14.put((java.lang.Object)"a", (java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    int var3 = var1.indexOf("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var1 = java.util.logging.Logger.getGlobal();
    var0.setParent(var1);
    var1.fine("{}");
    var1.exiting("a", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
