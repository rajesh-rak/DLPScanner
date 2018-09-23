
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.org.omg.CORBA.OperationDescriptionHelper var0 = new com.sun.org.omg.CORBA.OperationDescriptionHelper();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.OperationDescriptionHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/OperationDescription:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/OperationDescription:1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    org.omg.CORBA.TypeCode var0 = com.sun.org.omg.CORBA.ExcDescriptionSeqHelper.type();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.ExcDescriptionSeqHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/ExcDescriptionSeq:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/ExcDescriptionSeq:1.0"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.org.omg.CORBA.ExcDescriptionSeqHelper var0 = new com.sun.org.omg.CORBA.ExcDescriptionSeqHelper();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    org.omg.CORBA.TypeCode var0 = com.sun.org.omg.CORBA.OperationDescriptionHelper.type();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.org.omg.CORBA.ExceptionDescriptionHelper var0 = new com.sun.org.omg.CORBA.ExceptionDescriptionHelper();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    org.omg.CORBA.TypeCode var0 = com.sun.org.omg.CORBA.ExceptionDescriptionHelper.type();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.ExceptionDescriptionHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/ExceptionDescription:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/ExceptionDescription:1.0"));

  }

}
