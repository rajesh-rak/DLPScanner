
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.StructMemberHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/StructMember:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/StructMember:1.0"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.org.omg.CORBA.InitializerHelper var0 = new com.sun.org.omg.CORBA.InitializerHelper();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.org.omg.CORBA.StructMemberSeqHelper var0 = new com.sun.org.omg.CORBA.StructMemberSeqHelper();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.InitializerHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/Initializer:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/Initializer:1.0"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var0 = com.sun.org.omg.CORBA.StructMemberSeqHelper.id();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "IDL:omg.org/CORBA/StructMemberSeq:1.0"+ "'", var0.equals("IDL:omg.org/CORBA/StructMemberSeq:1.0"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.org.omg.CORBA.StructMemberHelper var0 = new com.sun.org.omg.CORBA.StructMemberHelper();

  }

}
