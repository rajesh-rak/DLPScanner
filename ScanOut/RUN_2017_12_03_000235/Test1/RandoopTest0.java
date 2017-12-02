
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.value();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


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

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


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

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    var0.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    double var2 = var0.product();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


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

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    double var5 = var0.quantile(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


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

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    int var1 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2147483648));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    double var5 = var0.standardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


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

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    double var3 = var0.sum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    double var1 = var0.kurtosis();
    int var2 = var0.getMaxOrderForSumOfPowers();
    double var3 = var0.mean();
    double var4 = var0.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    double var4 = var0.quantile(100.0d);
    double var5 = var0.rms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.center();
    int var3 = var0.size();
    cern.colt.list.DoubleArrayList var4 = var0.sortedElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    cern.colt.list.DoubleArrayList var1 = var0.elements();
    boolean var2 = var0.hasSumOfInversions();
    double var3 = var0.standardError();
    double var4 = var0.sumOfSquares();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


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

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    java.lang.String var1 = var0.toString();
    double var2 = var0.value();
    boolean var3 = var0.hasSumOfInversions();
    var0.standardize(0.5d, Double.NaN);
    double var8 = var0.center(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"+ "'", var1.equals("hep.aida.bin.DynamicBin1D\n-------------\nSize: 0\nSum: 0.0\nSumOfSquares: 0.0\nMin: Infinity\nMax: -Infinity\nMean: NaN\nRMS: NaN\nVariance: NaN\nStandard deviation: NaN\nStandard error: NaN\nGeometric mean: NaN\nProduct: 1.0\nHarmonic mean: NaN\nSum of inversions: 0.0\nSkew: NaN\nKurtosis: NaN\nSum of powers(3): 0.0\nSum of powers(4): 0.0\nSum of powers(5): 0.0\nSum of powers(6): 0.0\nMoment(0,0): NaN\nMoment(1,0): NaN\nMoment(2,0): NaN\nMoment(3,0): NaN\nMoment(4,0): NaN\nMoment(5,0): NaN\nMoment(6,0): NaN\nMoment(0,mean()): NaN\nMoment(1,mean()): NaN\nMoment(2,mean()): NaN\nMoment(3,mean()): NaN\nMoment(4,mean()): NaN\nMoment(5,mean()): NaN\nMoment(6,mean()): NaN\n25%, 50%, 75% Quantiles: 0.0, 0.0, 0.0\nquantileInverse(median): NaN\nDistinct elements: []\nFrequencies: []\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5d);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    var0.setFixedOrder(false);
    double var3 = var0.max();
    int var4 = var0.getMaxOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


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

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    hep.aida.bin.DynamicBin1D var0 = new hep.aida.bin.DynamicBin1D();
    boolean var1 = var0.hasSumOfInversions();
    var0.standardize(1.0d, Double.NaN);
    int var5 = var0.getMinOrderForSumOfPowers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


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

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


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

}
