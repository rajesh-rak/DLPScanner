
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 1, 10, 100, 0, (-1), 100, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var3 = var2.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    java.util.Collection var2 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    java.security.PublicKey var2 = var0.getPublicKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    int var2 = var0.getBasicConstraints();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isFontSet();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var7 = var6.isMinimumSizeSet();
    var2.add((java.awt.Component)var6, (java.lang.Object)10);
    var2.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var3 = new java.util.Date(100, 1, 100);
    java.lang.String var4 = var3.toLocaleString();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isMinimumSizeSet();
    javax.swing.JRootPane var4 = var2.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.getKeymap("10 May, 2000 12:00:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isFontSet();
    java.awt.Toolkit var4 = var2.getToolkit();
    boolean var5 = var2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var1 = new java.util.Date((-1L));
    var1.setYear(1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("10 May, 2000 12:00:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isMinimumSizeSet();
    java.lang.String var4 = var2.getName();
    var2.copy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isFontSet();
    java.awt.Toolkit var4 = var2.getToolkit();
    java.awt.Dimension var5 = var2.getPreferredScrollableViewportSize();
    javax.swing.JEditorPane var9 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var10 = var9.isFontSet();
    java.awt.Toolkit var11 = var9.getToolkit();
    java.awt.Dimension var12 = var9.getPreferredScrollableViewportSize();
    var2.putClientProperty((java.lang.Object)"", (java.lang.Object)var9);
    var2.firePropertyChange("", (-1.0d), (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = javax.management.ObjectName.unquote("10 May, 2000 12:00:00 AM");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    var2.cut();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.CertificateExtensions var0 = new sun.security.x509.CertificateExtensions();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isMinimumSizeSet();
    boolean var4 = var2.isOptimizedDrawingEnabled();
    javax.swing.text.NavigationFilter var5 = var2.getNavigationFilter();
    char var6 = var2.getFocusAccelerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '\u0000');

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isFontSet();
    var2.setFocusCycleRoot(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getSubjectAlternativeNames((java.security.cert.X509Certificate)var0);
    java.util.Date var3 = new java.util.Date((-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkValidity(var3);
      fail("Expected exception of type java.security.cert.CertificateNotYetValidException");
    } catch (java.security.cert.CertificateNotYetValidException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.security.PublicKey var1 = var0.getPublicKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getSubjectAlternativeNames((java.security.cert.X509Certificate)var0);
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isFontSet();
    java.awt.Toolkit var4 = var2.getToolkit();
    java.awt.Dimension var5 = var2.getPreferredScrollableViewportSize();
    java.awt.Color var6 = var2.getSelectedTextColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isFontSet();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var7 = var6.isMinimumSizeSet();
    var2.add((java.awt.Component)var6, (java.lang.Object)10);
    java.awt.event.ComponentListener[] var10 = var2.getComponentListeners();
    boolean var11 = var2.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var3 = var2.isFontSet();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var7 = var6.isMinimumSizeSet();
    var2.add((java.awt.Component)var6, (java.lang.Object)10);
    java.awt.event.ComponentListener[] var10 = var2.getComponentListeners();
    javax.swing.JEditorPane var13 = new javax.swing.JEditorPane("hi!", "hi!");
    boolean var14 = var13.isMinimumSizeSet();
    boolean var15 = var13.isOptimizedDrawingEnabled();
    javax.swing.text.NavigationFilter var16 = var13.getNavigationFilter();
    java.awt.Component var17 = var2.add((java.awt.Component)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

}
