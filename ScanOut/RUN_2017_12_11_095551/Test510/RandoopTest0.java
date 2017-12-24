
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    boolean var3 = var1.equals((java.lang.Object)0.0f);
    sun.rmi.transport.Transport var4 = var1.getInboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", (-1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(10, 1);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    boolean var3 = var1.equals((java.lang.Object)0.0f);
    int var4 = var1.getListenPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var1 = var0.getDocumentFilter();
    javax.swing.text.Element var2 = var0.getDefaultRootElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    int var2 = var1.getListenPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var1 = var0.getDocumentFilter();
    javax.swing.text.Position var2 = var0.getEndPosition();
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    var3.setAsynchronousLoadPriority((-1));
    javax.swing.text.Element var6 = var3.getDefaultRootElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElement(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.setAsynchronousLoadPriority((-1));
    javax.swing.text.Element var3 = var0.getDefaultRootElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.readUnlock();
      fail("Expected exception of type javax.swing.text.StateInvariantError");
    } catch (javax.swing.text.StateInvariantError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.setAsynchronousLoadPriority((-1));
    javax.swing.text.Position var4 = var0.createPosition(100);
    var0.readLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var1 = var0.getDocumentFilter();
    java.lang.Object var3 = var0.getProperty((java.lang.Object)"hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var0.getText(0, (-1));
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    boolean var1 = var0.getPreservesUnknownTags();
    javax.swing.text.DefaultStyledDocument var2 = new javax.swing.text.DefaultStyledDocument();
    var2.setAsynchronousLoadPriority((-1));
    javax.swing.text.Element var5 = var2.getDefaultRootElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertAfterEnd(var5, "hi!");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    boolean var3 = var1.equals((java.lang.Object)0.0f);
    java.rmi.server.RMIServerSocketFactory var4 = var1.getServerSocketFactory();
    sun.rmi.transport.Transport var5 = var1.getOutboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.setAsynchronousLoadPriority((-1));
    javax.swing.text.Position var4 = var0.createPosition(100);
    var0.remove(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.DefaultStyledDocument var1 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var2 = var1.getDocumentFilter();
    java.lang.Object var4 = var1.getProperty((java.lang.Object)"hi!");
    java.util.Dictionary var5 = var1.getDocumentProperties();
    var0.setDocumentProperties(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var1 = var0.getDocumentFilter();
    javax.swing.text.DefaultStyledDocument var4 = new javax.swing.text.DefaultStyledDocument();
    var4.setAsynchronousLoadPriority((-1));
    javax.swing.text.Element var8 = var4.getParagraphElement(0);
    javax.swing.text.Position var10 = var4.createPosition(1);
    javax.swing.text.DefaultStyledDocument var11 = new javax.swing.text.DefaultStyledDocument();
    var11.setAsynchronousLoadPriority((-1));
    javax.swing.text.Element var14 = var11.getDefaultRootElement();
    javax.swing.event.UndoableEditListener[] var15 = var11.getUndoableEditListeners();
    javax.swing.text.Style var17 = var11.getLogicalStyle((-1));
    java.awt.Color var18 = var4.getForeground((javax.swing.text.AttributeSet)var17);
    var0.setCharacterAttributes(100, 0, (javax.swing.text.AttributeSet)var17, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var1 = var0.getDocumentFilter();
    java.lang.Object var3 = var0.getProperty((java.lang.Object)"hi!");
    java.util.Dictionary var4 = var0.getDocumentProperties();
    var0.readLock();
    javax.swing.text.Element var6 = var0.getBidiRootElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.html.HTMLEditorKit.ParserCallback var2 = var0.getReader(100);
    javax.swing.text.Position var4 = var0.createPosition(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.Element var2 = var0.getElement("");
    var0.setTokenThreshold(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.setAsynchronousLoadPriority((-1));
    java.lang.Object var4 = var0.getProperty((java.lang.Object)1L);
    var0.setAsynchronousLoadPriority(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.DocumentFilter var1 = var0.getDocumentFilter();
    var0.removeStyle("");
    java.lang.Object var5 = var0.getProperty((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

}
