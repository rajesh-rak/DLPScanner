
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)true, (java.lang.Object)10L);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 10);
    int var3 = var2.getListenPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(0, 100);
    java.util.Enumeration var3 = var2.elements();
    java.util.Vector var6 = new java.util.Vector(0, 100);
    java.util.Enumeration var7 = var6.elements();
    boolean var8 = var2.removeAll((java.util.Collection)var6);
    java.util.Vector var11 = new java.util.Vector(0, 100);
    boolean var12 = var2.addAll((java.util.Collection)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(1, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(1);
    java.rmi.server.RMIServerSocketFactory var2 = var1.getServerSocketFactory();
    boolean var4 = var1.equals((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    int var2 = var0.getComponentZOrder((java.awt.Component)var1);
    java.awt.GraphicsConfiguration var3 = var0.getGraphicsConfiguration();
    boolean var4 = var0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.hasFocus();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.Element var2 = var0.getParagraphElement(10);
    javax.swing.text.Element var3 = var0.getDefaultRootElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.hasFocus();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Container var3 = new java.awt.Container();
    int var4 = var2.getComponentZOrder((java.awt.Component)var3);
    var0.remove((java.awt.Component)var3);
    java.awt.Container var6 = new java.awt.Container();
    java.awt.Container var7 = new java.awt.Container();
    int var8 = var6.getComponentZOrder((java.awt.Component)var7);
    java.awt.Container var9 = new java.awt.Container();
    java.awt.Component var10 = var7.add((java.awt.Component)var9);
    var3.setComponentZOrder(var10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isShowing();
    var0.firePropertyChange("", 100.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    int var2 = var0.getComponentZOrder((java.awt.Component)var1);
    java.awt.Container var3 = new java.awt.Container();
    java.awt.Component var4 = var1.add((java.awt.Component)var3);
    java.awt.Dimension var5 = var1.getSize();
    java.awt.Container var6 = new java.awt.Container();
    java.awt.Container var7 = new java.awt.Container();
    int var8 = var6.getComponentZOrder((java.awt.Component)var7);
    java.awt.Container var9 = new java.awt.Container();
    java.awt.Component var10 = var7.add((java.awt.Component)var9);
    java.awt.Dimension var11 = var7.getSize();
    var1.setMaximumSize(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.Element var2 = var0.getParagraphElement(10);
    javax.swing.text.html.HTMLDocument var3 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.Element var5 = var3.getParagraphElement(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertAfterStart(var5, "hi!");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    boolean var2 = var1.hasFocus();
    java.awt.Container var3 = new java.awt.Container();
    java.awt.Container var4 = new java.awt.Container();
    int var5 = var3.getComponentZOrder((java.awt.Component)var4);
    var1.remove((java.awt.Component)var4);
    java.awt.Component var8 = var0.add((java.awt.Component)var4, 0);
    var8.setFocusTraversalKeysEnabled(true);
    var8.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Insets var1 = var0.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    boolean var2 = var1.hasFocus();
    java.awt.Container var3 = new java.awt.Container();
    java.awt.Container var4 = new java.awt.Container();
    int var5 = var3.getComponentZOrder((java.awt.Component)var4);
    var1.remove((java.awt.Component)var4);
    java.awt.Component var8 = var0.add((java.awt.Component)var4, 0);
    var4.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.hasFocus();
    java.awt.Container var2 = new java.awt.Container();
    boolean var3 = var0.isFocusCycleRoot(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var4 = new java.util.Vector(0, 100);
    java.util.Enumeration var5 = var4.elements();
    java.util.Vector var8 = new java.util.Vector(0, 100);
    java.util.Enumeration var9 = var8.elements();
    boolean var10 = var4.removeAll((java.util.Collection)var8);
    boolean var11 = var1.containsAll((java.util.Collection)var8);
    java.util.Enumeration var12 = var8.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    int var2 = var0.getComponentZOrder((java.awt.Component)var1);
    java.awt.Container var3 = new java.awt.Container();
    java.awt.Component var4 = var1.add((java.awt.Component)var3);
    var3.removeNotify();
    java.awt.Dimension var6 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var3 = new java.util.Vector(1);
    java.util.Hashtable var4 = new java.util.Hashtable();
    java.lang.Object var5 = var4.clone();
    int var6 = var3.lastIndexOf(var5);
    boolean var7 = var1.addAll((java.util.Collection)var3);
    java.util.Vector var10 = new java.util.Vector(0, 100);
    java.util.Enumeration var11 = var10.elements();
    java.util.Vector var14 = new java.util.Vector(0, 100);
    java.util.Enumeration var15 = var14.elements();
    boolean var16 = var10.removeAll((java.util.Collection)var14);
    java.util.Vector var19 = new java.util.Vector(0, 100);
    boolean var20 = var10.addAll((java.util.Collection)var19);
    java.lang.Object[] var21 = new java.lang.Object[] { var19};
    java.lang.Object[] var22 = var1.toArray(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(0, 100);
    java.util.ListIterator var3 = var2.listIterator();
    java.util.Vector var5 = new java.util.Vector(1);
    java.util.Vector var7 = new java.util.Vector(1);
    java.util.Hashtable var8 = new java.util.Hashtable();
    java.lang.Object var9 = var8.clone();
    int var10 = var7.lastIndexOf(var9);
    boolean var11 = var5.addAll((java.util.Collection)var7);
    int var12 = var2.indexOf((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

}
