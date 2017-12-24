
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.org.omg.CORBA.ValueMemberHelper var0 = new com.sun.org.omg.CORBA.ValueMemberHelper();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.ValueMemberHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/ValueMember:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/ValueMember:1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/ValueDef/FullValueDescription:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/ValueDef/FullValueDescription:1.0"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper var0 = new com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper();

  }

}
