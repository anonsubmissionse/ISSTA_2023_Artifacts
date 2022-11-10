/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:34:52 GMT 2022
 */

package org.apache.commons.imaging.palette;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import org.apache.commons.imaging.palette.MedianCutQuantizer;
import org.apache.commons.imaging.palette.MostPopulatedBoxesMedianCut;
import org.apache.commons.imaging.palette.Palette;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MedianCutQuantizer_ESTest extends MedianCutQuantizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MedianCutQuantizer medianCutQuantizer0 = new MedianCutQuantizer(true);
      BufferedImage bufferedImage0 = new BufferedImage(8, 8, 13);
      MostPopulatedBoxesMedianCut mostPopulatedBoxesMedianCut0 = new MostPopulatedBoxesMedianCut();
      medianCutQuantizer0.process(bufferedImage0, 1, mostPopulatedBoxesMedianCut0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MedianCutQuantizer medianCutQuantizer0 = new MedianCutQuantizer(true);
      BufferedImage bufferedImage0 = new BufferedImage(89, 89, 13);
      medianCutQuantizer0.groupColors(bufferedImage0, (-15));
      MostPopulatedBoxesMedianCut mostPopulatedBoxesMedianCut0 = new MostPopulatedBoxesMedianCut();
      // Undeclared exception!
      medianCutQuantizer0.process(bufferedImage0, 255, mostPopulatedBoxesMedianCut0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MedianCutQuantizer medianCutQuantizer0 = new MedianCutQuantizer(false);
      MostPopulatedBoxesMedianCut mostPopulatedBoxesMedianCut0 = new MostPopulatedBoxesMedianCut();
      // Undeclared exception!
      try { 
        medianCutQuantizer0.process((BufferedImage) null, 771, mostPopulatedBoxesMedianCut0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MedianCutQuantizer medianCutQuantizer0 = new MedianCutQuantizer(false);
      BufferedImage bufferedImage0 = new BufferedImage(629, 8, 1);
      medianCutQuantizer0.groupColors(bufferedImage0, 255);
      // Undeclared exception!
      medianCutQuantizer0.groupColors(bufferedImage0, 629);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MedianCutQuantizer medianCutQuantizer0 = new MedianCutQuantizer(false);
      // Undeclared exception!
      try { 
        medianCutQuantizer0.groupColors((BufferedImage) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MedianCutQuantizer medianCutQuantizer0 = new MedianCutQuantizer(false);
      BufferedImage bufferedImage0 = new BufferedImage(8, 8, 8);
      MostPopulatedBoxesMedianCut mostPopulatedBoxesMedianCut0 = new MostPopulatedBoxesMedianCut();
      Palette palette0 = medianCutQuantizer0.process(bufferedImage0, 8, mostPopulatedBoxesMedianCut0);
      assertEquals(1, palette0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MedianCutQuantizer medianCutQuantizer0 = new MedianCutQuantizer(true);
      BufferedImage bufferedImage0 = new BufferedImage(6, 6, 6);
      MostPopulatedBoxesMedianCut mostPopulatedBoxesMedianCut0 = new MostPopulatedBoxesMedianCut();
      Palette palette0 = medianCutQuantizer0.process(bufferedImage0, 0, mostPopulatedBoxesMedianCut0);
      assertEquals(1, palette0.length());
  }
}
