/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:11:18 GMT 2022
 */

package org.apache.commons.imaging.formats.psd.dataparsers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.psd.PsdImageContents;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserStub;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataParserStub_ESTest extends DataParserStub_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataParserStub dataParserStub0 = new DataParserStub();
      int int0 = dataParserStub0.getBasicChannelsCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataParserStub dataParserStub0 = new DataParserStub();
      int[][][] intArray0 = new int[16][17][7];
      int int0 = dataParserStub0.getRGB(intArray0, 1, 1, (PsdImageContents) null);
      assertEquals(0, int0);
  }
}
