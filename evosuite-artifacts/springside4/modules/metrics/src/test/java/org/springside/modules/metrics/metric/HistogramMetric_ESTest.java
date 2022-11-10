/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:35:02 GMT 2022
 */

package org.springside.modules.metrics.metric;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.metrics.metric.HistogramMetric;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HistogramMetric_ESTest extends HistogramMetric_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HistogramMetric histogramMetric0 = new HistogramMetric();
      histogramMetric0.min = (-857L);
      String string0 = histogramMetric0.toString();
      assertEquals("HistogramMetric [min=-857, max=0, avg=0.0, pcts={}]", string0);
  }
}
