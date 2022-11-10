/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 05:15:12 GMT 2022
 */

package org.apache.commons.vfs2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.vfs2.FileTypeHasNoContentException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileTypeHasNoContentException_ESTest extends FileTypeHasNoContentException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileTypeHasNoContentException fileTypeHasNoContentException0 = new FileTypeHasNoContentException("iZKXE,Jw1zVaT#)}\"");
      FileTypeHasNoContentException fileTypeHasNoContentException1 = new FileTypeHasNoContentException("iZKXE,Jw1zVaT#)}\"", fileTypeHasNoContentException0);
      assertFalse(fileTypeHasNoContentException1.equals((Object)fileTypeHasNoContentException0));
  }
}
