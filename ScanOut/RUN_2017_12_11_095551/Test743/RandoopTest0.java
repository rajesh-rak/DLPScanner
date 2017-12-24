
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era var2 = var0.getEra("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.jar.JarEntry var1 = new java.util.jar.JarEntry("hi!");
    java.util.jar.JarEntry var2 = new java.util.jar.JarEntry((java.util.zip.ZipEntry)var1);
    long var3 = var1.getCompressedSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var6 = new java.util.Date(0, (-1), 0, 0, 100, (-1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.lang.String var2 = var0.getContentTypeFor("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var1 = new java.util.Date((-1L));
    var1.setSeconds(10);
    boolean var5 = var1.equals((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.jar.JarEntry var1 = new java.util.jar.JarEntry("hi!");
    java.util.jar.JarEntry var2 = new java.util.jar.JarEntry((java.util.zip.ZipEntry)var1);
    long var3 = var1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.jar.JarEntry var1 = new java.util.jar.JarEntry("hi!");
    java.util.jar.JarEntry var2 = new java.util.jar.JarEntry((java.util.zip.ZipEntry)var1);
    java.security.cert.Certificate[] var3 = var1.getCertificates();
    java.security.cert.Certificate[] var4 = var1.getCertificates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var1 = new java.util.Date(0L);
    int var2 = var1.getTimezoneOffset();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var5 = new java.util.Date(100, 100, 1, 10, 30);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var1 = new java.util.Date(100L);
    int var2 = var1.getMinutes();
    java.util.Date var4 = new java.util.Date(100L);
    var4.setTime(10L);
    boolean var7 = var1.after(var4);
    var4.setHours(30);
    java.util.Date var11 = new java.util.Date(100L);
    int var12 = var11.getMinutes();
    java.util.Date var14 = new java.util.Date(100L);
    var14.setTime(10L);
    boolean var17 = var11.after(var14);
    var14.setHours(30);
    int var20 = var14.getTimezoneOffset();
    int var21 = var14.getHours();
    int var22 = var4.compareTo(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var1 = new java.util.Date(100L);
    java.lang.String var2 = var1.toGMTString();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.warning("hi!");
    var1.warning("");
    var1.severe("1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    java.lang.String var3 = var1.getResourceBundleName();
    java.util.logging.Filter var4 = var1.getFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.jar.JarEntry var1 = new java.util.jar.JarEntry("hi!");
    java.util.jar.JarEntry var2 = new java.util.jar.JarEntry((java.util.zip.ZipEntry)var1);
    java.util.jar.JarEntry var3 = new java.util.jar.JarEntry(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.warning("hi!");
    var1.warning("");
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var8 = var7.getParent();
    java.lang.String var9 = var7.getResourceBundleName();
    var7.info("");
    var1.setParent(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.elements();
    java.lang.String var2 = var0.toString();
    java.util.Set var3 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.jar.JarEntry var1 = new java.util.jar.JarEntry("");
    java.util.jar.JarEntry var2 = new java.util.jar.JarEntry((java.util.zip.ZipEntry)var1);
    java.lang.String var3 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era var2 = var0.getEra("1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.jar.JarEntry var1 = new java.util.jar.JarEntry("");
    java.lang.String var2 = var1.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
