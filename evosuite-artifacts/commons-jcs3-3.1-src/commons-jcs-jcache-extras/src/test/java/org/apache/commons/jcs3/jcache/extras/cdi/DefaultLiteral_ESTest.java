/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:35:00 GMT 2022
 */

package org.apache.commons.jcs3.jcache.extras.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jcs3.jcache.extras.cdi.DefaultLiteral;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultLiteral_ESTest extends DefaultLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultLiteral defaultLiteral0 = new DefaultLiteral();
      String string0 = defaultLiteral0.toString();
      assertEquals("@javax.enterprise.inject.Default()", string0);
  }
}
