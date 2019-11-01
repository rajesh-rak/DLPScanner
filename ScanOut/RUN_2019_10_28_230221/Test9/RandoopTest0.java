
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.beans.Introspector.flushCaches();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.beans.Introspector.decapitalize("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.beans.Introspector.decapitalize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var0 = java.beans.Introspector.getBeanInfoSearchPath();
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    java.beans.Introspector.setBeanInfoSearchPath(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    java.beans.Introspector.setBeanInfoSearchPath(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
