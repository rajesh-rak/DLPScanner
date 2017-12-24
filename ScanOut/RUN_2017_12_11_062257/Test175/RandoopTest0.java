
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    boolean var2 = var1.isCritical();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var3 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    boolean var5 = var0.retainAll((java.util.Collection)var3);
    java.util.Enumeration var6 = var0.elements();
    java.util.Vector var8 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var9 = new sun.security.x509.ExtendedKeyUsageExtension(var8);
    sun.security.x509.ExtendedKeyUsageExtension var10 = new sun.security.x509.ExtendedKeyUsageExtension(var8);
    java.util.Vector var11 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var12 = new sun.security.x509.ExtendedKeyUsageExtension(var11);
    boolean var13 = var8.retainAll((java.util.Collection)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var0.addAll(6, (java.util.Collection)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElementAt((java.lang.Object)1L, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(6, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var3 = var0.listIterator(39);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var0 = new java.util.Date();
    var0.setMinutes(10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    long var6 = java.util.Date.UTC(100, (-1), (-1), 100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 944193541000L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    int[] var4 = new int[] { (-1), (-1)};
    int var5 = var0.getOffsets((-1L), var4);
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"null\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var6.equals("sun.util.calendar.ZoneInfo[id=\"null\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var6 = java.util.Date.UTC(0, 10, 100, (-1), 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2174173201000L));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var5 = new java.util.Date(6, 1, 1, 6, 100);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var3 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    boolean var5 = var0.retainAll((java.util.Collection)var3);
    java.util.Enumeration var6 = var0.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.elementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var3 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    boolean var5 = var0.retainAll((java.util.Collection)var3);
    java.util.Iterator var6 = var0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var2 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    boolean var5 = var0.retainAll((java.util.Collection)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Enumeration var3 = var2.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var3 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    boolean var5 = var0.retainAll((java.util.Collection)var3);
    java.util.Enumeration var6 = var0.elements();
    int var9 = var0.indexOf((java.lang.Object)0.0d, 0);
    java.util.Vector var10 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var11 = new sun.security.x509.ExtendedKeyUsageExtension(var10);
    sun.security.x509.ExtendedKeyUsageExtension var12 = new sun.security.x509.ExtendedKeyUsageExtension(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var14 = var0.lastIndexOf((java.lang.Object)var10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var3 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    boolean var5 = var0.retainAll((java.util.Collection)var3);
    java.util.Enumeration var6 = var0.elements();
    java.util.Date var7 = new java.util.Date();
    var7.setHours((-1));
    int var10 = var7.getMinutes();
    int var12 = var0.lastIndexOf((java.lang.Object)var10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore((-2174173201000L), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2174173201004L));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane.registerEditorKitForContentType("", "sun.util.calendar.ZoneInfo[id=\"null\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var1 = javax.swing.JEditorPane.getEditorKitClassNameForContentType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var3 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    boolean var5 = var0.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var7 = new sun.security.x509.ExtendedKeyUsageExtension(var6);
    boolean var8 = var0.remove((java.lang.Object)var6);
    java.util.Vector var9 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var10 = new sun.security.x509.ExtendedKeyUsageExtension(var9);
    sun.security.x509.ExtendedKeyUsageExtension var11 = new sun.security.x509.ExtendedKeyUsageExtension(var9);
    java.util.Vector var12 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var13 = new sun.security.x509.ExtendedKeyUsageExtension(var12);
    boolean var14 = var9.retainAll((java.util.Collection)var12);
    java.util.Enumeration var15 = var9.elements();
    boolean var16 = var6.remove((java.lang.Object)var9);
    java.util.Vector var17 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var18 = new sun.security.x509.ExtendedKeyUsageExtension(var17);
    sun.security.x509.ExtendedKeyUsageExtension var19 = new sun.security.x509.ExtendedKeyUsageExtension(var17);
    java.util.Vector var20 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var21 = new sun.security.x509.ExtendedKeyUsageExtension(var20);
    boolean var22 = var17.retainAll((java.util.Collection)var20);
    java.util.Vector var23 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var24 = new sun.security.x509.ExtendedKeyUsageExtension(var23);
    boolean var25 = var17.remove((java.lang.Object)var23);
    boolean var26 = var9.retainAll((java.util.Collection)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var29 = var23.subList(39, 39);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var5 = new java.util.Date(39, 0, 100, 0, 39);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var3 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    boolean var5 = var0.retainAll((java.util.Collection)var3);
    java.util.Enumeration var6 = var0.elements();
    int var9 = var0.indexOf((java.lang.Object)0.0d, 0);
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var12 = var0.containsAll((java.util.Collection)var11);
    java.util.Vector var14 = new java.util.Vector();
    var14.trimToSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((-1), (java.lang.Object)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getHours();
    java.lang.String var2 = var0.toString();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Vector var0 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var1 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension(var0);
    java.util.Vector var3 = new java.util.Vector();
    sun.security.x509.ExtendedKeyUsageExtension var4 = new sun.security.x509.ExtendedKeyUsageExtension(var3);
    boolean var5 = var0.retainAll((java.util.Collection)var3);
    java.lang.Object[] var6 = var0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
