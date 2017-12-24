
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var6 = java.util.Date.UTC(0, 1, 1, 10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2206273799000L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.equals((java.lang.Object)'a');
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.clear(10);
    var0.add(0, 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    java.util.Date var2 = var0.getGregorianChange();
    int var3 = var0.getWeeksInWeekYear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.get(52);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 52);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    java.util.Date var2 = var0.getGregorianChange();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.roll(52, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 10);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    boolean var8 = var3.before(var7);
    java.util.Date var12 = new java.util.Date((-1), (-1), 10);
    java.util.Date var16 = new java.util.Date((-1), (-1), 10);
    boolean var17 = var12.before(var16);
    boolean var18 = var7.after(var16);
    int var19 = var16.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 10);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    boolean var8 = var3.before(var7);
    var7.setHours((-1));
    int var11 = var7.getHours();
    java.lang.String var12 = var7.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var3 = new java.util.Date((-1), 23, 23);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    java.util.Date var11 = new java.util.Date((-1), (-1), 10);
    boolean var12 = var7.before(var11);
    boolean var13 = var3.before(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 10);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    boolean var8 = var3.before(var7);
    var7.setHours((-1));
    java.lang.String var11 = var7.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 10);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    boolean var8 = var3.before(var7);
    java.util.Date var12 = new java.util.Date((-1), (-1), 10);
    java.util.Date var16 = new java.util.Date((-1), (-1), 10);
    boolean var17 = var12.before(var16);
    boolean var18 = var7.after(var16);
    java.lang.String var19 = var16.toGMTString();
    int var20 = var16.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    java.util.Date var2 = var0.getGregorianChange();
    int var3 = var0.getWeeksInWeekYear();
    var0.set((-1), 23, 100, (-1), 10);
    int var11 = var0.getMinimum(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((-1), 23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.equals((java.lang.Object)'a');
    java.util.GregorianCalendar var4 = new java.util.GregorianCalendar();
    java.util.Date var5 = var4.getTime();
    java.lang.Object var7 = var1.put((java.lang.Object)var5, (java.lang.Object)(short)100);
    boolean var9 = var1.contains((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var3 = new java.util.Date((-1), 23, 23);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    java.util.Date var11 = new java.util.Date((-1), (-1), 10);
    boolean var12 = var7.before(var11);
    java.util.Date var16 = new java.util.Date((-1), (-1), 10);
    java.util.Date var20 = new java.util.Date((-1), (-1), 10);
    boolean var21 = var16.before(var20);
    boolean var22 = var11.after(var20);
    int var23 = var3.compareTo(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    java.util.Date var2 = var0.getGregorianChange();
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    java.util.Date var4 = var3.getTime();
    int var5 = var0.compareTo((java.util.Calendar)var3);
    int var7 = var3.getGreatestMinimum(0);
    boolean var8 = var3.isLenient();
    java.util.GregorianCalendar var9 = new java.util.GregorianCalendar();
    java.util.Date var10 = var9.getTime();
    java.util.Date var11 = var9.getGregorianChange();
    var3.setTime(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    java.util.Date var2 = var0.getGregorianChange();
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    java.util.Date var4 = var3.getTime();
    int var5 = var0.compareTo((java.util.Calendar)var3);
    int var7 = var3.getGreatestMinimum(0);
    boolean var8 = var3.isLenient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var3.getMinimum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.equals((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var6 = new java.util.Date(100, 23, 1, 23, (-1), 10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    java.util.Date var2 = var0.getGregorianChange();
    int var3 = var2.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("9 Dec 1898 17:30:00 GMT");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("9 Dec 1898 17:30:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("9 Dec 1898 17:30:00 GMT");
    var0.engineDeleteEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    var1.setTime(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.Date var1 = var0.getTime();
    java.util.Date var2 = var0.getGregorianChange();
    int var3 = var0.getWeeksInWeekYear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.set((-1), 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 52);

  }

}
