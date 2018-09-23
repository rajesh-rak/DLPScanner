
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.org.omg.CORBA.ParameterDescriptionHelper var0 = new com.sun.org.omg.CORBA.ParameterDescriptionHelper();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.ParameterDescriptionHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/ParameterDescription:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/ParameterDescription:1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    org.omg.CORBA.TypeCode var0 = com.sun.org.omg.CORBA.ParameterDescriptionHelper.type();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.org.omg.CORBA.OperationDescriptionHelper var0 = new com.sun.org.omg.CORBA.OperationDescriptionHelper();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    org.omg.CORBA.TypeCode var0 = com.sun.org.omg.CORBA.OperationDescriptionHelper.type();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.OperationDescriptionHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/OperationDescription:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/OperationDescription:1.0"));

  }

}
