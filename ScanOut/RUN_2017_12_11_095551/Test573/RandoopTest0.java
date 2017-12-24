
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


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.rename("hi!", "");
      fail("Expected exception of type javax.naming.InvalidNameException");
    } catch (javax.naming.InvalidNameException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    javax.naming.NameParser var3 = var1.getNameParser("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var3 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    java.lang.Object var6 = com.sun.naming.internal.ResourceManager.getFactory("hi!", var1, (javax.naming.Context)var3, "hi!", "");
    var3.setIgnoreCase(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(0, (-1), 0, 100, 1);
    var0.clear();
    var0.setMinimalDaysInFirstWeek((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var1 = new java.util.Date(10L);
    var1.setMinutes(1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Date var4 = new java.util.Date(0, 1, 100);
    boolean var5 = var0.contains((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(1, (-1), 0, 100, 1);
    java.util.Date var6 = var5.getGregorianChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var1 = new java.util.Date(10L);
    java.lang.String var2 = var1.toLocaleString();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var1 = new java.util.Hashtable();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var3 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    java.lang.Object var6 = com.sun.naming.internal.ResourceManager.getFactory("hi!", var1, (javax.naming.Context)var3, "hi!", "");
    boolean var8 = var1.containsValue((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Calendar var1 = java.util.Calendar.getInstance();
    var1.set(0, (-1), 0, 100, 1);
    var1.clear();
    java.util.GregorianCalendar var14 = new java.util.GregorianCalendar(1, (-1), 0, 100, 1);
    var14.roll(1, true);
    java.lang.String var18 = var14.toString();
    java.lang.Object var19 = var0.put((java.lang.Object)var1, (java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=339,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var18.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=339,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=19800000,DST_OFFSET=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date(0, 10, 1, (-1), 0, 10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=339,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=19800000,DST_OFFSET=0]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var1 = new java.util.Date(10L);
    var1.setDate(1);
    int var4 = var1.getYear();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.util.Calendar var2 = java.util.Calendar.getInstance();
    var2.set(0, (-1), 0, 100, 1);
    boolean var10 = var2.before((java.lang.Object)10L);
    boolean var11 = var1.equals((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var1 = new java.util.Date(10L);
    var1.setDate(1);
    int var4 = var1.getSeconds();
    java.util.Date var6 = new java.util.Date(10L);
    var6.setDate(1);
    int var9 = var1.compareTo(var6);
    java.util.Date var16 = new java.util.Date(100, 0, 1, 1, 100, 1);
    boolean var17 = var6.before(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    java.lang.Object var3 = var1.lookupLink("");
    javax.naming.directory.ModificationItem[] var5 = new javax.naming.directory.ModificationItem[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.modifyAttributes("hi!", var5);
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(1, (-1), 0, 100, 1);
    var5.roll(1, true);
    var5.setTimeInMillis(10L);
    java.util.TimeZone var11 = var5.getTimeZone();
    java.util.Calendar var12 = java.util.Calendar.getInstance(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(1, (-1), 0, 100, 1);
    var5.roll(1, true);
    var5.setTimeInMillis(10L);
    java.util.TimeZone var11 = var5.getTimeZone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var5.getMaximum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable();
    com.sun.jndi.toolkit.dir.HierMemDirCtx var3 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    java.lang.Object var6 = com.sun.naming.internal.ResourceManager.getFactory("hi!", var1, (javax.naming.Context)var3, "hi!", "");
    javax.naming.directory.ModificationItem[] var8 = new javax.naming.directory.ModificationItem[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.modifyAttributes("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=339,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=19800000,DST_OFFSET=0]", var8);
      fail("Expected exception of type javax.naming.NameNotFoundException");
    } catch (javax.naming.NameNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var0 = new com.sun.jndi.toolkit.dir.HierMemDirCtx();
    var0.setIgnoreCase(false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var5 = new java.util.Date(100, 0, 70, (-1), (-1));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var0 = new java.util.Date();

  }

}
