
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var3 = new byte[] { (byte)100, (byte)100, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var4 = new sun.security.x509.X509CertInfo(var3);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var6 = java.util.Date.UTC(1, 0, 1, (-1), 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2177456339000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-469003028812815864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone((-1), "hi!", 0, 1, 1, 0, 0, 1, 1, 10, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var18 = var11.getOffset((-1), 10, 10, 5, 0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    byte[] var3 = var0.generateSeed(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6392603235505396d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone((-1), "hi!", 0, 1, 1, 0, 0, 1, 1, 10, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setDSTSavings(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.SecureRandom var1 = new java.security.SecureRandom();
    double var2 = var1.nextGaussian();
    java.security.Provider var3 = var1.getProvider();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.SecureRandom var4 = java.security.SecureRandom.getInstance("hi!", var3);
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.9600930388745654d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var6 = new java.util.Date(1, 0, 0, 5, 1, 100);
    java.util.Date var13 = new java.util.Date(1, 0, 0, 5, 1, 100);
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    var6.setTime(0L);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var6 = new java.util.Date(1, 0, 0, 5, 1, 100);
    java.lang.String var7 = var6.toString();
    var6.setDate(1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    java.lang.String var1 = var0.getAlgorithm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "NativePRNG"+ "'", var1.equals("NativePRNG"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    java.security.Provider var2 = var0.getProvider();
    boolean var4 = var2.containsKey((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.6891675301890765d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date(5, 10, 100, 1, 100, 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var6 = new java.util.Date(1, 0, 0, 5, 1, 100);
    java.util.Date var13 = new java.util.Date(1, 0, 0, 5, 1, 100);
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    var6.setDate(100);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("Mon Dec 31 05:02:40 IST 1900");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("hi!");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    byte[] var3 = var0.generateSeed(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0181756308834096d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(5, "", 5, (-1), 1, 10, 10, 5, 5, 100, 100);
    java.lang.String var12 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "java.util.SimpleTimeZone[id=,offset=5,dstSavings=100,useDaylight=true,startYear=0,startMode=2,startMonth=5,startDay=-1,startDayOfWeek=1,startTime=10,startTimeMode=0,endMode=2,endMonth=10,endDay=5,endDayOfWeek=5,endTime=100,endTimeMode=0]"+ "'", var12.equals("java.util.SimpleTimeZone[id=,offset=5,dstSavings=100,useDaylight=true,startYear=0,startMode=2,startMonth=5,startDay=-1,startDayOfWeek=1,startTime=10,startTimeMode=0,endMode=2,endMonth=10,endDay=5,endDayOfWeek=5,endTime=100,endTimeMode=0]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var3 = new java.util.Date((-1), 1, 100);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone((-1), "hi!", 0, 1, 1, 0, 0, 1, 1, 10, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setStartRule(5, 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    long var1 = var0.nextLong();
    float var2 = var0.nextFloat();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3506343261268481486L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.61799645f);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var6 = new java.util.Date(1, 0, 0, 5, 1, 100);
    java.util.Date var13 = new java.util.Date(1, 0, 0, 5, 1, 100);
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var14.get("java.util.SimpleTimeZone[id=,offset=5,dstSavings=100,useDaylight=true,startYear=0,startMode=2,startMonth=5,startDay=-1,startDayOfWeek=1,startTime=10,startTimeMode=0,endMode=2,endMonth=10,endDay=5,endDayOfWeek=5,endTime=100,endTimeMode=0]");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var6 = new java.util.Date(1, 0, 0, 5, 1, 100);
    java.util.Date var13 = new java.util.Date(1, 0, 0, 5, 1, 100);
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    java.lang.String var15 = var14.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "validity"+ "'", var15.equals("validity"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(5, "", 5, (-1), 1, 10, 10, 5, 5, 100, 100);
    boolean var12 = var11.observesDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era[] var1 = var0.getEras();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone((-1), "hi!", 0, 1, 1, 0, 0, 1, 1, 10, 10);
    boolean var12 = var11.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    java.security.Provider var2 = var0.getProvider();
    boolean var4 = var2.equals((java.lang.Object)1.3017751004349236d);
    boolean var5 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.145951740112067d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var6 = new java.util.Date(1, 0, 0, 5, 1, 100);
    java.util.Date var13 = new java.util.Date(1, 0, 0, 5, 1, 100);
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    java.util.Date var21 = new java.util.Date(1, 0, 0, 5, 1, 100);
    boolean var22 = var13.after(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    java.security.Provider var2 = var0.getProvider();
    java.util.Set var3 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2196040453165536d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    double var2 = var0.nextGaussian();
    var0.setSeed((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5845815092027214d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.15987499856092507d);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextDouble();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.288508458423233d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    java.security.Provider var2 = var0.getProvider();
    java.util.Enumeration var3 = var2.keys();
    java.security.SecureRandom var4 = new java.security.SecureRandom();
    double var5 = var4.nextGaussian();
    java.lang.Object var6 = var2.remove((java.lang.Object)var4);
    java.lang.Object var8 = var2.get((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.691640449924735d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.18354553143807537d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Date var6 = new java.util.Date(1, 0, 0, 5, 1, 100);
    java.util.Date var13 = new java.util.Date(1, 0, 0, 5, 1, 100);
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.delete("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

}
