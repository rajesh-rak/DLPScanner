
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var5 = var4.toString();
    double var6 = var4.value();
    boolean var7 = var4.hasSumOfInversions();
    java.lang.String var8 = var0.compareWith((hep.aida.bin.AbstractBin1D)var4);
    
    // Checks the contract:  equals-hashcode on var0 and var4
    assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var0
    assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var4 = var0.offset(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      cern.colt.buffer.DoubleBuffer var6 = var0.buffered((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    hep.aida.bin.DynamicBin1D var5 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var6 = var5.elements();
    boolean var7 = var5.hasSumOfInversions();
    double var8 = var5.sumOfInversions();
    double var9 = var0.covariance(var5);
    
    // Checks the contract:  equals-hashcode on var0 and var5
    assertTrue("Contract failed: equals-hashcode on var0 and var5", var0.equals(var5) ? var0.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var0
    assertTrue("Contract failed: equals-hashcode on var5 and var0", var5.equals(var0) ? var5.hashCode() == var0.hashCode() : true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.offset(2147483647);
    boolean var5 = var0.hasSumOfInversions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    int var4 = var0.getMaxOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.sumOfPowers(100);
    double var5 = var0.standardError();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.trimmedMean(100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var5 = var4.elements();
    cern.colt.list.DoubleArrayList var6 = var0.quantiles(var5);
    
    // Checks the contract:  equals-hashcode on var0 and var4
    assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var0
    assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var6
    assertTrue("Contract failed: equals-hashcode on var5 and var6", var5.equals(var6) ? var5.hashCode() == var6.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var6 and var5
    assertTrue("Contract failed: equals-hashcode on var6 and var5", var6.equals(var5) ? var6.hashCode() == var5.hashCode() : true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var5 = var4.elements();
    int var6 = var4.getMaxOrderForSumOfPowers();
    double var8 = var4.sumOfPowers(100);
    double var9 = var0.covariance(var4);
    
    // Checks the contract:  equals-hashcode on var0 and var4
    assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var0
    assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var1 and var5
    assertTrue("Contract failed: equals-hashcode on var1 and var5", var1.equals(var5) ? var1.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var1
    assertTrue("Contract failed: equals-hashcode on var5 and var1", var5.equals(var1) ? var5.hashCode() == var1.hashCode() : true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.max();
    double var6 = var0.value((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    hep.aida.bin.DynamicBin1D var3 = new hep.aida.bin.DynamicBin1D();
    boolean var4 = var3.hasSumOfInversions();
    boolean var5 = var0.equals((java.lang.Object)var3);
    
    // Checks the contract:  equals-hashcode on var0 and var3
    assertTrue("Contract failed: equals-hashcode on var0 and var3", var0.equals(var3) ? var0.hashCode() == var3.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var3 and var0
    assertTrue("Contract failed: equals-hashcode on var3 and var0", var3.equals(var0) ? var3.hashCode() == var0.hashCode() : true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    var0.trimToSize();
    double var3 = var0.median();
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var5 = var4.toString();
    double var6 = var4.center();
    int var7 = var4.size();
    cern.colt.list.DoubleArrayList var8 = var4.sortedElements();
    boolean var9 = var0.removeAllOf(var8);
    
    // Checks the contract:  equals-hashcode on var0 and var4
    assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var0
    assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    var0.trim(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfLogarithms();
    var0.add(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    hep.aida.bin.DynamicBin1D var3 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var4 = var3.toString();
    double var5 = var3.center();
    int var6 = var3.size();
    cern.colt.list.DoubleArrayList var7 = var3.sortedElements();
    boolean var8 = var0.removeAllOf(var7);
    
    // Checks the contract:  equals-hashcode on var0 and var3
    assertTrue("Contract failed: equals-hashcode on var0 and var3", var0.equals(var3) ? var0.hashCode() == var3.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var3 and var0
    assertTrue("Contract failed: equals-hashcode on var3 and var0", var3.equals(var0) ? var3.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var1 and var7
    assertTrue("Contract failed: equals-hashcode on var1 and var7", var1.equals(var7) ? var1.hashCode() == var7.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var7 and var1
    assertTrue("Contract failed: equals-hashcode on var7 and var1", var7.equals(var1) ? var7.hashCode() == var1.hashCode() : true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var2 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      cern.colt.buffer.DoubleBuffer var4 = var0.buffered((-2147483648));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    java.lang.Object var4 = var0.clone();
    var0.standardize(100.0d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    int var4 = var0.size();
    hep.aida.bin.DynamicBin1D var5 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var6 = var5.toString();
    double var7 = var5.geometricMean();
    double var8 = var5.value();
    java.lang.String var9 = var0.compareWith((hep.aida.bin.AbstractBin1D)var5);
    
    // Checks the contract:  equals-hashcode on var0 and var5
    assertTrue("Contract failed: equals-hashcode on var0 and var5", var0.equals(var5) ? var0.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var0
    assertTrue("Contract failed: equals-hashcode on var5 and var0", var5.equals(var0) ? var5.hashCode() == var0.hashCode() : true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    cern.colt.list.DoubleArrayList var4 = var0.sortedElements();
    boolean var5 = var0.hasSumOfInversions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.mean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    hep.aida.bin.DynamicBin1D var3 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var4 = var3.toString();
    double var5 = var3.center();
    int var6 = var3.size();
    cern.colt.list.DoubleArrayList var7 = var3.sortedElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      hep.aida.bin.MightyStaticBin1D[] var9 = var0.splitApproximately(var7, (-2147483648));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var4.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    hep.aida.bin.DynamicBin1D var2 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var3 = var2.elements();
    cern.colt.list.DoubleArrayList var4 = var0.quantiles(var3);
    
    // Checks the contract:  equals-hashcode on var0 and var2
    assertTrue("Contract failed: equals-hashcode on var0 and var2", var0.equals(var2) ? var0.hashCode() == var2.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var2 and var0
    assertTrue("Contract failed: equals-hashcode on var2 and var0", var2.equals(var0) ? var2.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var3 and var4
    assertTrue("Contract failed: equals-hashcode on var3 and var4", var3.equals(var4) ? var3.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var3
    assertTrue("Contract failed: equals-hashcode on var4 and var3", var4.equals(var3) ? var4.hashCode() == var3.hashCode() : true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var2 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.trim(10, (-2147483648));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    hep.aida.bin.DynamicBin1D var2 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var3 = var2.toString();
    double var4 = var2.center();
    cern.colt.list.DoubleArrayList var5 = var2.sortedElements();
    var0.addAllOf(var5);
    
    // Checks the contract:  equals-hashcode on var0 and var2
    assertTrue("Contract failed: equals-hashcode on var0 and var2", var0.equals(var2) ? var0.hashCode() == var2.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var2 and var0
    assertTrue("Contract failed: equals-hashcode on var2 and var0", var2.equals(var0) ? var2.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var1 and var5
    assertTrue("Contract failed: equals-hashcode on var1 and var5", var1.equals(var5) ? var1.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var1
    assertTrue("Contract failed: equals-hashcode on var5 and var1", var5.equals(var1) ? var5.hashCode() == var1.hashCode() : true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfLogarithms();
    cern.colt.list.DoubleArrayList var4 = var0.elements();
    
    // Checks the contract:  equals-hashcode on var1 and var4
    assertTrue("Contract failed: equals-hashcode on var1 and var4", var1.equals(var4) ? var1.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var1
    assertTrue("Contract failed: equals-hashcode on var4 and var1", var4.equals(var1) ? var4.hashCode() == var1.hashCode() : true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var5 = var4.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAllOfFromTo(var5, 0, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    double var2 = var0.product();
    double var3 = var0.sumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    double var4 = var0.quantile(100.0d);
    cern.colt.list.DoubleArrayList var5 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    double var5 = var0.standardDeviation();
    var0.trim(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    double var5 = var0.center((-2147483648));
    double var6 = var0.harmonicMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    hep.aida.bin.DynamicBin1D var3 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var4 = var3.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      hep.aida.bin.MightyStaticBin1D[] var6 = var0.splitApproximately(var4, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    int var4 = var0.size();
    double var5 = var0.skew();
    int var8 = var0.sizeOfRange((-1.0d), 100.0d);
    var0.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.offset(2147483647);
    double var7 = var0.moment((-2147483648), (-1.0d));
    double var8 = var0.mean();
    double var9 = var0.variance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == Double.NaN);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.max();
    hep.aida.bin.DynamicBin1D var5 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var6 = var5.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      hep.aida.bin.MightyStaticBin1D[] var8 = var0.splitApproximately(var6, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfSquares();
    var0.add(Double.NaN);
    
    // Checks the contract:  var0.equals(var0)
    assertTrue("Contract failed: var0.equals(var0)", var0.equals(var0));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    double var5 = var0.sum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    int var1 = var0.getMinOrderForSumOfPowers();
    boolean var2 = var0.hasSumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    double var5 = var0.sumOfPowers(0);
    double var6 = var0.center();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5d);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.error();
    int var4 = var0.getMaxOrderForSumOfPowers();
    hep.aida.bin.DynamicBin1D var5 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var6 = var5.elements();
    var0.addAllOf(var6);
    
    // Checks the contract:  equals-hashcode on var0 and var5
    assertTrue("Contract failed: equals-hashcode on var0 and var5", var0.equals(var5) ? var0.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var0
    assertTrue("Contract failed: equals-hashcode on var5 and var0", var5.equals(var0) ? var5.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var1 and var6
    assertTrue("Contract failed: equals-hashcode on var1 and var6", var1.equals(var6) ? var1.hashCode() == var6.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var6 and var1
    assertTrue("Contract failed: equals-hashcode on var6 and var1", var6.equals(var1) ? var6.hashCode() == var1.hashCode() : true);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfSquares();
    int var6 = var0.sizeOfRange(Double.NaN, Double.NEGATIVE_INFINITY);
    int var7 = var0.getMaxOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2147483647);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.offset(2147483647);
    var0.add(Double.NaN);
    
    // Checks the contract:  var0.equals(var0)
    assertTrue("Contract failed: var0.equals(var0)", var0.equals(var0));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.sumOfInversions();
    double var5 = var0.median();
    java.lang.String var6 = var0.toString();
    int var7 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var6.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.trimmedMean((-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    boolean var5 = var0.hasSumOfInversions();
    double var7 = var0.quantile(0.0d);
    double var8 = var0.standardError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    double var4 = var0.product();
    java.lang.Object var5 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    var0.add(Double.NEGATIVE_INFINITY);
    double var5 = var0.min();
    double var6 = var0.value();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    double var4 = var0.product();
    double var5 = var0.sumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    double var4 = var0.quantile(100.0d);
    double var5 = var0.rms();
    int var6 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2147483648));

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    int var4 = var0.getMaxOrderForSumOfPowers();
    double var6 = var0.offset((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    int var5 = var0.getMinOrderForSumOfPowers();
    cern.colt.list.DoubleArrayList var6 = var0.sortedElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.sumOfInversions();
    double var4 = var0.kurtosis();
    double var5 = var0.offset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var4 = var0.sizeOfRange(100.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.sumOfInversions();
    double var5 = var0.median();
    int var6 = var0.getMaxOrderForSumOfPowers();
    double var7 = var0.standardError();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    double var2 = var0.product();
    double var3 = var0.product();
    double var4 = var0.standardError();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    boolean var5 = var0.hasSumOfInversions();
    double var6 = var0.sumOfInversions();
    double var7 = var0.variance();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.standardError();
    double var6 = var0.sumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    int var4 = var0.size();
    double var5 = var0.skew();
    double var6 = var0.skew();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.trimmedMean(2147483647, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    double var5 = var0.sumOfPowers(0);
    double var7 = var0.center(1);
    double var8 = var0.harmonicMean();
    double var9 = var0.skew();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == Double.NaN);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var5 = var4.toString();
    double var6 = var4.center();
    cern.colt.list.DoubleArrayList var7 = var4.sortedElements();
    boolean var8 = var0.removeAllOf(var7);
    
    // Checks the contract:  equals-hashcode on var0 and var4
    assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var0
    assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var1 and var7
    assertTrue("Contract failed: equals-hashcode on var1 and var7", var1.equals(var7) ? var1.hashCode() == var7.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var7 and var1
    assertTrue("Contract failed: equals-hashcode on var7 and var1", var7.equals(var1) ? var7.hashCode() == var1.hashCode() : true);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    double var2 = var0.standardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var4 = var0.offset(10);
    double var6 = var0.center((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    double var3 = var0.quantile(Double.NEGATIVE_INFINITY);
    double var4 = var0.product();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    int var4 = var0.size();
    double var5 = var0.skew();
    int var8 = var0.sizeOfRange((-1.0d), 100.0d);
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var9.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    double var3 = var0.value(10);
    double var5 = var0.sumOfPowers(1);
    var0.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    double var5 = var0.value((-1));
    double var7 = var0.value((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    double var5 = var0.sumOfPowers(0);
    double var7 = var0.center(1);
    double var8 = var0.variance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfInversions();
    cern.colt.list.DoubleArrayList var5 = var0.elements();
    
    // Checks the contract:  equals-hashcode on var1 and var5
    assertTrue("Contract failed: equals-hashcode on var1 and var5", var1.equals(var5) ? var1.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var1
    assertTrue("Contract failed: equals-hashcode on var5 and var1", var5.equals(var1) ? var5.hashCode() == var1.hashCode() : true);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.sumOfInversions();
    double var4 = var0.sumOfLogarithms();
    var0.setFixedOrder(true);
    int var7 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-2147483648));

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    int var5 = var0.getMinOrderForSumOfPowers();
    double var6 = var0.mean();
    double var7 = var0.harmonicMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    double var4 = var0.product();
    int var7 = var0.sizeOfRange(0.5d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    double var3 = var0.quantile(Double.NEGATIVE_INFINITY);
    cern.colt.list.DoubleArrayList var4 = var0.elements();
    
    // Checks the contract:  equals-hashcode on var1 and var4
    assertTrue("Contract failed: equals-hashcode on var1 and var4", var1.equals(var4) ? var1.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var1
    assertTrue("Contract failed: equals-hashcode on var4 and var1", var4.equals(var1) ? var4.hashCode() == var1.hashCode() : true);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    var0.trimToSize();
    double var3 = var0.median();
    double var5 = var0.value(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.trim(2147483647, 100);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    double var5 = var0.standardDeviation();
    double var6 = var0.error();
    double var8 = var0.error(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.standardError();
    boolean var7 = var0.hasSumOfPowers(1);
    double var8 = var0.standardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var3 = var0.value(1);
    boolean var5 = var0.hasSumOfPowers(1);
    double var6 = var0.standardError();
    var0.standardize(1.0d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var3 = var0.value(1);
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var5 = var4.toString();
    double var6 = var4.center();
    cern.colt.list.DoubleArrayList var7 = var4.sortedElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      hep.aida.bin.MightyStaticBin1D[] var9 = var0.splitApproximately(var7, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var5.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    cern.colt.list.DoubleArrayList var4 = var0.sortedElements();
    java.lang.Object var5 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    double var3 = var0.sum();
    boolean var5 = var0.hasSumOfPowers(2147483647);
    double var6 = var0.variance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    var0.standardize(0.5d, 10.0d);
    var0.setFixedOrder(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    int var4 = var0.getMaxOrderForSumOfPowers();
    var0.standardize(10.0d, Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.standardError();
    double var7 = var0.quantileInverse(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    int var5 = var0.sizeOfRange(0.5d, 100.0d);
    boolean var6 = var0.hasSumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.offset(2147483647);
    int var7 = var0.sizeOfRange(Double.NaN, (-1.0d));
    double var8 = var0.skew();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    int var5 = var0.getMinOrderForSumOfPowers();
    java.lang.Object var6 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    boolean var5 = var0.hasSumOfInversions();
    double var6 = var0.sumOfInversions();
    double var7 = var0.skew();
    int var8 = var0.getMaxOrderForSumOfPowers();
    boolean var9 = var0.hasSumOfInversions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    int var6 = var0.sizeOfRange(10.0d, 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfSquares();
    int var6 = var0.sizeOfRange(Double.NaN, Double.NEGATIVE_INFINITY);
    double var7 = var0.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.POSITIVE_INFINITY);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.sumOfPowers(100);
    double var5 = var0.standardError();
    double var6 = var0.error();
    var0.add(0.5d);
    double var9 = var0.harmonicMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5d);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    double var5 = var0.standardDeviation();
    double var6 = var0.error();
    cern.colt.list.DoubleArrayList var7 = var0.sortedElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    double var7 = var0.moment(2147483647, 0.0d);
    double var8 = var0.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.POSITIVE_INFINITY);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getMinOrderForSumOfPowers();
    boolean var3 = var0.isRebinnable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.sumOfPowers(100);
    int var5 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.standardError();
    boolean var7 = var0.hasSumOfPowers(1);
    boolean var9 = var0.hasSumOfPowers((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    double var5 = var0.standardDeviation();
    double var6 = var0.median();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.mean();
    double var4 = var0.error();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    double var4 = var0.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.POSITIVE_INFINITY);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    var0.standardize(0.5d, 10.0d);
    double var6 = var0.standardError();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    double var3 = var0.value(10);
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var5 = var4.elements();
    var0.addAllOf(var5);
    
    // Checks the contract:  equals-hashcode on var0 and var4
    assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var0
    assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    var0.add(Double.NEGATIVE_INFINITY);
    double var5 = var0.min();
    double var6 = var0.sumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.trimToSize();

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    double var2 = var0.product();
    int var3 = var0.size();
    double var5 = var0.center(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5d);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    boolean var5 = var0.hasSumOfInversions();
    double var6 = var0.standardError();
    cern.colt.list.DoubleArrayList var7 = var0.sortedElements();
    
    // Checks the contract:  equals-hashcode on var1 and var7
    assertTrue("Contract failed: equals-hashcode on var1 and var7", var1.equals(var7) ? var1.hashCode() == var7.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var7 and var1
    assertTrue("Contract failed: equals-hashcode on var7 and var1", var7.equals(var1) ? var7.hashCode() == var1.hashCode() : true);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var2 = var0.size();
    hep.aida.bin.DynamicBin1D var3 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var4 = var3.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAllOfFromTo(var4, 100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    double var2 = var0.harmonicMean();
    double var4 = var0.center((-1));
    double var5 = var0.geometricMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.trim(2147483647, (-2147483648));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.offset(2147483647);
    int var7 = var0.sizeOfRange(Double.NaN, Double.NaN);
    double var8 = var0.median();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    int var5 = var0.getMinOrderForSumOfPowers();
    double var6 = var0.error();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    double var2 = var0.sumOfLogarithms();
    double var3 = var0.sumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    var0.add(Double.NEGATIVE_INFINITY);
    double var5 = var0.min();
    double var6 = var0.geometricMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfSquares();
    double var4 = var0.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.POSITIVE_INFINITY);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    double var2 = var0.rms();
    double var4 = var0.quantileInverse(0.0d);
    double var5 = var0.sumOfLogarithms();
    double var6 = var0.variance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getMinOrderForSumOfPowers();
    double var3 = var0.standardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    double var2 = var0.product();
    double var4 = var0.quantile(1.0d);
    double var5 = var0.center();
    double var6 = var0.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NEGATIVE_INFINITY);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.value();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var0.trimmedMean(2147483647, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var3 = var0.value(1);
    boolean var5 = var0.hasSumOfPowers(1);
    java.lang.String var6 = var0.toString();
    double var7 = var0.geometricMean();
    double var8 = var0.harmonicMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var6.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    double var5 = var0.quantile(100.0d);
    boolean var6 = var0.isRebinnable();
    double var7 = var0.skew();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    double var5 = var0.center((-2147483648));
    boolean var6 = var0.hasSumOfInversions();
    double var7 = var0.value();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    int var4 = var0.getMaxOrderForSumOfPowers();
    cern.colt.list.DoubleArrayList var5 = var0.sortedElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    double var2 = var0.rms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    int var4 = var0.size();
    double var5 = var0.skew();
    int var8 = var0.sizeOfRange((-1.0d), 100.0d);
    double var9 = var0.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == Double.NEGATIVE_INFINITY);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.sumOfInversions();
    double var4 = var0.kurtosis();
    boolean var6 = var0.hasSumOfPowers(1);
    double var7 = var0.sumOfSquares();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.offset(2147483647);
    int var7 = var0.sizeOfRange(Double.NaN, (-1.0d));
    cern.colt.list.DoubleArrayList var8 = var0.elements();
    
    // Checks the contract:  equals-hashcode on var1 and var8
    assertTrue("Contract failed: equals-hashcode on var1 and var8", var1.equals(var8) ? var1.hashCode() == var8.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var8 and var1
    assertTrue("Contract failed: equals-hashcode on var8 and var1", var8.equals(var1) ? var8.hashCode() == var1.hashCode() : true);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var3 = var0.value(1);
    boolean var5 = var0.hasSumOfPowers(1);
    double var6 = var0.standardError();
    double var7 = var0.offset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var3 = var0.value(1);
    boolean var5 = var0.hasSumOfPowers(1);
    double var6 = var0.skew();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      cern.colt.buffer.DoubleBuffer var6 = var0.buffered((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    double var4 = var0.max();
    int var5 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var4 = var0.offset(10);
    double var5 = var0.kurtosis();
    double var6 = var0.center();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5d);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    int var4 = var0.getMaxOrderForSumOfPowers();
    double var5 = var0.rms();
    double var6 = var0.mean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.sumOfInversions();
    double var5 = var0.median();
    int var6 = var0.getMaxOrderForSumOfPowers();
    double var8 = var0.sumOfPowers(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.sumOfInversions();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    int var5 = var0.getMinOrderForSumOfPowers();
    double var7 = var0.sumOfPowers(10);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.sumOfInversions();
    double var5 = var0.value();
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var6.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    double var4 = var0.quantile(100.0d);
    double var7 = var0.moment(100, (-1.0d));
    java.lang.String var8 = var0.toString();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var8.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    int var4 = var0.size();
    double var5 = var0.skew();
    double var7 = var0.quantileInverse(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    hep.aida.bin.DynamicBin1D var2 = new hep.aida.bin.DynamicBin1D();
    int var3 = var2.getMinOrderForSumOfPowers();
    double var4 = var0.correlation(var2);
    
    // Checks the contract:  equals-hashcode on var0 and var2
    assertTrue("Contract failed: equals-hashcode on var0 and var2", var0.equals(var2) ? var0.hashCode() == var2.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var2 and var0
    assertTrue("Contract failed: equals-hashcode on var2 and var0", var2.equals(var0) ? var2.hashCode() == var0.hashCode() : true);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.harmonicMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.sumOfInversions();
    double var5 = var0.median();
    int var6 = var0.getMaxOrderForSumOfPowers();
    boolean var7 = var0.hasSumOfInversions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.median();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var5 = var4.toString();
    double var6 = var4.center();
    cern.colt.list.DoubleArrayList var7 = var4.sortedElements();
    var0.addAllOf(var7);
    
    // Checks the contract:  equals-hashcode on var0 and var4
    assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var0
    assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    double var4 = var0.max();
    cern.colt.buffer.DoubleBuffer var6 = var0.buffered(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    cern.colt.list.DoubleArrayList var3 = var0.sortedElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    int var3 = var0.sizeOfRange((-1.0d), (-1.0d));
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var4.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    double var5 = var0.value((-1));
    var0.add(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.standardError();
    boolean var7 = var0.hasSumOfPowers(1);
    var0.clear();
    double var9 = var0.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == Double.NEGATIVE_INFINITY);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    java.lang.String var3 = var0.toString();
    java.lang.Object var4 = var0.clone();
    int var5 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var3.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.sumOfPowers((-1));
    double var5 = var0.center();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    double var4 = var0.geometricMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.median();
    int var6 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2147483648));

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var4 = var0.sumOfPowers((-2147483648));
    var0.trim(2147483647, 1);
    int var8 = var0.getMinOrderForSumOfPowers();
    double var9 = var0.sumOfInversions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    double var5 = var0.sumOfPowers(0);
    java.lang.String var6 = var0.toString();
    cern.colt.list.DoubleArrayList var7 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var6.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    double var5 = var0.quantile(100.0d);
    double var7 = var0.sumOfPowers((-2147483648));
    double var8 = var0.sumOfLogarithms();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    boolean var5 = var0.hasSumOfInversions();
    double var6 = var0.sumOfInversions();
    double var7 = var0.variance();
    double var8 = var0.value();
    double var9 = var0.standardError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == Double.NaN);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    double var2 = var0.product();
    double var3 = var0.sumOfInversions();
    cern.colt.list.DoubleArrayList var4 = var0.sortedElements();
    
    // Checks the contract:  equals-hashcode on var1 and var4
    assertTrue("Contract failed: equals-hashcode on var1 and var4", var1.equals(var4) ? var1.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var1
    assertTrue("Contract failed: equals-hashcode on var4 and var1", var4.equals(var1) ? var4.hashCode() == var1.hashCode() : true);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    var0.trimToSize();
    double var3 = var0.median();
    double var4 = var0.variance();
    var0.setFixedOrder(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    double var2 = var0.harmonicMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    java.lang.String var3 = var0.toString();
    int var6 = var0.sizeOfRange((-1.0d), 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var3.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfSquares();
    int var4 = var0.getMaxOrderForSumOfPowers();
    double var5 = var0.value();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    double var3 = var0.quantile(Double.NEGATIVE_INFINITY);
    double var4 = var0.center();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5d);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    cern.colt.list.DoubleArrayList var3 = var0.sortedElements();
    hep.aida.bin.DynamicBin1D var4 = new hep.aida.bin.DynamicBin1D();
    double var5 = var4.kurtosis();
    int var6 = var4.getMaxOrderForSumOfPowers();
    double var7 = var4.kurtosis();
    double var8 = var4.variance();
    java.lang.String var9 = var0.compareWith((hep.aida.bin.AbstractBin1D)var4);
    
    // Checks the contract:  equals-hashcode on var0 and var4
    assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var0
    assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.median();
    boolean var6 = var0.hasSumOfInversions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    int var4 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfSquares();
    java.lang.Object var4 = var0.clone();
    double var6 = var0.error(0);
    double var7 = var0.sumOfSquares();
    var0.add((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.sumOfPowers(100);
    cern.colt.list.DoubleArrayList var5 = var0.elements();
    
    // Checks the contract:  equals-hashcode on var1 and var5
    assertTrue("Contract failed: equals-hashcode on var1 and var5", var1.equals(var5) ? var1.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var1
    assertTrue("Contract failed: equals-hashcode on var5 and var1", var5.equals(var1) ? var5.hashCode() == var1.hashCode() : true);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    double var2 = var0.harmonicMean();
    double var4 = var0.value(1);
    var0.setFixedOrder(true);
    int var9 = var0.sizeOfRange(Double.NaN, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.standardDeviation();
    var0.trim(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var3 = var0.value(1);
    boolean var5 = var0.hasSumOfPowers(1);
    java.lang.String var6 = var0.toString();
    double var7 = var0.geometricMean();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var6.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    double var3 = var0.sumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    boolean var2 = var0.isRebinnable();
    double var3 = var0.standardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    var0.setFixedOrder(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.trim(2147483647, 2147483647);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    double var4 = var0.sumOfLogarithms();
    double var5 = var0.mean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var3 = var0.value(1);
    boolean var5 = var0.hasSumOfPowers(1);
    double var6 = var0.standardError();
    boolean var8 = var0.hasSumOfPowers(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var2 = var0.size();
    var0.standardize((-1.0d), 1.0d);
    double var8 = var0.moment(1, Double.NaN);
    double var9 = var0.variance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == Double.NaN);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    int var1 = var0.getMinOrderForSumOfPowers();
    boolean var3 = var0.hasSumOfPowers(10);
    boolean var4 = var0.hasSumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.error();
    int var4 = var0.getMaxOrderForSumOfPowers();
    var0.standardize(0.5d, Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    hep.aida.bin.DynamicBin1D var1 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var2 = var1.elements();
    boolean var3 = var1.hasSumOfInversions();
    double var4 = var1.sumOfInversions();
    double var5 = var1.kurtosis();
    boolean var7 = var1.hasSumOfPowers(1);
    double var8 = var0.correlation(var1);
    
    // Checks the contract:  equals-hashcode on var0 and var1
    assertTrue("Contract failed: equals-hashcode on var0 and var1", var0.equals(var1) ? var0.hashCode() == var1.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var1 and var0
    assertTrue("Contract failed: equals-hashcode on var1 and var0", var1.equals(var0) ? var1.hashCode() == var0.hashCode() : true);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    cern.colt.list.DoubleArrayList var3 = var0.sortedElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.median();
    cern.colt.list.DoubleArrayList var6 = var0.elements();
    double var8 = var0.error(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    boolean var5 = var0.hasSumOfInversions();
    double var6 = var0.mean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    int var4 = var0.size();
    double var5 = var0.skew();
    double var8 = var0.moment(1, 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.sumOfInversions();
    double var4 = var0.kurtosis();
    boolean var6 = var0.hasSumOfPowers(1);
    double var7 = var0.standardError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var3 = var0.value();
    double var4 = var0.product();
    var0.standardize(1.0d, 0.0d);
    double var9 = var0.center((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5d);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.offset(2147483647);
    double var7 = var0.moment((-2147483648), (-1.0d));
    int var8 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-2147483648));

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var4 = var0.sumOfPowers(100);
    double var5 = var0.standardError();
    double var6 = var0.error();
    var0.add(0.5d);
    double var9 = var0.center();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5d);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    boolean var2 = var0.hasSumOfInversions();
    boolean var3 = var0.hasSumOfInversions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    double var5 = var0.standardDeviation();
    var0.clear();
    double var8 = var0.offset(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    double var2 = var0.harmonicMean();
    double var4 = var0.value(1);
    java.lang.Object var5 = var0.clone();
    double var6 = var0.kurtosis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    double var3 = var0.sum();
    double var5 = var0.quantileInverse(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    java.lang.String var3 = var0.toString();
    java.lang.Object var4 = var0.clone();
    double var5 = var0.skew();
    double var6 = var0.variance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var3.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.geometricMean();
    double var4 = var0.sumOfPowers((-2147483648));
    var0.trim(2147483647, 1);
    int var8 = var0.getMinOrderForSumOfPowers();
    double var9 = var0.sumOfSquares();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var3 = var0.value(1);
    boolean var5 = var0.hasSumOfPowers(1);
    java.lang.String var6 = var0.toString();
    double var7 = var0.min();
    double var8 = var0.median();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var6.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    double var3 = var0.sum();
    cern.colt.list.DoubleArrayList var4 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    int var5 = var0.getMinOrderForSumOfPowers();
    var0.standardize(Double.POSITIVE_INFINITY, 10.0d);
    double var9 = var0.error();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    double var5 = var0.sumOfPowers(0);
    hep.aida.bin.DynamicBin1D var6 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var7 = var6.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      hep.aida.bin.MightyStaticBin1D[] var9 = var0.splitApproximately(var7, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.sumOfSquares();
    int var4 = var0.getMaxOrderForSumOfPowers();
    var0.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    var0.trimToSize();
    double var3 = var0.median();
    double var5 = var0.value(10);
    double var6 = var0.standardDeviation();
    double var7 = var0.skew();
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    double var2 = var0.harmonicMean();
    double var4 = var0.value(1);
    java.lang.Object var5 = var0.clone();
    double var7 = var0.sumOfPowers((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    var0.standardize(0.5d, 10.0d);
    double var6 = var0.standardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    double var5 = var0.quantile(Double.NEGATIVE_INFINITY);
    boolean var6 = var0.hasSumOfInversions();
    double var7 = var0.sumOfLogarithms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    var0.trimToSize();
    double var3 = var0.median();
    double var5 = var0.value(10);
    double var6 = var0.standardDeviation();
    double var8 = var0.offset(0);
    double var9 = var0.rms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == Double.NaN);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    double var3 = var0.quantile(Double.NEGATIVE_INFINITY);
    double var4 = var0.median();
    double var6 = var0.value((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    java.lang.String var2 = var0.toString();
    int var3 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var2.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    double var2 = var0.harmonicMean();
    double var4 = var0.center((-1));
    double var5 = var0.geometricMean();
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var6.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    int var4 = var0.sizeOfRange(Double.NEGATIVE_INFINITY, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    int var3 = var0.sizeOfRange((-1.0d), (-1.0d));
    double var4 = var0.error();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.max();
    int var4 = var0.sizeOfRange(0.0d, Double.NEGATIVE_INFINITY);
    double var5 = var0.standardError();
    boolean var7 = var0.hasSumOfPowers(1);
    double var8 = var0.product();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    var0.standardize(0.5d, Double.NaN);
    double var8 = var0.center(0);
    int var9 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-2147483648));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    double var5 = var0.center();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5d);

  }

}
