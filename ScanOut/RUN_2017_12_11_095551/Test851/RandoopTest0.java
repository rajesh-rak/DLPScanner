
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var3 = new java.util.zip.ZipFile(var2);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);
    boolean var4 = var0.equals((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    java.io.File var3 = var2.getCanonicalFile();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var5 = new java.util.jar.JarFile(var3, true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);
    var1.clear();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isHidden();
    boolean var4 = var2.isFile();
    long var5 = var2.getTotalSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var6 = new java.util.zip.ZipFile(var2);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    java.io.File[] var4 = java.io.File.listRoots();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.set(10, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    java.util.Vector var6 = new java.util.Vector(0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var2.addAll(10, (java.util.Collection)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);
    java.util.Set var3 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    boolean var4 = var2.removeElement((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    java.io.File var3 = var2.getCanonicalFile();
    long var4 = var3.length();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var5 = new java.util.zip.ZipFile(var3);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isHidden();
    boolean var4 = var2.isFile();
    java.net.URL var5 = var2.toURL();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    java.io.File var3 = var2.getCanonicalFile();
    java.io.File var4 = var3.getCanonicalFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);
    java.util.Vector var5 = new java.util.Vector(0, 10);
    java.lang.Object var6 = var0.get((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(100, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    java.io.File var3 = var2.getCanonicalFile();
    long var4 = var3.length();
    java.lang.String var5 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var7 = new java.util.jar.JarFile(var3, true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test851/hi!/hi!"+ "'", var5.equals("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test851/hi!/hi!"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test851/hi!/hi!");
    java.lang.Thread[] var2 = new java.lang.Thread[] { };
    int var4 = var1.enumerate(var2, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    boolean var4 = var2.removeElement((java.lang.Object)0.0f);
    boolean var6 = var2.removeElement((java.lang.Object)10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)0.0d, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test851/hi!/hi!");
    var1.checkAccess();
    boolean var3 = var1.isDaemon();
    var1.list();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isHidden();
    boolean var4 = var2.isFile();
    boolean var5 = var2.canExecute();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    boolean var4 = var2.removeElement((java.lang.Object)0.0f);
    boolean var6 = var2.removeElement((java.lang.Object)10.0d);
    java.io.File var9 = new java.io.File("hi!", "hi!");
    int var10 = var2.indexOf((java.lang.Object)var9);
    boolean var11 = var9.canWrite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    java.io.File var3 = var2.getCanonicalFile();
    long var4 = var2.length();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isHidden();
    boolean var4 = var2.isFile();
    long var5 = var2.getTotalSpace();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);
    boolean var3 = var0.isEmpty();
    java.util.Set var4 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    boolean var4 = var2.removeElement((java.lang.Object)0.0f);
    boolean var6 = var2.removeElement((java.lang.Object)10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var2.subList(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isHidden();
    boolean var4 = var2.isFile();
    long var5 = var2.getTotalSpace();
    boolean var6 = var2.mkdirs();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test851/hi!/hi!");
    var1.stop();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.ThreadGroup[name=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test851/hi!/hi!,maxpri=10]"+ "'", var3.equals("java.lang.ThreadGroup[name=/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_095551/Test851/hi!/hi!,maxpri=10]"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    boolean var4 = var2.removeElement((java.lang.Object)0.0f);
    int var6 = var2.indexOf((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

}
