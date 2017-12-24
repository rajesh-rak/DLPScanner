
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.toString();
    int var3 = var1.activeCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var2.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(10, "[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("java.lang.ThreadGroup[name=,maxpri=10]");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    var2.clear();
    java.util.Enumeration var4 = var2.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var6 = var2.listIterator(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.get(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("");
    java.lang.String var4 = var3.toString();
    boolean var5 = var1.parentOf(var3);
    boolean var7 = var3.allowThreadSuspension(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var4.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Enumeration var3 = var2.keys();
    boolean var5 = var2.contains((java.lang.Object)1.0f);
    java.util.Enumeration var6 = var2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Enumeration var3 = var2.keys();
    java.util.Vector var6 = new java.util.Vector(1, (-1));
    var6.clear();
    java.lang.String var8 = var6.toString();
    boolean var9 = var2.containsKey((java.lang.Object)var6);
    java.lang.ThreadGroup var11 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var13 = new java.lang.ThreadGroup("");
    java.lang.String var14 = var13.toString();
    boolean var15 = var11.parentOf(var13);
    java.lang.Object[] var16 = new java.lang.Object[] { var13};
    java.lang.Object[] var17 = var6.toArray(var16);
    java.util.Hashtable var20 = new java.util.Hashtable(10, 1.0f);
    java.util.Enumeration var21 = var20.keys();
    boolean var23 = var20.contains((java.lang.Object)1.0f);
    java.lang.ThreadGroup var25 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var27 = new java.lang.ThreadGroup("");
    java.lang.String var28 = var27.toString();
    boolean var29 = var25.parentOf(var27);
    boolean var30 = var20.containsKey((java.lang.Object)var29);
    java.lang.String var31 = var20.toString();
    boolean var32 = var6.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var14.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var28.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "{}"+ "'", var31.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("");
    java.lang.String var4 = var3.toString();
    boolean var5 = var1.parentOf(var3);
    java.lang.String var6 = var1.toString();
    java.lang.Thread[] var7 = new java.lang.Thread[] { };
    int var8 = var1.enumerate(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var4.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var6.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Enumeration var3 = var2.keys();
    java.util.Vector var6 = new java.util.Vector(1, (-1));
    var6.clear();
    java.lang.String var8 = var6.toString();
    boolean var9 = var2.containsKey((java.lang.Object)var6);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Enumeration var3 = var2.keys();
    java.util.Vector var6 = new java.util.Vector(1, (-1));
    var6.clear();
    java.lang.String var8 = var6.toString();
    boolean var9 = var2.containsKey((java.lang.Object)var6);
    boolean var11 = var6.removeElement((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("java.lang.ThreadGroup[name=,maxpri=10]");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    var2.clear();
    java.util.Enumeration var4 = var2.elements();
    java.util.ListIterator var5 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.security.AccessControlContext var3 = java.security.AccessController.getContext();
    java.lang.Object[] var4 = new java.lang.Object[] { var3};
    var2.copyInto(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.toString();
    boolean var3 = var1.isDaemon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var2.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("");
    java.lang.String var4 = var3.toString();
    boolean var5 = var1.parentOf(var3);
    java.lang.String var6 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var4.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.toString();
    boolean var3 = var1.isDestroyed();
    var1.suspend();
    boolean var5 = var1.isDaemon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var2.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Enumeration var3 = var2.keys();
    boolean var5 = var2.contains((java.lang.Object)1.0f);
    boolean var7 = var2.containsValue((java.lang.Object)' ');
    var2.clear();
    java.lang.Object var10 = var2.get((java.lang.Object)(byte)1);
    java.lang.ThreadGroup var12 = new java.lang.ThreadGroup("");
    java.lang.String var13 = var12.toString();
    boolean var14 = var2.containsValue((java.lang.Object)var12);
    int var15 = var12.getMaxPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var13.equals("java.lang.ThreadGroup[name=,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Thread var1 = new java.lang.Thread("[]");
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1, "");

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var2.set(100, (java.lang.Object)1.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    var2.clear();
    int var4 = var2.size();
    var2.addElement((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

}
