
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var3 = new byte[] { (byte)1, (byte)1, (byte)10};
    java.lang.String var4 = sun.security.util.Debug.toString(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01:01:0a"+ "'", var4.equals("01:01:0a"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = sun.security.krb5.KrbException.returnCodeSymbol(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "not yet implemented"+ "'", var1.equals("not yet implemented"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Formatter var0 = new java.util.Formatter();
    var0.close();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Throwable var0 = new java.lang.Throwable();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.security.Permissions@46176578 (\n)\n"+ "'", var1.equals("java.security.Permissions@46176578 (\n)\n"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Throwable var1 = new java.lang.Throwable("01:01:0a");

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.krb5.KrbException var3 = new sun.security.krb5.KrbException((-1), "01:01:0a");
    java.lang.String var4 = var3.toString();
    java.lang.Exception var5 = new java.lang.Exception((java.lang.Throwable)var3);
    sun.security.krb5.KrbException var8 = new sun.security.krb5.KrbException((-1), "01:01:0a");
    java.lang.String var9 = var8.toString();
    java.lang.Exception var10 = new java.lang.Exception((java.lang.Throwable)var8);
    var5.addSuppressed((java.lang.Throwable)var8);
    java.lang.Throwable var12 = new java.lang.Throwable("krb_error -1 null (-1) - 01:01:0a", (java.lang.Throwable)var8);
    java.lang.Exception var13 = new java.lang.Exception((java.lang.Throwable)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "KrbException: null (-1) - 01:01:0a"+ "'", var4.equals("KrbException: null (-1) - 01:01:0a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "KrbException: null (-1) - 01:01:0a"+ "'", var9.equals("KrbException: null (-1) - 01:01:0a"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = new java.lang.String("not yet implemented");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "not yet implemented"+ "'", var1.equals("not yet implemented"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass();
    boolean var2 = var0.isAssignableFrom(var1);
    java.lang.reflect.Field[] var3 = var1.getDeclaredFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.krb5.KrbException var2 = new sun.security.krb5.KrbException((-1), "01:01:0a");
    java.lang.String var3 = var2.toString();
    java.lang.Exception var4 = new java.lang.Exception((java.lang.Throwable)var2);
    java.lang.String var5 = var2.returnCodeSymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "KrbException: null (-1) - 01:01:0a"+ "'", var3.equals("KrbException: null (-1) - 01:01:0a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "not yet implemented"+ "'", var5.equals("not yet implemented"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    boolean var1 = sun.security.util.Debug.isOn("not yet implemented");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    boolean var1 = sun.security.util.Debug.isOn("krb_error -1 null (-1) - 01:01:0a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    char[] var2 = new char[] { 'a', '#'};
    java.lang.String var5 = java.lang.String.copyValueOf(var2, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "a"+ "'", var5.equals("a"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.util.Hashtable var3 = new java.util.Hashtable(0);
    var1.putAll((java.util.Map)var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass();
    boolean var2 = var0.isAssignableFrom(var1);
    java.lang.annotation.Annotation[] var3 = var0.getAnnotations();
    boolean var4 = var0.isArray();
    java.lang.annotation.Annotation[] var5 = var0.getAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    boolean var1 = var0.isMemberClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.krb5.KrbException var1 = new sun.security.krb5.KrbException(10);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var2 = var1.getSigners();
    boolean var3 = var1.desiredAssertionStatus();
    boolean var4 = var0.isAssignableFrom(var1);
    java.lang.reflect.Constructor[] var5 = var0.getConstructors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.security.krb5.KrbException var3 = new sun.security.krb5.KrbException((-1), "01:01:0a");
    java.lang.String var4 = var3.toString();
    java.lang.Exception var5 = new java.lang.Exception((java.lang.Throwable)var3);
    sun.security.krb5.KrbException var8 = new sun.security.krb5.KrbException((-1), "01:01:0a");
    java.lang.String var9 = var8.toString();
    java.lang.Exception var10 = new java.lang.Exception((java.lang.Throwable)var8);
    var5.addSuppressed((java.lang.Throwable)var8);
    java.lang.Throwable var12 = new java.lang.Throwable("krb_error -1 null (-1) - 01:01:0a", (java.lang.Throwable)var8);
    java.lang.String var13 = java.lang.String.valueOf((java.lang.Object)"krb_error -1 null (-1) - 01:01:0a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "KrbException: null (-1) - 01:01:0a"+ "'", var4.equals("KrbException: null (-1) - 01:01:0a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "KrbException: null (-1) - 01:01:0a"+ "'", var9.equals("KrbException: null (-1) - 01:01:0a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "krb_error -1 null (-1) - 01:01:0a"+ "'", var13.equals("krb_error -1 null (-1) - 01:01:0a"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var3 = var1.contains((java.lang.Object)"java.security.Permissions@46176578 (\n)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.krb5.KrbException var2 = new sun.security.krb5.KrbException((-1), "01:01:0a");
    java.lang.String var3 = var2.krbErrorMessage();
    sun.security.krb5.internal.KRBError var4 = var2.getError();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "krb_error -1 null (-1) - 01:01:0a"+ "'", var3.equals("krb_error -1 null (-1) - 01:01:0a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    char[] var5 = new char[] { '4', 'a', '4'};
    java.security.Key var6 = var0.engineGetKey("hi!", var5);
    byte[] var11 = new byte[] { (byte)1, (byte)0, (byte)0};
    java.lang.String var12 = sun.security.util.Debug.toString(var11);
    java.security.cert.Certificate[] var13 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("01:00:00", var11, var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "01:00:00"+ "'", var12.equals("01:00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Constructor var1 = var0.getEnclosingConstructor();
    boolean var3 = sun.reflect.Reflection.quickCheckMemberAccess(var0, 1);
    boolean var5 = sun.reflect.Reflection.quickCheckMemberAccess(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass();
    boolean var2 = var0.isAssignableFrom(var1);
    java.lang.annotation.Annotation[] var3 = var0.getAnnotations();
    java.lang.reflect.Constructor[] var4 = var0.getConstructors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
