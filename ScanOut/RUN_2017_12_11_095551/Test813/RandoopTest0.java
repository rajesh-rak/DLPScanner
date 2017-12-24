
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var0 = java.awt.EventQueue.getMostRecentEventTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512988324322L);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)'4');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var0 = javax.swing.JPopupMenu.getDefaultLightWeightPopupEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.annotation.Annotation[] var0 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var1 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    javax.management.Descriptor var2 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(1);
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    java.rmi.server.RMIClientSocketFactory var3 = var1.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var3 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("hi!", "", var2, var4);
    java.lang.String var6 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var3 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("hi!", "", var2, var4);
    boolean var7 = var5.equals((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    sun.rmi.transport.Transport var3 = var2.getInboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(1);
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[:1]"+ "'", var3.equals("[:1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)true, "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    int var3 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanParameterInfo[] var5 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var6 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var7 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var6);
    javax.management.MBeanConstructorInfo var8 = new javax.management.MBeanConstructorInfo("hi!", "", var5, var7);
    javax.management.MBeanConstructorInfo var9 = new javax.management.MBeanConstructorInfo("[:1]", "", var2, var7);
    java.lang.String var10 = var9.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[:1]"+ "'", var10.equals("[:1]"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.instantiateChild("[:1]");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    sun.rmi.transport.Channel var3 = var2.getChannel();
    sun.rmi.transport.Transport var4 = var2.getOutboundTransport();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var5 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)var4);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var1 = var0.getLocale();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var3 = var2.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.retainAll((java.util.Collection)var2);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.SecondaryLoop var1 = var0.createSecondaryLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var3 = var2.getLocale();
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var6 = var5.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.retainAll((java.util.Collection)var5);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var1 = var0.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.instantiateChild("[:1]");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var3 = var2.getLocale();
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextChild var5 = var2.getBeanContextChildPeer();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var9 = var8.getLocale();
    var6.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var8);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var12 = var11.getLocale();
    var6.setLocale(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var2.retainAll((java.util.Collection)var6);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var3 = var2.getLocale();
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextChild var5 = var2.getBeanContextChildPeer();
    java.awt.EventQueue var6 = new java.awt.EventQueue();
    boolean var7 = var2.containsKey((java.lang.Object)var6);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var11 = var10.getLocale();
    var8.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var10);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var14 = var13.getLocale();
    var8.setLocale(var14);
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var2, var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var3 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("hi!", "", var2, var4);
    java.lang.Object var6 = var5.clone();
    java.lang.String var7 = var5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var3 = var2.getLocale();
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var2);
    boolean var6 = var2.remove((java.lang.Object)100);
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var10 = var9.getLocale();
    var7.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var9);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var13 = var12.getLocale();
    var7.setLocale(var13);
    var2.setLocale(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var3 = var2.getLocale();
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var2);
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var6 = var5.getLocale();
    var0.setLocale(var6);
    boolean var8 = var0.needsGui();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

}
