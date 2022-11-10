/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:09:38 GMT 2022
 */

package org.apache.commons.imaging.common.itu_t4;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.common.itu_t4.HuffmanTreeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HuffmanTreeException_ESTest extends HuffmanTreeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HuffmanTreeException huffmanTreeException0 = new HuffmanTreeException("l(4L5");
      HuffmanTreeException huffmanTreeException1 = new HuffmanTreeException("l(4L5", huffmanTreeException0);
      assertFalse(huffmanTreeException1.equals((Object)huffmanTreeException0));
  }
}
