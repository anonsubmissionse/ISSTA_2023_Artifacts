/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:13:20 GMT 2022
 */

package org.apache.commons.net;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.net.MalformedServerReplyException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MalformedServerReplyException_ESTest extends MalformedServerReplyException_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MalformedServerReplyException malformedServerReplyException0 = new MalformedServerReplyException("");
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MalformedServerReplyException malformedServerReplyException0 = new MalformedServerReplyException();
  }
}
