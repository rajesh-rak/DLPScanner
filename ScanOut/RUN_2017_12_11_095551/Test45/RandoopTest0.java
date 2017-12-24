
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.getText((-1), 1);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    java.lang.String var3 = var2.toString();
    int var4 = var2.getPort();
    sun.rmi.transport.Channel var5 = var2.getChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[hi!:-1]"+ "'", var3.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = java.rmi.server.RemoteServer.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    java.rmi.server.RMIServerSocketFactory var3 = var2.getServerSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var2 = var0.createPosition(100);
    java.util.Enumeration var3 = var0.getStyleNames();
    javax.swing.text.Element var4 = var0.getBidiRootElement();
    javax.swing.text.Element var5 = var0.getBidiRootElement();
    javax.swing.text.Position var6 = var0.getStartPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var1 = var0.getStartPosition();
    java.util.Dictionary var2 = var0.getDocumentProperties();
    var0.readLock();
    java.awt.Window[] var4 = java.awt.Window.getWindows();
    javax.swing.text.DefaultStyledDocument var5 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var6 = var5.getStartPosition();
    java.util.Dictionary var7 = var5.getDocumentProperties();
    javax.swing.text.Style var9 = var5.getLogicalStyle((-1));
    var0.putProperty((java.lang.Object)var4, (java.lang.Object)(-1));
    var0.setAsynchronousLoadPriority(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var1 = var0.getStartPosition();
    javax.swing.text.DefaultStyledDocument var2 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var4 = var2.createPosition(100);
    java.util.Enumeration var5 = var2.getStyleNames();
    javax.swing.text.Element var6 = var2.getBidiRootElement();
    javax.swing.text.Element var7 = var2.getBidiRootElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElement(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var2 = var0.createPosition(100);
    javax.swing.text.Position var3 = var0.getEndPosition();
    javax.swing.text.DefaultStyledDocument var6 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var7 = var6.getStartPosition();
    java.util.Dictionary var8 = var6.getDocumentProperties();
    javax.swing.text.Style var10 = var6.getLogicalStyle((-1));
    var0.setParagraphAttributes(0, 100, (javax.swing.text.AttributeSet)var10, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var0.getText((-1), 10);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var1 = var0.getStartPosition();
    java.util.Dictionary var2 = var0.getDocumentProperties();
    javax.swing.text.Style var4 = var0.getLogicalStyle((-1));
    var0.setAsynchronousLoadPriority(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    java.lang.String var3 = var2.toString();
    int var4 = var2.getPort();
    int var5 = var2.getPort();
    sun.rmi.transport.Channel var6 = var2.getChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[hi!:-1]"+ "'", var3.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var2 = var0.createPosition(100);
    java.util.Enumeration var3 = var0.getStyleNames();
    javax.swing.text.Style var5 = var0.getStyle("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var2 = var0.createPosition(100);
    javax.swing.event.DocumentListener[] var3 = var0.getDocumentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var1 = var0.getStartPosition();
    java.util.Dictionary var2 = var0.getDocumentProperties();
    var0.readLock();
    int var4 = var0.getAsynchronousLoadPriority();
    javax.swing.event.DocumentListener[] var5 = var0.getDocumentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.rmi.server.RMIClientSocketFactory var5 = var2.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[hi!:-1]"+ "'", var3.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[hi!:-1]"+ "'", var4.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    sun.rmi.transport.tcp.TCPEndpoint var5 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    boolean var6 = var2.equals((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var2 = var0.createPosition(100);
    java.util.Enumeration var3 = var0.getStyleNames();
    javax.swing.text.DefaultStyledDocument var4 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var6 = var4.createPosition(100);
    java.util.Enumeration var7 = var4.getStyleNames();
    javax.swing.text.Element var8 = var4.getBidiRootElement();
    javax.swing.text.Element var9 = var4.getBidiRootElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElement(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var2 = var0.createPosition(100);
    var0.readLock();
    var0.readLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var2 = var0.createPosition(100);
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var4 = var3.getStartPosition();
    java.util.Dictionary var5 = var3.getDocumentProperties();
    javax.swing.text.Style var7 = var3.getLogicalStyle((-1));
    java.awt.Color var8 = var0.getBackground((javax.swing.text.AttributeSet)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var1 = var0.getStartPosition();
    java.util.Dictionary var2 = var0.getDocumentProperties();
    var0.readLock();
    java.awt.Window[] var4 = java.awt.Window.getWindows();
    javax.swing.text.DefaultStyledDocument var5 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var6 = var5.getStartPosition();
    java.util.Dictionary var7 = var5.getDocumentProperties();
    javax.swing.text.Style var9 = var5.getLogicalStyle((-1));
    var0.putProperty((java.lang.Object)var4, (java.lang.Object)(-1));
    sun.rmi.transport.tcp.TCPEndpoint var13 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    sun.rmi.transport.Transport var16 = var13.getOutboundTransport();
    java.lang.Object var17 = var0.getProperty((java.lang.Object)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var0.getText(100, 1);
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[hi!:-1]"+ "'", var14.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[hi!:-1]"+ "'", var15.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var1 = var0.getStartPosition();
    var0.readLock();
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var5 = var3.createPosition(100);
    java.util.Enumeration var6 = var3.getStyleNames();
    javax.swing.text.DefaultStyledDocument var7 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var9 = var7.createPosition(100);
    javax.swing.text.Position var10 = var7.getEndPosition();
    var0.putProperty((java.lang.Object)var6, (java.lang.Object)var7);
    javax.swing.event.UndoableEditListener[] var12 = var0.getUndoableEditListeners();
    var0.readUnlock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
