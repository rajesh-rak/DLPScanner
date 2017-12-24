
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(10, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = new java.lang.String(" 44");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " 44"+ "'", var1.equals(" 44"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var3 = new char[] { ' ', '4', '4'};
    java.lang.String var4 = java.lang.String.copyValueOf(var3);
    java.lang.String var5 = new java.lang.String(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " 44"+ "'", var4.equals(" 44"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " 44"+ "'", var5.equals(" 44"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    boolean var5 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var0, 0, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    com.sun.crypto.provider.SunJCE var5 = new com.sun.crypto.provider.SunJCE();
    var2.putAll((java.util.Map)var5);
    double var7 = var2.getVersion();
    boolean var9 = var2.containsValue((java.lang.Object)" 44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var3 = new byte[] { (byte)100, (byte)1, (byte)(-1)};
    java.lang.String var5 = new java.lang.String(var3, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\uFF64\uFF01\uFFFF"+ "'", var5.equals("\uFF64\uFF01\uFFFF"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    char[] var1 = new char[] { '#'};
    java.lang.String var2 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "#"+ "'", var2.equals("#"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    java.security.Provider.Service var4 = var0.getService(" 44", " 44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.Object var3 = var0.setProperty(" 44", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    java.lang.String var5 = var2.getInfo();
    var2.clear();
    com.sun.crypto.provider.SunJCE var7 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var8 = var7.entrySet();
    com.sun.crypto.provider.SunJCE var9 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var10 = var9.entrySet();
    var7.putAll((java.util.Map)var9);
    com.sun.crypto.provider.SunJCE var12 = new com.sun.crypto.provider.SunJCE();
    var9.putAll((java.util.Map)var12);
    boolean var14 = var2.contains((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var5.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    com.sun.crypto.provider.SunJCE var5 = new com.sun.crypto.provider.SunJCE();
    var2.putAll((java.util.Map)var5);
    com.sun.crypto.provider.SunJCE var7 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var8 = var7.entrySet();
    com.sun.crypto.provider.SunJCE var9 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var10 = var9.entrySet();
    var7.putAll((java.util.Map)var9);
    var2.putAll((java.util.Map)var7);
    com.sun.crypto.provider.SunJCE var13 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var14 = var13.entrySet();
    com.sun.crypto.provider.SunJCE var15 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var16 = var15.entrySet();
    var13.putAll((java.util.Map)var15);
    com.sun.crypto.provider.SunJCE var18 = new com.sun.crypto.provider.SunJCE();
    var15.putAll((java.util.Map)var18);
    com.sun.crypto.provider.SunJCE var20 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var21 = var20.entrySet();
    com.sun.crypto.provider.SunJCE var22 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var23 = var22.entrySet();
    var20.putAll((java.util.Map)var22);
    var15.putAll((java.util.Map)var20);
    com.sun.crypto.provider.SunJCE var26 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var27 = var26.entrySet();
    var15.putAll((java.util.Map)var26);
    var7.putAll((java.util.Map)var15);
    java.util.Enumeration var30 = var15.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    java.lang.String var5 = var2.getInfo();
    var2.clear();
    java.util.Collection var7 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var5.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = java.lang.String.valueOf(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("\uFF64\uFF01\uFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Q\uFF64\uFF01\uFFFF\\E"+ "'", var1.equals("\\Q\uFF64\uFF01\uFFFF\\E"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    char[] var2 = new char[] { ' ', '#'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " #"+ "'", var3.equals(" #"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    byte[] var1 = sun.net.util.IPAddressUtil.textToNumericFormatV6("\uFF64\uFF01\uFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    com.sun.crypto.provider.SunJCE var5 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var6 = var5.entrySet();
    com.sun.crypto.provider.SunJCE var7 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var8 = var7.entrySet();
    var5.putAll((java.util.Map)var7);
    java.lang.String var10 = var7.getInfo();
    var7.clear();
    var2.putAll((java.util.Map)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var10.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    com.sun.crypto.provider.SunJCE var5 = new com.sun.crypto.provider.SunJCE();
    var2.putAll((java.util.Map)var5);
    com.sun.crypto.provider.SunJCE var7 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var8 = var7.entrySet();
    com.sun.crypto.provider.SunJCE var9 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var10 = var9.entrySet();
    var7.putAll((java.util.Map)var9);
    var2.putAll((java.util.Map)var7);
    com.sun.crypto.provider.SunJCE var13 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var14 = var13.entrySet();
    com.sun.crypto.provider.SunJCE var15 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var16 = var15.entrySet();
    var13.putAll((java.util.Map)var15);
    com.sun.crypto.provider.SunJCE var18 = new com.sun.crypto.provider.SunJCE();
    var15.putAll((java.util.Map)var18);
    com.sun.crypto.provider.SunJCE var20 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var21 = var20.entrySet();
    com.sun.crypto.provider.SunJCE var22 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var23 = var22.entrySet();
    var20.putAll((java.util.Map)var22);
    var15.putAll((java.util.Map)var20);
    com.sun.crypto.provider.SunJCE var26 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var27 = var26.entrySet();
    var15.putAll((java.util.Map)var26);
    var7.putAll((java.util.Map)var15);
    java.lang.Object var31 = var7.remove((java.lang.Object)1);
    int var32 = var7.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 149);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    java.lang.String var5 = var2.getInfo();
    int var6 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var5.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 149);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    java.util.Set var5 = var2.stringPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    com.sun.crypto.provider.SunJCE var5 = new com.sun.crypto.provider.SunJCE();
    var2.putAll((java.util.Map)var5);
    java.lang.String var7 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "SunJCE"+ "'", var7.equals("SunJCE"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    java.util.Enumeration var5 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    com.sun.crypto.provider.SunJCE var5 = new com.sun.crypto.provider.SunJCE();
    var2.putAll((java.util.Map)var5);
    double var7 = var2.getVersion();
    boolean var9 = var2.containsKey((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var1 = java.lang.String.valueOf(149);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "149"+ "'", var1.equals("149"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Set var1 = var0.entrySet();
    java.util.Enumeration var2 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    boolean var3 = var0.engineIsCertificateEntry("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)");
    java.security.cert.Certificate[] var5 = var0.engineGetCertificateChain("true");
    boolean var7 = var0.engineContainsAlias(" #");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    boolean var3 = var0.engineIsCertificateEntry("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)");
    java.security.cert.Certificate[] var5 = var0.engineGetCertificateChain("true");
    java.util.Date var7 = var0.engineGetCreationDate("SunJCE");
    java.util.Date var9 = var0.engineGetCreationDate("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

}
