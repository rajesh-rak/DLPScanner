
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.ensureCapacity(10);
    int var3 = var0.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100);
    sun.rmi.transport.Transport var3 = var2.getInboundTransport();
    sun.rmi.transport.Channel var4 = var2.getChannel();
    java.rmi.server.RMIServerSocketFactory var5 = var2.getServerSocketFactory();
    java.lang.String var6 = var2.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.equals((java.lang.Object)true);
    int var4 = var0.lastIndexOf((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    var1.ensureCapacity(10);
    boolean var4 = var0.addAll((java.util.Collection)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.util.Enumeration var1 = var0.getStyleNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var0.getText(10, (-1));
      fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Position var2 = var0.createPosition(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.setAsynchronousLoadPriority(10);
    javax.swing.text.Position var4 = var0.createPosition(0);
    javax.swing.text.Element var6 = var0.getParagraphElement((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.ensureCapacity(10);
    var0.removeAllElements();
    java.lang.Object[] var4 = var0.toArray();
    sun.rmi.transport.tcp.TCPEndpoint var7 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100);
    int var9 = var0.indexOf((java.lang.Object)var7, 10);
    java.util.Vector var10 = new java.util.Vector();
    var10.ensureCapacity(10);
    var10.removeAllElements();
    java.lang.Object[] var14 = var10.toArray();
    sun.rmi.transport.tcp.TCPEndpoint var17 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100);
    int var19 = var10.indexOf((java.lang.Object)var17, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)10, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var1 = var0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    int var3 = var2.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.ensureCapacity(10);
    int var3 = var0.capacity();
    var0.addElement((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.ensureCapacity(10);
    var0.removeAllElements();
    javax.swing.text.DefaultStyledDocument var4 = new javax.swing.text.DefaultStyledDocument();
    java.util.Enumeration var5 = var4.getStyleNames();
    var4.setAsynchronousLoadPriority(0);
    int var9 = var0.indexOf((java.lang.Object)var4, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.subList((-1), 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100);
    sun.rmi.transport.Transport var3 = var2.getInboundTransport();
    sun.rmi.transport.Channel var4 = var2.getChannel();
    java.rmi.server.RMIServerSocketFactory var5 = var2.getServerSocketFactory();
    sun.rmi.transport.Transport var6 = var2.getInboundTransport();
    boolean var8 = var2.equals((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.setAsynchronousLoadPriority(10);
    javax.swing.text.Element var3 = var0.getBidiRootElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100);
    sun.rmi.transport.Transport var3 = var2.getInboundTransport();
    sun.rmi.transport.Channel var4 = var2.getChannel();
    java.rmi.server.RMIServerSocketFactory var5 = var2.getServerSocketFactory();
    int var6 = var2.getPort();
    java.rmi.server.RMIClientSocketFactory var7 = var2.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    var1.ensureCapacity(10);
    boolean var4 = var0.retainAll((java.util.Collection)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    java.util.Vector var3 = new java.util.Vector();
    var3.ensureCapacity(10);
    var3.removeAllElements();
    java.lang.Object[] var7 = var3.toArray();
    boolean var8 = var2.removeAll((java.util.Collection)var3);
    sun.rmi.transport.tcp.TCPEndpoint var11 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100);
    sun.rmi.transport.Transport var12 = var11.getInboundTransport();
    sun.rmi.transport.Channel var13 = var11.getChannel();
    java.rmi.server.RMIServerSocketFactory var14 = var11.getServerSocketFactory();
    boolean var15 = var2.contains((java.lang.Object)var11);
    int var16 = var11.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.ensureCapacity(10);
    var0.removeAllElements();
    java.lang.Object[] var4 = var0.toArray();
    javax.swing.text.DefaultStyledDocument var5 = new javax.swing.text.DefaultStyledDocument();
    var5.setAsynchronousLoadPriority(10);
    boolean var8 = var0.equals((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.beans.VetoableChangeSupport var1 = new java.beans.VetoableChangeSupport((java.lang.Object)10);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.ensureCapacity(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.util.Enumeration var1 = var0.getStyleNames();
    java.util.Dictionary var2 = var0.getDocumentProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.ensureCapacity(10);
    int var3 = var0.capacity();
    boolean var5 = var0.add((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    java.util.Vector var3 = new java.util.Vector();
    var3.ensureCapacity(10);
    var3.removeAllElements();
    java.lang.Object[] var7 = var3.toArray();
    boolean var8 = var2.removeAll((java.util.Collection)var3);
    java.lang.Object[] var9 = var3.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
