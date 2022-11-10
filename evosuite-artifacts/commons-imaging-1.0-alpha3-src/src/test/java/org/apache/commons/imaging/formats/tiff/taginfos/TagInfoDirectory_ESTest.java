/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:11:40 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff.taginfos;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TagInfoDirectory_ESTest extends TagInfoDirectory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
      TagInfoDirectory tagInfoDirectory0 = new TagInfoDirectory("{yf\"i)3Uol", 0, tiffDirectoryType0);
      assertEquals(0, tagInfoDirectory0.tag);
  }
}
