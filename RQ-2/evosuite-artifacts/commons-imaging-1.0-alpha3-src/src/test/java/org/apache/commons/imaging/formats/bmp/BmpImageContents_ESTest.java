/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:06:18 GMT 2022
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.bmp.BmpHeaderInfo;
import org.apache.commons.imaging.formats.bmp.BmpImageContents;
import org.apache.commons.imaging.formats.bmp.PixelParserRle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageContents_ESTest extends BmpImageContents_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)51, (byte)51, (byte)51, (byte)51, (byte)51, (byte)51, 16711680, (byte)51, 16711680, 16711680, 8, 16711680, 0, 0, 8, 0, 16711680, 8, (-1054), (-2555), 0, bmpHeaderInfo_ColorSpace0, (-320), (-1054), 8, 1, 1, 0, (-1644));
      byte[] byteArray0 = new byte[3];
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      BmpImageContents bmpImageContents0 = new BmpImageContents(bmpHeaderInfo0, byteArray0, byteArray0, pixelParserRle0);
  }
}
