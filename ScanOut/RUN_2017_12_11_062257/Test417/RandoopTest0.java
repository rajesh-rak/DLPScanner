
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.JarIndex var2 = new sun.misc.JarIndex(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getStandardDigestName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var2 = new byte[] { (byte)0, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.timestamp.TimestampToken var3 = new sun.security.timestamp.TimestampToken(var2);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isBlockOrSF("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
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
      sun.security.x509.IPAddressName var1 = new sun.security.x509.IPAddressName("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.Security.setProperty("", "");

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.security.Security.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("", "");
    java.util.List var3 = sun.security.jca.GetInstance.getServices(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getStandardDigestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var1 = var0.values();
    java.lang.String var2 = var0.getInfo();
    com.sun.crypto.provider.SunJCE var3 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var4 = var3.values();
    var0.putAll((java.util.Map)var3);
    java.util.Enumeration var6 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var2.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)", "", "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.timestamp.TimestampToken var2 = new sun.security.timestamp.TimestampToken(var1);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var1 = var0.values();
    java.util.Enumeration var2 = var0.propertyNames();
    java.util.Enumeration var3 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var1 = var0.values();
    java.util.Enumeration var2 = var0.elements();
    java.util.Set var3 = var0.stringPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.misc.JarIndex var0 = new sun.misc.JarIndex();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isSigningRelated("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    java.lang.String var1 = var0.toString();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    byte[] var1 = var0.encode();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var1 = var0.values();
    java.util.Enumeration var2 = var0.elements();
    int var3 = var0.size();
    java.util.Enumeration var4 = var0.elements();
    java.lang.String var6 = var0.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getEncAlgFromSigAlg("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.timestamp.TimestampToken var1 = new sun.security.timestamp.TimestampToken(var0);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.security.Security.removeProvider("");

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var3 = var2.values();
    java.lang.String var4 = var2.getInfo();
    java.util.Hashtable var5 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var6 = sun.security.jca.GetInstance.getService("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)", "", (java.security.Provider)var2);
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var4.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var1 = var0.values();
    java.lang.String var2 = var0.getInfo();
    com.sun.crypto.provider.SunJCE var3 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var4 = var3.values();
    var0.putAll((java.util.Map)var3);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var3);
    java.lang.Object var8 = var6.get((java.lang.Object)1L);
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var2.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "{Mac.SslMacSHA1=com.sun.crypto.provider.SslMacCore$SslMacSHA1, SecretKeyFactory.PBEWithSHA1AndRC2_40=com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndRC2_40, Cipher.DESede SupportedKeyFormats=RAW, Mac.HmacSHA384 SupportedKeyFormats=RAW, Cipher.DES SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64, AlgorithmParameters.DES=com.sun.crypto.provider.DESParameters, SecretKeyFactory.PBEWithSHA1AndDESede=com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndDESede, Cipher.DESedeWrap SupportedKeyFormats=RAW, KeyGenerator.HmacMD5=com.sun.crypto.provider.HmacMD5KeyGenerator, Alg.Alias.AlgorithmParameters.OID.1.2.840.113549.1.5.3=PBEWithMD5AndDES, AlgorithmParameterGenerator.DiffieHellman=com.sun.crypto.provider.DHParameterGenerator, Cipher.RSA SupportedKeyClasses=java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey, Alg.Alias.KeyPairGenerator.DH=DiffieHellman, Alg.Alias.Cipher.1.2.840.113549.1.5.3=PBEWithMD5AndDES, Cipher.DES SupportedKeyFormats=RAW, Mac.SslMacSHA1 SupportedKeyFormats=RAW, Alg.Alias.AlgorithmParameterGenerator.DH=DiffieHellman, SecretKeyFactory.PBEWithMD5AndTripleDES=com.sun.crypto.provider.PBEKeyFactory$PBEWithMD5AndTripleDES, Alg.Alias.KeyPairGenerator.1.2.840.113549.1.3.1=DiffieHellman, Cipher.DESedeWrap=com.sun.crypto.provider.DESedeWrapCipher, AlgorithmParameters.DESede=com.sun.crypto.provider.DESedeParameters, Provider.id version=1.7, Mac.HmacSHA1 SupportedKeyFormats=RAW, KeyGenerator.ARCFOUR=com.sun.crypto.provider.KeyGeneratorCore$ARCFOURKeyGenerator, Cipher.AES SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, KeyGenerator.DES=com.sun.crypto.provider.DESKeyGenerator, Mac.HmacSHA256=com.sun.crypto.provider.HmacCore$HmacSHA256, Alg.Alias.Cipher.Rijndael=AES, Alg.Alias.AlgorithmParameterGenerator.1.2.840.113549.1.3.1=DiffieHellman, Alg.Alias.Cipher.RC4=ARCFOUR, KeyGenerator.HmacSHA256=com.sun.crypto.provider.KeyGeneratorCore$HmacSHA256KG, Alg.Alias.SecretKeyFactory.TripleDES=DESede, Cipher.AESWrap=com.sun.crypto.provider.AESWrapCipher, Mac.HmacMD5 SupportedKeyFormats=RAW, Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, Cipher.RC2 SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, AlgorithmParameters.RC2=com.sun.crypto.provider.RC2Parameters, Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Cipher.AES SupportedKeyFormats=RAW, Cipher.ARCFOUR=com.sun.crypto.provider.ARCFOURCipher, Alg.Alias.AlgorithmParameters.Rijndael=AES, Cipher.Blowfish SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, Mac.HmacSHA256 SupportedKeyFormats=RAW, Alg.Alias.KeyGenerator.SunTls12RsaPremasterSecret=SunTlsRsaPremasterSecret, KeyGenerator.SunTls12Prf=com.sun.crypto.provider.TlsPrfGenerator$V12, Mac.HmacPBESHA1=com.sun.crypto.provider.HmacPKCS12PBESHA1, Cipher.AESWrap SupportedPaddings=NOPADDING, Provider.id info=SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC), Alg.Alias.KeyFactory.OID.1.2.840.113549.1.3.1=DiffieHellman, Mac.SslMacMD5=com.sun.crypto.provider.SslMacCore$SslMacMD5, Mac.HmacMD5=com.sun.crypto.provider.HmacMD5, KeyGenerator.RC2=com.sun.crypto.provider.KeyGeneratorCore$RC2KeyGenerator, KeyGenerator.SunTlsKeyMaterial=com.sun.crypto.provider.TlsKeyMaterialGenerator, Cipher.DES=com.sun.crypto.provider.DESCipher, Cipher.RSA SupportedModes=ECB, Mac.HmacPBESHA1 SupportedKeyFormats=RAW, KeyGenerator.SunTlsMasterSecret=com.sun.crypto.provider.TlsMasterSecretGenerator, AlgorithmParameters.Blowfish=com.sun.crypto.provider.BlowfishParameters, KeyGenerator.SunTlsRsaPremasterSecret=com.sun.crypto.provider.TlsRsaPremasterSecretGenerator, Cipher.DESedeWrap SupportedModes=CBC, Alg.Alias.KeyGenerator.Rijndael=AES, Cipher.DES SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, KeyAgreement.DiffieHellman SupportedKeyClasses=javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey, Alg.Alias.KeyGenerator.SunTls12KeyMaterial=SunTlsKeyMaterial, Alg.Alias.AlgorithmParameters.1.2.840.113549.1.3.1=DiffieHellman, SecretKeyFactory.DESede=com.sun.crypto.provider.DESedeKeyFactory, Mac.SslMacMD5 SupportedKeyFormats=RAW, AlgorithmParameters.PBEWithMD5AndDES=com.sun.crypto.provider.PBEParameters, Mac.HmacSHA1=com.sun.crypto.provider.HmacSHA1, KeyStore.JCEKS=com.sun.crypto.provider.JceKeyStore, Cipher.ARCFOUR SupportedKeyFormats=RAW, Alg.Alias.Cipher.TripleDES=DESede, Cipher.RC2=com.sun.crypto.provider.RC2Cipher, Alg.Alias.AlgorithmParameters.OID.1.2.840.113549.1.3.1=DiffieHellman, Alg.Alias.KeyFactory.1.2.840.113549.1.3.1=DiffieHellman, KeyFactory.DiffieHellman=com.sun.crypto.provider.DHKeyFactory, KeyGenerator.HmacSHA1=com.sun.crypto.provider.HmacSHA1KeyGenerator, Alg.Alias.KeyAgreement.OID.1.2.840.113549.1.3.1=DiffieHellman, Alg.Alias.SecretKeyFactory.1.2.840.113549.1.5.12=PBKDF2WithHmacSHA1, AlgorithmParameters.OAEP=com.sun.crypto.provider.OAEPParameters, Alg.Alias.SecretKeyFactory.PBE=PBEWithMD5AndDES, Mac.HmacSHA384=com.sun.crypto.provider.HmacCore$HmacSHA384, Cipher.PBEWithSHA1AndRC2_40=com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndRC2_40, AlgorithmParameters.DiffieHellman=com.sun.crypto.provider.DHParameters, Cipher.AESWrap SupportedKeyFormats=RAW, KeyGenerator.HmacSHA384=com.sun.crypto.provider.KeyGeneratorCore$HmacSHA384KG, AlgorithmParameters.PBEWithSHA1AndRC2_40=com.sun.crypto.provider.PBEParameters, KeyAgreement.DiffieHellman=com.sun.crypto.provider.DHKeyAgreement, Alg.Alias.SecretKeyFactory.OID.1.2.840.113549.1.5.12=PBKDF2WithHmacSHA1, Cipher.PBEWithSHA1AndDESede=com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndDESede, Provider.id name=SunJCE, AlgorithmParameters.PBEWithSHA1AndDESede=com.sun.crypto.provider.PBEParameters, Alg.Alias.Cipher.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, Cipher.AESWrap SupportedModes=ECB, Alg.Alias.Cipher.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, AlgorithmParameters.PBE=com.sun.crypto.provider.PBEParameters, AlgorithmParameters.AES=com.sun.crypto.provider.AESParameters, Alg.Alias.AlgorithmParameterGenerator.OID.1.2.840.113549.1.3.1=DiffieHellman, Cipher.Blowfish SupportedKeyFormats=RAW, Alg.Alias.KeyFactory.DH=DiffieHellman, Cipher.DESede SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64, Alg.Alias.SecretKeyFactory.1.2.840.113549.1.5.3=PBEWithMD5AndDES, KeyGenerator.SunTlsPrf=com.sun.crypto.provider.TlsPrfGenerator$V10, Alg.Alias.Cipher.OID.1.2.840.113549.1.5.3=PBEWithMD5AndDES, Mac.HmacSHA512 SupportedKeyFormats=RAW, Cipher.RSA=com.sun.crypto.provider.RSACipher, KeyGenerator.Blowfish=com.sun.crypto.provider.BlowfishKeyGenerator, Alg.Alias.KeyGenerator.SunTls12MasterSecret=SunTlsMasterSecret, Alg.Alias.AlgorithmParameters.TripleDES=DESede, Cipher.RC2 SupportedKeyFormats=RAW, Cipher.PBEWithMD5AndDES=com.sun.crypto.provider.PBEWithMD5AndDESCipher, Alg.Alias.AlgorithmParameters.OID.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, KeyGenerator.AES=com.sun.crypto.provider.AESKeyGenerator, Cipher.PBEWithMD5AndTripleDES=com.sun.crypto.provider.PBEWithMD5AndTripleDESCipher, Alg.Alias.AlgorithmParameters.OID.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, Alg.Alias.KeyGenerator.TripleDES=DESede, Cipher.RSA SupportedPaddings=NOPADDING|PKCS1PADDING|OAEPWITHMD5ANDMGF1PADDING|OAEPWITHSHA1ANDMGF1PADDING|OAEPWITHSHA-1ANDMGF1PADDING|OAEPWITHSHA-256ANDMGF1PADDING|OAEPWITHSHA-384ANDMGF1PADDING|OAEPWITHSHA-512ANDMGF1PADDING, Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Alg.Alias.KeyGenerator.RC4=ARCFOUR, SecretKeyFactory.PBKDF2WithHmacSHA1=com.sun.crypto.provider.PBKDF2HmacSHA1Factory, Cipher.Blowfish=com.sun.crypto.provider.BlowfishCipher, Alg.Alias.SecretKeyFactory.OID.1.2.840.113549.1.5.3=PBEWithMD5AndDES, Cipher.RC2 SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64, Cipher.AES SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64|CFB72|CFB80|CFB88|CFB96|CFB104|CFB112|CFB120|CFB128|OFB72|OFB80|OFB88|OFB96|OFB104|OFB112|OFB120|OFB128, Cipher.ARCFOUR SupportedModes=ECB, Cipher.ARCFOUR SupportedPaddings=NOPADDING, KeyPairGenerator.DiffieHellman=com.sun.crypto.provider.DHKeyPairGenerator, Alg.Alias.AlgorithmParameters.DH=DiffieHellman, Cipher.DESedeWrap SupportedPaddings=NOPADDING, AlgorithmParameters.PBEWithMD5AndTripleDES=com.sun.crypto.provider.PBEParameters, KeyGenerator.DESede=com.sun.crypto.provider.DESedeKeyGenerator, Alg.Alias.KeyAgreement.1.2.840.113549.1.3.1=DiffieHellman, Alg.Alias.KeyPairGenerator.OID.1.2.840.113549.1.3.1=DiffieHellman, Mac.HmacSHA512=com.sun.crypto.provider.HmacCore$HmacSHA512, Alg.Alias.Cipher.OID.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, KeyGenerator.HmacSHA512=com.sun.crypto.provider.KeyGeneratorCore$HmacSHA512KG, Alg.Alias.Cipher.OID.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Alg.Alias.SecretKeyFactory.OID.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, Alg.Alias.AlgorithmParameters.1.2.840.113549.1.5.3=PBEWithMD5AndDES, Cipher.DESede=com.sun.crypto.provider.DESedeCipher, SecretKeyFactory.DES=com.sun.crypto.provider.DESKeyFactory, SecretKeyFactory.PBEWithMD5AndDES=com.sun.crypto.provider.PBEKeyFactory$PBEWithMD5AndDES, Alg.Alias.SecretKeyFactory.OID.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Cipher.DESede SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, Cipher.Blowfish SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64, Provider.id className=com.sun.crypto.provider.SunJCE, Cipher.AES=com.sun.crypto.provider.AESCipher, Alg.Alias.KeyAgreement.DH=DiffieHellman}"+ "'", var9.equals("{Mac.SslMacSHA1=com.sun.crypto.provider.SslMacCore$SslMacSHA1, SecretKeyFactory.PBEWithSHA1AndRC2_40=com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndRC2_40, Cipher.DESede SupportedKeyFormats=RAW, Mac.HmacSHA384 SupportedKeyFormats=RAW, Cipher.DES SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64, AlgorithmParameters.DES=com.sun.crypto.provider.DESParameters, SecretKeyFactory.PBEWithSHA1AndDESede=com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndDESede, Cipher.DESedeWrap SupportedKeyFormats=RAW, KeyGenerator.HmacMD5=com.sun.crypto.provider.HmacMD5KeyGenerator, Alg.Alias.AlgorithmParameters.OID.1.2.840.113549.1.5.3=PBEWithMD5AndDES, AlgorithmParameterGenerator.DiffieHellman=com.sun.crypto.provider.DHParameterGenerator, Cipher.RSA SupportedKeyClasses=java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey, Alg.Alias.KeyPairGenerator.DH=DiffieHellman, Alg.Alias.Cipher.1.2.840.113549.1.5.3=PBEWithMD5AndDES, Cipher.DES SupportedKeyFormats=RAW, Mac.SslMacSHA1 SupportedKeyFormats=RAW, Alg.Alias.AlgorithmParameterGenerator.DH=DiffieHellman, SecretKeyFactory.PBEWithMD5AndTripleDES=com.sun.crypto.provider.PBEKeyFactory$PBEWithMD5AndTripleDES, Alg.Alias.KeyPairGenerator.1.2.840.113549.1.3.1=DiffieHellman, Cipher.DESedeWrap=com.sun.crypto.provider.DESedeWrapCipher, AlgorithmParameters.DESede=com.sun.crypto.provider.DESedeParameters, Provider.id version=1.7, Mac.HmacSHA1 SupportedKeyFormats=RAW, KeyGenerator.ARCFOUR=com.sun.crypto.provider.KeyGeneratorCore$ARCFOURKeyGenerator, Cipher.AES SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, KeyGenerator.DES=com.sun.crypto.provider.DESKeyGenerator, Mac.HmacSHA256=com.sun.crypto.provider.HmacCore$HmacSHA256, Alg.Alias.Cipher.Rijndael=AES, Alg.Alias.AlgorithmParameterGenerator.1.2.840.113549.1.3.1=DiffieHellman, Alg.Alias.Cipher.RC4=ARCFOUR, KeyGenerator.HmacSHA256=com.sun.crypto.provider.KeyGeneratorCore$HmacSHA256KG, Alg.Alias.SecretKeyFactory.TripleDES=DESede, Cipher.AESWrap=com.sun.crypto.provider.AESWrapCipher, Mac.HmacMD5 SupportedKeyFormats=RAW, Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, Cipher.RC2 SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, AlgorithmParameters.RC2=com.sun.crypto.provider.RC2Parameters, Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Cipher.AES SupportedKeyFormats=RAW, Cipher.ARCFOUR=com.sun.crypto.provider.ARCFOURCipher, Alg.Alias.AlgorithmParameters.Rijndael=AES, Cipher.Blowfish SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, Mac.HmacSHA256 SupportedKeyFormats=RAW, Alg.Alias.KeyGenerator.SunTls12RsaPremasterSecret=SunTlsRsaPremasterSecret, KeyGenerator.SunTls12Prf=com.sun.crypto.provider.TlsPrfGenerator$V12, Mac.HmacPBESHA1=com.sun.crypto.provider.HmacPKCS12PBESHA1, Cipher.AESWrap SupportedPaddings=NOPADDING, Provider.id info=SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC), Alg.Alias.KeyFactory.OID.1.2.840.113549.1.3.1=DiffieHellman, Mac.SslMacMD5=com.sun.crypto.provider.SslMacCore$SslMacMD5, Mac.HmacMD5=com.sun.crypto.provider.HmacMD5, KeyGenerator.RC2=com.sun.crypto.provider.KeyGeneratorCore$RC2KeyGenerator, KeyGenerator.SunTlsKeyMaterial=com.sun.crypto.provider.TlsKeyMaterialGenerator, Cipher.DES=com.sun.crypto.provider.DESCipher, Cipher.RSA SupportedModes=ECB, Mac.HmacPBESHA1 SupportedKeyFormats=RAW, KeyGenerator.SunTlsMasterSecret=com.sun.crypto.provider.TlsMasterSecretGenerator, AlgorithmParameters.Blowfish=com.sun.crypto.provider.BlowfishParameters, KeyGenerator.SunTlsRsaPremasterSecret=com.sun.crypto.provider.TlsRsaPremasterSecretGenerator, Cipher.DESedeWrap SupportedModes=CBC, Alg.Alias.KeyGenerator.Rijndael=AES, Cipher.DES SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, KeyAgreement.DiffieHellman SupportedKeyClasses=javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey, Alg.Alias.KeyGenerator.SunTls12KeyMaterial=SunTlsKeyMaterial, Alg.Alias.AlgorithmParameters.1.2.840.113549.1.3.1=DiffieHellman, SecretKeyFactory.DESede=com.sun.crypto.provider.DESedeKeyFactory, Mac.SslMacMD5 SupportedKeyFormats=RAW, AlgorithmParameters.PBEWithMD5AndDES=com.sun.crypto.provider.PBEParameters, Mac.HmacSHA1=com.sun.crypto.provider.HmacSHA1, KeyStore.JCEKS=com.sun.crypto.provider.JceKeyStore, Cipher.ARCFOUR SupportedKeyFormats=RAW, Alg.Alias.Cipher.TripleDES=DESede, Cipher.RC2=com.sun.crypto.provider.RC2Cipher, Alg.Alias.AlgorithmParameters.OID.1.2.840.113549.1.3.1=DiffieHellman, Alg.Alias.KeyFactory.1.2.840.113549.1.3.1=DiffieHellman, KeyFactory.DiffieHellman=com.sun.crypto.provider.DHKeyFactory, KeyGenerator.HmacSHA1=com.sun.crypto.provider.HmacSHA1KeyGenerator, Alg.Alias.KeyAgreement.OID.1.2.840.113549.1.3.1=DiffieHellman, Alg.Alias.SecretKeyFactory.1.2.840.113549.1.5.12=PBKDF2WithHmacSHA1, AlgorithmParameters.OAEP=com.sun.crypto.provider.OAEPParameters, Alg.Alias.SecretKeyFactory.PBE=PBEWithMD5AndDES, Mac.HmacSHA384=com.sun.crypto.provider.HmacCore$HmacSHA384, Cipher.PBEWithSHA1AndRC2_40=com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndRC2_40, AlgorithmParameters.DiffieHellman=com.sun.crypto.provider.DHParameters, Cipher.AESWrap SupportedKeyFormats=RAW, KeyGenerator.HmacSHA384=com.sun.crypto.provider.KeyGeneratorCore$HmacSHA384KG, AlgorithmParameters.PBEWithSHA1AndRC2_40=com.sun.crypto.provider.PBEParameters, KeyAgreement.DiffieHellman=com.sun.crypto.provider.DHKeyAgreement, Alg.Alias.SecretKeyFactory.OID.1.2.840.113549.1.5.12=PBKDF2WithHmacSHA1, Cipher.PBEWithSHA1AndDESede=com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndDESede, Provider.id name=SunJCE, AlgorithmParameters.PBEWithSHA1AndDESede=com.sun.crypto.provider.PBEParameters, Alg.Alias.Cipher.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, Cipher.AESWrap SupportedModes=ECB, Alg.Alias.Cipher.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, AlgorithmParameters.PBE=com.sun.crypto.provider.PBEParameters, AlgorithmParameters.AES=com.sun.crypto.provider.AESParameters, Alg.Alias.AlgorithmParameterGenerator.OID.1.2.840.113549.1.3.1=DiffieHellman, Cipher.Blowfish SupportedKeyFormats=RAW, Alg.Alias.KeyFactory.DH=DiffieHellman, Cipher.DESede SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64, Alg.Alias.SecretKeyFactory.1.2.840.113549.1.5.3=PBEWithMD5AndDES, KeyGenerator.SunTlsPrf=com.sun.crypto.provider.TlsPrfGenerator$V10, Alg.Alias.Cipher.OID.1.2.840.113549.1.5.3=PBEWithMD5AndDES, Mac.HmacSHA512 SupportedKeyFormats=RAW, Cipher.RSA=com.sun.crypto.provider.RSACipher, KeyGenerator.Blowfish=com.sun.crypto.provider.BlowfishKeyGenerator, Alg.Alias.KeyGenerator.SunTls12MasterSecret=SunTlsMasterSecret, Alg.Alias.AlgorithmParameters.TripleDES=DESede, Cipher.RC2 SupportedKeyFormats=RAW, Cipher.PBEWithMD5AndDES=com.sun.crypto.provider.PBEWithMD5AndDESCipher, Alg.Alias.AlgorithmParameters.OID.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, KeyGenerator.AES=com.sun.crypto.provider.AESKeyGenerator, Cipher.PBEWithMD5AndTripleDES=com.sun.crypto.provider.PBEWithMD5AndTripleDESCipher, Alg.Alias.AlgorithmParameters.OID.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, Alg.Alias.KeyGenerator.TripleDES=DESede, Cipher.RSA SupportedPaddings=NOPADDING|PKCS1PADDING|OAEPWITHMD5ANDMGF1PADDING|OAEPWITHSHA1ANDMGF1PADDING|OAEPWITHSHA-1ANDMGF1PADDING|OAEPWITHSHA-256ANDMGF1PADDING|OAEPWITHSHA-384ANDMGF1PADDING|OAEPWITHSHA-512ANDMGF1PADDING, Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Alg.Alias.KeyGenerator.RC4=ARCFOUR, SecretKeyFactory.PBKDF2WithHmacSHA1=com.sun.crypto.provider.PBKDF2HmacSHA1Factory, Cipher.Blowfish=com.sun.crypto.provider.BlowfishCipher, Alg.Alias.SecretKeyFactory.OID.1.2.840.113549.1.5.3=PBEWithMD5AndDES, Cipher.RC2 SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64, Cipher.AES SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64|CFB72|CFB80|CFB88|CFB96|CFB104|CFB112|CFB120|CFB128|OFB72|OFB80|OFB88|OFB96|OFB104|OFB112|OFB120|OFB128, Cipher.ARCFOUR SupportedModes=ECB, Cipher.ARCFOUR SupportedPaddings=NOPADDING, KeyPairGenerator.DiffieHellman=com.sun.crypto.provider.DHKeyPairGenerator, Alg.Alias.AlgorithmParameters.DH=DiffieHellman, Cipher.DESedeWrap SupportedPaddings=NOPADDING, AlgorithmParameters.PBEWithMD5AndTripleDES=com.sun.crypto.provider.PBEParameters, KeyGenerator.DESede=com.sun.crypto.provider.DESedeKeyGenerator, Alg.Alias.KeyAgreement.1.2.840.113549.1.3.1=DiffieHellman, Alg.Alias.KeyPairGenerator.OID.1.2.840.113549.1.3.1=DiffieHellman, Mac.HmacSHA512=com.sun.crypto.provider.HmacCore$HmacSHA512, Alg.Alias.Cipher.OID.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, KeyGenerator.HmacSHA512=com.sun.crypto.provider.KeyGeneratorCore$HmacSHA512KG, Alg.Alias.Cipher.OID.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Alg.Alias.SecretKeyFactory.OID.1.2.840.113549.1.12.1.6=PBEWithSHA1AndRC2_40, Alg.Alias.AlgorithmParameters.1.2.840.113549.1.5.3=PBEWithMD5AndDES, Cipher.DESede=com.sun.crypto.provider.DESedeCipher, SecretKeyFactory.DES=com.sun.crypto.provider.DESKeyFactory, SecretKeyFactory.PBEWithMD5AndDES=com.sun.crypto.provider.PBEKeyFactory$PBEWithMD5AndDES, Alg.Alias.SecretKeyFactory.OID.1.2.840.113549.1.12.1.3=PBEWithSHA1AndDESede, Cipher.DESede SupportedPaddings=NOPADDING|PKCS5PADDING|ISO10126PADDING, Cipher.Blowfish SupportedModes=ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64, Provider.id className=com.sun.crypto.provider.SunJCE, Cipher.AES=com.sun.crypto.provider.AESCipher, Alg.Alias.KeyAgreement.DH=DiffieHellman}"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var1 = var0.values();
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var0);
    com.sun.crypto.provider.SunJCE var3 = new com.sun.crypto.provider.SunJCE();
    java.util.Collection var4 = var3.values();
    java.lang.String var5 = var3.getInfo();
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var3);
    boolean var7 = var0.equals((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var5.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

}
