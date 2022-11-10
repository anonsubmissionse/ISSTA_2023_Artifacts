/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:47:04 GMT 2022
 */

package org.apache.commons.imaging.formats.psd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.PrintWriter;
import org.apache.commons.imaging.formats.psd.PsdHeaderInfo;
import org.apache.commons.imaging.formats.psd.PsdImageContents;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PsdImageContents_ESTest extends PsdImageContents_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PsdImageContents psdImageContents0 = new PsdImageContents((PsdHeaderInfo) null, 213, 3244, 3, 1758);
      psdImageContents0.dump();
      assertEquals(213, psdImageContents0.ColorModeDataLength);
      assertEquals(1758, psdImageContents0.Compression);
      assertEquals(3, psdImageContents0.LayerAndMaskDataLength);
      assertEquals(3244, psdImageContents0.ImageResourcesLength);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PsdImageContents psdImageContents0 = new PsdImageContents((PsdHeaderInfo) null, (-1405), 0, 0, 0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
      psdImageContents0.dump((PrintWriter) mockPrintWriter0);
      assertEquals(131, charArrayWriter0.size());
      assertEquals("\nImageContents\nCompression: 0 (0)\nColorModeDataLength: -1405 (fffffa83)\nImageResourcesLength: 0 (0)\nLayerAndMaskDataLength: 0 (0)\n\n", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      PsdHeaderInfo psdHeaderInfo0 = new PsdHeaderInfo(3, byteArray0, 0, 31, 0, 2, 0);
      PsdImageContents psdImageContents0 = new PsdImageContents(psdHeaderInfo0, 2821, 31, 0, (-127));
      // Undeclared exception!
      try { 
        psdImageContents0.dump((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.psd.PsdImageContents", e);
      }
  }
}
